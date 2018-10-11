package org.certificatic.service;

import java.util.List;

import org.certificatic.dao.AlumnoDAO;
import org.certificatic.model.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoDAO alumnoDAO;

	@Override
	public void save(Alumno alumno) {
		alumnoDAO.save(alumno);
	}

	@Override
	public List<Alumno> findAll() {
		return alumnoDAO.findAll();
	}

}
