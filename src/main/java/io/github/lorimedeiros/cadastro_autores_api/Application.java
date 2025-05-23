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
	Como usar o grant type authorization token (token que funciona como o google, single sign-on)
	1 -> criada a requisição nomeada 'Authorization Code - Postman' no folder OAuth2
	2 -> na aba Authorization, selecionar OAuth 2.0 e ir em 'Configure New Token'
	3 -> Grant type : Authorization Code
	4 -> Callback URL : http://localhost:8080/authorized (o mesmo conteudo da coluna redirect_uri dp banco de dados)
	5 -> Auth URL : http://localhost:8080/oauth2/token
	6 -> Access Token URL : http://localhost:8080/oauth2/token
	7 -> Client ID e Client Secret são as msm do client salvo no banco de dados, scope deixa em branco
	8 -> Client Authentication : send as basic auth header
	9 -> dar um clear cookies para limpar sessões anteriores, dar um ctrl + s, dar um 'get new acess token'
	10 -> o proprio postman vai abrir uma aba para o form de login, nisso já é possivel logar com algum usuario
	11 -> apos o login bem sucedido é possivel pegar o token gerado
	*/

}
