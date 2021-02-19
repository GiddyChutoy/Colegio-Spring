/**
 * 
 */
package com.adri.colegio.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adri.colegio.dao.MatriculaDAO;
import com.adri.colegio.dtos.Caja;
import com.adri.colegio.dtos.Matricula;
import com.adri.colegio.repositorios.CajaRepository;
import com.adri.colegio.repositorios.MatriculaRepository;

/**
 * @author 201907
 *
 */
@Service
public class MatriculaDAOImpl implements MatriculaDAO {

	@Autowired
	MatriculaRepository matriculaRepository;
	
	@Autowired
	CajaRepository cajaRepository;
	
	@Override
	public List<Matricula> listarmatriculas(Integer idAsig, String asigNombre, Integer idAlum, String alumNombre, String fecha, Integer activo) {
	
		List<Matricula> listaMatriculas = matriculaRepository.listaMatriculas(idAsig, asigNombre, idAlum, alumNombre, fecha, activo);
		
		return listaMatriculas;
	}

	@Override
	public Integer borrarMatricula(Integer idMatricula) {
		
		List<Caja> caja = cajaRepository.listaCajas(idMatricula);
		
		Caja c = caja.get(0);
		
		if(c != null && idMatricula != null) {
			
			
			
			cajaRepository.deleteById(c.getId());
			
			matriculaRepository.deleteById(idMatricula);
		}
		
		return 1;
	}

}
