package io.github.lorimedeiros.cadastro_autores_api.controller.mappers;

import io.github.lorimedeiros.cadastro_autores_api.controller.dto.CadastroLivroDTO;
import io.github.lorimedeiros.cadastro_autores_api.controller.dto.PesquisaLivroDTO;
import io.github.lorimedeiros.cadastro_autores_api.model.Livro;
import io.github.lorimedeiros.cadastro_autores_api.repository.AutorRepository;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring", uses = AutorMapper.class)
public abstract class LivroMapper {

    @Autowired
    AutorRepository autorRepository;

    @Mapping(target = "autor", expression = "java( autorRepository.findById(dto.idAutor()).orElse(null) )")
    public abstract Livro toEntity(CadastroLivroDTO dto);

    public abstract PesquisaLivroDTO toDTO(Livro livro);

}
