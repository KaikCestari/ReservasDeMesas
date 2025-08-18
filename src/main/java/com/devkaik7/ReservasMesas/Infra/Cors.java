package com.devkaik7.ReservasMesas.Infra;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Cors{

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")        // aplica a todas as rotas
                        .allowedOrigins("http://localhost:3000") // front React
                        .allowedMethods("GET","POST","PUT","DELETE")
                        .allowedHeaders("*");
            }
        };
    }
}