package com.miviaje.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pvhotelreserva")
public class PVHotelReserva {

	@Id
	private int idReservasHoteles;
	private int fkHoteles;
	private int fkReserva;

	public PVHotelReserva() {

	}

	public PVHotelReserva(int idReservasHoteles, int fkHoteles, int fkReserva) {
		this.idReservasHoteles = idReservasHoteles;
		this.fkHoteles = fkHoteles;
		this.fkReserva = fkReserva;
	}

	public int getIdReservasHoteles() {
		return idReservasHoteles;
	}

	public void setIdReservasHoteles(int idReservasHoteles) {
		this.idReservasHoteles = idReservasHoteles;
	}

	public int getFkHoteles() {
		return fkHoteles;
	}

	public void setFkHoteles(int fkHoteles) {
		this.fkHoteles = fkHoteles;
	}

	public int getFkReserva() {
		return fkReserva;
	}

	public void setFkReserva(int fkReserva) {
		this.fkReserva = fkReserva;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("PVHotelReserva{");
		sb.append("idReservasHoteles=").append(idReservasHoteles);
		sb.append(", fkHoteles=").append(fkHoteles);
		sb.append(", fkReserva=").append(fkReserva);
		sb.append('}');
		return sb.toString();
	}
}
