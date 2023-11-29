package com.practica.services.impl;

import com.practica.controllers.dtos.AlumnoDTO;
import com.practica.models.AlumnoModel;
import com.practica.repositories.AlumnoRepository;
import com.practica.services.IAlumnoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class AlumnoServiceImpl implements IAlumnoServices {

    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public List<AlumnoModel> findAll() {
        return alumnoRepository.findAll();
    }

    @Override
    public AlumnoModel crearAlumno(AlumnoModel alumno) {
        return alumnoRepository.save(alumno);
    }
}
