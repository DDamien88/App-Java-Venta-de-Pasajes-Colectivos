/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventadepasajesgrupo17.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ventadepasajesgrupo17.entidades.Colectivo;
import ventadepasajesgrupo17.entidades.Horario;
import ventadepasajesgrupo17.entidades.Pasaje;
import ventadepasajesgrupo17.entidades.Pasajero;
import ventadepasajesgrupo17.entidades.Ruta;

public class PasajeData {

    //private PasajeroData pasajeroData = new PasajeroData();
    private ColectivoData colectivoData = new ColectivoData();
    
    private Connection con = null;

    public PasajeData() {
        con = Conexion.getConexion();
    }

    public void registrarVenta(Pasaje pasaje, Ruta ruta, Horario hora, Pasajero pasajero) {
        Colectivo cole = new Colectivo();
        String sql = "INSERT INTO pasajes (id_colectivo, fecha_viaje, hora_viaje, asiento, precio)"
                + "VALUES(?, ?, ?, ?, ?) WHERE id_ruta = ? AND id_horario= ?  AND id_pasajero= '";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, cole.getId_colectivo());
            ps.setDate(2, Date.valueOf(pasaje.getFecha_viaje()));
            ps.setTime(3, Time.valueOf(pasaje.getHora_viaje()));
            ps.setInt(4, pasaje.getAsiento());
            ps.setDouble(5, pasaje.getPrecio());
            ps.setInt(6, ruta.getId_ruta());
            ps.setInt(7, hora.getId_horario());
            ps.setInt(8, pasajero.getId_pasajero());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pasaje.setId_pasaje(rs.getInt(1));
//                pasajero.setId_pasajero(rs.getInt(1));
//                cole.setId_colectivo(1);
//                ruta.setId_ruta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Venta registrada!");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajes");
        }
    }

    public List<Pasaje> listarPasajes(Pasajero pasajero) {
        String sql = "SELECT id_pasaje, id_pasajero, id_colectivo, id_ruta, fecha_viaje, hora_viaje, asiento, precio FROM pasajes WHERE id_pasajero = ?";
        ArrayList<Pasaje> ventas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pasajero.getId_pasajero());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasa = new Pasaje();
//                Pasajero pasaj = ;
//                Colectivo cole = ;
//                Ruta ruta = ;
                pasa.setId_pasaje(rs.getInt("id_pasaje"));
//                pasaj.setId_pasajero(rs.getInt("id_pasajero"));
//                cole.setId_colectivo(rs.getInt("id_colectivo"));
//                ruta.setId_ruta(rs.getInt("id_ruta"));     
                pasa.setFecha_viaje(rs.getDate("fecha_viaje").toLocalDate());
                pasa.setHora_viaje(rs.getTime("hora_viaje").toLocalTime());
                pasa.setAsiento(rs.getInt("asiento"));
                pasa.setPrecio(rs.getDouble("precio"));

                ventas.add(pasa);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajes");
        }
        return ventas;

    }
}
