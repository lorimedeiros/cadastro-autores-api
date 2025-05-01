package io.github.lorimedeiros.cadastro_autores_api.repository.specs;

import io.github.lorimedeiros.cadastro_autores_api.model.GeneroLivro;
import io.github.lorimedeiros.cadastro_autores_api.model.Livro;
import org.springframework.data.jpa.domain.Specification;

public class LivroSpecs {

    public static Specification<Livro> isbnEqual(String isbn){
        return (root, query, cb) -> cb.equal(root.get("isbn"), isbn);
    }

    public static Specification<Livro> tituloLike(String titulo){
        return (root, query, cb) ->
                cb.like(cb.upper(root.get("titulo")), "%" + titulo.toUpperCase() + "%");
    }

    public static Specification<Livro> generoEqual(GeneroLivro genero){
        return (root, query, cb) -> cb.equal(root.get("genero"), genero);
    }

    public static Specification<Livro> anoPublicacaoEqual(Integer anoPublicacao){
        // select extract (year from data_publicacao) from livro; -> comando em PostgresSQL
        // select year(data_publicacao) from livro;
        // select to_char(data_publicacao, "YYYY") from livro; -> forma de transformar ano em char no Postgres (como faremos aqui)
        return (root, query, cb) ->
                cb.equal(cb.function("to_char", String.class, root.get("dataPublicacao"), cb.literal("YYYY")), anoPublicacao.toString());
        //to_char -> função sendo chamada
        //String.class -> retorno da função
        //root.get("dataPublicacao") -> campo a ser acessado
    }

    public static Specification<Livro> nomeAutorLike(String nomeAutor){
        return (root, query, cb) -> {
            //dentro do atributo autor (que é um objeto tipo Autor) de livro, damos um get no nome do autor
            return cb.like(cb.upper(root.get("autor").get("nome")), "%" + nomeAutor.toUpperCase() + "%");
        };
    }

    /*
    versão com uso do JOIN
    public static Specification<Livro> nomeAutorLike(String nomeAutor){
        return (root, query, cb) -> {
            Join<Object, Object> joinAutor = root.join("autor", JoinType.LEFT);
            return cb.like(cb.upper(joinAutor.get("nome")), "%" + nomeAutor.toUpperCase() + "%")
        };
    }
    DIFERENÇA: nessa versão controlamos o join definido como LEFT JOIN
    NA OUTRA VERSÃO: é, por padrão, um INNER JOIN
    */

}
