package io.github.lorimedeiros.cadastro_autores_api.controller;

import io.github.lorimedeiros.cadastro_autores_api.model.Client;
import io.github.lorimedeiros.cadastro_autores_api.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) //isso faz com que não seja necessário um retorno tipo ResponseEntity
    @PreAuthorize("hasRole('GERENTE')")
    public void salvar(@RequestBody Client client){
        service.salvar(client);
    }

}