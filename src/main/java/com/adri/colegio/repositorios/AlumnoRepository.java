package com.adri.colegio.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.adri.colegio.entities.AlumnoEntities;

public interface AlumnoRepository extends CrudRepository<AlumnoEntities, Integer> {

}
