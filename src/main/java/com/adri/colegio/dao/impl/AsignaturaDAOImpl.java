/**
 * 
 */
package com.adri.colegio.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.adri.colegio.dao.AsignaturaDAO;
import com.adri.colegio.dtos.Asignatura;
import com.adri.colegio.entities.AsignaturaEntities;
import com.adri.colegio.repositorios.AsignaturaRepository;

/**
 * @author Giddy
 *
 */
public class AsignaturaDAOImpl implements AsignaturaDAO {

	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	@Override
	public Integer insertarAsignatura(Integer id, String nombre, Integer curso, Double tasa) {
		
		AsignaturaEntities asignatura = new AsignaturaEntities(id, nombre, curso, tasa);
		asignaturaRepository.save(asignatura);
		
		return 1;
	}

	@Override
	public List<Asignatura> listarAsignaturas(Integer id, String nombre, Integer curso, Double tasa) {
		
		List<Asignatura> listaAsignaturas = asignaturaRepository.listarAsignaturas(id, nombre, curso, tasa);
		
		
		return listaAsignaturas;
	}

	@Override
	public List<Asignatura> listarIdNombre(Integer id, String nombre) {
		
		List<Asignatura> listaAsignaturas = asignaturaRepository.listarAsignaturasSimple(id, nombre);
		
		return listaAsignaturas;
	}

	@Override
	public Integer borrarAsignatura(Integer id) {
		
		asignaturaRepository.deleteById(id);
		
		return 1;
	}

	@Override
	public Integer actualizarAsignatura(Integer id, String nombre, Integer curso, Double tasa) {
		
		AsignaturaEntities asignatura = new AsignaturaEntities(id, nombre, curso, tasa);
		asignaturaRepository.save(asignatura);
		
		return 1;
	}
	
	

}
