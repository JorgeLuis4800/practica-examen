package com.practica.controllers;

import com.practica.controllers.dtos.AlumnoDTO;
import com.practica.controllers.dtos.MateriaDTO;
import com.practica.models.AlumnoModel;
import com.practica.models.MateriaModel;
import com.practica.services.IAlumnoServices;
import com.practica.services.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private IAlumnoServices alumnoServices;

    @Autowired
    private IMateriaService materiaService;

    @GetMapping("/buscar/calificaciones")
    public List<AlumnoDTO> obtenerAlumnosYCalificaciones() {
        List<AlumnoDTO> alumnoDTOS = alumnoServices.findAll().stream().map(alumnoModel -> {
            AlumnoDTO alumnoDTO = new AlumnoDTO();
            alumnoDTO.setMatricula(alumnoModel.getMatricula());
            alumnoDTO.setNombreCompleto(alumnoModel.getNombre().concat(" ") + alumnoModel.getApellidoP().concat(" ") + alumnoModel.getApellidoM());
            List<MateriaDTO> materias = alumnoModel.getMaterias().stream().map(materiaModel -> {
                MateriaDTO materiaDTO = new MateriaDTO();
                materiaDTO.setNombre(materiaModel.getMateria());
                materiaDTO.setCalificacion(materiaModel.getCalificacion());
                return materiaDTO;
            }).collect(Collectors.toList());
            alumnoDTO.setMaterias(materias);
            return alumnoDTO;
        }).collect(Collectors.toList());
        return alumnoDTOS;
    }

    @PostMapping("/crear")
    public AlumnoModel crearAlumno(@RequestBody AlumnoModel alumno){
        return alumnoServices.crearAlumno(alumno);
    }

    @PostMapping("/crear/materia")
    public AlumnoModel crearAlumnoMateria(@RequestBody AlumnoModel alumno, @RequestBody MateriaModel materiaModel){
        alumnoServices.crearAlumno(alumno);
        materiaService.crearMateria(materiaModel);


        return null;
    }

}
