package com.Jaczibeth.alumnos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jaczibeth.alumnos.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
  
    
}
  