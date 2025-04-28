package io.github.lorimedeiros.cadastro_autores_api.controller.dto;

import io.github.lorimedeiros.cadastro_autores_api.model.GeneroLivro;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record CadastroLivroDTO(
        String isbn,
        String titulo,
        LocalDate dataPublicacao,
        GeneroLivro genero,
        BigDecimal preco,
        UUID idAutor) {

    //

}
