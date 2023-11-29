package com.practica.services.impl;

import com.practica.models.MateriaModel;
import com.practica.repositories.MateriaRepository;
import com.practica.services.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateriaServiceImpl implements IMateriaService {

    @Autowired
    private MateriaRepository materiaRepository;

    @Override
    public MateriaModel crearMateria(MateriaModel materia) {
        return materiaRepository.save(materia);
    }


}
