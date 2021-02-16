/**
 * 
 */
package com.adri.colegio.dao;

import java.util.List;

import com.adri.colegio.dtos.Notas;

/**
 * @author Giddy
 *
 */
public interface NotaDAO {

	Integer insertarNota(Integer idAlumno, Integer idAsignatura, Integer nota, String fecha);
	List<Notas> listarNotas(Integer idAlumno, String nombre, String asignatura,	Integer nota, String fecha);
	List<Notas> listarNotasSimple(String nombre, String asignatura, String fecha);
	Integer borrarNota(Integer id);
	
}
