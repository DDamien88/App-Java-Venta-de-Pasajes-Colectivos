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
import ventadepasajesgrupo17.entidades.Pasaje;
import ventadepasajesgrupo17.entidades.Pasajero;
import ventadepasajesgrupo17.entidades.Ruta;

public class PasajeData {

    private ColectivoData coleData = new ColectivoData();
    private PasajeroData pd = new PasajeroData();
    private RutaData rd = new RutaData();

    private Connection con = null;

    public PasajeData() {
        con = Conexion.getConexion();
    }

    public void registrarVenta(Pasaje pasaje) {
        String sql = "INSERT INTO pasajes (id_pasajero, id_colectivo, id_ruta, fecha_viaje, hora_viaje, asiento, precio) "
                + " VALUES(?, ?, ?, ?, ?, ? ,?) ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, pasaje.getPasajero().getId_pasajero());
            ps.setInt(2, pasaje.getColectivo().getId_colectivo());
            ps.setInt(3, pasaje.getRuta().getId_ruta());
            ps.setDate(4, Date.valueOf(pasaje.getFecha_viaje()));
            ps.setTime(5, Time.valueOf(pasaje.getHora_viaje()));
            ps.setInt(6, pasaje.getAsiento());
            ps.setDouble(7, pasaje.getPrecio());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                pasaje.setId_pasaje(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Venta registrada! " + "\n"
                        + " Pasaje: " + pasaje.getId_pasaje() + "\n" + " Asiento: " + pasaje.getAsiento() + "\n" + " Fecha del viaje: " + pasaje.getFecha_viaje() + "\n" + " Hora del viaje: " + pasaje.getHora_viaje() + "\n");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajes");
        }
    }

    public List<Pasaje> listarPasajes(int idPasajero) {
        String sql = "SELECT * FROM pasajes WHERE id_pasajero = ? ";
        ArrayList<Pasaje> ventas = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPasajero);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasa = new Pasaje();
                pasa.setId_pasaje(rs.getInt("id_pasaje"));
                Pasajero pasajero = pd.buscarPasajero(rs.getInt("id_pasajero"));
                Colectivo cole = coleData.buscarColectivo(rs.getInt("id_colectivo"));
                Ruta ruta = rd.buscarRuta(rs.getInt("id_ruta"));
                pasa.setPasajero(pasajero);
                pasa.setColectivo(cole);
                pasa.setRuta(ruta);
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
    
     public List<Pasaje> listarPasajesPorRuta(int idRuta) {
        String sql = "SELECT id_pasaje, id_pasajero, id_colectivo, id_ruta, fecha_viaje, hora_viaje, asiento, precio FROM pasajes WHERE id_ruta = ? ";
        ArrayList<Pasaje> listaPasaje = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idRuta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pasaje pasa = new Pasaje();
                pasa.setId_pasaje(rs.getInt("id_pasaje"));
                Pasajero pasajero = pd.buscarPasajero(rs.getInt("id_pasajero"));
                Colectivo cole = coleData.buscarColectivo(rs.getInt("id_colectivo"));
                Ruta ruta = rd.buscarRuta(rs.getInt("id_ruta"));
                pasa.setPasajero(pasajero);
                pasa.setColectivo(cole);
                pasa.setRuta(ruta);
                pasa.setFecha_viaje(rs.getDate("fecha_viaje").toLocalDate());
                pasa.setHora_viaje(rs.getTime("hora_viaje").toLocalTime());
                pasa.setAsiento(rs.getInt("asiento"));
                pasa.setPrecio(rs.getDouble("precio"));
                listaPasaje.add(pasa);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pasajes");
        }
        return listaPasaje;

    }

    public void anularVenta(int idPasajero, int idColectivo, int idRuta) {
        String sql = "DELETE FROM pasajes WHERE id_pasajero = ? AND id_colectivo = ? AND id_ruta = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            //ps.setInt(1, idPasaje);
            ps.setInt(1, idPasajero);
            ps.setInt(2, idColectivo);
            ps.setInt(3, idRuta);
            int fila = ps.executeUpdate();
            if (fila > 0) {
                JOptionPane.showMessageDialog(null, "Venta borrada exitosamente ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajes ");
        }
    }
}
