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
	Criando um JAR da aplicação e rodando para entender o fluxo de build

	DE FORMA AUTOMÁTICA:
	1 -> vamos na aba Maven da IDE e selecionamos clean e package no pacote lifecycle

	USANDO LINHA DE COMANDO (NA MÃO):
	1 -> abre o terminal da IDE e damos o comando " ./mvnw clean package -DskipTests "
		 a) ./mvnw clean package : empacota a aplicação pra produção (builda e empacota gerando arquivo .jar)
		 b) -DskipTests          : equivalente a desabilitar os testes na aba maven

	2 -> com isso já podemos ver e acessar o arquivo jar. Na pasta raiz do projeto, no mesmo nível que src
		 temos a pasta target, dentro dela temos nosso .jar (não o .original)

	3 -> CONCERTADO O NOME DA DATABASE NO .YML

	DE FORMA AUTOMÁTICA:
	4 -> click com botão direito no .jar e damos um run

	USANDO LINHA DE COMANDO (NA MÃO):
	4 -> no terminal: java -jar .\target\cadastro-autores-api-0.0.1-SNAPSHOT.jar
	     a) selecionando a pasta (com click) na aba de navegação de pastas (na esquerda da IDE),
	     	digitando até '.\target\' e dando um tab, acontece o auto-complete

	OBS: caso haja falha em rodar o .jar, tentar novamente o mesmo comando no terminal

	*/

}
