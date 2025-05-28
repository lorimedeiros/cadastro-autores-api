package io.github.lorimedeiros.cadastro_autores_api.controller.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Schema(name = "Usuario")
public record UsuarioDTO(@NotBlank(message = "Campo obrigatório")
                         String login,
                         @Email(message = "E-mail inválido")
                         @NotBlank(message = "Campo obrigatório")
                         String email,
                         @NotBlank(message = "Campo obrigatório")
                         String senha,
                         List<String> roles) {
}
