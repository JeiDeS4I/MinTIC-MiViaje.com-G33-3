package com.miviaje.app.model.service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.miviaje.app.model.Hotel;
import com.miviaje.app.model.Reserva;

public interface IHotel extends CrudRepository<Hotel, Integer> {

	
	
	@Query("select h from Hotel h where h.ciudad = :ciudad")
	public List<Hotel> findHotelByCiudad(@Param("ciudad") String ciudad);
	
}
