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

	// 2ª forma (e a que usarei definitivamente) de se livrar dos problemas com o prefixo ROLE_
	// 1 -> removido o "ROLE_ +" da linha 23 de CustomAuthentication
	// 2 -> criada a instancia do construtor grantedAuthorityDefaults em SecurityConfiguration

}
