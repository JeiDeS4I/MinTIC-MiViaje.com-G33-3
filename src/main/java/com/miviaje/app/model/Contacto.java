package com.miviaje.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacto")
public class Contacto {

	@Id
	@Column(name="idcontacto")
	private int id;
	//@Column(name="nombre")
	private String nombre;
	//@Column(name="apellido_contacto")
	private String apellido;
	//@Column(name="correo_contacto")
	private String correo;
	//@Column(name="telefono_contacto")
	private String telefono;
	@Column(name="mensaje")
	private String mensaje_contacto;

	public Contacto() {

	}

	public Contacto(int id, String nombre, String apellido, String correo, String telefono, String mensaje) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.telefono = telefono;
		this.mensaje_contacto = mensaje;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMensaje() {
		return mensaje_contacto;
	}

	public void setMensaje(String mensaje) {
		this.mensaje_contacto = mensaje;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Contacto{");
		sb.append("id=").append(id);
		sb.append(", nombre=").append(nombre);
		sb.append(", apellido=").append(apellido);
		sb.append(", correo=").append(correo);
		sb.append(", telefono=").append(telefono);
		sb.append(", mensaje=").append(mensaje_contacto);
		sb.append('}');
		return sb.toString();
	}

}
