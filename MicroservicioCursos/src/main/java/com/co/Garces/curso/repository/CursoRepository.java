package com.co.Garces.curso.repository;

import org.springframework.data.repository.CrudRepository;

import com.co.Garces.common.usuario.entity.Curso;


public interface CursoRepository extends CrudRepository<Curso, Long> {
}
