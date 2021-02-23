/**
 * 
 */
package com.adri.colegio.controllers.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adri.colegio.dao.CombosDAO;
import com.adri.colegio.dtos.Combo;

/**
 * @author 201907
 *
 */
@RestController
@RequestMapping("v1")
public class ComboRestController {
	
	@Autowired
	CombosDAO combo;
	
	@GetMapping(value = "combos/municipios")
	public List<Combo> comboMunicipios(){
		List<Combo> listaMunicipios = combo.comboMunicipios();
		return listaMunicipios;
	}
	
	@GetMapping(value = "combos/alumnos")
	public List<Combo> comboAlumnos(){
		List<Combo> listaAlulmnos = combo.comboAlumnos();
		return listaAlulmnos;
	}
	
	@GetMapping(value = "combos/asignaturas")
	public List<Combo> comboAsignaturas(){
		List<Combo> listaAsignaturas = combo.comboAsignaturas();
		return listaAsignaturas;
	}
}
