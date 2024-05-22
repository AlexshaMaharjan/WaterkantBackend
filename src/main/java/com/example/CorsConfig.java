package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/chat") // Allow CORS for the '/chat' endpoint
                .allowedOrigins("http://localhost:63342") // Allow requests from this origin
                .allowedMethods("GET", "POST"); // Allow only GET and POST methods
    }
}
