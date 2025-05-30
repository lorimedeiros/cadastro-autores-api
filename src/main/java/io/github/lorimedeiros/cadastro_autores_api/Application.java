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
	Preparando ambiente para produção através de profiles do Spring
	FORMA 1 (no .yml)
	1 -> criando yml do ambiente de produção
	2 -> mudando yml principal para rodar aplicação no perfil production (com 'profiles:active:')
		 no proprio log, ao rodar a aplicação (3ª linha mais ou menos), são informados quantos e quais perfis estão ativos
		 e isso já possibilita que a aplicação carregue as propriedades de produção (do yml 'application-production'
	3 -> foi criado também o 'application-homologacao' que é uma cópia do yml principal da aplicação
	*/

}
