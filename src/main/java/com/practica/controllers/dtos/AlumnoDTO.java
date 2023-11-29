package com.practica.controllers.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Setter
@Getter
public class AlumnoDTO {

    private Long matricula;
    private String nombreCompleto;
    private List<MateriaDTO> materias;
}
