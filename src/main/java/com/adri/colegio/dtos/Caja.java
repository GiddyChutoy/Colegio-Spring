/**
 * 
 */
package com.adri.colegio.dtos;

/**
 * @author 201907
 *
 */
public class Caja {
	private Integer id;
	private Integer idMatricula;
	private Double importe;

	/**
	 * @param id
	 * @param idMatricula
	 * @param importe
	 */
	public Caja(Integer id, Integer idMatricula, Double importe) {
		super();
		this.id = id;
		this.idMatricula = idMatricula;
		this.importe = importe;
	}

	/**
	 * @param idMatricula
	 * @param importe
	 */
	public Caja(Integer idMatricula, Double importe) {
		super();
		this.idMatricula = idMatricula;
		this.importe = importe;
	}

	/**
	 * @param idMatricula
	 */
	public Caja(Integer idMatricula) {
		super();
		this.idMatricula = idMatricula;
	}

	/**
	 * 
	 */
	public Caja() {
		super();
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the idMatricula
	 */
	public Integer getIdMatricula() {
		return idMatricula;
	}

	/**
	 * @param idMatricula the idMatricula to set
	 */
	public void setIdMatricula(Integer idMatricula) {
		this.idMatricula = idMatricula;
	}

	/**
	 * @return the importe
	 */
	public Double getImporte() {
		return importe;
	}

	/**
	 * @param importe the importe to set
	 */
	public void setImporte(Double importe) {
		this.importe = importe;
	}

}
