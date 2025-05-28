package io.github.lorimedeiros.cadastro_autores_api.controller.dto;

import io.github.lorimedeiros.cadastro_autores_api.model.GeneroLivro;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.ISBN;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Schema(name = "Livro")
public record CadastroLivroDTO(
        @NotBlank(message = "Campo obrigatório")
        @ISBN
        String isbn,
        @NotBlank(message = "Campo obrigatório")
        String titulo,
        @NotNull(message = "Campo obrigatório")
        @Past(message = "Não pode ser uma data futura")
        LocalDate dataPublicacao,
        GeneroLivro genero,
        @Positive(message = "Não pode ser um valor negativo")
        BigDecimal preco,
        @NotNull(message = "Campo obrigatório")
        UUID idAutor) {

    //

}
