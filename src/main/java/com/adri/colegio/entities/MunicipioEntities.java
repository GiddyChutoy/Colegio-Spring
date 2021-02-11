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
@Entity
@Table(name = "municipios")
public class MunicipioEntities {
	
	@Id
	@Column(name="id_municipio")
	private int idMunicipio;
	
	@Column(name="id_provincia")
	private int idProvincia;
	
	@Column(name="nombre")
	private String nombre;

	/**
	 * @param idMunicipio
	 * @param idProvincia
	 * @param nombre
	 */
	public MunicipioEntities(int idMunicipio, int idProvincia, String nombre) {
		super();
		this.idMunicipio = idMunicipio;
		this.idProvincia = idProvincia;
		this.nombre = nombre;
	}

	/**
	 * 
	 */
	public MunicipioEntities() {
		super();
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
	 * @return the idProvincia
	 */
	public int getIdProvincia() {
		return idProvincia;
	}

	/**
	 * @param idProvincia the idProvincia to set
	 */
	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
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
	
	
	
}
