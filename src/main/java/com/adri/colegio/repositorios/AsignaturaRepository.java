package com.adri.colegio.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.adri.colegio.dtos.Asignatura;
import com.adri.colegio.entities.AsignaturaEntities;

public interface AsignaturaRepository extends CrudRepository<AsignaturaEntities, Integer> {

	@Query(value = "select new com.adri.colegio.dtos.Asignatura (asig.id, asig.nombre, asig.curso, asig.tasa)"
			+ " FROM com.adri.colegio.entities.AsignaturaEntities as asig"
			+ " WHERE (asig.id LIKE CONCAT('%', :id, '%') or :id is null)"
			+ " AND asig.nombre LIKE CONCAT('%', :nombreAsignatura, '%')"
			+ " AND asig.curso LIKE CONCAT('%', :curso, '%')"
			+ " AND asig.tasa LIKE CONCAT('%', :tasa, '%')"
			)
	List<Asignatura> listarAsignaturas(@Param("id") Integer id, @Param("nombreAsignatura") String nombre, 
			@Param("curso") Integer curso, 
			@Param("tasa") Double tasa);
	
	
	@Query(value = "select new com.adri.colegio.dtos.Asignatura (asig.id, asig.nombre, asig.curso, asig.tasa)"
			+ " FROM com.adri.colegio.entities.AsignaturaEntities as asig"
			+ " WHERE (asig.id LIKE CONCAT('%', :id, '%') or :id is null)"
			+ " AND asig.nombre LIKE CONCAT('%', :nombreAsignatura, '%')")
	List<Asignatura> listarAsignaturasSimple(@Param("id") Integer id, @Param("nombreAsignatura") String nombre);
}
