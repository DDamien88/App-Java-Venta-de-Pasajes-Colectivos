package ventadepasajesgrupo17.accesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import ventadepasajesgrupo17.entidades.Pasajero;

public class PasajeroData {
       
    private Connection con = null;

    public PasajeroData() {
        con = Conexion.getConexion();
    }
    
    public void guardarPasajero(Pasajero pasajero){
    
        String sql = "INSERT INTO `pasajeros`(`nombre`, `apellido`, `dni`, `correo`, `telefono`) "
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getApellido());
            ps.setString(3, pasajero.getDni());
            ps.setString(4, pasajero.getCorreo());
            ps.setString(5, pasajero.getTelefono());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                pasajero.setId_pasajero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Pasajero agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla pasajeros");
        }   
    }
    public void actualizarPasajero(Pasajero pasajero){
    
        String sql = " UPDATE pasajeros SET nombre = ?, apellido = ?, dni = ?, correo = ?, telefono = ? "
                + " WHERE id_pasajero = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pasajero.getNombre());
            ps.setString(2, pasajero.getApellido());
            ps.setString(3, pasajero.getDni());
            ps.setString(4, pasajero.getCorreo());
            ps.setString(5, pasajero.getTelefono());
            ps.setInt(6, pasajero.getId_pasajero());
            int ex = ps.executeUpdate();
            if(ex == 1){
            JOptionPane.showMessageDialog(null, "Pasajero actualizado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero");
        }
    }
    public void eliminarPasajero(int id){
        String sql = "UPDATE pasajeros SET estado = 0 WHERE id_pasajero = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if(fila > 0){
            JOptionPane.showMessageDialog(null, "Pasajero dado de baja");
            
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajeros");
        }
        
        
    }
    public Pasajero buscarPasajero(int id){
        String sql = "SELECT nombre, apellido, dni, correo, telefono FROM pasajeros WHERE id_pasajero = ? AND estado = 1";
        
        Pasajero pasajero = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
            pasajero = new Pasajero();
            pasajero.setId_pasajero(id);
            pasajero.setNombre(rs.getString("nombre"));
            pasajero.setApellido(rs.getString("apellido"));
            pasajero.setDni(rs.getString("dni"));
            pasajero.setCorreo(rs.getString("correo"));
            pasajero.setTelefono(rs.getString("telefono"));
            pasajero.setEstado(true);
            } else {
            JOptionPane.showMessageDialog(null, "No existe un pasajero con ese ID.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero");
        }
        return pasajero;
        
    }
    public List<Pasajero> listarPasajeros(){
    ArrayList<Pasajero> pasajeros = new ArrayList<>();
    
    String sql = "SELECT id_pasajero, nombre, apellido, dni, correo, telefono FROM pasajeros AND estado = 1";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            Pasajero pasajero = new Pasajero();
            
            pasajero.setId_pasajero(rs.getInt("id_pasajero"));
            pasajero.setNombre(rs.getString("nombre"));
            pasajero.setApellido(rs.getString("apellido"));
            pasajero.setDni(rs.getString("dni"));
            pasajero.setCorreo(rs.getString("correo"));
            pasajero.setTelefono(rs.getString("telefono"));
            pasajero.setEstado(true);
            pasajeros.add(pasajero);
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "No se puede acceder a la tabla pasajeros");
        }
        
        return pasajeros;
       
    }
    public Pasajero buscarPasajeroPorDNI(String dni){
        String sql = "SELECT id_pasajero, nombre, apellido, dni, correo, telefono FROM pasajeros WHERE dni = ? AND estado = 1";
        
        Pasajero pasajero = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
            pasajero = new Pasajero();
            pasajero.setId_pasajero(rs.getInt("id_pasajero"));
            pasajero.setNombre(rs.getString("nombre"));
            pasajero.setApellido(rs.getString("apellido"));
            pasajero.setDni(rs.getString("dni"));
            pasajero.setCorreo(rs.getString("correo"));
            pasajero.setTelefono(rs.getString("telefono"));
            pasajero.setEstado(true);
            } else {
            JOptionPane.showMessageDialog(null, "No existe un pasajero con ese dni.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero");
        }
        return pasajero;
        
    }
    public List<Pasajero> buscarPasajeroPorNombre(String nombre){
        
        String sql = "SELECT id_pasajero, nombre, apellido, dni, correo, telefono FROM pasajeros WHERE nombre = ? AND estado = 1";
        ArrayList<Pasajero> pasajerosXNombre = new ArrayList<>();

        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
            Pasajero pasajero = new Pasajero();
            pasajero.setId_pasajero(rs.getInt("id_pasajero"));
            pasajero.setNombre(rs.getString("nombre"));
            pasajero.setApellido(rs.getString("apellido"));
            pasajero.setDni(rs.getString("dni"));
            pasajero.setCorreo(rs.getString("correo"));
            pasajero.setTelefono(rs.getString("telefono"));
            pasajero.setEstado(true);
            
            pasajerosXNombre.add(pasajero);
            } else {
            JOptionPane.showMessageDialog(null, "No existen pasajeros con ese nombre.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla pasajero");
        }
        return pasajerosXNombre;
        
    }
}
