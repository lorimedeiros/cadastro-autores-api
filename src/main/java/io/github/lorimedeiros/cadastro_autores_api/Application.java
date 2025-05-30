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
	Preparando ambiente para produção através de profiles do Spring
	FORMA 2 (cariáveis de ambiente, sem necessidade de arquivos adicionais)
	1 -> ao fim das linhas da configuração principal do yml foram dados 3 '-'
		 isso representa a separação entre um ambiente e outro
		 obs: o comentário é opcional, coloquei para eu não me perder
	2 -> nisso, podemos mudar de perfil no 'profiles:active:' da mesma forma, o nome dos perfís são definidos
		 nas configurações 'spring:config:activate:on-profile:'

	obs: o 'spring:config:activate:on-profile:' pode receber mais de um ambiente separados por virgula

	3 -> finalmente a forma variável de ambiente:
		 a) comentamos ou removemos a parte 'profiles:active: production'
		 b) vamos na barrinha da IDE intellij, no mesmo nível que o botão run e procuramos pelo botão Application
		    é o botão que está selecionando a classe application que tem o main da aplicação, click no botão
		 c) do lado direito de Application click no (> ou :), em seguida 'edit'
		 d) na janela que abrirá vamos em 'enviroment variables' e no botão 'edit enviroment variables'
		 e) na nova janela que abrirá iremos em 'user enviroment variables' e click no '+'
		 f) criamos a variable com name: SPRING_PROFILES_ACTIVE e value: production e damos um ok e apply

		 SPRING_PROFILES_ACTIVE=production
	*/

}
