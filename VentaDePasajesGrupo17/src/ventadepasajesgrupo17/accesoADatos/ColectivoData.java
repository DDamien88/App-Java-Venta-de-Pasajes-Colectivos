/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventadepasajesgrupo17.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ventadepasajesgrupo17.entidades.Colectivo;

/**
 *
 * @author Damián
 */
public class ColectivoData {

    private Connection con = null;

    public ColectivoData() {
        con = Conexion.getConexion();
    }

    public void guardarColectivo(Colectivo cole) {
        String sql = "INSERT INTO colectivos (matricula, marca, modelo, capacidad, estado)"
                + "VALUES(?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, cole.getMatricula());
            ps.setString(2, cole.getMarca());
            ps.setString(3, cole.getModelo());
            ps.setInt(4, cole.getCapacidad());
            ps.setBoolean(5, cole.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cole.setId_colectivo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Colectivo agregado");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Colectivo");
        }
    }

    public void modificarColectivo(Colectivo cole) {
        String sql = "UPDATE colectivos SET matricula = ?, marca = ?, modelo = ?, capacidad = ? "
                + "WHERE id_colectivo = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cole.getMatricula());
            ps.setString(2, cole.getMarca());
            ps.setString(3, cole.getModelo());
            ps.setInt(4, cole.getCapacidad());
            ps.setInt(5, cole.getId_colectivo());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Colectivo modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla colectivo");
        }
    }

    public void eliminarColectivo(int id) {
        String sql = "UPDATE colectivos SET estado = 0  WHERE id_colectivo = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "colectivo eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla colectivo");
        }

    }

    public Colectivo buscarColectivo(int id) {
        //Agregar estado
        String sql = "SELECT matricula, marca, modelo, capacidad FROM colectivos WHERE id_colectivo = ? AND estado = 1 ";
        Colectivo cole = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cole = new Colectivo();
                cole.setId_colectivo(id);
                cole.setMatricula(rs.getString("matricula"));
                cole.setMarca(rs.getString("marca"));
                cole.setModelo(rs.getString("modelo"));
                cole.setCapacidad(rs.getInt("capacidad"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el Colectivo");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla colectivo " + ex.getMessage());
        }
        return cole;
    }

    public List<Colectivo> listarColes() {
        //Cambiar estado
        String sql = "SELECT id_colectivo, matricula, marca, modelo, capacidad, estado FROM colectivos WHERE estado = 1";
        ArrayList<Colectivo> coles = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Colectivo cole = new Colectivo();
                cole.setId_colectivo(rs.getInt("id_colectivo"));
                cole.setMatricula(rs.getString("matricula"));
                cole.setMarca(rs.getString("marca"));
                cole.setModelo(rs.getString("modelo"));
                cole.setCapacidad(rs.getInt("capacidad"));
                cole.setEstado(rs.getBoolean("estado"));

                coles.add(cole);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla colectivos");
        }
        return coles;

    }

}
