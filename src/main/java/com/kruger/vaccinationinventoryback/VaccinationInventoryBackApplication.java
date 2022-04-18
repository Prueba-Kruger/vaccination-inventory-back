package com.kruger.vaccinationinventoryback;

import com.sun.istack.NotNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class VaccinationInventoryBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(VaccinationInventoryBackApplication.class, args);
    }

    @Bean(name = "customCorsFilter")
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(@NotNull CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedMethods("*")
                        .allowedOriginPatterns(
                                "https://.*\\.domain\\.com.*",
                                "http://.*\\.domain\\.com.*",
                                "http://localhost:4200/graphql/login",
                                "http://localhost:4200/graphql",
                                "http://localhost:4200",
                                "localhost:4200",
                                "https://int.megapicking.megaprofer.com/",
                                "https://int.megapicking.megaprofer.com/graphql",
                                "https://int.megapicking.megaprofer.com/graphql/login"
                        );
            }
        };
    }

}
