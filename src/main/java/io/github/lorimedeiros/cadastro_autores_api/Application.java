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

	/*
	Adicionando mensagens log (em locais estratégicos) para monitoramento da aplicação:
	1 -> adicionados logs estratégicos em AutorController (salvar e deletar) - info
	2 -> adicionados logs estratégicos em ClientController (salvar) - info
	3 -> adicionados logs estratégicos em GlobalExceptionHandler - error
	...mais adições repetitivas
	*/

}
