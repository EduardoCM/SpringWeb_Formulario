package org.certificatic.dao;


import java.util.List;

import org.certificatic.model.Alumno;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class AlumnoDAOImpl implements AlumnoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(Alumno alumno) {
		getSession().save(alumno);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Alumno> findAll() {
		Query query = getSession().createQuery("from Alumno");
		return query.list();
	}
	
	

}
