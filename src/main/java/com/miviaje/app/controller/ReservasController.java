package com.miviaje.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miviaje.app.model.Hotel;
import com.miviaje.app.model.Reserva;
import com.miviaje.app.model.service.IReservaService;

@RestController
@RequestMapping("/api")
public class ReservasController {
	
	@Autowired
	private IReservaService reservaService;
	
	@GetMapping("/reservas")
	public List<Reserva> getReservas(){
		return reservaService.getReservas();
	}
	
	@GetMapping("/reservas/{id}")
	public Reserva getReservaXId(@PathVariable int id) {
		return reservaService.getReservaXId(id);
	}
	
	@GetMapping("/hoteles")
	public List<Hotel> getHoteles(){
		return reservaService.getHoteles();
	}
	
	@PostMapping
	public void insertHotel(Hotel hotel) {
		reservaService.insertHotel(hotel);
	}
}
