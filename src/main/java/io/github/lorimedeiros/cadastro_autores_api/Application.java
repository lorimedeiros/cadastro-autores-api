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

	// 1 -> https://github.com/lorimedeiros/Resum-es-muito-importantes-para-o-desenvolver-da-humanidade/blob/main/Spring%20Boot/03.%20Autenticando%20com%20conta%20Google%20.md
	// após todo esse bereguedê de configuração do google cloud... (até o 2º módulo do .md)
	// 2 -> adicionada dependencia oauth2 no pom.xml e reload no maeven (+ clean e install)
	// 3 -> adicionada configração do oauth2 em application.yml (essas chaves são obtidas no google cloud
	// 4 -> dando umas ajustadas no security configuration
	// 5 -> adicionando redirecionamento para raiz (para teste) em login view controller

}
