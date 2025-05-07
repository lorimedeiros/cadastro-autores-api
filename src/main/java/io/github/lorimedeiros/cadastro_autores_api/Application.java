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

	// 1 -> criada a model usuario
	// 2 -> script da tabela usuario adicionado + criação da tabela no postgres
	// 3 -> info na pasta external libraries do projeto, clicando em qualquer lugar e digitando 'hibernate' achamos o core
	// 4 -> no core está a versão do hibernate, para que possamos adicionar a dependencia que nos ajudará a transformar as strings da nossa lista 'roles' em array
	// VERSÃO: 6.6
	// OBS: o hibernate sozinho não consegue fazer isso, por isso vamos resolver com uma dependencia extra, a 'hypersistence'
	// https://github.com/vladmihalcea/hypersistence-utils
	// 5 -> buscando por versão, colocamos no pom.xml e carregamos o maven
	// 6 -> foi mexido na classe uduário

}
