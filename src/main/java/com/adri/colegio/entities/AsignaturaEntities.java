/**
 * 
 */
package com.adri.colegio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 201907
 *
 */
@Entity
@Table(name = "asignaturas")
public class AsignaturaEntities {
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "curso")
	private int curso;
	
	@Column(name = "tasa")
	private Integer tasa;

	/**
	 * @param id
	 * @param nombre
	 * @param curso
	 * @param tasa
	 */
	public AsignaturaEntities(int id, String nombre, int curso, Integer tasa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
		this.tasa = tasa;
	}

	/**
	 * 
	 */
	public AsignaturaEntities() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the curso
	 */
	public int getCurso() {
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(int curso) {
		this.curso = curso;
	}

	/**
	 * @return the tasa
	 */
	public int getTasa() {
		return tasa;
	}

	/**
	 * @param tasa the tasa to set
	 */
	public void setTasa(int tasa) {
		this.tasa = tasa;
	}
	
	
	
}
