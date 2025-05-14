package io.github.lorimedeiros.cadastro_autores_api.controller;

import io.github.lorimedeiros.cadastro_autores_api.controller.dto.UsuarioDTO;
import io.github.lorimedeiros.cadastro_autores_api.controller.mappers.UsuarioMapper;
import io.github.lorimedeiros.cadastro_autores_api.model.Usuario;
import io.github.lorimedeiros.cadastro_autores_api.service.UsuarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService service;
    private final UsuarioMapper mapper;

    @PostMapping
    public void salvar(@RequestBody @Valid UsuarioDTO dto){
        var usuario = mapper.toEntity(dto);
        service.salvar(usuario);
    }

    public void deletar(@PathVariable("login") String login){
        Usuario usuario = service.obterPorLogin(login);
        service.deletar(usuario);
    }

}
