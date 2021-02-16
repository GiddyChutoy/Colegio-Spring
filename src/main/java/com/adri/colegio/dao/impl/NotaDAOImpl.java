/**
 * 
 */
package com.adri.colegio.dao.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adri.colegio.dao.NotaDAO;
import com.adri.colegio.dtos.Notas;
import com.adri.colegio.entities.AlumnoEntities;
import com.adri.colegio.entities.AsignaturaEntities;
import com.adri.colegio.entities.NotaEntities;
import com.adri.colegio.repositorios.AlumnoRepository;
import com.adri.colegio.repositorios.AsignaturaRepository;
import com.adri.colegio.repositorios.NotaRepository;

/**
 * @author Giddy
 *
 */
@Service
public class NotaDAOImpl implements NotaDAO {
	
	@Autowired
	private NotaRepository notaRepository;
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private AsignaturaRepository asignaturaRepository;

	@Override
	public Integer insertarNota(Integer idAlumno, Integer idAsignatura, Integer nota, String fecha) {
		
		Date cDate = new Date();
		String fDate = new SimpleDateFormat("yyyy-MM-dd").format(cDate);
		
		if(fecha == "") {
			 fecha = fDate;
		}
		
		Optional<AlumnoEntities> alumnoOptional = alumnoRepository.findById(idAlumno);
		
		Optional<AsignaturaEntities> asignaturaOptional = asignaturaRepository.findById(idAsignatura);
		
		AlumnoEntities a = alumnoOptional.get();
		
		AsignaturaEntities asig = asignaturaOptional.get();
		
		NotaEntities n = new NotaEntities(a, asig, nota, fecha);
		
		notaRepository.save(n);
		
		
		return 1;
	}

	@Override
	public List<Notas> listarNotas(Integer idAlumno, String nombre, String asignatura, Integer nota, String fecha) {
		
		List<Notas> listaNotas = notaRepository.listaNotas(idAlumno, nombre, asignatura, nota, fecha);
		
		return listaNotas;
	}

	@Override
	public List<Notas> listarNotasSimple(String nombre, String asignatura, String fecha) {
		
		List<Notas> listaNotas = notaRepository.listaNotasSimple(asignatura, nombre, fecha);
		
		return listaNotas;
	}

	@Override
	public Integer borrarNota(Integer id) {
		
		notaRepository.deleteById(id);
		
		return 1;
	}

	
	
}
