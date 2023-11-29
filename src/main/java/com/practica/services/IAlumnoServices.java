package com.practica.services;

import com.practica.controllers.dtos.AlumnoDTO;
import com.practica.models.AlumnoModel;

import java.util.List;

public interface IAlumnoServices {

    List<AlumnoModel> findAll();
    AlumnoModel crearAlumno(AlumnoModel alumno);




}
