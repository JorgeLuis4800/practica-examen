package com.practica.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MateriaEnum {

    MATEMATICAS ("Matematicas"),
    ESPANOL ("Espanol"),
    QUIMICA ("Quimica");

    private String descripcion;

}
