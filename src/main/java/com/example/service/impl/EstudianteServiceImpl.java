package com.example.service.impl;

import com.example.dto.EstudianteDTO;
import com.example.model.Estudiante;
import com.example.repository.EstudianteRepository;
import com.example.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    private final EstudianteRepository estudianteRepository;

    @Autowired
    public EstudianteServiceImpl(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public List<EstudianteDTO> obtenerTodosLosEstudiantes() {
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        return estudiantes.stream()
                .map(this::convertToDTO)  // Convierte Estudiante a EstudianteDTO
                .collect(Collectors.toList());
    }

    private EstudianteDTO convertToDTO(Estudiante estudiante) {
        return new EstudianteDTO(
                estudiante.getId(),
                estudiante.getNombre(),
                estudiante.getApellido(),
                estudiante.getEmail(),
                estudiante.getFechaNacimiento(),
                estudiante.getNumeroInscripcion()
        );
    }

    @Override
    public EstudianteDTO crearEstudiante(EstudianteDTO estudianteDTO) {
        Estudiante estudiante = convertToEntity(estudianteDTO);  // Convierte EstudianteDTO a Estudiante
        estudiante = estudianteRepository.save(estudiante);
        return convertToDTO(estudiante);  // Convierte la entidad guardada a EstudianteDTO
    }

    private Estudiante convertToEntity(EstudianteDTO estudianteDTO) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(estudianteDTO.getNombre());
        estudiante.setApellido(estudianteDTO.getApellido());
        estudiante.setEmail(estudianteDTO.getEmail());
        estudiante.setFechaNacimiento(estudianteDTO.getFechaNacimiento());
        estudiante.setNumeroInscripcion(estudianteDTO.getNumeroInscripcion());
        return estudiante;
    }

    @Override
    public EstudianteDTO obtenerEstudiantePorId(Long id) {
        Estudiante estudiante = estudianteRepository.findById(id).orElse(null);
        return estudiante != null ? convertToDTO(estudiante) : null;
    }

    @Override
    public EstudianteDTO actualizarEstudiante(Long id, EstudianteDTO estudianteDTO) {
        Estudiante estudiante = estudianteRepository.findById(id).orElse(null);
        if (estudiante != null) {
            estudiante.setNombre(estudianteDTO.getNombre());
            estudiante.setApellido(estudianteDTO.getApellido());
            estudiante.setEmail(estudianteDTO.getEmail());
            estudiante.setFechaNacimiento(estudianteDTO.getFechaNacimiento());
            estudiante.setNumeroInscripcion(estudianteDTO.getNumeroInscripcion());
            estudiante = estudianteRepository.save(estudiante);
            return convertToDTO(estudiante);
        }
        return null;
    }

    @Override
    public boolean eliminarEstudiante(Long id) {
        Estudiante estudiante = estudianteRepository.findById(id).orElse(null);
        if (estudiante != null) {
            estudianteRepository.delete(estudiante);
            return true;
        }
        return false;
    }
}
