package com.practica.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@Table(name = "alumnos")
public class AlumnoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alumno", unique = true, nullable = false)
    private Long idAlumno;

    @Column(unique = true, nullable = false)
    private Long matricula;

    private String nombre;
    @Column(name = "apellido_paterno")
    private String apellidoP;

    @Column(name = "apellido_materno")
    private String apellidoM;

    @OneToMany
    @JoinColumn(name = "id_alumno")
    private Set<MateriaModel> materias;

    private static final long serialVersionUID = 124951768436978979L;

}
