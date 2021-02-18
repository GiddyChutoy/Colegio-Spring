/**
 * 
 */
package com.adri.colegio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adri.colegio.dao.MatriculaDAO;
import com.adri.colegio.repositorios.MatriculaRepository;

/**
 * @author 201907
 *
 */
@Controller
public class MatriculasController {
	
	@Autowired
	MatriculaDAO matriculaimpl;
	
	
	@GetMapping(value = "listadoMatriculas")
	public String listarMatriculasFormulario(ModelMap model) {
		
		
		return "/vistas/matriculas/listadoMatriculas";
	}
	
	
	@PostMapping(value = "listadoMatriculas")
	public String listarMatriculas( @RequestParam(value = "idAsigntatura" , required = false) Integer idAsig,
			@RequestParam(value = "asignatura" , required = false) String asigNombre,
			@RequestParam(value = "idAlumno" , required = false) Integer idAlum,
			@RequestParam(value = "nombre" , required = false) String alumNombre,
			@RequestParam(value = "fecha" , required = false) String fecha,
			@RequestParam(value = "activo" , required = false) Integer activo,
			ModelMap model) {
		
		model.addAttribute("lista", matriculaimpl.listarmatriculas(idAsig, asigNombre, idAlum, alumNombre, fecha, activo));
		
		return "/vistas/matriculas/listadoMatriculas";
	}

}
