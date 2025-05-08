package io.github.lorimedeiros.cadastro_autores_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// 1 -> tiramos de SecurityConfiguration, no método securityFilterChain, as permissões de cada endpoint feitas na mão
	// 2 -> em livrocontroller, colocamos a anotation @PreAuthorize("hasAnyRole('OPERADOR','GERENTE')") em todos os métodos. Pois, seguindo a regra de negócio, tanto operador quanto gerente podem acessar tudo em Livro
	// OBS: como em todos os métodos são a mesma regra, eu poderia apenas aplicar a anotação em cima da classe, assim valeria para tudo
	// 3 -> regras no controller de autores

	/*
	{
    "login" : "operador",
    "senha" : "123",
    "roles" : [
        "OPERADOR"
        ]
	}

	{
    "login" : "gerente",
    "senha" : "321",
    "roles" : [
        "GERENTE"
        ]
	}
	*/

}
