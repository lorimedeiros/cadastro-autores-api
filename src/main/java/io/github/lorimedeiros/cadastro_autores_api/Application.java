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

	// Não usaremos mais o método 'UserDetails' da classe 'CustomUserDetailsService' para criar uma Authentication
	// iremos mudar para CustomAuthentication
	// 1 -> criando CustomAuthenticationProvider
	// 2 -> implementando métodos da interface 'AuthenticationProvider'
	// 3 -> desabilitado os user details service (é possivel fazer isso apenas comentando o @Bean em cima do método 'userDetailsService', ao invés de apagar tudo)
	/*
	Tem um detalhe (até esse momento do código) que irá barrar nosso acesso.
	Trocamos o userDetailsService pelo AuthrnticationProvider, PORÉM o uds tinha em seu método a adição automática
	do prefixo "ROLE_" em todas as roles (e isso é obrigatório para a autenticação funcionar),
	por ocorrer debaixo dos panos, de forma automatizada, não percebemos. Já o ap não faz essa adição.

	Em CustomAuthentication temos uma opção de solução para isso (na linha 23).
	No próximo commit resolveremos isso de uma outra forma.
	*/
	// 4 -> colocamos o prefixo "ROLE_" na role em CustomAuthentication

}
