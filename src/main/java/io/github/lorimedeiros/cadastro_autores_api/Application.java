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
	Como se autenticar em outro microserviço (outra aplicação Spring Boot):
	1) Criando uma nova aplicação (para testar, já que não temos, no momento, outra aplicação real):
	   1 -> criar um novo projeto spring no https://start.spring.io/
	   2 -> project : maven; lenguage : java; spring boot verion : mais recente e estável possível;
	   3 -> Project metadata =
	   			Group : io.github.lorimedeiros
	   			Artifact & Name : resourceserver (ou qualquer outro nome para a aplicação)
				Packaging : Jar
				Java : 21 ou, de preferência, o mesmo usado no projeto
	   4 -> dependencias : spring web, spring security, OAuth2 Resource Server
	   5 -> dar generate nesse novo projeto montado e abrir (preferível em uma nova janela) no intellij

	2) No IntelliJ
	   1 -> criada uma classe RSController no pacote principal (mesmo da classe Application) e anotada como @RestController
	   2 -> nesta classe foram criados os métodos =
	   		@GetMapping("/public")
	   		public ResponseEntity<String> publicEndpoint(){
	   			return ResponseEntity.ok("PUBLIC ENDPOINT OK!");
	   		}

	   		@GetMapping("/private")
	   		public ResponseEntity<String> privateEndpoint(){
	   			return ResponseEntity.ok("PRIVATE ENDPOINT OK!");
	   		}
	   3 -> criada também uma classe SecurityConfiguration no pacote principal anotada com @Configuration e @EnableWebSecurity
	   4 -> métodos da SecurityConfiguration =
	   		@Bean
	   		public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

	   			http.csrf(AbstractHttpConfigurer::disable)
	   				 	 .authorizeHttpRequest(auth -> {
	   				 	 	 auth.requestMatchers("/public/**").permitAll();
	   				 	 	 auth.anyRequest().authenticated();
	   				 	 })
	   				 	 .oauth2ResourceServer(oauthRS -> oauth2RS.jwt(Customizer.withDefaults()));
	   			return http.build();

	   		}
	   5 -> no application.properties/yml adicionamos as seguintes configurações =
	   		(aqui esta em .properties)
	   		spring.security.oauth2.resourceserver.jwt.issuer-uri=http://localhost:8080
	   		server.port=8081
	   		(sim, alteramos a porta, pois a 8080 está com a aplicação original, isso causaria o erro de 'porta ocupada')

	3) No postman
	   1 -> criamos (pode ser no folder OAuth2 que estão as requests da outra aplicação) a request 'Resource Server Test'
	   2 -> definimos a url dessa request como sendo: http://localhost:8081
	   3 -> acessamos o http://localhost:8081/public e recebemos um ok, se tentarmos o .../private recebemos um Unauthorized
	   4 -> vamos na (outra) request 'Authorization Code - Postman', damos um 'clear cookies' e 'get new acess token'
	   5 -> logamos com algum usuário e copiamos o token criado
	   6 -> voltamos no 'Resource Server Test' e acessamos a aba 'Headers', criamos o header 'Authorization' e colamos o token copiado no valor desse header
	   7 -> fazendo isso, recebemos um ok do .../private também

	Feito!
	Assim conectamos/rodamos a aplicação (a porta 8081) com o token de outra (porta 8080), ou seja, a 8080 vira nosso servidor de autenticação.
	*/

}
