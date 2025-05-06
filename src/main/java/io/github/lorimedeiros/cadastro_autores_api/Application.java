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

	// 1 -> criado método userDetailsService na classe SecurityConfiguration
	// 2 -> criado o codificador e decodificador, que é o passwordEncoder usando BCrypt
	// 3 -> foi colcado o encoder.encode nos passwords de userDetailsService
	// FINAL -> depois disso é só dar uma brincadinha no Postman com Basic Auth ou usando o form np browser

}
