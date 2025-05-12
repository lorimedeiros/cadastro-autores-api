package io.github.lorimedeiros.cadastro_autores_api.security;

import io.github.lorimedeiros.cadastro_autores_api.model.Usuario;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collection;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Getter
public class CustomAuthentication implements Authentication {

    private final Usuario usuario;

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        return this.usuario
                .getRoles()
                .stream().map(role -> new SimpleGrantedAuthority(role))
                .collect(Collectors.toList());
    } //aqui retornamos os Authorities (que são as roles do nosso usuário, existe uma lista pra isso na classe usuário)

    @Override
    public Object getCredentials() {
        return null;
    } //implementação será feita posteriormente

    @Override
    public Object getDetails() {
        return usuario;
    }

    @Override
    public Object getPrincipal() {
        return usuario;
    }

    @Override
    public boolean isAuthenticated() {
        return true;
    } //se deixar false, você nunca vai conseguir logar

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {

    }

    @Override
    public String getName() {
        return usuario.getLogin();
    }
}
