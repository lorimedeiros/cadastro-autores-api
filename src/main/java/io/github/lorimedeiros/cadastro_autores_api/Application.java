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
	1 -> Criação da classe OpenApiConfiguration e configuração simples com anotações
	2 -> Modificando operações
		 a) alterações feitas em AutorController, tag para nomear classe
		 	operation nome e descrição de método; apiresponses para customizar (em caso de multiplas) as respostas da requisição
		 b) alterada a classe AutorDTO. schema usado para customizar nome da classe
		 	schema pode também ser usado para modificar nomes de propriedades de dto's
		 c) por termos o GlobalExceptionHandler, as operações mapeiam também os response codes dos erros que o
		 	handler captura
	...outras alterações repetitivas feitas!
	*/

}
