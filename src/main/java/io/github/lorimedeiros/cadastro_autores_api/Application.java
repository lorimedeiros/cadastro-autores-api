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

	// Usando variáveis de ambiente na applicação
	// 1 -> modificações feitas no yml (referenciação das variáveis de ambiente)
	// 2 -> Na IDE, na barra de opções superior, temos a opção 'Run' > 'Debug Configurations'
	// 3 -> Selecionar o icone +, tipo 'Application'
	// 4 -> Name : Application; java : VersãoUtilizadaNoProjeto; Main : faça o caminho io.github...Application
	// 5 -> Neste ponto já será notória a caixinha 'environment variables', apertar no botão da extrema direita da caixa
	// 6 -> Criar as 2 variáveis do yml (GOOGLE_CLIENT_ID e GOOGLE_CLIENT_SECRET)
	// 7 -> Dar a elas os valores dessas chaves

	// claro que eu apaguei o projeto no google cloud
	// desvantagem: agora, toda vez que for abrir o projeto no intellij terá que colocar novamente aquelas variáveis de ambiente

}
