/**
 * 
 */
package com.adri.colegio.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adri.colegio.dao.MatriculaDAO;
import com.adri.colegio.dtos.Matricula;
import com.adri.colegio.repositorios.MatriculaRepository;

/**
 * @author 201907
 *
 */
@Service
public class MatriculaDAOImpl implements MatriculaDAO {

	@Autowired
	MatriculaRepository matriculaRepository;
	
	@Override
	public List<Matricula> listarmatriculas(Integer idAsig, String asigNombre, Integer idAlum, String alumNombre, String fecha, Integer activo) {
	
		List<Matricula> listaMatriculas = matriculaRepository.listaMatriculas(idAsig, asigNombre, idAlum, alumNombre, fecha, activo);
		
		return listaMatriculas;
	}

}
