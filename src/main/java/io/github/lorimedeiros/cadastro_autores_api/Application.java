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
	Customizando e adicionando cores nos logs:
	1 -> No application.yml, no mesmo nível de application (só isso já habilita cores, mas iremos customizar)
		   output:
    	     ansi:
      		   enabled: ALWAYS
    2 -> em 'logging: pattern: console:' está a string de configuração de cores, formato da data foi mudado para o brasileiro
	*/

}
