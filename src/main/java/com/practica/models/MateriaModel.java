package com.practica.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "materias")
@Setter
@Getter
public class MateriaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String materia;
    private Double calificacion;

    @Column(name = "id_alumno")
    private Long idAlumno;

    //@ManyToOne
    //@JoinColumn(name = "id_alumno", table = "alumnos")
    //private AlumnoModel alumno;
}
