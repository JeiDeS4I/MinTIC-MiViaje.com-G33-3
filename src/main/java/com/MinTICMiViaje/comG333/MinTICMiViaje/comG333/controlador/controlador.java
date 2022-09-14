package com.MinTICMiViaje.comG333.MinTICMiViaje.comG333.controlador;

import com.MinTICMiViaje.comG333.MinTICMiViaje.comG333.servicios.hotelServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controlador {

    @Autowired
    hotelServicios hotelServicios;


    @GetMapping("/")
    public String index(){
        return "index";
    }

}
