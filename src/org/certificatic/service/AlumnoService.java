package org.certificatic.service;

import java.util.List;

import org.certificatic.model.Alumno;

public interface AlumnoService {
	
	public void save(Alumno alumno);
	
	public List<Alumno> findAll();


}
