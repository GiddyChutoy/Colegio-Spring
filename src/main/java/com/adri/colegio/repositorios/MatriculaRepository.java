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
			+ " INNER JOIN com.adri.colegio.entities.AsignaturaEntities as asig on m.idAsignatura.id = asig.id"
			+ " INNER JOIN com.adri.colegio.entities.AlumnoEntities as a on m.idAlumno.id = a.id"
			+ " where (asig.id LIKE CONCAT('%', :idAsig, '%') or :idAsig is null)"
			+ "	AND asig.nombre LIKE CONCAT('%', :asigNombre, '%')"
			+ " AND (a.id LIKE CONCAT('%', :idAlum, '%') or :idAlum is null)"
			+ " AND a.nombre LIKE CONCAT('%', :alumNombre, '%')"
			+ " AND m.fecha LIKE CONCAT('%', :fecha, '%')"
			+ " AND (m.activo LIKE CONCAT('%', :activo, '%') or :activo is null)"
			)
	List<Matricula> listaMatriculas(@Param("idAsig") Integer idAsig, @Param("asigNombre") String asigNombre,
			@Param("idAlum") Integer idAlum, @Param("alumNombre") String alumNombre,
			@Param("fecha") String fecha, @Param("activo") Integer activo);
	
}
