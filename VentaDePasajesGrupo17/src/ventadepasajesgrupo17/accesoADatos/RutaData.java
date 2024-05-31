/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventadepasajesgrupo17.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ventadepasajesgrupo17.entidades.Ruta;

/**
 * La aplicación debe implementar las operaciones CRUD (Crear, Listar ,
 * Actualizar, Eliminar) Gestión de Rutas: Los usuarios deben poder añadir
 * nuevas rutas a la base de datos, especificando el origen y destino de cada
 * ruta. Los usuarios deben poder visualizar la lista de rutas disponibles.
 * mostrar todas las rutas Los usuarios deben poder buscar rutas por origen o
 * destino. buscarOrigen/ buscarDestino *
 *
 */
public class RutaData {

    private Connection con = null;
    //private HorarioData hd= new HorarioData();

    public RutaData() {
        this.con = (Connection) Conexion.getConexion();

    }

    public void guardarRuta(Ruta ruta) {
        String sql = "INSERT INTO rutas(origen, destino, duracion_estimada) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, ruta.getOrigen());

            ps.setString(2, ruta.getDestino());

            ps.setTime(3, Time.valueOf(ruta.getDuracion_estimado()));

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                ruta.setId_ruta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ruta guardada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta");
        }

    }

    public void actualizarRuta(String origen, String destino, Time duracion_estimada) {
        String sql = "UPDATE rutas SET `origen`='?',`destino`='?',`duracion_estimado`='?' WHERE id_ruta=? and id_horario=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, origen);
            ps.setString(2, destino);
            ps.setTime(3, duracion_estimada);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Ruta actualizada");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder  a la tabla ");
        }

    }

    public void eliminarRuta(int id_horario, int id_ruta) {
        String sql = "DELETE FROM rutas WHERE id_horario=? and id_ruta=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_horario);
            ps.setInt(2, id_ruta);
            int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Incripcion borrada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder  a la tabla ");
        }

    }

    public List<Ruta> listarRuta() {
        ArrayList<Ruta> rutas = new ArrayList<>();
        String sql = "SELECT * FROM rutas";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Ruta rut = new Ruta();
                rut.setId_ruta(rs.getInt("id_ruta"));
                rut.setOrigen("origen");
                rut.setDestino(rs.getString("destino"));
                rut.setDuracion_estimado(rs.getTime("duracion_estimada").toLocalTime());
                rutas.add(rut);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ruta");
        }
        return rutas;

    }

    public List<Ruta> buscarOrigen(String origen) {
        ArrayList<Ruta> rutas = new ArrayList<>();
        String sql = "SELECT * FROM rutas WHERE origen = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, origen);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Ruta ruta = new Ruta();
                ruta.setId_ruta(rs.getInt("id_ruta"));
                ruta.setOrigen(rs.getString("origen"));
                ruta.setDestino(rs.getString("destino"));
                ruta.setDuracion_estimado(rs.getTime("duracion_estimada").toLocalTime());
                rutas.add(ruta);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el origen");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla rutas");
        }
        return rutas;
    }

    public List<Ruta> buscarDestino(String destino) {
        ArrayList<Ruta> rutas = new ArrayList<>();
        String sql = "SELECT * FROM rutas WHERE destino = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, destino);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Ruta ruta = new Ruta();
                ruta.setId_ruta(rs.getInt("id_ruta"));
                ruta.setOrigen(rs.getString("origen"));
                ruta.setDestino(rs.getString("destino"));
                ruta.setDuracion_estimado(rs.getTime("duracion_estimada").toLocalTime());
                rutas.add(ruta);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el destino");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla destino");
        }
        return rutas;
    }

    public Ruta buscarRuta(int id) {

        String sql = "SELECT origen, destino, duracion_estimada FROM rutas WHERE id_ruta = ? ";
        Ruta rut = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                rut = new Ruta();
                rut.setId_ruta(id);
                rut.setOrigen(rs.getString("origen"));
                rut.setDestino(rs.getString("destino"));
                rut.setDuracion_estimado(rs.getTime("duracion_estimada").toLocalTime());

            } else {
                JOptionPane.showMessageDialog(null, "No existe la ruta");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla rutas " + ex.getMessage());
        }
        return rut;

    }

}
