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

	// Transformação do usuário que vem do google em tipo CustomAuthentication
	// 2º : Implementação da estratégia de recepção de usuário autenticado do google e transformação do mesmo em CustomAuthentication
	// 1 -> Iniciação da onfiguração manual do oauth2 no securityFilterChain de SecurityConfiguration
	// 2 -> Implementação da classe LoginSocialSucessHandler para uso na configuração manual do filterchain
	// 3 -> Adicionado o sucessHandler no filterchain
	// 4 -> Adição do método obterPorEmail no usuario service
	// 5 -> implementação do findByEmail no repository de usuario

}
