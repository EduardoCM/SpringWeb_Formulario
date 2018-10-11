package org.certificatic.dao;

import java.util.List;

import org.certificatic.model.Alumno;
import org.hibernate.Query;

public interface AlumnoDAO {
	
	public void save(Alumno alumno);
	
	public List<Alumno> findAll();

}
