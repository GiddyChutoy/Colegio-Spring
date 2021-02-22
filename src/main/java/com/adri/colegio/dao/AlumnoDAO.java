package com.adri.colegio.dao;

import java.util.List;

import com.adri.colegio.dtos.Alumno;
import com.adri.colegio.entities.AlumnoEntities;

public interface AlumnoDAO {
	List<Alumno> obtenerAlumnosporIdyNombre(Integer id, String nombre);
	Integer insertarAlumno(Integer id, String nombre, Integer idMunicipio, Integer famNumerosa);
	Integer actualizaralumno(Integer id, String nombre, Integer idMunicipio, Integer famNumerosa);
	Integer eliminarAlumno(Integer id);
	boolean esFamiliaNumerosa(String idAlumno);
}
