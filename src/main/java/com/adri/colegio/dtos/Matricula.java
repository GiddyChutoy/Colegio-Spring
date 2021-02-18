/**
 * 
 */
package com.adri.colegio.dtos;

/**
 * @author 201907
 *
 */
public class Matricula {
	private int id;
	private int idAsignatura;
	private String asignatura;
	private int idAlumno;
	private String nombre;
	private String fecha;
	private int activo;

	/**
	 * 
	 */
	public Matricula() {
		super();
	}
	
	

	/**
	 * @param idAsignatura
	 * @param asignatura
	 * @param idAlumno
	 * @param nombre
	 * @param fecha
	 * @param activo
	 */
	public Matricula(int idAsignatura, String asignatura, int idAlumno, String nombre, String fecha, int activo) {
		super();
		this.idAsignatura = idAsignatura;
		this.asignatura = asignatura;
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.fecha = fecha;
		this.activo = activo;
	}



	/**
	 * @param asignatura
	 * @param idAlumno
	 * @param fecha
	 * @param activo
	 */
	public Matricula(String asignatura, int idAlumno, String fecha, int activo) {
		super();
		this.asignatura = asignatura;
		this.idAlumno = idAlumno;
		this.fecha = fecha;
		this.activo = activo;
	}

	/**
	 * @param asignatura
	 * @param idAlumno
	 * @param nombre
	 * @param fecha
	 * @param activo
	 */
	public Matricula(String asignatura, int idAlumno, String nombre, String fecha, int activo) {
		super();
		this.asignatura = asignatura;
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.fecha = fecha;
		this.activo = activo;
	}
	
	

	/**
	 * @param id
	 * @param idAsignatura
	 * @param asignatura
	 * @param idAlumno
	 * @param nombre
	 * @param fecha
	 * @param activo
	 */
	public Matricula(int id, int idAsignatura, String asignatura, int idAlumno, String nombre, String fecha,
			int activo) {
		super();
		this.id = id;
		this.idAsignatura = idAsignatura;
		this.asignatura = asignatura;
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.fecha = fecha;
		this.activo = activo;
	}

	/**
	 * @return the asignatura
	 */
	public String getAsignatura() {
		return asignatura;
	}

	/**
	 * @param asignatura the asignatura to set
	 */
	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	/**
	 * @return the idAlumno
	 */
	public int getIdAlumno() {
		return idAlumno;
	}

	/**
	 * @param idAlumno the idAlumno to set
	 */
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
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
	public int getActivo() {
		return activo;
	}

	/**
	 * @param activo the activo to set
	 */
	public void setActivo(int activo) {
		this.activo = activo;
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
	 * @return the idAsignatura
	 */
	public int getIdAsignatura() {
		return idAsignatura;
	}

	/**
	 * @param idAsignatura the idAsignatura to set
	 */
	public void setIdAsignatura(int idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
	
	

}
