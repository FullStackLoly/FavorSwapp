package com.grupo2.favorswapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Permitir a todas las rutas
                        .allowedOrigins("*") // Permitir a todas las origenes, en producción debe limitarse a la URL de tu frontend
                        .allowedMethods("GET", "PATCH", "POST", "PUT", "DELETE") // Permitir los métodos HTTP especificados
                        .allowedHeaders("*"); // Permitir todos los encabezados
            }
        };
    }
}

