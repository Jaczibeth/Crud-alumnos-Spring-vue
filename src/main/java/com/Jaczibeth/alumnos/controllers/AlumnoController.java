package com.Jaczibeth.alumnos.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.Jaczibeth.alumnos.model.Alumno;
import com.Jaczibeth.alumnos.repository.AlumnoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoRepository alumnoRepository;
    
    @GetMapping("/traer-alumnos")
    public List<Alumno> TraerAlumnos() {
        return alumnoRepository.findAll();
    
    }
}
