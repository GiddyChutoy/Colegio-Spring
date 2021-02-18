/**
 * 
 */
package com.adri.colegio.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.adri.colegio.dtos.Matricula;
import com.adri.colegio.entities.MatriculaEntities;

/**
 * @author 201907
 *
 */
public interface MatriculaRepository extends CrudRepository<MatriculaEntities, Integer>{
	
	@Query(value = "select new com.adri.colegio.dtos.Matricula (asig.id, asig.nombre, a.id, a.nombre, m.fecha, m.activo)"
			+ " FROM com.adri.colegio.entities.MatriculaEntities as m"
			+ " INNER JOIN com.adri.colegio.entities.AsignaturaEntities as asig on m.idAsignatura.id = asi.id"
			+ " INNER JOIN com.adri.colegio.entities.AlumnoEntities as a on m.idAlumno.id = a.id"
			+ " where")
	List<Matricula> listaMatriculas(@Param("idAsig") Integer idAsig);
	
}
