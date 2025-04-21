package io.github.lorimedeiros.cadastro_autores_api.controller.dto;

import java.time.LocalDate;

// DTO -> Data Transfer Object
// aqui colocamos apenas as informações que iremos receber no POST para que sigamos corretamente o nosso contrato de API
// é a camada representacional; um objeto que irá representar um JSON (que recebemos na requisição)
public record AutorDTO(
        String nome,
        LocalDate dataNascimento,
        String nacionalidade) {
}
