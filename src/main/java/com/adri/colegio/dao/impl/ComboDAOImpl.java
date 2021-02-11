/**
 * 
 */
package com.adri.colegio.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adri.colegio.dao.CombosDAO;
import com.adri.colegio.dtos.Combo;
import com.adri.colegio.entities.AlumnoEntities;
import com.adri.colegio.entities.AsignaturaEntities;
import com.adri.colegio.entities.MunicipioEntities;
import com.adri.colegio.repositorios.AlumnoRepository;
import com.adri.colegio.repositorios.AsignaturaRepository;
import com.adri.colegio.repositorios.MunicipioRepository;

/**
 * @author 201907
 *
 */
@Service
public class ComboDAOImpl implements CombosDAO {

	@Autowired
	private MunicipioRepository municipioRepository;
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	@Override
	public List<Combo> comboMunicipios() {
		Iterable<MunicipioEntities> listaEntidadesMunicipios = municipioRepository.findAll();
		List<Combo> listaMunicipios = mapeoEntidadMunicipioCombo(listaEntidadesMunicipios);
		
		return listaMunicipios;
	}

	@Override
	public List<Combo> comboAlumnos() {
		Iterable<AlumnoEntities> listaEntidadesMunicipios = alumnoRepository.findAll();
		List<Combo> listaAlumnos = mapeoEntidadAlumnoCombo(listaEntidadesMunicipios);
		
		return listaAlumnos;
	}

	@Override
	public List<Combo> comboAsignaturas() {
		Iterable<AsignaturaEntities> listaEntidadesMunicipios = asignaturaRepository.findAll();
		List<Combo> listaAlumnos = mapeoEntidadAsignaturaCombo(listaEntidadesMunicipios);
		
		return listaAlumnos;
	}

	/**
	 * @param listaEntidadesMunicipios
	 * @return
	 */
	private List<Combo> mapeoEntidadMunicipioCombo(Iterable<MunicipioEntities> listaEntidadesMunicipios ){
		List<Combo> listaMunicipios = new ArrayList<Combo>();
		
		for(MunicipioEntities m : listaEntidadesMunicipios) {
			listaMunicipios.add(new Combo(m.getIdMunicipio(), m.getNombre()));
		}
		
		return listaMunicipios;
	}
	
	/**
	 * @param listaEntidadesAlumnos
	 * @return
	 */
	private List<Combo> mapeoEntidadAlumnoCombo(Iterable<AlumnoEntities> listaEntidadesAlumnos ){
		List<Combo> listaAlumnos = new ArrayList<Combo>();
		
		for(AlumnoEntities m : listaEntidadesAlumnos) {
			listaAlumnos.add(new Combo(m.getId(), m.getNombre()));
		}
		
		return listaAlumnos;
	}
	
	/**
	 * @param listaEntidadesAlumnos
	 * @return
	 */
	private List<Combo> mapeoEntidadAsignaturaCombo(Iterable<AsignaturaEntities> listaEntidadesAsignaturas ){
		List<Combo> listaAsignaturas = new ArrayList<Combo>();
		
		for(AsignaturaEntities m : listaEntidadesAsignaturas) {
			listaAsignaturas.add(new Combo(m.getId(), m.getNombre()));
		}
		
		return listaAsignaturas;
	}
	
}
