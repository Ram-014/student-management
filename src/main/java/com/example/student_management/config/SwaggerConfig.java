package com.example.student_management.config;



import io.swagger.v3.oas.models.OpenAPI;

import org.springframework.context.annotation.*;

@Configuration

public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI(){

        return new OpenAPI();
    }
}
