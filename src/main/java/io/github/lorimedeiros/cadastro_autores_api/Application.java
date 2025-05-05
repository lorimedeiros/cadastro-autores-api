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

	// 1 - import da thymeleaf no pom.xml
	// 2 - criação da view de login
	// 3 - criação da configuração MVC WebConfiguration + registro da view
	// 4 - criação do controller para acessar a pagina atraves do /login
	// 5 - por ultimo colocamos a customização no securityconfiguration

}
