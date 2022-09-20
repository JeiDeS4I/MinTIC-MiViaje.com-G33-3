package com.miviaje.app.model.service;

import java.util.List;
import java.util.Map;

import com.miviaje.app.model.Contacto;
import com.miviaje.app.model.Hotel;
import com.miviaje.app.model.Reserva;

public interface IReservacionService {

	/*
	 * 
	 * CRUD Hotel
	 * 
	 */
	public Hotel getHotelXId(int id);

	public List<Hotel> getHoteles();
	
	public List<Hotel> getHotelByCiudad(String ciudad);

	public Hotel crearHotel(Hotel hotel);

	public void eliminarHotel(int id);

	// Devuelve los 3 hoteles más reservados
	public Map topHoteles();

	/*
	 * 
	 * CRUD Reserva
	 * 
	 */
	public List<Reserva> getReservas();

	public Reserva getReservaXId(int id);
	
	public Reserva getReservaByTokenDocumento(String numeroDocumento, String token);

	public Reserva crearReserva(Reserva reserva);
	
	public void eliminarReserva(int id);
	


	/*
	 * 
	 * CRUD Contacto
	 * 
	 */

	public Contacto getContactoXId(int id);

	public List<Contacto> getContactos();

	public Contacto crearContacto(Contacto contacto);

	public void eliminarContacto(int id);


}
