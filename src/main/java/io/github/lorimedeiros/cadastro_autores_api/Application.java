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
	Utilizando Actuator para obter métricas da aplicação (observalidade)
	  - Monitoramento é um ponto muito importante no pós deploy
	    são usadas ferramentas como Prometheus e Grafana para a observalidade.
	    O Actuator pode prover informações para essas ferramentas.

	1 -> dependencia do actuator adicionada ao pom.xml
	2 -> configurando para a url do actuator ser ignorada pelo spring security em securityConfiguration
	3 -> acessando http://localhost:8080/actuator vemos a mensagem que indica que o actuator está ativado
		 podemos ver também os endpoints habilitados
	4 -> acessando http://localhost:8080/actuator/health vemos a saúde da aplicação
	5 -> ativados mais endpoints em application.yml, acessando novamente o endpoint do actuator vemos os novos endpoints
	6 -> acessando http://localhost:8080/actuator/metrics vemos as métricas
	*/

}
