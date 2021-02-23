/**
 * 
 */
package com.adri.colegio.dtos;

/**
 * @author 201907
 *
 */
public class Notas {
	private int id;
	private int idAlumno;
	private String nombre;
	private int idAsignatura;
	private String asignatura;
	private int nota;
	private String fecha;

	/**
	 * 
	 */
	public Notas() {
		super();
	}

	
	
	/**
	 * @param id
	 * @param idAlumno
	 * @param nombre
	 * @param asignatura
	 * @param nota
	 * @param fecha
	 */
	public Notas(int id, int idAlumno, String nombre, String asignatura, int nota, String fecha) {
		super();
		this.id = id;
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.nota = nota;
		this.fecha = fecha;
	}



	/**
	 * @param nombre
	 * @param asignatura
	 * @param fecha
	 */
	public Notas(String nombre, String asignatura, String fecha) {
		super();
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.fecha = fecha;
	}

//	/**
//	 * @param idAlumno
//	 * @param nombre
//	 * @param asignatura
//	 * @param nota
//	 * @param fecha
//	 */
//	public Notas(int idAlumno, String nombre, String asignatura, int nota, String fecha) {
//		super();
//		this.idAlumno = idAlumno;
//		this.nombre = nombre;
//		this.asignatura = asignatura;
//		this.nota = nota;
//		this.fecha = fecha;
//	}

	/**
	 * @param id
	 * @param idAlumno
	 * @param idAsignatura
	 * @param asignatura
	 * @param nota
	 * @param fecha
	 */
	public Notas(int id, int idAlumno, String nombre, int idAsignatura, String asignatura, int nota, String fecha) {
		super();
		this.id = id;
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.idAsignatura = idAsignatura;
		this.asignatura = asignatura;
		this.nota = nota;
		this.fecha = fecha;
	}

	/**
	 * @param id
	 * @param idAlumno
	 * @param idAsignatura
	 * @param nota
	 * @param fecha
	 */
	public Notas(int id, int idAlumno, int idAsignatura, int nota, String fecha) {
		super();
		this.id = id;
		this.idAlumno = idAlumno;
		this.idAsignatura = idAsignatura;
		this.nota = nota;
		this.fecha = fecha;
	}

	
	
	/**
	 * @param id
	 * @param nombre
	 * @param asignatura
	 * @param nota
	 * @param fecha
	 */
	public Notas(int id, String nombre, String asignatura, int nota, String fecha) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.nota = nota;
		this.fecha = fecha;
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

}
