/**
 * 
 */
package com.adri.colegio.dtos;

/**
 * @author 201907
 *
 */
public class Alumno {
	private int id;
	private String nombre;
	private String municipio;
	private int idMunicipio;
	private int familiaNumerosa;

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
	 * 
	 */
	public Alumno() {
		super();
	}

	/**
	 * @param id
	 * @param nombre
	 */
	public Alumno(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	/**
	 * @param id
	 * @param nombre
	 * @param municipio
	 */
	public Alumno(int id, String nombre, String municipio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.municipio = municipio;
	}

	/**
	 * @param id
	 * @param nombre
	 * @param municipio
	 */
	public Alumno(int id, String nombre, String municipio, int idMunicipio, int familiaNumerosa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.municipio = municipio;
		this.idMunicipio = idMunicipio;
		this.familiaNumerosa = familiaNumerosa;
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
	 * @return the municipio
	 */
	public String getMunicipio() {
		return municipio;
	}

	/**
	 * @param municipio the municipio to set
	 */
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	/**
	 * @return the familiaNumerosa
	 */
	public int getFamiliaNumerosa() {
		return familiaNumerosa;
	}

	/**
	 * @param familiaNumerosa the familiaNumerosa to set
	 */
	public void setFamiliaNumerosa(int familiaNumerosa) {
		this.familiaNumerosa = familiaNumerosa;
	}

	
	
}
