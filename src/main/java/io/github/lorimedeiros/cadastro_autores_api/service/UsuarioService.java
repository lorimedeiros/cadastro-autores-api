package io.github.lorimedeiros.cadastro_autores_api.service;

import io.github.lorimedeiros.cadastro_autores_api.model.Usuario;
import io.github.lorimedeiros.cadastro_autores_api.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;
    private final PasswordEncoder encoder;

    public void salvar(Usuario usuario){
        var senha = usuario.getSenha();
        usuario.setSenha(encoder.encode(senha));
        repository.save(usuario);
    }

    public void deletar(Usuario usuario){
        repository.delete(usuario);
    }

    public Usuario obterPorLogin(String login){
        return repository.findByLogin(login);
    }

    public Usuario obterPorEmail(String email){
        return repository.findByEmail(email);
    }

}
