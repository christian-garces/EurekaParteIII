package com.Garces.usuario.service;

import com.Garces.commons.service.CommonService;
import com.Garces.usuario.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno>{
	
	public Alumno save(Alumno alumno);
	
	public void deleteById (Long Id);
}
