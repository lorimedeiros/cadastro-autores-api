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
	Criando a instancia do banco de dados no serviço RDS da AWS
	1 -> acessamos o console de serviços aws (fazer login): https://sa-east-1.console.aws.amazon.com/console/home?region=sa-east-1#
		 obs: na hora de realizar login há também uma tela de login como IAM, que são aqueles que acessam a
		 	  aplicação de outra pessoa. Lembrar de logar como host.
	2  -> click no icone da 'Aurora and RDS' (ou pesquisamos pelo serviço)
	3  -> scrollamos até achar a opção 'Criar banco de dados'
	4  -> em 'Escolher um método de criação de banco de dados' escolhemos 'criação padrão'
	5  -> em 'Opções do mecanismo' escolhemos o 'PostgreSQL' que é o banco que estamos usando na aplicação
	6  -> não habilitamos o filtro nem o RDS Extended Support
	7  -> modelo definimos como o gratuito
	8  -> configurações: nome = 'livrariaapi-database' (mas é o nome que quiser)
	9  -> Configurações de credenciais: user = 'postgres' , senha = 'postgres'
	10 -> Acesso público: sim (iremos acessar por fora da AWS)
	11 -> desabilitamos o insights de monitoramento (é pago)
	12 -> o resto deicamos no padrão
	13 -> por fim criamos o banco de dados
	14 -> click no nome do banco de dados para ver detalhes

	Caso deslogue e queira acessar novemente:
	1  -> acessamos a aba do serviço RDS
	2  -> clicamos em 'instancias de banco de dados'
	*/

}
