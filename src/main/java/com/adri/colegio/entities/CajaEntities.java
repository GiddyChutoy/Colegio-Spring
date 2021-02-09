/**
 * 
 */
package com.adri.colegio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author 201907
 *
 */
/**
 * @author Giddy
 *
 */
@Entity
@Table(name="caja")
public class CajaEntities {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="idmatricula")
	private MatriculaEntities idMatricula;
	
	@Column(name="importe")
	private double importe;

	/**
	 * @param id
	 * @param idMatricula
	 * @param importe
	 */
	public CajaEntities(Integer id, MatriculaEntities idMatricula, double importe) {
		super();
		this.id = id;
		this.idMatricula = idMatricula;
		this.importe = importe;
	}

	
	
	/**
	 * @param idMatricula
	 * @param importe
	 */
	public CajaEntities(MatriculaEntities idMatricula, double importe) {
		super();
		this.idMatricula = idMatricula;
		this.importe = importe;
	}



	/**
	 * 
	 */
	public CajaEntities() {
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
	public MatriculaEntities getIdMatricula() {
		return idMatricula;
	}

	/**
	 * @param idMatricula the idMatricula to set
	 */
	public void setIdMatricula(MatriculaEntities idMatricula) {
		this.idMatricula = idMatricula;
	}

	/**
	 * @return the importe
	 */
	public double getImporte() {
		return importe;
	}

	/**
	 * @param importe the importe to set
	 */
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
	
}
