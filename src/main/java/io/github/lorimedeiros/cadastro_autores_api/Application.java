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

	// 1 -> criação do pacote security, bem como a classe CustomUserDetailsService
	// 2 -> remoção dos usuários em memória de SecurityConfiguration, no método userDetailsService
	// admin : admin123
	// tecnico : 123

}
