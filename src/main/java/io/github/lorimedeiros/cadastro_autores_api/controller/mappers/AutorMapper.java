package io.github.lorimedeiros.cadastro_autores_api.controller.mappers;

import io.github.lorimedeiros.cadastro_autores_api.controller.dto.AutorDTO;
import io.github.lorimedeiros.cadastro_autores_api.model.Autor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AutorMapper {

    @Mapping(source = "nome", target = "nomeAutor")
    //vamos supor que na propriedade (classe Autor) eu tivesse o nome de atributo 'nomeAutor' para nome
    //e no meu dto eu tivesse 'nome', então assim seria feito.
    //source = como está no dto, target = como está na model
    Autor toEntity(AutorDTO dto);
    AutorDTO toDTO(Autor autor);

}
