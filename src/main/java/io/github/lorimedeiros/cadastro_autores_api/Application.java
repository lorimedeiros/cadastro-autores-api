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
	Configurando o Authorization Server
	1 ->  Adição da dependência do starter no pom.xml

	OBS: esse projeto já é um resource server. Agora sera resource server E Authorization Server.
		 Pode ser implementado tanto junto quanto separado. Aqui será feito junto.
	*/

}
