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
	OBS1: foi resolvido um problema no dockerfile (no entrypoint
	OBS2: outro abacaxi, dessa vez eram as variáveis do google, mesmo não sendo usadas, elas precisam receber algum valor

	Realizando deploy do container em produção
	1 -> docker build -t lorimedeiros/cadastro-autores-api:prod .
	2 -> docker run -d --name cadastro-autores-api-production \
  		   -e DATASOURCE_URL="jdbc:postgresql://livrariadb-prod:5432/livraria" \
  		   -e DATASOURCE_USERNAME="postgresprod" \
  		   -e DATASOURCE_PASSWORD="postgresprod" \
  		   -e SPRING_PROFILES_ACTIVE="production" \
  		   -e TZ="America/Sao_Paulo" \
  		   --network livraria-network \
  		   -p 8080:8080 \
  		   -p 9090:9090 \
  		   lorimedeiros/cadastro-autores-api:prod
  	3 -> docker ps
  	4 -> docker logs cadastro-autores-api-production

  	5 -> com isso já está tudo certo e a api já funciona em produção
  		 Se quisermos desativar ela é só stopar o container e ativar novamente é só dar start
	*/

}
