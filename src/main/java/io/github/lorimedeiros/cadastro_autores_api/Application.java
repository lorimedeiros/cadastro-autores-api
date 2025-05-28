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
	Configurações de um log:
	root -> Log pai de todos; é a configuração para toda a aplicação

	- No geral, temos 5 níveis de log
		Níveis em ordem hierarquica
		1. TRACE
		2. DEBUG
		3. INFO
		4. WARN
		5. ERROR

		obs : como se trata de uma hierarquia, quando habilitamos um nivel, habilitamos todos abaixo dele
			  ex: se habilitarmos o trace, habilitamos tudo.
		obs2: não é recomendado ativar o trace, ele trás exatamente tudo que é log e isso pode gerar erros
			  e, se a aplicação estiver na cloud, consome cloud

	1 -> no apllication.yml, definida a rootlog como warn (linha 27)
		 é o melhor e menos gastoso.

	2 -> definindo que os logs da minha pasta controller serão nível error para teste (isso foi mudado
		 io:
      	   github:
             lorimedeiros:
               controller: error

	3 -> web terá logs nivel debug (linhas 33) e security trace (linha 34)

	4 -> foi definido meu pacote github.lorimedeiros como 'trace', isso anula a parte 2

	5 -> habilitado o log na classe AutorController com @Slf4j

	6 -> habilitando leveis de log no metodo de pesquisa de AutorController
		 lembrando que o nível ativado no meu pacote já é trace, isso já faz não necessário ativar níveis,
		 automatico já ira mostrar tudo, graças ao trace no pacote

	obs: para que os logs de método apareçam, é só fazer requisição (no postman ou swagger)
		 isso fará os logs aparecerem proximos ao select da requisição
	*/

}
