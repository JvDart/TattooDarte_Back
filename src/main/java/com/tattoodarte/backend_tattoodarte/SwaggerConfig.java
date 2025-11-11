package com.tattoodarte.backend_tattoodarte;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("tattoo-api")
                .packagesToScan("com.tattoodarte.backend_tattoodarte.controller")
                .build();
    }

    // Personalización del OpenAPI
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("TattooDarte API")
                        .version("1.0")
                        .description("Documentación de la API para la aplicación TattooDarte"))
                .servers(List.of(new Server().url("http://localhost:8080").description("Servidor local")));
    }
}
