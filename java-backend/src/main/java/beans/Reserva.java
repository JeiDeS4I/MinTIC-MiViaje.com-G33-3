package beans;

import java.sql.Date;

public class Reserva {
    private int idReservas;
    private String token;
    private Date fechaInicial;
    private Date fechaFinal;
    private int cantidadPersonas;
    private String nombrePersona;
    private String apellidoPersona;
    private String correoPersona;
    private String telefonoPersona;
    private String tipoDocumento;
    private String numeroDocumento;
    // falta el ultimo atributo de la tabla

    public Reserva(int idReservas, String token, Date fechaInicial, Date fechaFinal, int cantidadPersonas, String nombrePersona, String apellidoPersona, String correoPersona, String telefonoPersona, String tipoDocumento, String numeroDocumento) {
        this.idReservas = idReservas;
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

    public int getIdReservas() {
        return idReservas;
    }

    public void setIdReservas(int idReservas) {
        this.idReservas = idReservas;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reserva{");
        sb.append("idReservas=").append(idReservas);
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
