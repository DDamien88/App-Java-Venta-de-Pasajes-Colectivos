/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventadepasajesgrupo17.accesoADatos;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import ventadepasajesgrupo17.entidades.Horario;
import ventadepasajesgrupo17.entidades.Ruta;
import javax.swing.JOptionPane;
import ventadepasajesgrupo17.entidades.Pasaje;

/**
 *
 * @author Castro Maria Victoria
 */
public class HorarioData {

    private Connection con = null;
    private RutaData rutad = new RutaData();

    public HorarioData() {
        this.con = (Connection) Conexion.getConexion();
    }


    public void guardarHorario(Horario hor) {
        String sql = "INSERT INTO horarios (id_ruta,hora_salida,hora_llegada,estado) "
                + "VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, hor.getRuta().getId_ruta());
            ps.setTime(2, Time.valueOf(hor.getHora_salida()));
            ps.setTime(3, Time.valueOf(hor.getHora_llegada()));
            ps.setBoolean(4, hor.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                hor.setId_horario(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Horario guardado ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horarios");
        }

    }


    public void actualizarHorario(Horario horario) {
        String sql = "UPDATE horarios SET id_ruta = ?, hora_salida = ?, hora_llegada = ?"
                + "WHERE id_horario = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, horario.getRuta().getId_ruta());
            ps.setTime(2, Time.valueOf(horario.getHora_salida()));
            ps.setTime(3, Time.valueOf(horario.getHora_llegada()));
            ps.setInt(4, horario.getId_horario());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Horario actualizado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Horarios");
        }
    }

    public void eliminarHorario(int id) {
        String sql = "UPDATE horarios SET estado = 0 WHERE id_horario = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Horario eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Horarios");
        }
    }
    
    public List<Horario> verHorariosDisponible(Horario horario){
        ArrayList<Horario> horas = new ArrayList<>();
        String sql = "SELECT hora_salida, hora_llegada FROM horarios WHERE id_ruta = ? AND estado = 1 ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, horario.getRuta().getId_ruta());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Horario hor = new Horario();
                hor.setHora_salida(rs.getTime("hora_salida").toLocalTime());
                hor.setHora_llegada(rs.getTime("hora_llegada").toLocalTime());
                horas.add(hor);
            } else {
                JOptionPane.showMessageDialog(null, "No existe la ruta");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horario");
        }
        return horas;
        
    }

    public List<Horario> buscarHorariosPorRuta(Horario horario) {
        ArrayList<Horario> horas = new ArrayList<>();
        String sql = "SELECT id_horario, hora_salida, hora_llegada FROM horarios WHERE id_ruta = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, horario.getRuta().getId_ruta());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Horario hora = new Horario();
                hora.setId_horario(rs.getInt("id_horario"));
                hora.setHora_salida(rs.getTime("hora_salida").toLocalTime());
                hora.setHora_llegada(rs.getTime("hora_llegada").toLocalTime());
                horas.add(hora);
            } else {
                JOptionPane.showMessageDialog(null, "No existe la ruta");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horarios");
        }
        return horas;
    }
    
        public List<Horario> buscarHorariosPorHoraDeSalida(LocalTime hora_salida) {
        ArrayList<Horario> horas = new ArrayList<>();
        String sql = "SELECT id_horario, hora_salida, hora_llegada FROM horarios WHERE hora_salida = ? AND estado = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTime(1, Time.valueOf(hora_salida));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Horario hora = new Horario();
                Ruta rutas = new Ruta();
                hora.setId_horario(rs.getInt("id_horario"));
                hora.setHora_salida(rs.getTime("hora_salida").toLocalTime());
                hora.setHora_llegada(rs.getTime("hora_llegada").toLocalTime());
                horas.add(hora);
            } else {
                JOptionPane.showMessageDialog(null, "No existe la ruta");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horarios");
        }
        return horas;
    }
    



}
