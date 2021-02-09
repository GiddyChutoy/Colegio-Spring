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
import javax.persistence.Table;

/**
 * @author 201907
 *
 */
@Entity
@Table(name = "notas")
public class NotaEntities {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_alumnos")
	private AlumnoEntities idAlumno;
	
	@ManyToOne
	@JoinColumn(name = "id_asignaturas")
	private AsignaturaEntities idAsignatura;
	
	@Column(name = "nota")
	private int nota;
	
	@Column(name = "fecha")
	private String fecha;

	/**
	 * @param id
	 * @param idAlumno
	 * @param idAsignatura
	 * @param nota
	 * @param fecha
	 */
	public NotaEntities(AlumnoEntities idAlumno, AsignaturaEntities idAsignatura, int nota, String fecha) {
		super();
		this.idAlumno = idAlumno;
		this.idAsignatura = idAsignatura;
		this.nota = nota;
		this.fecha = fecha;
	}

	/**
	 * 
	 */
	public NotaEntities() {
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
	 * @return the idAlumno
	 */
	public AlumnoEntities getIdAlumno() {
		return idAlumno;
	}

	/**
	 * @param idAlumno the idAlumno to set
	 */
	public void setIdAlumno(AlumnoEntities idAlumno) {
		this.idAlumno = idAlumno;
	}

	/**
	 * @return the idAsignatura
	 */
	public AsignaturaEntities getIdAsignatura() {
		return idAsignatura;
	}

	/**
	 * @param idAsignatura the idAsignatura to set
	 */
	public void setIdAsignatura(AsignaturaEntities idAsignatura) {
		this.idAsignatura = idAsignatura;
	}

	/**
	 * @return the nota
	 */
	public int getNota() {
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(int nota) {
		this.nota = nota;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	

}
