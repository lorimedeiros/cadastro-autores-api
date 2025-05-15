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
	// 3º : Retomando o uso da nossa página de login própria
	// 1 -> Reabilitação das linhas comentadas que levavam ao formulário de login próprio em filterchain
	// 2 -> adição do botão de login com google em login.html

	// COMO USAR LOGIN GOOGLE NO POSTMAN?
	// 1 -> em Authentication, selecionar 'No Auth'
	// 2 -> em Headers, criar parâmetro com key = Cookie
	// 3 -> apos logar via google por formulario, R Click e inspecionar
	// 4 -> expandir mais a aba de inspeção até que apareça a aba 'Application'
	// 5 -> Storage > Cookies > localhost:8080
	// 6 -> procurar o JSESIONID e copiar seu valor
	// 7 -> colamos esse valor de sessão no valor do header COM PREFIXO "JSESSIONID=", cuja key é Cookie, do postman
	// ex: JSESSIONID=620737B5FA11CAB1F152060DFA48B59E
	// Feito!!

	// OUTROS SERVIÇOS:
	// E se eu quiser criar mais formas de login? (ex: github, facebook...
	// Simples, vamos no yml e adicionamos, da mesma forma que está o google (client-id, client-secret), outra forma de serviço de login
	// depois adicionamos outro botão para login


}
