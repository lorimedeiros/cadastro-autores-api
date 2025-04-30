package io.github.lorimedeiros.cadastro_autores_api.controller.mappers;

import io.github.lorimedeiros.cadastro_autores_api.controller.dto.AutorDTO;
import io.github.lorimedeiros.cadastro_autores_api.model.Autor;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AutorMapper {

    Autor toEntity(AutorDTO dto);
    AutorDTO toDTO(Autor autor);

}
