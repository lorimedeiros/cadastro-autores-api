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
	1 -> gerado/configurado arquivo de log, no applcation.yml
	     a) mas o que e onde aparece esse arquivo de log?
	     	1º assim que rodar o pojeto o arquivo 'app.log' irá aparecer na pasta raiz do projeto, no mesmo nível
	     	   que o .md e o pom.xml
	     	2º seu conteúdo é aquilo que nos é mostrado np console da IDE ao rodarmos o projeto
	*/

}
