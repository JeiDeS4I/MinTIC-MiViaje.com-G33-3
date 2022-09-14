package com.miviaje.app.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miviaje.app.model.Hotel;
import com.miviaje.app.model.Reserva;
import com.miviaje.app.model.service.dao.IHotel;
import com.miviaje.app.model.service.dao.IReserva;

@Service
public class ReservaService implements IReservaService {

	@Autowired
	private IReserva reservaDao;

	@Autowired
	private IHotel hotelDao;

	@Override
	public List<Reserva> getReservas() {
		return (List<Reserva>) reservaDao.findAll();
	}

	@Override
	public Reserva getReservaXId(int id) {
		return reservaDao.findById(id).get();
	}

	@Override
	public List<Hotel> getHoteles() {
		return (List<Hotel>) hotelDao.findAll();
	}

	@Override
	public Hotel getHotelXId(int id) {
		return hotelDao.findById(id).get();
	}

	@Override
	public Hotel insertHotel(Hotel hotel) {
		
		return hotelDao.save(hotel);
	}

	
}
