/**
 * 
 */
package com.adri.colegio.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adri.colegio.dao.CombosDAO;
import com.adri.colegio.dtos.Asignatura;
import com.adri.colegio.entities.AsignaturaEntities;
import com.adri.colegio.repositorios.AsignaturaRepository;

/**
 * @author 201907
 *
 */
@Controller
public class AsignaturasController {
	
	@Autowired
	private CombosDAO combo;
	
	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	
	private static final Logger logger = LoggerFactory.getLogger(AlumnosController.class);
	
	
	//Insertar
	
	@GetMapping(value = "insertarAsignaturas")
	public String insertarAsignaturasFormulario(ModelMap model) {
		
		return "/vistas/asignaturas/insertarAsignatura";
	}
	
	@PostMapping(value = "insertarAsignaturas")
	public String insertarAsignaturas(@RequestParam(value = "id", required = false) Integer id,
			@RequestParam(value = "nombre", required = false) String nombre,
			@RequestParam(value = "curso", required = false) Integer curso,
			@RequestParam(value = "tasa", required = false) Integer tasa,
			ModelMap model) {
		
		AsignaturaEntities asignatura = new AsignaturaEntities(id, nombre, curso, tasa);
		asignaturaRepository.save(asignatura);
		
		
		return "/vistas/asignaturas/insertarAsignatura";
	}
	
	
	
	
	
	
	
	//Listar
	
	@GetMapping(value = "listaAsignaturas")
	public String listaAsignaturaFormulario(ModelMap model) {
		
		return "/vistas/asignaturas/listaAsignaturas";
	}
	
	@PostMapping(value = "listaAsignaturas")
	public String listaAsignatura(@RequestParam(value = "id", required = false) Integer id,
			@RequestParam(value = "nombre", required = false) String nombre,
			@RequestParam(value = "curso", required = false) Integer curso,
			@RequestParam(value = "tasa", required = false) Double tasa,
			ModelMap model) {
		
		List<Asignatura> listaAsignaturas = asignaturaRepository.listarAsignaturasSimple(id, nombre);
		model.addAttribute("lista", listaAsignaturas);
		
		return "/vistas/asignaturas/listaAsignaturas";
	}
	
	
	
	
	
	
	//Borrar
	@GetMapping(value = "formularioBorrarAsignaturas")
	public String borrarAsignaturaFormulario(ModelMap model) {
		
		
		return "/vistas/asignaturas/borrarAsignaturas";
	}
	
	@PostMapping(value = "formularioBorrarAsignaturas")
	public String mostrarAsignaturaFormulario(@RequestParam(value = "id", required = false) Integer id,
			@RequestParam(value = "nombre", required = false) String nombre, ModelMap model) {
		
		List<Asignatura> listaAsignaturas = asignaturaRepository.listarAsignaturasSimple(id, nombre);
		model.addAttribute("lista", listaAsignaturas);
		
		return "/vistas/asignaturas/borrarAsignaturas";
	}
	
	
	@PostMapping(value = "borrarAsignatura")
	public String borrarAsignatura(@RequestParam(value = "id", required = true) Integer id, ModelMap model) {
		
		asignaturaRepository.deleteById(id);
		
		return "/vistas/asignaturas/borrarAsignaturas";
	}
	
	
	
	
	
	
	
	//Actualizar
	
	@GetMapping(value = "actualizarAsignatura")
	public String actualizarAsignaturaFormulario(ModelMap model) {
		
		
		return "/vistas/asignaturas/modificarAsignatura";
	}
	
	@PostMapping(value = "modificar")
	public String mostrarAsignaturaFormularioActualizar(@RequestParam(value = "id", required = false) Integer id,
			@RequestParam(value = "nombre", required = false) String nombre, ModelMap model) {
		
		List<Asignatura> listaAsignaturas = asignaturaRepository.listarAsignaturasSimple(id, nombre);
		model.addAttribute("lista", listaAsignaturas);
		
		return "/vistas/asignaturas/modificarAsignatura";
	}
	
	
	@PostMapping(value = "actualizarAsignatura")
	public String actualizarAsignatura(@RequestParam(value = "id", required = false) Integer id,
			@RequestParam(value = "nombre", required = false) String nombre,
			@RequestParam(value = "curso", required = false) Integer curso,
			@RequestParam(value = "tasa", required = false) Integer tasa,
			ModelMap model) {
		
		AsignaturaEntities asignatura = new AsignaturaEntities(id, nombre, curso, tasa);
		asignaturaRepository.save(asignatura);
		
	
		return "/vistas/asignaturas/modificarAsignatura";
		
	}
	
}
