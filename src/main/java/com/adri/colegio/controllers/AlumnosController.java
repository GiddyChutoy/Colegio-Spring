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
import com.adri.colegio.dtos.Combo;
import com.adri.colegio.entities.AlumnoEntities;
import com.adri.colegio.repositorios.AlumnoRepository;

/**
 * @author 201907
 *
 */
@Controller
public class AlumnosController {

	@Autowired
	private CombosDAO combo;
	
	@Autowired
	private AlumnoRepository alumnoRepository;

	private static final Logger logger = LoggerFactory.getLogger(AlumnosController.class);

	/**
	 * @param model
	 * @return
	 */
	@GetMapping(value = "insertarAlumnos")
	public String formularioInsertarAlumnos(ModelMap model) {

		List<Combo> listaMunicipios = combo.comboMunicipios();
		model.addAttribute("comboMunicipios", listaMunicipios);
		return "vistas/alumnos/insertarAlumnos";
	}

	/**
	 * @param id
	 * @param nombre
	 * @param idMunicipio
	 * @param familiaNumerosa
	 * @param model
	 * @return
	 */
	@PostMapping(value = "insertarAlumnos")
	public String insertarAlumno(@RequestParam(value = "id", required = false) Integer id,
			@RequestParam(value = "nombre", required = false) String nombre,
			@RequestParam(value = "municipios", required = false) Integer idMunicipio,
			@RequestParam(value = "familiaNumerosa", required = false) Integer familiaNumerosa, ModelMap model) {

		familiaNumerosa = (familiaNumerosa == null) ? 0 : 1;
		
		
		AlumnoEntities alumno = new AlumnoEntities(id, nombre, idMunicipio, familiaNumerosa);
		
		alumnoRepository.save(alumno);
		
		
		
		return formularioInsertarAlumnos(model);
	}

}
