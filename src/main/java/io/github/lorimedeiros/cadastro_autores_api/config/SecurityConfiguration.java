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

    //essa config é a exata configuração padrão de quando apenas adicionamos a spring security sem configurar nada,
    //ou seja, isso é apenas uma demonstração.

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http
                .csrf(AbstractHttpConfigurer::disable) //como não estamos trabalhando com aplicação web, isso está desabilitado
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults())
                .authorizeHttpRequests(authorize -> {
                    authorize.anyRequest().authenticated();
                    //qualquer requisição que eu fizer tem que estar autenticada
                })
                .build();
    }

    /*
    .formLogin(configurer -> configurer.loginPage("/login.html").successForwardUrl("/home.html"))
    se eu tivesse arquivos html assim eu conectaria essas paginas
    */

}
