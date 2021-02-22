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

import com.adri.colegio.dao.AsignaturaDAO;
import com.adri.colegio.dtos.Asignatura;
import com.adri.colegio.entities.AsignaturaEntities;
import com.adri.colegio.repositorios.AsignaturaRepository;

/**
 * @author 201907
 *
 */
@RestController
@RequestMapping("v1")
public class AsignaturaRestController {
	@Autowired
	AsignaturaDAO asignaturaImpl;

	@Autowired
	AsignaturaRepository asignaturaRepository;
	
	@PostMapping(value = "asignaturas")
	public ResponseEntity<String> insertarAsignatura(@RequestBody AsignaturaEntities asignatura){
		
		asignaturaRepository.save(asignatura);
		
		return new ResponseEntity<>("Inserción correcta!", HttpStatus.OK);
		
	} 
	
	@GetMapping(value = "asignaturas")
	public Iterable<AsignaturaEntities> getAsignatura(){
		
		
		return asignaturaRepository.findAll();
	}
	
	
	@GetMapping(value = "asignaturas/{id}")
	public Optional<AsignaturaEntities> getAsignaturaporID(@PathVariable("id") Integer id){
		
		
		return asignaturaRepository.findById(id);
	}
	
	
	@GetMapping(value = "asignaturas", params = {"id", "nombre"})
	public List<Asignatura> getAsignaturaporIdNombre(@RequestParam(value ="id") Integer id, @RequestParam(value = "nombre") String nombre){
		
		
		return asignaturaImpl.listarIdNombre(id, nombre);
	}
	
	@PutMapping(value = "asignaturas")
	public ResponseEntity<String> actualizarAsignatura(@RequestBody AsignaturaEntities asignatura){
		
		asignaturaRepository.save(asignatura);
		
		return new ResponseEntity<>("Actualización correcta!", HttpStatus.OK);
		
	} 
	
	@DeleteMapping(value = "asignaturas/{id}")
	public ResponseEntity<String> borrarAsignatura(@PathVariable("id") Integer id){
		
		asignaturaRepository.deleteById(id);;
		
		return new ResponseEntity<>("Exterminio con éxito!", HttpStatus.OK);
		
	} 
}
