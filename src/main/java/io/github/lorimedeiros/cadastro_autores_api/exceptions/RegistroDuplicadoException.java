package io.github.lorimedeiros.cadastro_autores_api.exceptions;

public class RegistroDuplicadoException extends RuntimeException {

    public RegistroDuplicadoException(String message) {
        super(message);
    } //essa classe foi criada pois se trata de uma regra de negócio

}
