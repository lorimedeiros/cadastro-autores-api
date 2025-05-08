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

	// 1 -> criação do Security Service para fazer a logica de obter o usuario que realizou determinada requisição
	// 2 -> Injeção do Security service no método salvar Autor Service
	// 3 -> alteração em Autor, agora não recebe mais id do usuario, mas sim o objeto usuario todo
	// 4 -> Injeção do Security service no método salvar Livro Service
	// 5 -> alteração em Livro, agora não recebe mais id do usuario, mas sim o objeto usuario todo

}
