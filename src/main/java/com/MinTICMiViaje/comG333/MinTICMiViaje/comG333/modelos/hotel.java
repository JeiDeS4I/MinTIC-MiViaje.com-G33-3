package com.MinTICMiViaje.comG333.MinTICMiViaje.comG333.modelos;

import javax.persistence.*;

@Entity
@Table(name="hoteles")
public class hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreHotel;
    private String ciudad;
    private int totalHabitaciones;
    private int diponiblesHabitaciones;
    private double costoHabitacion;
    private String imagen;

    public hotel(String nombreHotel, String ciudad, int totalHabitaciones, int diponiblesHabitaciones, double costoHabitacion, String imagen) {
        this.nombreHotel = nombreHotel;
        this.ciudad = ciudad;
        this.totalHabitaciones = totalHabitaciones;
        this.diponiblesHabitaciones = diponiblesHabitaciones;
        this.costoHabitacion = costoHabitacion;
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTotalHabitaciones() {
        return totalHabitaciones;
    }

    public void setTotalHabitaciones(int totalHabitaciones) {
        this.totalHabitaciones = totalHabitaciones;
    }

    public int getDiponiblesHabitaciones() {
        return diponiblesHabitaciones;
    }

    public void setDiponiblesHabitaciones(int diponiblesHabitaciones) {
        this.diponiblesHabitaciones = diponiblesHabitaciones;
    }

    public double getCostoHabitacion() {
        return costoHabitacion;
    }

    public void setCostoHabitacion(double costoHabitacion) {
        this.costoHabitacion = costoHabitacion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
