package io.github.lorimedeiros.cadastro_autores_api.repository;

import io.github.lorimedeiros.cadastro_autores_api.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {

    Client findByClientId(String clientId);

}
