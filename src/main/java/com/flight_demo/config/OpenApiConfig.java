package com.flight_demo.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {

        return new OpenAPI()
                .info(
                        new Info()
                                .title("Flight Status API")
                                .version("1.0")
                                .description("Live Flight Status REST API")
                                .contact(
                                        new Contact()
                                                .name("Columbus Challenge")))
                .externalDocs(
                        new ExternalDocumentation()
                                .description("Documentation"));
    }
}