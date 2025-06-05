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
	Introdução aos serviços de Cloud

	- São serviços que são fornecidos (podendo ser gratuitos, testes ou pagos),
	  esses serviços são, por exemplo: bancos de dados, repositórios git, registry docker, cloud computer.
	  Esses serviços são caracterizados pela necessidade de internet para serem acessados.

	- IAM: Identity Acess Management:
	  Todos os serviços tem um controle de acesso total, onde se pode criar uma conta e é
	  possível adicionar outros usuários para acessar as aplicações/serviços, além de
	  controlar o nível de acesso das pessoas, tudo isso através desses serviços

	- Service Acount:
	  contas especificas para aplicações, afim de não expor suas credenciais

	- Exemplos de serviços cloud: GCP (Google Cloud Plataform), AWS (Amazon Web Services)...

	- Acessando... (GCP):
	  No site da google cloud você realiza login com sua conta google e procura pelo console,
	  que é o painel administrativo dos serviços.
	  Na aba de navegação, acessada pelos três pontos, podemos ver todos os serviços.

	- Acessando... (AWS):
	  Bem semelhante, abrimos a pagina da AWS, logamos e buscamos pela aba de serviços ou console.
	  * Alguns serviços:
	  	+ EC2: Serviço pra Cloud Compute, para criar máquinas virtuais. (criarei uma para fazer deploy do container docker)
	  	+ RDS: Serviço de Banco de Dados
	*/

}
