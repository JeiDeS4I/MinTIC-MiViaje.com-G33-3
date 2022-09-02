package controller;

import beans.Hotel;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Operaciones {

    public static void main(String[] args) {
        listarHoteles();
    }
    public static void listarHoteles() {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM hoteles";

        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id_hotel");
                String nombre = rs.getString("nombre");
                String ciudad = rs.getString("ciudad");
                int totalHabitaciones = rs.getInt("totalHabitaciones");
                int disponiblesHabitaciones = rs.getInt("disponiblesHabitaciones");
                String costoHabitacion = rs.getString("costoHabitacion");
                String imagen = rs.getString("imagen");

                Hotel h = new Hotel(id, nombre, ciudad, totalHabitaciones, disponiblesHabitaciones, costoHabitacion, imagen);
                System.out.println(h);
            }
            st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }
    }
}
