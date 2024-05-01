package com.co.Garces.service.implementation;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.co.Garces.common.service.CommonService;
import com.co.Garces.common.service.implementation.CommonServiceImpl;
import com.co.Garces.common.usuario.entity.Curso;
import com.co.Garces.curso.repository.CursoRepository;


@Service
public class CursoServiceImpl extends CommonServiceImpl<Curso, CursoRepository> implements CommonService<Curso> {
	@Override
	public Iterable<Curso> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Curso> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Curso save(Curso entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
	}
}
