/**
 * 
 */
package com.adri.colegio.dao;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;

import com.adri.colegio.dtos.Asignatura;

/**
 * @author Giddy
 *
 */
public interface AsignaturaDAO {
	
	Integer insertarAsignatura(Integer id, String nombre, Integer curso, Double tasa);
	List<Asignatura> listarAsignaturas(Integer id, String nombre, Integer curso, Double tasa);
	List<Asignatura> listarIdNombre(Integer id, String nombre);
	Integer borrarAsignatura(Integer id);
	Integer actualizarAsignatura(Integer id, String nombre, Integer curso, Double tasa);
	
}
