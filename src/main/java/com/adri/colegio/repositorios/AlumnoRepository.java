package com.adri.colegio.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.adri.colegio.dtos.Alumno;
import com.adri.colegio.entities.AlumnoEntities;

public interface AlumnoRepository extends CrudRepository<AlumnoEntities, Integer> {

	@Query(value = "select new com.adri.colegio.dtos.Alumno (a.id, a.nombre, m.nombre, m.idMunicipio, a.famNumerosa)"
			+ " FROM com.adri.colegio.entities.AlumnoEntities as a, com.adri.colegio.entities.MunicipioEntities as m"
			+ " where a.idMunicipio = m.idMunicipio"
			+ " AND (a.id LIKE CONCAT('%', :id, '%') or :id is null)"
			+ " AND a.nombre LIKE CONCAT('%', :nombre, '%')")
	List<Alumno> listarAlumnoIdNombre(@Param("id") Integer id, @Param("nombre") String nombre);
}
