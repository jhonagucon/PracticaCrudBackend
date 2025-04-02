package com.example.model;  // Cambiado a com.example.model

import jakarta.persistence.Entity;  // Usamos Entity de Jakarta Persistence
import jakarta.persistence.Table;  // Usamos Table para especificar el nombre de la tabla en la base de datos

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)  // Incluye los campos de la clase Persona en equals y hashCode
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity  // Marca la clase como una entidad JPA
@Table(name = "docentes")  // Opcional: Especificamos el nombre de la tabla en la base de datos
public class Docente extends Persona {  // Extiende de Persona (que ya tiene los campos comunes)

    private String nroEmpleado;  // Número de empleado del docente
    private String departamento;  // Departamento al que pertenece el docente
}
