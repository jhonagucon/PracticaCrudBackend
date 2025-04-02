package com.example.model;  // Cambiado a com.example.model

import jakarta.persistence.MappedSuperclass;  // Usamos MappedSuperclass para que esta clase no se mapee a una tabla
import jakarta.persistence.Id;  // Usamos Id de Jakarta Persistence
import jakarta.persistence.GeneratedValue;  // Usamos GeneratedValue para generación automática de ID
import jakarta.persistence.GenerationType;  // Usamos GenerationType para la estrategia de generación de ID
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@MappedSuperclass  // Esto indica que esta clase no se mapea directamente a una tabla
public abstract class Persona {

    @Id  // Marca el campo id como clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // La base de datos generará el id automáticamente
    private Long id;

    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaNacimiento;
}
