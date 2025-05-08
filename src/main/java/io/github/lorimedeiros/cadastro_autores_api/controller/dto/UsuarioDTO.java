package io.github.lorimedeiros.cadastro_autores_api.controller.dto;

import java.util.List;

public record UsuarioDTO(String login,
                         String senha,
                         List<String> roles) {
}
