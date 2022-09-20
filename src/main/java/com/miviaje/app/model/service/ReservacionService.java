package com.miviaje.app.model.service;

import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miviaje.app.model.Contacto;
import com.miviaje.app.model.Hotel;
import com.miviaje.app.model.Reserva;
import com.miviaje.app.model.service.dao.IContacto;
import com.miviaje.app.model.service.dao.IHotel;
import com.miviaje.app.model.service.dao.IReserva;

@Service
public class ReservacionService implements IReservacionService {

	@Autowired
	private IReserva reservaDao;

	@Autowired
	private IHotel hotelDao;

	@Autowired
	private IContacto contactoDao;

	/*
	 * Metodos CRUD de hotel
	 * 
	 * 
	 */
	@Override
	public List<Hotel> getHoteles() {
		return (List<Hotel>) hotelDao.findAll();
	}

	@Override
	public Hotel getHotelXId(int id) {
		return hotelDao.findById(id).get();
	}
	
	@Override
	public List<Hotel> getHotelByCiudad(String ciudad) {
		return hotelDao.findHotelByCiudad(ciudad);
	}

	@Override
	public Hotel crearHotel(Hotel hotel) {
		return hotelDao.save(hotel);
	}

	@Override
	public void eliminarHotel(int id) {
		hotelDao.deleteById(id);

	}

	@Override
	public Map<Integer, Integer> topHoteles() {
		List<Reserva> lista = getReservas();

		Map<Integer, Integer> top = new HashMap<>();

		for (Reserva reservita : lista) {
			top.merge(reservita.getFkHotel(), 1, Integer::sum);
		}

		return top;
	}

	/*
	 * 
	 * Metodos CRUD de Reservas
	 * 
	 * 
	 */

	@Override
	public Reserva crearReserva(Reserva reserva) {
		return reservaDao.save(reserva);
	}

	@Override
	public List<Reserva> getReservas() {
		return (List<Reserva>) reservaDao.findAll();
	}

	@Override
	public Reserva getReservaXId(int id) {
		return reservaDao.findById(id).get();
	}
	
	@Override
	public Reserva getReservaByTokenDocumento(String numeroDocumento, String token) {
		return reservaDao.findReservaByTokenDocumento(numeroDocumento, token);
	}


	@Override
	public void eliminarReserva(int id) {
		reservaDao.deleteById(id);
	}

	/*
	 * Generar Token
	 */
	public static String generarToken(int longitud) {
		String letrasMin = "abcdefghijklmnopqrstuvwxyz";
		String letrasMayu = letrasMin.toUpperCase();
		String numeros = "0123456789";
		String randomToken = letrasMin + letrasMayu + numeros;
		SecureRandom random = new SecureRandom();

		if (longitud < 1)
			throw new IllegalArgumentException();

		StringBuilder tokenFinal = new StringBuilder(longitud);

		for (int i = 0; i < longitud; i++) {
			int rndCharAt = random.nextInt(randomToken.length());
			char rndChar = randomToken.charAt(rndCharAt);
			tokenFinal.append(rndChar);
		}
		return tokenFinal.toString();
	}

	/*
	 * 
	 * Metodos CRUD de Contacto
	 * 
	 * 
	 */

	@Override
	public Contacto getContactoXId(int id) {
		return contactoDao.findById(id).get();
	}

	@Override
	public List<Contacto> getContactos() {
		return (List<Contacto>) contactoDao.findAll();

	}

	@Override
	public Contacto crearContacto(Contacto contacto) {
		return contactoDao.save(contacto);
	}

	@Override
	public void eliminarContacto(int id) {
		contactoDao.deleteById(id);
	}

	
}
