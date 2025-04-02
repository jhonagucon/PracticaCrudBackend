package com.example.CRUD_Practica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.example")
@EnableJpaRepositories("com.example.repository") // Añadido para asegurar que se escaneen los repositorios
@EntityScan(basePackages = "com.example.model")

public class CrudPracticaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudPracticaApplication.class, args);
    }
}
