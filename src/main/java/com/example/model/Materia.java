package com.example.model;  // Cambiado a com.example.model

import jakarta.persistence.Entity;  // Usamos Entity de Jakarta Persistence
import jakarta.persistence.Id;  // Usamos Id de Jakarta Persistence
import jakarta.persistence.GeneratedValue;  // Usamos GeneratedValue de Jakarta Persistence
import jakarta.persistence.GenerationType;  // Usamos GenerationType para la estrategia de generación de ID

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity  // Indica que esta clase es una entidad JPA y se mapeará a una tabla en la base de datos
public class Materia {
    
    @Id  // Marca el campo id como la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // La base de datos generará el id automáticamente
    private Long id;

    private String nombreMateria;
    private String codigoUnico;
    private Integer creditos;
}
