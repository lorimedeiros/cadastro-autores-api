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

	// finalidade: entender como o security aplica roles (temos USER e ADMIN definidas)
	// 1 -> no método securityFilterChain, dentro de .authorizeHttpRequests estão os métodos e explicações
	// 2 -> é possivel testar no postman as autorizações e negações.
	// 403 Forbidden significa que foi barrado; senha incorreta seria 401

}
