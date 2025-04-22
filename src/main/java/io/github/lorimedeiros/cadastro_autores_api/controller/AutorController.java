package io.github.lorimedeiros.cadastro_autores_api.controller;

import io.github.lorimedeiros.cadastro_autores_api.controller.dto.AutorDTO;
import io.github.lorimedeiros.cadastro_autores_api.model.Autor;
import io.github.lorimedeiros.cadastro_autores_api.service.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/autores")
// http://localhost:8080/autores
public class AutorController {

    private final AutorService service;

    public AutorController(AutorService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody AutorDTO autorDTO){
        Autor autorSalvo = service.salvar(autorDTO.mapearParaAutor());

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(autorSalvo.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutorDTO> obterDetalhes(@PathVariable("id") String id){
        var idAutor = UUID.fromString(id);
        Optional<Autor> autorOptional = service.obterPorId(idAutor);

        if (autorOptional.isPresent()) {
            Autor autor = autorOptional.get();
            AutorDTO dto = new AutorDTO(
                    autor.getId(),
                    autor.getNome(),
                    autor.getDataNascimento(),
                    autor.getNacionalidade());
            return ResponseEntity.ok(dto);
        }

        return ResponseEntity.notFound().build();
    }

}
