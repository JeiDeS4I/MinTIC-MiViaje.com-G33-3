package com.MinTICMiViaje.comG333.MinTICMiViaje.comG333.repo;

import com.MinTICMiViaje.comG333.MinTICMiViaje.comG333.modelos.hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface hotelRepositorio extends JpaRepository<hotel, Integer> {
}
