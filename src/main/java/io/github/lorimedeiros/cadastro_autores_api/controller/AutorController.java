package io.github.lorimedeiros.cadastro_autores_api.controller;

import io.github.lorimedeiros.cadastro_autores_api.controller.dto.AutorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autores")
// http://localhost:8080/autores
public class AutorController {

    // ResponseEntity -> Representa todos os dados que podemos retornar em uma resposta (body, headers, cod status)
    @PostMapping
    public ResponseEntity salvar(@RequestBody AutorDTO autorDTO){


        return new ResponseEntity("Autor salvo com sucesso! " + autorDTO, HttpStatus.CREATED);
    }

}
