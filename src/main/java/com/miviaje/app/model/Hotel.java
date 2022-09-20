package com.miviaje.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hoteles")
public class Hotel {

	@Id
	@Column(name = "id_hoteles")
	private int idHotel;
	private String nombreHotel;
	private String ciudad;
	private int totalHabitaciones;
	private int disponiblesHabitaciones;
	private String costoHabitacion;
	private String imagen;

	public Hotel() {

	}

	public Hotel(int idHotel, String nombreHotel, String ciudad, int totalHabitaciones, int disponiblesHabitaciones,
			String costoHabitacion, String imagen) {
		this.idHotel = idHotel;
		this.nombreHotel = nombreHotel;
		this.ciudad = ciudad;
		this.totalHabitaciones = totalHabitaciones;
		this.disponiblesHabitaciones = disponiblesHabitaciones;
		this.costoHabitacion = costoHabitacion;
		this.imagen = imagen;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getNombreHotel() {
		return nombreHotel;
	}

	public void setNombreHotel(String nombreHotel) {
		this.nombreHotel = nombreHotel;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getTotalHabitaciones() {
		return totalHabitaciones;
	}

	public void setTotalHabitaciones(int totalHabitaciones) {
		this.totalHabitaciones = totalHabitaciones;
	}

	public int getDisponiblesHabitaciones() {
		return disponiblesHabitaciones;
	}

	public void setDisponiblesHabitaciones(int disponiblesHabitaciones) {
		this.disponiblesHabitaciones = disponiblesHabitaciones;
	}

	public String getCostoHabitacion() {
		return costoHabitacion;
	}

	public void setCostoHabitacion(String costoHabitacion) {
		this.costoHabitacion = costoHabitacion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hotel{");
		sb.append("idHotel=").append(idHotel);
		sb.append(", nombreHotel=").append(nombreHotel);
		sb.append(", ciudad=").append(ciudad);
		sb.append(", totalHabitaciones=").append(totalHabitaciones);
		sb.append(", disponiblesHabitaciones=").append(disponiblesHabitaciones);
		sb.append(", costoHabitacion=").append(costoHabitacion);
		sb.append(", imagen=").append(imagen);
		sb.append('}');
		return sb.toString();
	}

}
