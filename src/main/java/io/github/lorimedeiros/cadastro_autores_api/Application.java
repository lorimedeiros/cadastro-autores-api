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
	Grant Types (ou... fluxo de autenticação(Authentication Flows)):

	- Password Flow (Deprecated - Inseguro):
	  * Surgiu no OAuth1, no OAuth2 ficou inseguro
	  * Funcionamento:
	  	- Usuário acessa o sistema (client), e nesse exato passo está o problema, o usuário
	  	  digita as credenciais no próprio client. Depois o client solicita o token ao
	  	  authorization server, que vai emitir o token e possibilitar o cliente realizar
	  	  requisições para o resource server.
	  	- Autenticações como a do goole (login social), por exemplo, não são digitados login e
	  	  senha na própria aplicação, mas sim no authorization server do google.
		- O grande problema no Password Flow é que o client vai conhecer seu login e senha
		  e ele pode desviar/salvar em alguma base de dados.

	- Authorization Code (Um dos mais seguros (e recomendados) existentes):
	  * Funcionamento:
	  	- PASSO 1:
	  	  Usuário acessa o sistema/client, o client encaminha para o authorization server,
	  	  o usuário é autenticado, estando autenticado ele irá emitir o código de autorização.
	  	  OBS: Código de autorização != Token
	  	  OBS2: Esse é o mesmo fluxo que o google usa
	  	- PASSO 2:
	  	  Retorna essa autorização para o client, client AGORA solicita token ao authorization server
	  	  com seu código de autorização, authorization server emite Token e passa para o client que
	  	  agora, tendo o token, pode realizar requisições para o resource server.

	- Client Credentials:
	  * Comunicação entre API's ou Sistemas
	  * Não existe usuário aqui (por se tratar de API's)
	    - Client requisita token para o authorization server (passando client id e client secred)
	      authorization server emite token com scopes (scopes são tipo as permissões) e manda
	      para o client, por fim o client pode realizar as requisições.

	*/

}
