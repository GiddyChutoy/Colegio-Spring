/**
 * 
 */
package com.adri.colegio.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.adri.colegio.dtos.Notas;
import com.adri.colegio.entities.NotaEntities;

/**
 * @author Giddy
 *
 */
public interface NotaRepository extends CrudRepository<NotaEntities, Integer> {
	
	@Query(value = "select new com.adri.colegio.dtos.Notas (a.id, a.nombre, asig.nombre, n.nota, n.fecha)"
			+ " FROM com.adri.colegio.entities.NotaEntities as n"
			+ " INNER JOIN com.adri.colegio.entities.AlumnoEntities as a on n.idAlumno.id = a.id"
			+ " INNER JOIN com.adri.colegio.entities.AsignaturaEntities as asig on n.idAsignatura.id = asig.id"
			+ " where (a.id LIKE CONCAT('%', :idAlumno, '%') or :idAlumno is null)"
			+ " AND asig.nombre LIKE CONCAT('%', :asignatura, '%')"
			+ " AND a.nombre LIKE CONCAT('%', :nombreAlumno, '%')"
			+ " AND n.nota LIKE CONCAT('%', :nota, '%')"
			+ " AND n.fecha LIKE CONCAT('%', :fecha, '%')")
	List<Notas> listaNotas(@Param("idAlumno") Integer idAlumno, @Param("nombreAlumno") String nombre, 
			@Param("asignatura") String asignatura, @Param("nota") Integer nota, @Param("fecha") String fecha);
	
	
	@Query(value = "select new com.adri.colegio.dtos.Notas (a.nombre, asig.nombre, n.fecha)"
			+ " FROM com.adri.colegio.entities.NotaEntities as n"
			+ " INNER JOIN com.adri.colegio.entities.AlumnoEntities as a on n.idAlumno.id = a.id"
			+ " INNER JOIN com.adri.colegio.entities.AsignaturaEntities as asig on n.idAsignatura.id = asig.id"
			+ " where asig.nombre LIKE CONCAT('%', :asignatura, '%')"
			+ " AND a.nombre LIKE CONCAT('%', :nombreAlumno, '%')"
			+ " AND n.fecha LIKE CONCAT('%', :fecha, '%')")
	List<Notas> listaNotasSimple(@Param("nombreAlumno") String nombre, @Param("asignatura") String asignatura,
			@Param("fecha") String fecha);
	
}
