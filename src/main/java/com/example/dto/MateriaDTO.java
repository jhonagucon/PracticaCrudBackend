package com.example.dto;  // Cambiado a com.example.dto

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MateriaDTO {

    private Long id;
    private String nombreMateria;
    private String codigoUnico;
    private Integer creditos;
}
