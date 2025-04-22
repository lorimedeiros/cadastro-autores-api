package io.github.lorimedeiros.cadastro_autores_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // também necessaria para que o listener funcione (na classe autor
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
