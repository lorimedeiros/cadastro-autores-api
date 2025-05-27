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
	Swagger: ferramenta/interface gráfica
	openapi: especificação que define um padrão para escrever APIs REST

	OBS: Existe um pequeno porém em habilitar essa documentação. Se não houvesse segurança habilitada,
		 apenas em adicionar a dependencia ao pom.xml, todo o projeto seria escaneado e documentado,
		 de forma automática. Como já temos segurança habilitada na API veremos como se segue
		 neste cenário (a partir do 2º passo já é essa instrução).

	Habilitando e testando o Swagger Open API no projeto:
	https://springdoc.org/#Introduction
	1 -> dependencia do openapi adicionada ao pom.xml
	2 -> foi desabilitada a segurança em SecurityConfiguration para o Swagger, do pacote config. (assim ele não seria barrado pela segurança)
	3 -> feito isso, é possivel acessar a url padrão do swagger (após subir a aplicação)
		 http://localhost:8080/swagger-ui/index.html
	*/

}
