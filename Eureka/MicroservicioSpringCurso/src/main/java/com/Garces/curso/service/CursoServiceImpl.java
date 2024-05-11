package com.Garces.curso.service;

import org.springframework.stereotype.Service;

import com.Garces.common.usuario.models.entity.Curso;
import com.Garces.commons.service.CommonService;
import com.Garces.commons.service.CommonServiceImpl;
import com.Garces.curso.repository.CursoRepository;

@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso,CursoRepository> implements CommonService<Curso>{

}
