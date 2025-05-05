package io.github.lorimedeiros.cadastro_autores_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //RestController é para API, esse é para páginas web
public class LoginViewController {

    @GetMapping("/login")
    public String paginaLogin(){ //dentro de um controller, retornamos strings
        return "login"; //aqui colocamos o nome que está no template
    }

}
