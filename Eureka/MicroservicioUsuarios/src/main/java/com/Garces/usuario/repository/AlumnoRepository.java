package com.Garces.usuario.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Garces.usuario.entity.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno,Long>{

}
