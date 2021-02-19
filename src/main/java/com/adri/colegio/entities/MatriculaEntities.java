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
@Table(name = "matriculaciones")
public class MatriculaEntities {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="id_asignatura")
	private AsignaturaEntities idAsignatura;
	
	@ManyToOne
	@JoinColumn(name="id_alumno")
	private AlumnoEntities idAlumno;
	
	@Column(name="fecha")
	private String fecha;
	
	@Column(name="activo")
	private Integer activo;

	/**
	 * @param id
	 * @param idAsignatura
	 * @param idAlumno
	 * @param fecha
	 * @param activo
	 */
	public MatriculaEntities(Integer id, AsignaturaEntities idAsignatura, AlumnoEntities idAlumno, String fecha,
			Integer activo) {
		super();
		this.id = id;
		this.idAsignatura = idAsignatura;
		this.idAlumno = idAlumno;
		this.fecha = fecha;
		this.activo = activo;
	}
	
	

	/**
	 * @param idAsignatura
	 * @param idAlumno
	 * @param fecha
	 * @param activo
	 */
	public MatriculaEntities(AsignaturaEntities idAsignatura, AlumnoEntities idAlumno, String fecha, Integer activo) {
		super();
		this.idAsignatura = idAsignatura;
		this.idAlumno = idAlumno;
		this.fecha = fecha;
		this.activo = activo;
	}



	/**
	 * @param id
	 */
	public MatriculaEntities(Integer id) {
		super();
		this.id = id;
	}



	/**
	 * 
	 */
	public MatriculaEntities() {
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

	/**
	 * @return the activo
	 */
	public Integer getActivo() {
		return activo;
	}

	/**
	 * @param activo the activo to set
	 */
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
	
	
	
	
	
	
	
}
