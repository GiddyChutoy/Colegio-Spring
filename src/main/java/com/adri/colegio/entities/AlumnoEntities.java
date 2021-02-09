/**
 * 
 */
package com.adri.colegio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Giddy
 *
 */
/**
 * @author Giddy
 *
 */
@Entity
@Table(name = "alumnos")
public class AlumnoEntities {

	/**
	 * @param id
	 * @param nombre
	 * @param idMunicipio
	 * @param famNumerosa
	 */
	public AlumnoEntities(int id, String nombre, int idMunicipio, Integer famNumerosa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.idMunicipio = idMunicipio;
		this.famNumerosa = famNumerosa;
	}
	
	public AlumnoEntities() {
		super();
	}

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "id_municipio")
	private int idMunicipio;
	
	@Column(name = "familia_numerosa")
	private Integer famNumerosa;

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
	 * @return the idMunicipio
	 */
	public int getIdMunicipio() {
		return idMunicipio;
	}

	/**
	 * @param idMunicipio the idMunicipio to set
	 */
	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	/**
	 * @return the famNumerosa
	 */
	public int getFamNumerosa() {
		return famNumerosa;
	}

	/**
	 * @param famNumerosa the famNumerosa to set
	 */
	public void setFamNumerosa(int famNumerosa) {
		this.famNumerosa = famNumerosa;
	}
	
	
}
