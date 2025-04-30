package io.github.lorimedeiros.cadastro_autores_api.service;

import io.github.lorimedeiros.cadastro_autores_api.model.Livro;
import io.github.lorimedeiros.cadastro_autores_api.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class LivroService {

    private final LivroRepository repository;

    public Livro salvar(Livro livro) {
        return repository.save(livro);
    }

    public Optional<Livro> obterPorId(UUID id){
        return repository.findById(id);
    }

}
