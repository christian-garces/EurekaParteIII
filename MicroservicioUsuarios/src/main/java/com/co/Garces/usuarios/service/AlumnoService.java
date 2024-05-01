package com.co.Garces.usuarios.service;

import com.co.Garces.common.service.CommonService;
import com.co.Garces.common.usuario.entity.Alumno;

import java.util.Optional;


public interface AlumnoService extends CommonService<Alumno> {
    Optional<Alumno> findById(Long id);
    Alumno save(Alumno alumno);
}
