package io.github.lorimedeiros.cadastro_autores_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http
                .csrf(AbstractHttpConfigurer::disable)
                .httpBasic(Customizer.withDefaults())
                .authorizeHttpRequests(authorize -> {
                    authorize.anyRequest().authenticated();
                })
                .build();
    }

    //httpBasic -> de aplicação para aplicação (por isso usamos no postman
    //formLogin -> de usuário (por isso usamos no navegador
    //OBS: se remover o formulário de login ainda é possivel se credenciar pela web, mas é usando Http Basic

    /*
    Como funciona o sistema da base64 do Basic:
    1 - No postman, vá em Authorization
    2 - Selecione Auth Type 'No Auth'
    3 - Vá em Headers
    4 - Crie o header com key 'Authorization' e value 'Basic' + spacebar
    5 - Vá em: https://www.debugbear.com/basic-auth-header-generator
    6 - Coloque usuário (por padrão é 'user') e a senha dada pelo terminal spring
    7 - Pegue o hash criado pelo site e passe no value da autenticação no postman (depois do spacebar)
    8 - Feito!
    É, basicamente, isso que o Basic faz só que de forma automática no postman quando colocamos user e senha
    */

}
