package elorrieta.pojos;

import java.util.Date;

public class Alumno {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Date fecha;
	private String clase;

	public Alumno() {
		nombre = null;
		apellido1 = null;
		apellido2 = null;
		dni = null;
		fecha = null;
		clase = null;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", dni=" + dni
				+ ", fecha=" + fecha + ", clase=" + clase + "]";
	}

}
