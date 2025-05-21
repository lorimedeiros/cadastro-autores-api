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
	1 -> Criação da entidade Client no pacote model
	2 -> Adição dos comandos sql no .txt
	3 -> Criação, no pacote repository, da classe ClientRepository
	4 -> Criação do service, para realização da lógica de persistencia do Client, bem como seus métodos
	5 -> Criação do controller

	OBS: NO CONTROLLER, não está sendo usado dto apenas para agilizar, MAAAAS, o ideal é criar o dto e mapper

	RegisteredClient : análogo ao User Details; Usado para identificar o usuário, este é o objeto
	contendo Client ID, Client Secret.
	RegisteredClientRepository : análogo ao User Details Service; Busca clients no banco.
	*/

}
