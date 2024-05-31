/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventadepasajesgrupo17.accesoADatos;

import java.sql.*;
import java.time.LocalDate;
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
    //private RutaData rd = new MateriaData();

    public HorarioData() {
        this.con = (Connection) Conexion.getConexion();
    }

    //crear primero ruta y despues horario
    public void guardarHorario(Horario hor, Ruta ruta) {
        String sql = "INSERT INTO horarios (id_ruta,hora_salida,hora_llegada) "
                + "VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ruta.getId_ruta());
            ps.setTime(2, Time.valueOf(hor.getHora_salida()));
            ps.setTime(3, Time.valueOf(hor.getHora_llegada()));
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

    public Horario buscarHorario(int id) {
        String sql = "SELECT  id_ruta, hora_salida, hora_llegada FROM horarios WHERE id_horario = ?";
        Horario horario = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                horario = new Horario();
                horario.setId_horario(id);
                // horario.setId_ruta(rs.getInt("id_ruta"));
                horario.setHora_salida(rs.getTime("hora_salida").toLocalTime());
                horario.setHora_llegada(rs.getTime("hora_llegada").toLocalTime());

            } else {
                JOptionPane.showMessageDialog(null, "No existe el horario");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Horarios " + ex.getMessage());
        }
        return horario;
    }

    public void actualizarHorario(Horario horario) {
        String sql = "UPDATE horarios SET id_ruta = ?, horario_salido = ?, horario_llegada = ?"
                + "WHERE id_horario = ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            // ps.setInt(1, horario.getId_ruta());
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
        String sql = "UPDATE horarios SET id_ruta = null WHERE id_horario = ?";

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

    public List<Horario> buscarHorariosPorRuta(Ruta ruta) {
        ArrayList<Horario> horas = new ArrayList<>();
        String sql = "SELECT * FROM horarios WHERE id_ruta = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ruta.getId_ruta());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Horario hora = new Horario();
                Ruta rutas = new Ruta();
                hora.setId_horario(rs.getInt("id_horario"));
                rutas.setId_ruta(rs.getInt("id_ruta"));
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

    //Los usuarios deben poder añadir horarios a las rutas, especificando la fecha y hora de
//salida y llegada.  
//    public void guardarHorarioPorFechaYHora(int id_ruta, int id_pasaje){
//        String sql = "INSERT INTO horarios (hora_salida,hora_llegada) VALUES (?,?)"
//                + "WHERE id_ruta=? and id_pasaje/fecha_viaje      JOIN"; 
//        
//
//        
//    }
//    //Los usuarios deben poder visualizar los horarios disponibles para una ruta específica.
//    //Select  ver horarios segun id_ruta
//    public void verHorariosDisponibleds(){
//        String sql = "SELECT horariodisponible???? ";
//        
//    }
//        
////Los usuarios deben poder buscar horarios por ruta o fecha.
//    //Select horario_llegada, salida segun ruta o fecha(pasaje)
//    public void buscarHorarioPorRutaOFecha(Ruta id_ruta, Pasaje fecha_viaje){
//        String sql = "SELECT hora_salida, hora_llegada FROM horarios WHERE id_ruta = ? "
//                + "OR id_fecha = ?"; 
//        
//    }
}
