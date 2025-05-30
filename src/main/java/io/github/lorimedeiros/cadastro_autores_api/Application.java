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
	Utilizando variáveis de ambiente no lugar de profiles
	1 -> no yml, foi trocada a 'datasource:url:' pela variável de ambiente '${DATASOURCE_URL}'
		 dentro das chaves, após os dois pontos (:) está o valor padrão, é como dizer:
		 "se não encontrar tal variável de ambiente, use..."
		 com as demais foi feito o mesmo
	2 -> na classe 'DatabaseConfiguration' do pacote 'config', foi posto o log para que seja informada a url do banco

	OBS: uma observação, se não quiser usar nenhum perfil específico de yml, colocar default, isso irá pegar o principal
	OBS2: se der um 'ctrl + F' no log, é possível buscar pela str digitada
	OBS3: para definir algum outro valor na variável de ambiente, que não seja aquele padrão após o ':'
		  é só ir nas configurações de variável de ambiente da IDE e colocar name como sendo o que vem antes
		  dos ':' e o value sendo o outro valor que queremos atribuir.
		  Dessa forma, o valor padrão (que vem depois do :) é ignorado, dando prioridade ao atribuído nas
		  configurações de variável de ambiente da IDE.
	*/

}
