package com.example.service;

import java.util.List;

import com.example.dto.EstudianteDTO;

public interface IEstudianteService {

    List<EstudianteDTO> obtenerTodosLosEstudiantes();

    EstudianteDTO crearEstudiante(EstudianteDTO estudianteDTO);

    EstudianteDTO obtenerEstudiantePorId(Long id);

    EstudianteDTO actualizarEstudiante(Long id, EstudianteDTO estudianteDTO);

    boolean eliminarEstudiante(Long id);
}
