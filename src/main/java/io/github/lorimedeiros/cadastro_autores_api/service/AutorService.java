package io.github.lorimedeiros.cadastro_autores_api.service;

import io.github.lorimedeiros.cadastro_autores_api.exceptions.OperacaoNaoPermitidaException;
import io.github.lorimedeiros.cadastro_autores_api.model.Autor;
import io.github.lorimedeiros.cadastro_autores_api.repository.AutorRepository;
import io.github.lorimedeiros.cadastro_autores_api.repository.LivroRepository;
import io.github.lorimedeiros.cadastro_autores_api.validator.AutorValidator;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AutorService {

    private final AutorRepository repository;
    private final AutorValidator validator;
    private final LivroRepository livroRepository;

    public Autor salvar(Autor autor){
        validator.validar(autor);
        return repository.save(autor);
    }

    public Optional<Autor> obterPorId(UUID id){
        return repository.findById(id);
    }

    public void deletar(Autor autor){
        if (possuiLivro(autor)){
            throw new OperacaoNaoPermitidaException("Não é permitido excluir um autor que possui livros cadastrados!");
        }
        repository.delete(autor);
    }

    public List<Autor> pesquisa(String nome, String nacionalidade){
        if(nome != null && nacionalidade != null){
            return repository.findByNomeAndNacionalidade(nome, nacionalidade);
        } else if (nome != null){
            return repository.findByNome(nome);
        } else if (nacionalidade != null) {
            return repository.findByNacionalidade(nacionalidade);
        }
        return repository.findAll();
    }

    public List<Autor> pesquisaByExample(String nome, String nacionalidade){
        var autor = new Autor();
        autor.setNome(nome);
        autor.setNacionalidade(nacionalidade);

        ExampleMatcher matcher = ExampleMatcher //o matcher é uma estrategia de como tratar aquele valor recebido
                .matching()
                .withIgnorePaths("id", "dataNascimento", "dataCadastro") //ignora paths
                .withIgnoreNullValues()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING); //contento aquela string recebida em qualquer parte do nome
        Example<Autor> autorExample = Example.of(autor, matcher);
        return repository.findAll(autorExample);
    }

    public void atualizar(Autor autor){
        if (autor.getId() == null) {
            throw new IllegalArgumentException("Para atualizar é necessário que o autor já esteja salvo na base.");
        }
        validator.validar(autor);
        repository.save(autor);
    }

    public boolean possuiLivro(Autor autor){
        return livroRepository.existsByAutor(autor);
    }

}
