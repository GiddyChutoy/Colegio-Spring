package com.adri.colegio.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adri.colegio.dao.AlumnoDAO;
import com.adri.colegio.dtos.Alumno;
import com.adri.colegio.entities.AlumnoEntities;
import com.adri.colegio.repositorios.AlumnoRepository;

@Service
public class AlumnoDAOImpl implements AlumnoDAO {
	
	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	public List<Alumno> obtenerAlumnosporIdyNombre(Integer id, String nombre) {
		return alumnoRepository.listarAlumnoIdNombre(id, nombre);
	}

	@Override
	public Integer insertarAlumno(Integer id, String nombre, Integer idMunicipio, Integer famNumerosa) {
		
		famNumerosa = (famNumerosa == null) ? 0 : 1;		
		AlumnoEntities alumno = new AlumnoEntities(id, nombre, idMunicipio, famNumerosa);		
		alumnoRepository.save(alumno);
		
		return 1;  
	}

	@Override
	public Integer actualizaralumno(Integer id, String nombre, Integer idMunicipio, Integer famNumerosa) {
		famNumerosa = (famNumerosa == null) ? 0 : 1;
		
		AlumnoEntities alumno = new AlumnoEntities(id, nombre, idMunicipio, famNumerosa);	
		alumnoRepository.save(alumno);
		
		return 1;
	}

	@Override
	public Integer eliminarAlumno(Integer id) {
		alumnoRepository.deleteById(id);
		return 1;
	}

	@Override
	public boolean esFamiliaNumerosa(String idAlumno) {
		// TODO Auto-generated method stub
		return false;
	}
}	