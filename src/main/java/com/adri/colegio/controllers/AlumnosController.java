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
import com.adri.colegio.dtos.Alumno;
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

	//Insertar
	
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

	
	//Listar
	
	@GetMapping(value = "listadoAlumnos")
	public String vista(ModelMap model) {
		
		return "/vistas/alumnos/listaAlumno";
	}
	
	@PostMapping(value = "listadoAlumnos")
	public String listarAlumnos(@RequestParam(value = "id", required = false) Integer id, 
			@RequestParam(value = "nombre", required = false) String nombre, ModelMap model) {
		
		List<Alumno> listaAlumnos = alumnoRepository.listarAlumnoIdNombre(id, nombre);
		model.addAttribute("lista", listaAlumnos);
		
		return "/vistas/alumnos/listaAlumno";
	}
	
	
	
	//Borrar
	
	@GetMapping(value = "formularioBorrarAlumnos")
	public String getBorrarAlumno(ModelMap model) {
		return "/vistas/alumnos/borrarAlumnos";
	}	
	
	@PostMapping(value = "formularioBorrarAlumnos")
	public String cargarBorrarAlumno(@RequestParam(value = "id", required = false) Integer id,
			@RequestParam(value = "nombre", required = false) String nombre,ModelMap model) {
		//List<Combo> listaAlumnos = combo.comboAlumnos();
		List<Alumno> listaAlumnos = alumnoRepository.listarAlumnoIdNombre(id, nombre);
		model.addAttribute("lista", listaAlumnos);
		
		return "/vistas/alumnos/borrarAlumnos";
	}
	
	@PostMapping(value = "borrarAlumnos")
	public String borrarAlumno(@RequestParam(value = "id", required = false) Integer id, 
			@RequestParam(value = "nombre", required = false) String nombre,  ModelMap model) {
		
		alumnoRepository.deleteById(id);
		
		return "/vistas/alumnos/borrarAlumnos";
	}
	
	
	
	//Modificar
	
	@GetMapping(value = "actualizar")
	public String actualizarFormulario(ModelMap model) {
		
		/*List<Combo> listaComboMunicipios = combo.comboMunicipios();
		model.addAttribute("comboMunicipio", listaComboMunicipios);*/
		
		return "/vistas/alumnos/actualizarAlumno";
	}
	
	@PostMapping(value = "actualizar")
	public String enumerarAlumno(@RequestParam(value = "id", required = false) Integer id, 
			@RequestParam(value = "nombre", required = false) String nombre,
//			@RequestParam(value = "municipios", required = false) String municipio,
//			@RequestParam(value = "familiaNumerosa", required = false) Integer famNumerosa,
			ModelMap model) {
		
		List<Alumno> listaAlumnos = alumnoRepository.listarAlumnoIdNombre(id, nombre);
		model.addAttribute("lista", listaAlumnos);
		
		List<Combo> listaComboMunicipios = combo.comboMunicipios();
		model.addAttribute("comboMunicipios", listaComboMunicipios);
		
		return "/vistas/alumnos/actualizarAlumno";
	}
	
	@PostMapping(value = "actualizarAlumnoBD")
	public String actualizarAlumnoDB(@RequestParam(value = "id", required = false) Integer id, 
			@RequestParam(value = "nombre", required = false) String nombre,
			@RequestParam(value = "municipio", required = false) Integer municipio,
			@RequestParam(value = "familiaNumerosa", required = false) String famNumerosa,
			ModelMap model) {
		
		famNumerosa = (famNumerosa == null) ? "0" : "1";
		
		AlumnoEntities a = new AlumnoEntities(id, nombre, municipio, Integer.parseInt(famNumerosa));
		
		alumnoRepository.save(a);
		
		return "/vistas/alumnos/actualizarAlumno"; 
	}
}
