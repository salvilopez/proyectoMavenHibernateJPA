package es.salvi.hibernate.modelo;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")

public class cliente implements Serializable {
	
	@Id
	@Column(name = "nombreUsuario")
	private String nombreUsuario;
	
	
	@Column(name = "nombre")
	private String nombre ;
	
	
	@Column(name = "apellidos")
	private String apellidos ;
	
	
	@Column(name = "tipo")
	private String tipo ;
	
	@Column(name = "fechaNacimiento")
	private Date fechaNacimiento;
	
	public cliente() {
		
	}

	
	public cliente(String nombreUsuario, String nombre, String apellidos, String tipo, Date fechaNacimiento) {
		
		this.nombreUsuario = nombreUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.tipo = tipo;
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getNombreUsuario() {
		return nombreUsuario;
	}


	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "cliente [nombre=" + nombre + ", apellidos=" + apellidos + ", tipo=" + tipo + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
	
	
	
}
