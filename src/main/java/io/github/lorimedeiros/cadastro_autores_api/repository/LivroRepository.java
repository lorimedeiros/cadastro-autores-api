package io.github.lorimedeiros.cadastro_autores_api.repository;

import io.github.lorimedeiros.cadastro_autores_api.model.Autor;
import io.github.lorimedeiros.cadastro_autores_api.model.GeneroLivro;
import io.github.lorimedeiros.cadastro_autores_api.model.Livro;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface LivroRepository extends JpaRepository<Livro, UUID>, JpaSpecificationExecutor<Livro> {

    Page<Livro> findByAutor(Autor autor, Pageable pageable);

    boolean existsByAutor(Autor autor);

    Optional<Livro> findByAutor(Autor autor);
    Optional<Livro> findByTitulo(String titulo);
    Optional<Livro> findByIsbn(String isbn);

    Optional<Livro> findByTituloAndPreco(String titulo, BigDecimal preco);
    Optional<Livro> findByTituloOrIsbn(String titulo, String isbn);

    Optional<Livro> findByDataPublicacaoBetween(LocalDate inicio, LocalDate fim);

}