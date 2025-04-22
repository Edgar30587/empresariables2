package com.pruebasaberpro.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pruebasaberpro.app.models.Estudiante;

public interface EstudianteRepository extends MongoRepository<Estudiante, String>{
    // Existing methods
    Estudiante findByCedula(String cedula);
    void deleteByCedula(String cedula);

    // New methods for registro
    Estudiante findByRegistro(String registro);
    void deleteByRegistro(String registro);
}

