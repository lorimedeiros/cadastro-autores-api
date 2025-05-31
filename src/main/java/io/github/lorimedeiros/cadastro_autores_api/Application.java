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
	Testando banco de produção com a aplicação
	1 -> vamos nas variáveis de ambiente da IDE e criamos as variáveis:
		 a) DATASOURCE_USERNAME  postgresprod
			DATASOURCE_PASSWORD  postgresprod
			DATASOURCE_URL       jdbc:postgresql://localhost:5433/livraria
		 b) definimos tambem a variável de ambiente 'SPRING_PROFILES_ACTIVE' como valor sendo 'default', por enquanto
	2 -> no postman, pegaremos um token com os dados de produção:
		 a) vamos no pacote: OAuth2 > request: Authorization Code - Postman
		 b) na aba 'Authorization', selecionamos OAuth 2.0, é esperado que isso já esteja configurado
		 	Client ID: client-production
		 	Client Secret: secret-production
		 c) damor um 'clear cookies' + 'get acess token'
		 d) logamos com o usuario criado
		 	login: gerente
		 	senha: admin123
		 e) damos proced e copiamos o acess token criado
	3 -> agora podemos ir numa request simples como 'pesquisar' de livros
	4 -> na authorization da request escolhemos bearer token e colamos o token criado
		 assim sabemos se tudo está funcionando conforme os conformes (devemos receber 200 ok)
	5 ->
	*/

}
