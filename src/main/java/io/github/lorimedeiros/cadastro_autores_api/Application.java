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

	// Transformação do usuário que vem do google em tipo CustomAuthentication
	// 1º : Adição do campo email.
	// 1 -> Atualida a tabela 'Usuario' do banco de dados. (script alterando em 'comandos-tabelas.txt'
	// 2 -> Adicionado o atributo email no model de usuario
	// 3 -> Adicionado o atributo email no dto de usuario
	// 4 -> Adição do @Valid no método salvar no controller de usuario, para que as validações do dto funcionem
	// OBS: se ocorrer erro inesperado dar um clean/install

}
