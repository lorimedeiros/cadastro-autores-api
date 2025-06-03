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
	Construindo a imagem Docker da aplicação através do Dockerfile
	1 -> Na pasta raíz do projeto (cadastro-autores-api), click direito > new > file
		 e criamos a file com nome 'Dockerfile'

	OBS: caso ainda não tenha o plugin do docker na IDE, intalar

	2 -> Na IDE podemos ver a aba docker. Na barra inferior, no mesmo nível que terminal temos 'Services'
		 click nele e deverá aparecer Docker com seus container e afins

	3 -> Agora teremos que construir esse arquivo docker com base em 2 partes 'build' e 'run'
		 1º O Build:
		 	CONTEXTO:  para fazer o build precisamos ir no maven e dar um clean + package
		 		       ou seja, para fazer um build precisaremos da imagem do maven
		 	RESOLUÇÃO: vamos no navegador e buscamos por https://hub.docker.com/ onde estão registradas
		 			   as imagens docker da comunidade.
		 			   Na barra de search buscamos por 'maven' e selecionamos o oficial (geralmente o primeiro)
		 			   Click em 'tags'

		 			   (depois vamos no filter tags e digitamos 21 (que é a versão da jdk que estou
		 			   usando, mas isso pode ser ajustado de projeto pra projeto)
		 			   Pode ser usado qualquer uma daquelas imagens, portanto que a versão bata)

		 			   Buscamos pela tag '3.8.8-amazoncorretto-21-al2023'
		 			   e colamos no dockerfile

		   EXPLICAÇÃO: FROM maven:3.8.8-amazoncorretto-21-al2023
		 			   FROM  : comando docker
		 			   maven : nome da imagem
		 			   o que vem depois dos ':' é a tag

					   WORKDIR /build
					   construindo dentro da imagem uma pasta build
					   pode ser dado o nome que quiser

					   COPY . .
					   comando para copiar que resebe 2 parâmetros
					   primeiro . é qual arquivo quer copiar (toda pasta atual, todo o projeto
					   segundo . para botar dentro da pasta build, issó funciona pois o comando acima já faz com que build seja a pasta selecionada para execução de comandos

					   RUN mvn clean package -DskipTests
					   mesmo comando usado anteriormente para criar o jar

		 2º O RUN: aqui pegamos o jar criado dentro do build e copiamos dentro da pasta app
		 		   exportmaos também as portas 8080, da aplicação e a 9090, do actuator com EXPOSE
		 		   definimos quais variáveis de ambiente usaremos com ENV, as definimos como vazias, por hora
		 		   já em spring profiles definimos o perfil como production
				   definimos timezone com TZ
				   ENTRYPOINT é o comando para inicializar a aplicação

	*/

}
