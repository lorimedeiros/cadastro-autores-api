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
	Configurando a máquina na cloud com o serviço EC2 da AWS
	1  -> buscamos pelo serviço EC2 no menu da AWS
	2  -> buscamos pelo botão 'Executar instância' na página do EC2
	3  -> 'Nome e tags' = livraria-server
	4  -> 'Imagem do sistema operacional' = Amazon Linux
	5  -> 'Par de chaves (login)' > 'Criar novo par de chaves' > nome = livraria-rsa > 'Criar par de chaves'
	6  -> em 'Configurações de rede' selecionamos 'Selecionar grupo de segurança existente' e selecionamos o grupo default
	7  -> vamos em 'Executar instância'
	8  -> ao lado da mensagem verde de sucesso temos o link da instancia criada, click nele
	9  -> click no link em 'id da instancia'
	10 -> click em 'conectar' (localizado bem abaixo de 'resumo da instancia'

	OBS: ABRIR OUTRA ABA E NÃO FECHAR ESSA DE CONEXÃO

	11 -> abrimos o menu EC2 em outra aba e buscamos por 'grupos de segurança'
	12 -> click no id do grupo de segurança
	13 -> click em 'editar regras de entrada'
	14 -> click em 'adicionar regra'
	15 -> SSH - TCP - PORTA 22 - 18.228.70.32/29
		  na pior das hipoteses procuramos manualmente o IP da nossa região em:
		  https://ip-ranges.amazonaws.com/ip-ranges.json
		  buscamos: "region": "sa-east-1", "service": "EC2_INSTANCE_CONNECT"
	16 -> 'salvar regras'
	17 -> voltamos naquela pagina de conexão e conectamos

	18 -> daremos alguns comandos linux na máquina virtual que irá abrir
		  sudo yum update
		  - para atualizar o linux da maquina virtual
		  sudo yum install docker
		  y
		  - para instalar o docker em nossa máquina
		  sudo service docker start
		  - inicia o serviço docker
		  sudo docker ps
		  - para testar se está funcionando

	OBS: proximo commit iniciarei o container
	*/

}