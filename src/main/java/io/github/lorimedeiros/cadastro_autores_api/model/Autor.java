package io.github.lorimedeiros.cadastro_autores_api.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Autor")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(exclude = {"livros"})
@EntityListeners(AuditingEntityListener.class) //essa anotation ativa o listener, que irá 'escutar' quando atualizarmos essas datas
public class Autor {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "nacionalidade", length = 50)
    private String nacionalidade;

    @OneToMany(mappedBy = "autor")
    private List<Livro> livros;

    // tipo LocalDateTime pois nas tabelas estão os tipos timestamp
    // timestamp -> data e hora
    // localdate -> data de nascimento, pois o que realmente importa é a data
    // createdDate para delegar ao jpa a função de colocar essa data, NESTE CASO data de criação
    // lastModifiedDate para colocar ultima data de modificação
    @CreatedDate
    @Column(name = "data_cadastro")
    private LocalDateTime dataCadastro;

    @LastModifiedDate
    @Column(name = "data_atualizacao")
    private LocalDateTime dataAtualizacao;

    // no usuario não mexemos, por hora
    @Column(name = "id_usuario")
    private UUID idUsuario;

}
