package com.api.producermensageria.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class OpenAPIConfig {

    @Bean
    public OpenAPI baseOpenAPI(){
        return new OpenAPI().info(new Info()
                .title("API de produção de mensagens")
                .description("Cria mensagens em uma fila de clientes"));
    }

}
