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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adri.colegio.dao.AlumnoDAO;
import com.adri.colegio.dtos.Alumno;
import com.adri.colegio.entities.AlumnoEntities;
import com.adri.colegio.repositorios.AlumnoRepository;

/**
 * @author 201907
 *
 */
@RestController
@RequestMapping("v1")
public class AlumnoRestController {
	
	@Autowired
	AlumnoDAO alumnoImpl;

	@Autowired
	AlumnoRepository alumnoRepository;
	
	@PostMapping(value = "alumnos")
	public ResponseEntity<String> insertarAlumno(@RequestBody AlumnoEntities alumno){
		
		alumnoRepository.save(alumno);
		
		return new ResponseEntity<>("Inserción correcta!", HttpStatus.OK);
		
	} 
	
	@GetMapping(value = "alumnos")
	public Iterable<AlumnoEntities> getAlumnos(){
		
		
		return alumnoRepository.findAll();
	}
	
	
	@GetMapping(value = "alumnos/{id}")
	public Optional<AlumnoEntities> getAlumnoporID(@PathVariable("id") Integer id){
		
		
		return alumnoRepository.findById(id);
	}
	
	
	@GetMapping(value = "alumnos", params = {"id", "nombre"})
	public List<Alumno> getAlumnosporIdNombre(@RequestParam(value ="id") Integer id, @RequestParam(value = "nombre") String nombre){
		
		
		return alumnoImpl.obtenerAlumnosporIdyNombre(id, nombre);
	}
	
	@PutMapping(value = "alumnos")
	public ResponseEntity<String> actualizarAlumno(@RequestBody AlumnoEntities alumno){
		
		alumnoRepository.save(alumno);
		
		return new ResponseEntity<>("Actualización correcta!", HttpStatus.OK);
		
	} 
	
	@DeleteMapping(value = "alumnos/{id}")
	public ResponseEntity<String> borrarAlumno(@PathVariable("id") Integer id){
		
		alumnoRepository.deleteById(id);;
		
		return new ResponseEntity<>("Exterminio con éxito!", HttpStatus.OK);
		
	} 
}
