package io.github.lorimedeiros.cadastro_autores_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        return http
                .csrf(AbstractHttpConfigurer::disable)
                .httpBasic(Customizer.withDefaults())
                .formLogin(configurer -> {
                    configurer.loginPage("/login").permitAll();
                })
                .authorizeHttpRequests(authorize -> {
                    authorize.requestMatchers("/login").permitAll();
                    //permitAll -> não recomendado, completamente inseguro; APENAS para login
                    //pois qualquer um pode acessar livremente, mesmo não autenticado

                    authorize.requestMatchers(HttpMethod.POST, "/autores/**").hasRole("ADMIN");
                    authorize.requestMatchers(HttpMethod.DELETE, "/autores/**").hasRole("ADMIN");
                    authorize.requestMatchers(HttpMethod.PUT, "/autores/**").hasRole("ADMIN");
                    //assim eu dito que APENAS admin pode alterar autores (os outros roles ainda podem ver com GET)

                    authorize.requestMatchers(HttpMethod.GET, "/autores/**").hasAnyRole("ADMIN", "USER");
                    //deixando explicito que ambos users podem dar get em autores

                    /*
                    authorize.requestMatchers("/autores/**").hasRole("ADMIN");
                    */
                    //** -> se trata de um coringa, pode ler como "qualquer coisa que venha depois do autores/"
                    //assim seria se apenas o admin pudesse acessar qualquer que fosse a requisição de autor

                    authorize.requestMatchers("/livros/**").hasAnyRole("USER", "ADMIN");

                    //hasRole("USER") -> se eu colocasse isso aqui iria restringir o admin de acessar os livros
                    //hasAnyRole() -> agora sim, qualquer role descrita dentro do parâmetro pode acessar essa url

                    authorize.anyRequest().authenticated();
                    //essa linha acima garante que qualquer url, mesmo as não mapeadas, como feito mais acima,
                    //precise que o usuário esteja, ao menos, autenticado para poder acessar
                    //OBS: anyRequest precisa estar por ultimo, como feito aqui, pois ele anula qualquer coisa abaixo dele

                    //ou seja: requestMatchers permite apontar uma url especifica; anyRequest para aplicar ação em todas

                    // Authority x Role
                    // role é um grupo de usuário, papel que você exerce na empresa
                    // authority é uma permissão de executar uma tarefa/operação
                })
                .build();
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(10);
    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder encoder){

        UserDetails user1 = User.builder()
                .username("usuario")
                .password(encoder.encode("123"))
                .roles("USER")
                .build();

        UserDetails user2 = User.builder()
                .username("admin")
                .password(encoder.encode("321"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user1, user2);

    }

}
