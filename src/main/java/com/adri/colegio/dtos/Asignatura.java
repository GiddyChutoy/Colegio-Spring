/**
 * 
 */
package com.adri.colegio.dtos;

/**
 * @author 201907
 *
 */
public class Asignatura {
	private int id;
	private String nombre;
	private int curso;
	private int tasa;

	/**
	 * 
	 */
	public Asignatura() {
		super();
	}
	
	

	/**
	 * @param id
	 */
	public Asignatura(int id) {
		super();
		this.id = id;
	}



	/**
	 * @param id
	 * @param nombre
	 * @param curso
	 */
	public Asignatura(int id, String nombre, int curso, int tasa) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
		this.tasa = tasa;
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
