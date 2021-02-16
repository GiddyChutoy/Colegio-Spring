/**
 * 
 */
package com.adri.colegio.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adri.colegio.dao.CombosDAO;
import com.adri.colegio.dao.NotaDAO;
import com.adri.colegio.dtos.Combo;

/**
 * @author Giddy
 *
 */
@Controller
public class NotasController {

	@Autowired
	private CombosDAO combo;
	
	@Autowired
	NotaDAO notadaoimpl;
	
	
	//Insertar
	
	@GetMapping(value = "insertarNotas")
	public String insertarNotasFormulario(ModelMap model) {
		
		List<Combo> listaAlumnos = combo.comboAlumnos();
		model.addAttribute("listaAlumnos", listaAlumnos);
		
		List<Combo> listaAsignaturas = combo.comboAsignaturas();
		model.addAttribute("listaAsignaturas", listaAsignaturas);
		
		return "/vistas/notas/insertarNotas";
	}
	
	@PostMapping(value = "insertarNotas")
	public String insertarNotas(@RequestParam(value = "alumnos", required = false) Integer idAlumno,
			@RequestParam(value = "asignaturas", required = false) Integer idAsignatura,
			@RequestParam(value = "nota", required = false) Integer nota,
			@RequestParam(value = "fecha", required = false) String fecha, ModelMap model) {
		
		notadaoimpl.insertarNota(idAlumno, idAsignatura, nota, fecha);
		
		return "/vistas/notas/insertarNotas";
	}
	
	
	
	
	
	//Listar
	
	@GetMapping(value = "listadoNotas")
	public String listadoNotasFormulario(ModelMap model) {
		
		
		
		return "/vistas/notas/listaNotas";
	}
	
	
	@PostMapping(value = "listadoNotas")
	public String listadoNotas(@RequestParam(value = "idAlumno", required = false) Integer idAlumno,
			@RequestParam(value = "nombre", required = false) String nombre,
			@RequestParam(value = "asignatura", required = false) String asignatura,
			@RequestParam(value = "nota", required = false) Integer nota,
			@RequestParam(value = "fecha", required = false) String fecha,
			ModelMap model) {
		
		
		model.addAttribute("lista", notadaoimpl.listarNotas(idAlumno, nombre, asignatura, nota, fecha));
		
		
		return "/vistas/notas/listaNotas";
	}
	
	
	
	//Borrar
	
	@GetMapping(value = "borrarNotasFormulario")
	public String borrarNotasFormulario(ModelMap model) {
		
		
		return "/vistas/notas/borrarNotas";
	}
	
	@PostMapping(value = "borrarNotasFormulario")
	public String mostrarNotasFormulario(@RequestParam(value = "nombreAlumno", required = false) String nombre,
			@RequestParam(value = "asignatura", required = false) String asignatura,
			@RequestParam(value = "fecha", required = false) String fecha,
			ModelMap model) {
		
		
		model.addAttribute("listaNotas", notadaoimpl.listarNotasSimple(nombre, asignatura, fecha));
		
		
		return "/vistas/notas/borrarNotas";
	}
	
	
	@PostMapping(value = "borrarNotasDB")
	public String borrarNotas(@RequestParam("idAlumnosAntiguo") Integer id, ModelMap model) {
		
		notadaoimpl.borrarNota(id);
		
		return "/vistas/notas/borrarNotas";
	}
	
	//Modificar
	
	@GetMapping(value = "actualizarNotas")
	public String actualizarNotasFormulario(ModelMap model) {
		
		
		return "/vistas/notas/actualizarNotas";
	}
	
	
	@PostMapping(value = "actualizarNotas")
	public String mostrarActualizarNotasFormulario(@RequestParam(value = "nombreAlumno", required = false) String nombre,
			@RequestParam(value = "asignatura", required = false) String asignatura,
			@RequestParam(value = "fecha", required = false) String fecha,
			ModelMap model) {
		
		List<Combo> listaAlumnos = combo.comboAlumnos();
		model.addAttribute("listaAlumnos", listaAlumnos);
		
		List<Combo> listaAsignaturas = combo.comboAsignaturas();
		model.addAttribute("listaAsignaturas", listaAsignaturas);
		
		
		model.addAttribute("listaNotas", notadaoimpl.listarNotasSimple(nombre, asignatura, fecha));
		
		return "/vistas/notas/actualizarNotas";
	}
	
	@PostMapping(value = "actualizarNotasDB")
	public String actualizarNotas(@RequestParam(value = "idAlumno", required = false) Integer idAlumno,
			@RequestParam(value = "idAsignatura", required = false) Integer idAsignatura,
			@RequestParam(value = "nota", required = false) Integer nota,
			@RequestParam(value = "fecha", required = false) String fecha,
			ModelMap model) {
		
		notadaoimpl.insertarNota(idAlumno, idAsignatura, nota, fecha);
		
		
		return "/vistas/notas/actualizarNotas";
	}
	
}
