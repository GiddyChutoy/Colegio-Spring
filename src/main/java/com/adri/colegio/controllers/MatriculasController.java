/**
 * 
 */
package com.adri.colegio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	
	@Autowired
	MatriculaRepository matriculaRepository;
	
	@GetMapping(value = "listadoMatriculas")
	public String listarMatriculasFormulario(ModelMap model) {
		
		
		return "/vistas/matriculas/listadoMatriculas";
	}
	
	
	@PostMapping(value = "listadoMatriculas")
	public String listarMatriculas(ModelMap model) {
		
		model.addAttribute("lista", null);
		
		return "/vistas/matriculas/listadoMatriculas";
	}

}
