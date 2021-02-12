/**
 * 
 */
package com.adri.colegio.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adri.colegio.dao.CombosDAO;
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
	
	
}
