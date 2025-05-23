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
	Acessar via browser:
	http://localhost:8080/oauth2/authorize?response_type=code&client_id=meu-client&redirect_uri=http%3A%2F%2Flocalhost%3A8080%2Fauthorized

	Criada requisição 'Authorization Code - Manual'
	no parâmetro 'code' do body é colado o code gerado no link acima

	1 -> novo caminho adicionado no LoginViewController
	*/

}
