package io.github.lorimedeiros.cadastro_autores_api.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Livraria API",
                version = "v1",
                contact = @Contact(
                        name = "Lori Medeiros",
                        email = "lori.medeiros@livrariaapi.com",
                        url = "livrariaapi.com"
                )
        )
)
public class OpenApiConfiguration {
}
