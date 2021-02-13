/**
 * 
 */
package com.adri.colegio.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adri.colegio.dao.CombosDAO;
import com.adri.colegio.dtos.Combo;
import com.adri.colegio.dtos.Notas;
import com.adri.colegio.entities.AlumnoEntities;
import com.adri.colegio.entities.AsignaturaEntities;
import com.adri.colegio.entities.NotaEntities;
import com.adri.colegio.repositorios.AlumnoRepository;
import com.adri.colegio.repositorios.AsignaturaRepository;
import com.adri.colegio.repositorios.NotaRepository;

/**
 * @author Giddy
 *
 */
@Controller
public class NotasController {

	@Autowired
	private NotaRepository notaRepository;
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	@Autowired
	private CombosDAO combo;
	
	
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
		
		Date cDate = new Date();
		String fDate = new SimpleDateFormat("yyyy-MM-dd").format(cDate);
		
		if(fecha == "") {
			 fecha = fDate;
		}
		
		Optional<AlumnoEntities> alumnoOptional = alumnoRepository.findById(idAlumno);
		
		Optional<AsignaturaEntities> asignaturaOptional = asignaturaRepository.findById(idAsignatura);
		
		AlumnoEntities a = alumnoOptional.get();
		
		AsignaturaEntities asig = asignaturaOptional.get();
		
		NotaEntities n = new NotaEntities(a, asig, nota, fecha);
		
		notaRepository.save(n);
		
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
		
		List<Notas> listaNotas = notaRepository.listaNotas(idAlumno, nombre, asignatura, nota, fecha);
		model.addAttribute("lista", listaNotas);
		
		
		return "/vistas/notas/listaNotas";
	}
	
	
	
	//Borrar
	
	@GetMapping(value = "borrarNotasFormulario")
	public String borrarNotasFormulario(ModelMap model) {
		
		
		return "/vistas/notas/borrarNotas";
	}
	
	@PostMapping(value = "borrarNotasFormulario")
	public String mostrarNotasFormulario(@RequestParam(value = "nombre", required = false) String nombre,
			@RequestParam(value = "asignatura", required = false) String asignatura,
			@RequestParam(value = "fecha", required = false) String fecha,
			ModelMap model) {
		
		List<Notas> listaNotas = notaRepository.listaNotasSimple(nombre, asignatura, fecha);
		model.addAttribute("listaNotas", listaNotas);
		
		
		return "/vistas/notas/borrarNotas";
	}
	
	
	@PostMapping(value = "borrarNotasDB")
	public String borrarNotas(@RequestParam("idAlumnosAntiguo") Integer id, ModelMap model) {
		
		notaRepository.deleteById(id);
		
		return "/vistas/notas/borrarNotas";
	}
	
	//Modificar
	
	@GetMapping(value = "actualizarNotas")
	public String actualizarNotasFormulario(ModelMap model) {
		
		
		return "/vistas/notas/actualizarNotas";
	}
	
	
	@PostMapping(value = "actualizarNotas")
	public String mostrarActualizarNotasFormulario(@RequestParam(value = "nombre", required = false) String nombre,
			@RequestParam(value = "asignatura", required = false) String asignatura,
			@RequestParam(value = "fecha", required = false) String fecha,
			ModelMap model) {
		
		List<Combo> listaAlumnos = combo.comboAlumnos();
		model.addAttribute("listaAlumnos", listaAlumnos);
		
		List<Combo> listaAsignaturas = combo.comboAsignaturas();
		model.addAttribute("listaAsignaturas", listaAsignaturas);
		
		List<Notas> listaNotas = notaRepository.listaNotasSimple(nombre, asignatura, fecha);
		model.addAttribute("listaNotas", listaNotas);
		
		return "/vistas/notas/actualizarNotas";
	}
	
	@PostMapping(value = "actualizarNotasDB")
	public String actualizarNotas(@RequestParam(value = "idAntiguo", required = false) Integer id,
			@RequestParam(value = "nombre", required = false) Integer idAlumno,
			@RequestParam(value = "asignatura", required = false) Integer idAsignatura,
			@RequestParam(value = "nota", required = false) Integer nota,
			@RequestParam(value = "fecha", required = false) String fecha,
			ModelMap model) {
		
		Date cDate = new Date();
		String fDate = new SimpleDateFormat("yyyy-MM-dd").format(cDate);
		
		if(fecha == "") {
			 fecha = fDate;
		}
		
		Optional<AlumnoEntities> alumnoOptional = alumnoRepository.findById(idAlumno);
		
		Optional<AsignaturaEntities> asignaturaOptional = asignaturaRepository.findById(idAsignatura);
		
		AlumnoEntities a = alumnoOptional.get();
		
		AsignaturaEntities asig = asignaturaOptional.get();
		
		NotaEntities n = new NotaEntities(id, a, asig, nota, fecha);
		
		notaRepository.save(n);
		
		
		return "/vistas/notas/actualizarNotas";
	}
	
}
