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
	Removendo erros gerais que o handler faz aparecer nos métodos do swagger
	1 -> alterações no application.yml


	Adicionando a autenticação com token no swagger
	1 -> remoção de authentication basic do filter chain, na classe SecurityConfiguration
	2 -> adição do botão de autenticação no OpenApiConfiguration bem como algumas configurações de segurança
	no swagger
	1 -> ao tentar dar qualquer comando receberemos um unauthorized por não estarmos autenticados, porém agora temos um botão 'authorize' no extremo direito do lado de servers
	2 -> click neste botão e abrirá a janela que solicita um token
	3 -> abrimos o postman, pacote OAuth2, request 'Authorization Code - Postman'
	4 -> (levando em consideração que já esteja tudo pré configurado) clear cookies + get new acess token + proced
	5 -> copiamos o acess token, colamos e confirmamos no swagger, dê um close nessa janelinha
	Feito!


	E se eu quiser trazer o swagger (já existente) de um outro projeto
	1 -> no postman, no mesmo nível de my workspace, click em import,
	2 -> cole a url do swagger no espaço url dessa janela de import e confirme com um click em import
	*/

}
