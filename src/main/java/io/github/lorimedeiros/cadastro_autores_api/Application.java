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
	Realizando deploy da aplicação spring boot na AWS

	continuação dos comandos na maquina virtual:
	sudo docker run --name livrariaapi -e DATASOURCE_URL=jdbc:postgresql://(endpoint rds):5432/livraria -e DATASOURCE_USERNAME=postgres -e DATASOURCE_PASSWORD=postgres -p 8080:8080 -p 9090:9090 lorimedeiros/cadastro-autores-api
	- 'lorimedeiros/cadastro-autores-api' corresponde ao nome do repositorio do projeto no dockerhub
	OBS: depois disso o Spring irá inicializar nesse terminal

	ajustando segurança para acessar:
	1 -> vamos no menu principal EC2
	2 -> 'grupos de segurança'
	3 -> click no IP do grupo
	4 -> 'editar regras de entrada'
	5 -> 'adicionar regra'
	6 -> TCP Personalizado - TCP - 8080 - Qualquer local IPv4 - 0.0.0.0/0
	7 -> salvar regras

	para acessar (via web):
	1 -> pegamos o public IP (la na parte branca em baixo do cmd linux)
	2 -> vamos no browser e colocamos http://(public IP):8080
	3 -> agora podemos logar com algum de nossos usuarios (aqueles presentes no postgres)

	para acessar (via postman):
	1 -> na request 'authorization code - postman' (vamos pegar o token)
	2 -> na aba Authorization, na callback URL, alteramos para: http://(public IP):8080/authorized
	3 -> auth url e acess token url sofrem essa mesma alteração de trecho

	OBS: o passo a seguir não dará certo se nosso client estiver com a redirect URL ainda apontando para localhost
		 devemos ajustar ela para apontar pro public IP

	4 -> damos um clear cookies e get acess token, por fim copiamos o token para usar na request do proximo passo
	5 -> agora, quando quisermos usar o ip da cloud fazemos o seguinte (exemplo com a requisição de salvar autor):
		 http://(public IP):8080/autores
	*/

}