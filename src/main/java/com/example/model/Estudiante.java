package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data  // Lombok generará automáticamente los getters y setters
@NoArgsConstructor  // Constructor sin parámetros
@AllArgsConstructor  // Constructor con todos los parámetros
@Builder  // Usamos el patrón builder
@Entity  // Marca la clase como una entidad JPA
public class Estudiante extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroInscripcion;
}
