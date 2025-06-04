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
	Enviando a imagem da nossa aplicação para o dockerhub
	https://hub.docker.com
	1 -> entro com github
	2 -> no terminal da IDE:
		 docker tag lorimedeiros/cadastro-autores-api:prod lorimedeiros/cadastro-autores-api:latest
		 docker login    #isso vai ser automático se já estiver logado no docker pelo aplicativo
		 docker push lorimedeiros/cadastro-autores-api

	3 -> https://hub.docker.com/repositories/lorimedeiros
	     agora aparece seguindo o link acima
	*/

}
