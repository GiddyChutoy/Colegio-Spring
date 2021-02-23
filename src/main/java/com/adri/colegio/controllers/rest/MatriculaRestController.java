/**
 * 
 */
package com.adri.colegio.controllers.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adri.colegio.dao.MatriculaDAO;
import com.adri.colegio.dtos.Matricula;
import com.adri.colegio.entities.MatriculaEntities;
import com.adri.colegio.repositorios.MatriculaRepository;

/**
 * @author 201907
 *
 */
@RestController
@RequestMapping("v1")
public class MatriculaRestController {
	
	@Autowired
	MatriculaDAO matricula;
	
	@Autowired
	MatriculaRepository matriculaRepository;
	
	@PostMapping(value = "matriculas")
	public ResponseEntity<String> insertarMatricula(@RequestBody MatriculaEntities matricula){
		
		matriculaRepository.save(matricula);
		
		return new ResponseEntity<>("Inserción correcta!", HttpStatus.OK);
	}
	
	@GetMapping(value = "matriculas")
	public Iterable<MatriculaEntities> listarMatriculas(){
		
		return matriculaRepository.findAll();
	}
	
	@GetMapping(value = "matriculas/{id}")
	public Optional<MatriculaEntities> listarMatriculasId(@PathVariable("id") Integer id){
		
		return matriculaRepository.findById(id);
	}
	
	@GetMapping(value = "matriculas", params = {"idAlumno", "nombreAlumno", "asignatura", "nota", "fecha"})
	public List<Matricula> listarMatriculasParametros(@RequestParam(value ="idAsignatura") Integer idAsignatura, 
			@RequestParam(value = "nombreAlumno") String nombreAsig, 
			@RequestParam(value = "asignatura") Integer idAlumno,
			@RequestParam(value = "nota") String nombreAlumno,
			@RequestParam(value = "fecha") String fecha,
			@RequestParam(value = "activo") Integer activo){
		
		
		return matriculaRepository.listaMatriculas(idAsignatura, nombreAsig, idAlumno, nombreAlumno, fecha, activo);
	}
	
	@DeleteMapping(value = "matriculas/{id}")
	public ResponseEntity<String> borrarMatricula(@PathVariable("id") Integer id){
		
		matriculaRepository.deleteById(id);
		
		return new ResponseEntity<>("Exterminio con éxito!", HttpStatus.OK);
		
	} 
}
