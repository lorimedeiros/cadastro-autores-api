package io.github.lorimedeiros.cadastro_autores_api.controller.mappers;

import io.github.lorimedeiros.cadastro_autores_api.controller.dto.UsuarioDTO;
import io.github.lorimedeiros.cadastro_autores_api.model.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    Usuario toEntity(UsuarioDTO dto);

}
