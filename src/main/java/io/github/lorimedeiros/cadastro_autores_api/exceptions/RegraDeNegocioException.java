package io.github.lorimedeiros.cadastro_autores_api.exceptions;

import lombok.Getter;

public class RegraDeNegocioException extends RuntimeException{

    @Getter
    private String campo;

    public RegraDeNegocioException(String campo, String mensagem){
        super(mensagem);
        this.campo = campo;
    }
}
