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

	// 1 -> criação do repository, service, mapper, dto e controller de usuarios
	// 2 -> permitindo que seja possivel cadastrar usuario sem estar autenticado (em SecurityConfiguration -> securityFilterChain

	/*
	bodys - json:
	{
    "login" : "admin",
    "senha" : "admin123",
    "roles" : [
        "ADMIN"
        ]
	}

	{
    "login" : "tecnico",
    "senha" : "123",
    "roles" : [
        "TECNICO"
        ]
	}
	*/

}
