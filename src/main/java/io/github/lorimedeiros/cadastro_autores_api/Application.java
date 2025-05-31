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
	Preparando o banco de dados de produção no docker
	1 -> abrimo o cmd
	2 -> colamos:
	 	 docker run --name livrariadb-prod -d -p 5433:5432 -e POSTGRES_PASSWORD=postgresprod -e POSTGRES_USER=postgresprod -e POSTGRES_DB=livraria --network livraria-network postgres:17.4
		 verificamos se está tudo ok com
		 docker ps
	3 -> agora temos que registrar um novo servidor
		 a) acessamos: http://localhost:15432
		 b) logamos normal com as mesmas informações do db principal
		 c) criamos novo servidor: servers (botão direito) > register > server...
		 d) na nova janela que abrirá, na aba general, name: producao
		 e) aba connection: Host name/address: livrariadb-prod (nome do container)
		 					port: 5432 (estão na mesma network então podem estar na mesma port)
		 					maintenace database: livraria (nome que definimos no --name)
		 					username: postgresprod
		 					password: postgresprod
		 f) damos um save e já podemos ver 'producao' no nível abaixo de servers (na aba de navegação esquerda)
		 g) não tem nenhuma table, então copiamos os comandos de 'comandos-tabelas.txt' e rodamos na query tool
		 OBS: na parte '-p 5433:5432', a segunda parte (5432) nunca muda, pois é a porta do container
	4 -> feito isso, vamos dar insert em um usuário (pelo próprio querry tool) para que seja possível acessar
		 a) antes vamos em: https://bcrypt-generator.com/
		 	para encriptar a senha, pois nossa aplicação só deve aceitar assim (usei senha: admin123)
		 b) agora teremos que habilitar uma função no postgre com o comando:
		 	CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
		 c) agora o insert:
		 	insert into usuario
			(id, login, senha, email, roles)
			values
			(uuid_generate_v4(), 'gerente', '$2a$12$TsSzIh4qwdIQkAssCRkHq.t/WK0.Lg1isMVgiTTPSvJY8cSb8re8.', 'gerente@email.com', '{GERENTE}');
	5 -> agora daremos insert em um client
		 a) secret também deve ser encriptado (usei secret: secret-production)
		 B: INSERT de client:
		 	insert into client
			(id, client_id, client_secret, redirect_uri, scope)
			values
			(uuid_generate_v4(), 'client-production', '$2a$12$y6oaBL/iGR/it83UP6yxgujsH3O.V309P4XShtlUy91o1mXkPraD6', 'http://localhost:8080/authorized', 'GERENTE');
	6 ->
	*/

}
