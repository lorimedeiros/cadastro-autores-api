package io.github.lorimedeiros.cadastro_autores_api.service;

import io.github.lorimedeiros.cadastro_autores_api.repository.LivroRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LivroService {

    private final LivroRepository repository;

}
