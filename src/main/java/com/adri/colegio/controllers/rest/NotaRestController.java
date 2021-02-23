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

import com.adri.colegio.dao.NotaDAO;
import com.adri.colegio.dtos.Notas;
import com.adri.colegio.entities.NotaEntities;
import com.adri.colegio.repositorios.NotaRepository;

/**
 * @author 201907
 *
 */
@RestController
@RequestMapping("v1")
public class NotaRestController {
	@Autowired
	NotaDAO nota;
	
	@Autowired
	NotaRepository notaRepository;
	
	@PostMapping(value = "notas")
	public ResponseEntity<String> insertarNota(@RequestBody NotaEntities nota){
		
		notaRepository.save(nota);
		
		return new ResponseEntity<>("Inserción correcta!", HttpStatus.OK);
	}
	
	@GetMapping(value = "notas")
	public Iterable<NotaEntities> listarNotas(){
		
		return notaRepository.findAll();
	}
	
	@GetMapping(value = "notas/{id}")
	public Optional<NotaEntities> listarNotasId(@PathVariable("id") Integer id){
		
		return notaRepository.findById(id);
	}
	
	@GetMapping(value = "notas", params = {"idAlumno", "nombreAlumno", "asignatura", "nota", "fecha"})
	public List<Notas> listarNotasParametros(@RequestParam(value ="idAlumno") Integer idAlumno, 
			@RequestParam(value = "nombreAlumno") String nombreAlumno, 
			@RequestParam(value = "asignatura") String nombreAsignatura,
			@RequestParam(value = "nota") Integer nota,
			@RequestParam(value = "fecha") String fecha){
		
		
		return notaRepository.listaNotas(idAlumno, nombreAlumno, nombreAsignatura, nota, fecha);
	}
	
	@PutMapping(value = "notas")
	public ResponseEntity<String> actualizarNota(@RequestBody NotaEntities nota){
		
		notaRepository.save(nota);
		
		return new ResponseEntity<>("Actualización correcta!", HttpStatus.OK);
		
	} 
	
	
	@DeleteMapping(value = "notas/{id}")
	public ResponseEntity<String> borrarNota(@PathVariable("id") Integer id){
		
		notaRepository.deleteById(id);;
		
		return new ResponseEntity<>("Exterminio con éxito!", HttpStatus.OK);
		
	}
}
