package io.github.lorimedeiros.cadastro_autores_api.security;

import io.github.lorimedeiros.cadastro_autores_api.model.Usuario;
import io.github.lorimedeiros.cadastro_autores_api.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SecurityService {

    private final UsuarioService usuarioService;

    public Usuario obterUsuarioLogado(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        UserDetails userDetails = (UserDetails) auth.getPrincipal();

        String login = userDetails.getUsername();
        return usuarioService.obterPorLogin(login);
    }

}
