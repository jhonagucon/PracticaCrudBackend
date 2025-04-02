package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
    
}
