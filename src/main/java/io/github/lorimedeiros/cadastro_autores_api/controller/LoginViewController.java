package io.github.lorimedeiros.cadastro_autores_api.controller;

import io.github.lorimedeiros.cadastro_autores_api.security.CustomAuthentication;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller //RestController é para API, esse é para páginas web
public class LoginViewController {

    @GetMapping("/login")
    public String paginaLogin(){
        return "login";
    }

    @GetMapping("/")
    @ResponseBody
    public String paginaHome(Authentication auth){
        if (auth instanceof CustomAuthentication customAuth){
            System.out.println(customAuth.getUsuario());
        }
        return "Olá, " +  auth.getName();
    }

}
