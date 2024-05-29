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
        String sql = "INSERT INTO colectivos (matricula, marca, modelo, capacidad)"
                + "VALUES(?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, cole.getMatricula());
            ps.setString(2, cole.getMarca());
            ps.setString(3, cole.getModelo());
            ps.setInt(4, cole.getCapacidad());
           
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

}
