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

	// Customização do usuário. Transformando os dados do Google no meu tipo de usuário.
	// 1 -> Criada a classe CustomAuthentication, dentro do pacote security
	// 2 -> implementados e customizados os métodos do 'implements Authentication'

}
