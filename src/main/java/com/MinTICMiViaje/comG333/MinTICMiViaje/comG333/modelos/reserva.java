package com.MinTICMiViaje.comG333.MinTICMiViaje.comG333.modelos;

import javax.persistence.*;

@Entity
@Table(name = "reservas")

public class reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String token;
    private String fechaInicial;
    private String fechaFinal;
    private int cantidadPersonas;
    private String nombrePersona;
    private String apellidoPersona;
    private String correoPersona;
    private String telefonoPersona;
    private String tipoDocumento;
    private String numeroDocumento;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private hotel hotel;


    public reserva(int id, String token, String fechaInicial, String fechaFinal, int cantidadPersonas, String nombrePersona, String apellidoPersona, String correoPersona, String telefonoPersona, String tipoDocumento, String numeroDocumento) {
        this.id = id;
        this.token = token;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.cantidadPersonas = cantidadPersonas;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.correoPersona = correoPersona;
        this.telefonoPersona = telefonoPersona;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(String fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public com.MinTICMiViaje.comG333.MinTICMiViaje.comG333.modelos.hotel getHotel() {
        return hotel;
    }

    public void setHotel(com.MinTICMiViaje.comG333.MinTICMiViaje.comG333.modelos.hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reserva{");
        sb.append("id=").append(id);
        sb.append(", token=").append(token);
        sb.append(", fechaInicial=").append(fechaInicial);
        sb.append(", fechaFinal=").append(fechaFinal);
        sb.append(", cantidadPersonas=").append(cantidadPersonas);
        sb.append(", nombrePersona=").append(nombrePersona);
        sb.append(", apellidoPersona=").append(apellidoPersona);
        sb.append(", correoPersona=").append(correoPersona);
        sb.append(", telefonoPersona=").append(telefonoPersona);
        sb.append(", tipoDocumento=").append(tipoDocumento);
        sb.append(", numeroDocumento=").append(numeroDocumento);
        sb.append('}');
        return sb.toString();
    }





}
