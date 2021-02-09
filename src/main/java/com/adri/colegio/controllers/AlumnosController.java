package com.adri.colegio.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.adri.colegio.dtos.Combo;
import com.adri.colegio.entities.MunicipioEntities;
import com.adri.colegio.repositorios.MunicipioRepository;

/**
 * @author 201907
 *
 */
@Controller
public class AlumnosController {

	@Autowired
	private MunicipioRepository municipioRepository;
	
	private static final Logger logger = LoggerFactory.getLogger(AlumnosController.class);
	
	@GetMapping( value = "insertaralumno")
	public String formularioInsertarAlumnos(ModelMap model) {
		Iterable<MunicipioEntities> listaEntidadesMunicipios = municipioRepository.findAll();
		List<Combo> listaMunicipios = mapeoEntidadMunicipioCombo(listaEntidadesMunicipios);
		model.addAttribute("comboMunicipios", listaMunicipios);
		return "vistas/alumnos/insertarAlumnos";
	}
	
}
