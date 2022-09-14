package com.MinTICMiViaje.comG333.MinTICMiViaje.comG333.servicios;

import com.MinTICMiViaje.comG333.MinTICMiViaje.comG333.modelos.hotel;
import com.MinTICMiViaje.comG333.MinTICMiViaje.comG333.repo.hotelRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class hotelServicios {

@Autowired
hotelRepositorio hotelRepositorio;

    public List<hotel> getAllHoteles(){
        List<hotel> lista = new ArrayList<>();
        hotelRepositorio.findAll().forEach(hotel -> lista.add(hotel));
        return lista;
    }

    public hotel getHotelById(Integer id){
        hotel hotel = null;
        try{
            hotel = hotelRepositorio.findById(id).get();
        }catch  (NoSuchElementException exception){
            //Entra al catch si no encontro el hotel y retorna null por que el try fallo
        }
        return hotel;
    }

    public boolean saveOrUpdatehotel(hotel hotel){
        hotel hot=hotelRepositorio.save(hotel);
        if (hotelRepositorio.findById(hot.getId())!=null){
            return true;
        }
        return false;
    }

    public boolean deleteHotel(Integer id){
        hotelRepositorio.deleteById(id);
        if (getHotelById(id)!=null){
            return false;
        }
        return true;
    }


}
