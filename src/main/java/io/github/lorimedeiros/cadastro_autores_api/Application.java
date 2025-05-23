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
	Como obter um token JWT utilizando Client Credentials (no postman)
	1 -> Foi criado um novo folder com nome "OAuth2" no nosso esquema de livraria do postman
	2 -> dentro desse folder foi criada uma nova requisição, essa requisição não precisa de URL nem se preocupar com o metodo
	3 -> foi acessada a aba Authorization
	4 -> Auth Type : OAuth 2.0
	5 -> Agora iremos configurar um novo token
	6 -> na parte 'Configure New Token'...
	7 -> Grant type : Client Credentials
	8 -> Access Token URL : http://localhost:8080/oauth2/token
	9 -> Client ID e Client Secret são aqueles registrados e salvos aqui no 'JSON-para-testes.txt' (meu-client e client-secret, respectivamente)
	10 -> Scope : GERENTE (presente no mesmo local que estão o id e secret)
	11 -> Client Authentication : SEND AS BASIC AUTH HEADER (configuramos isso na linha 45 da classe CustomRegisteredClientRepository)
	12 -> dar um 'get new acess token' (obs: deve subir a applicação para dar certo esse passo)
	13 -> dê um proceed
	14 -> agora é possivel copiar o token na parte 'acess token' da janela que irá abrir

	15 -> no site jwt.io é possivel colar esse token e testar o mesmo, colando no lugar do token padrão do site

	Como usar o token?
	1 -> vá em alguma requisição qualquer do postman, ex: livros -> pesquisa
	2 -> em authorization selecionar 'bearer token' e cole o token no campo
	3 -> agora só dar um send e ser feliz

	Mas e se eu quiser fazer na mão? (sem postman ajudar)
	1 -> na pasta OAuth2 do postman crie a requisição 'Client Credentials - manual'
	2 -> em authorization dessa request escolhemos a 'no auth'
	3 -> em headers dessa request crie o header 'Authorization'
	4 -> vá no site https://www.debugbear.com/basic-auth-header-generator
	5 -> no site, monte um token passando como username o client id e como password o client secret
	6 -> copie o token criado, a partir da palavra Basic e cole no Value da key Authorization da request no postman
	7 -> no body da request, selecionar o tipo 'x-www-form-urlencoded'
	8 -> conteúdo do body:
		 Key : grant_type , Value : client_credentials
		 Key : scope , Value : GERENTE
	9 -> Request method : POST , url : http://localhost:8080/oauth2/token
	10 -> ctrl + s, para salvar essa request montada
	11 -> send na request montada
	12 -> e pronto, o token criado vem no body da resposta
	*/

}
