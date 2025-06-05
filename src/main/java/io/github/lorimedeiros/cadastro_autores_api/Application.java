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
	Criando as tabelas e testando o banco da AWS

	Liberando a segurança para conexão no banco da aws:
	1 -> na aba de 'Segurança e conexão', vamos na parte 'segurança', em seguida 'Grupos de segurança da VPC'
	2 -> click no link (com nome default)
	3 -> click no id do grupo de segurança
	4 -> em regras de entrda, click em 'editar regras de entrada'
	5 -> click em 'adicionar regra'
	6 -> em 'tipo' selecionamos PostgreSQL, IP escolhemos a opção que está tudo zerado
	7 -> click em 'salvar regras'

	Conectando no pgadmin:
	1 -> no pg admin, buscamos por servers na aba de navegação, click direito > register > server...
	2 -> general    : name = aws (pgadmin)
	3 -> na aba do nosso banco da aws buscamos o endpoint (e copiamos) na parte de segurança e conexão
	4 -> connection : Host name/address = (link endpoint copiado) ; user = postgres ; senha = postgres
	5 -> click em 'save'/'salvar'

	Criando o banco de dados no esquema de aws:
	1 -> na aba, expandimos 'aws', expandimos 'databases'
	2 -> click direito em 'databases' > create > database...
	3 -> general : name = livraria
	4 -> damos um save

	Criando as tabelas:
	1 -> abrimo a query tool do banco recem criado
	2 -> colamos os scripts da file txt 'comandos-tabelas' (presente nos arquivos do projeto) e rodamos
	3 -> rodamos também a linha de código que cria extensão uuid (também está na comandos-tabelas)
	4 -> rodamos os inserts (do arquivo JSON-para-testes)

	Criando conexão com nossa aplicação:
	1 -> acessamos as variáveis de ambiente na IDE
	2 -> modificamos usuario e senha do banco sendo ambos 'postgres'
	3 -> na url do banco:
		 jdbc:postgresql://(Endpoint do banco aws):5432/livraria

	OBS: lembrar de stopar o deploy no docker para desocupar a porta
	OBS: lembrar de definir a IDE para rodar a aplicação local

	Teste no postman:
	1 -> Rodar a aplicação
	2 -> no postman, vamos no pacote OAuth2, na requisição Authorization Code - Postman
	3 -> damos um clear e um get new acess token
	4 -> logamos e copiamos o token
	5 -> realizamos alguma requisição para testar (lembrando de usar autorização bearer token)
	*/

}
