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
	O que é oauth2?
	Se trata de um protocolo de autorização que permite que aplicativos acessem recursos de um usuário
	em outros serviços, sem que o usuário precise compartilhar suas credenciais.
	Em vez disso (credenciais) o oauth vai usar os tokens de acesso.

	Como funciona?
	Ao invés do usuário estar sempre se autenticando (como é o caso da autenticação basic),
	o usuário se autentica apenas uma vez e então recebe um token, token este que contém uma duração.
	Como um tempo de Sessão, tempo que poderá usar para fazer requisições.

	Conceitos:
	- Authorization Server: Guarda a base de dados de usuário. Autentica e identifica o usuário e o client.

	- Resource Server: Onde se encontra a API, de onde vem os dados que a aplicação client vai acessar.

	- Usuário: Quem está acessando o sistema.

	- Client: Sistema registrado no Authorization Service

	Fluxo:
	Usuário -> Client -> Resource Server
	- Usuário, através do client, acessa o authorization server (sem autenticação)

	Usuário -> Client -> Authorization Server -> Resource Server
	- Usuário vai tentar acessar o authorization server, se precisar se autenticar, o client vai pedir
	  ao authorization server para autenticar esse usuário. Se o usuário conseguir se autenticar,
	  o authorization server vai emitir um token para o client e o client vai conseguir acessar os
	  dados do Resource Server.
	*/

}
