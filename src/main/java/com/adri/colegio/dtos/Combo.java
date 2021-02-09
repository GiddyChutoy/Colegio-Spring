/**
 * 
 */
package com.adri.colegio.dtos;

/**
 * @author 201907
 *
 */
public class Combo  {
	private int id;
	private String descripcion;

	/**
	 * @param id
	 * @param descripcion
	 */
	public Combo(int id, String descripcion) {
		super();
		this.id = id;
		this.descripcion = descripcion;
	}

	/**
	 * 
	 */
	public Combo() {
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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	

}
