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
	1 -> iniciada a configuração do Authorization Server na classe AuthorizationServerConfiguration, do pacote config.
	2 -> Criação do método authServerSecurityFilterChain e o definindo como principal por meio da anotação @Order

	OBS: sim, alguns métodos estão @Deprecated
	*/

}
