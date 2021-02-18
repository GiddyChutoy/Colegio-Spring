/**
 * 
 */
package com.adri.colegio.dao;

import java.util.List;

import com.adri.colegio.dtos.Matricula;

/**
 * @author 201907
 *
 */
public interface MatriculaDAO {
	
	List<Matricula> listarmatriculas(Integer idAsig, String asigNombre, Integer idAlum, String alumNombre, String fecha, Integer activo);
	Integer borrarMatricula(Integer idMatricula);
}
