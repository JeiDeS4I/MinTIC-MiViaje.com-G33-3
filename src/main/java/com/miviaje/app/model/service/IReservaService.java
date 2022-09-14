package com.miviaje.app.model.service;

import java.util.List;

import com.miviaje.app.model.Hotel;
import com.miviaje.app.model.Reserva;

public interface IReservaService {
	public List<Reserva> getReservas ();
	
	public Reserva getReservaXId (int id);
	
	public List<Hotel> getHoteles ();
	
	public Hotel getHotelXId (int id);
	
	public void insertHotel(Hotel hotel);
}
