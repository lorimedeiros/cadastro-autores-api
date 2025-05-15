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
	   Da forma atual, a aplicação apenas loga por google se já houver um usuário cadastrado anteriormente.
	   Ou seja, cadastrado no postman com o mesmo email google que logamos quando clicamos no botão google.
	   Isso vai ser resolvido nessa versão.
	*/
	// 1 -> Mudanças realizadas no LoginSocialSucessHandler
	// OBS: com isso podemos até logar via formulario preenchendo campos de login e senha
	// (após logar a primeira vez com o google, claro, para que ele possa criar o usuario)
	// usuario sendo tudo antes do @ e senha sendo a senha padrao 666

}
