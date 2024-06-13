/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ventadepasajesgrupo17.vistas;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ventadepasajesgrupo17.accesoADatos.RutaData;
import ventadepasajesgrupo17.entidades.Ruta;



public class AgregarRuta extends javax.swing.JInternalFrame {
    private RutaData rutData = new RutaData();
    private Ruta rutaActual = null;
   
    public AgregarRuta() {
        initComponents();  
    }
    
    private boolean validarTexto(String nro){
        Pattern patron=Pattern.compile("^[a-zA-Z\\s]+$");
        Matcher m=patron.matcher(nro);
        return m.matches();
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jtDestino = new javax.swing.JTextField();
        jtDuracion = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioEstado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jtOrigen = new javax.swing.JTextField();
        jID = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        jBID = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jtDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDestinoActionPerformed(evt);
            }
        });

        jtDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDuracionActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(153, 255, 153));
        jbGuardar.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(102, 102, 102));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setText("Destino");

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setText("Duracion Estimada");

        jBNuevo.setBackground(new java.awt.Color(153, 153, 153));
        jBNuevo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBNuevo.setForeground(new java.awt.Color(102, 102, 102));
        jBNuevo.setText("nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setBackground(new java.awt.Color(153, 153, 153));
        jBEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBEliminar.setForeground(new java.awt.Color(102, 102, 102));
        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setText("Estado");

        jRadioEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioEstadoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setText("Origen");

        jtOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtOrigenActionPerformed(evt);
            }
        });

        jID.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jID.setText("ID");

        jBID.setText("Buscar");
        jBID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("OCR-B 10 BT", 3, 24)); // NOI18N
        jLabel1.setText("Rutas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBEliminar)
                                .addGap(51, 51, 51)
                                .addComponent(jBNuevo)
                                .addGap(48, 48, 48)
                                .addComponent(jbGuardar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(31, 31, 31)
                                .addComponent(jRadioEstado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jID, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(6, 6, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(9, 9, 9))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                            .addComponent(jBID)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 85, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBID)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jID)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioEstado, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminar)
                    .addComponent(jBNuevo)
                    .addComponent(jbGuardar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDestinoActionPerformed
        // STRING DESTINO
    }//GEN-LAST:event_jtDestinoActionPerformed

    private void jtDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDuracionActionPerformed
        
    }//GEN-LAST:event_jtDuracionActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        try{
            
        String origen=jtOrigen.getText();
        String destino= jtDestino.getText();
        LocalTime duracion ;
        
        if(origen.isEmpty() || destino.isEmpty()){
            JOptionPane.showMessageDialog(this, "No puede ver campos vacios");
            return;
        }
        
        if(!validarTexto(origen)){
            JOptionPane.showMessageDialog(this, "Ingrese origen nuevamente, formato incorrecto");
            jtOrigen.setText("");
            return;
        }
        
        if(!validarTexto(destino)){
            JOptionPane.showMessageDialog(this, "Ingrese destino nuevamente,formato incorrecto");
            jtDestino.setText("");
            return;
        }

        duracion = LocalTime.parse(jtDuracion.getText());

        Boolean estado=jRadioEstado.isSelected();
        
        if(rutaActual==null){
            rutaActual=new Ruta(origen, destino, duracion, estado); //edito aca
            rutData.guardarRuta(rutaActual);
        }else{
            
            rutaActual.setOrigen(origen);
            rutaActual.setDestino(destino);
            rutaActual.setDuracion_estimada(duracion);
            rutData.actualizarRuta(rutaActual);
       
        }
        }catch(DateTimeParseException e){
            JOptionPane.showMessageDialog(this,"Error formato hh:mm");
        }
        
    }//GEN-LAST:event_jbGuardarActionPerformed
    
    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
       limpiarCampos();
       rutaActual=null;
       
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed

        if(rutaActual!=null){
            rutData.eliminarRuta(rutaActual.getId_ruta());
            rutaActual=null;
            limpiarCampos();
        } else {            
            JOptionPane.showMessageDialog(this, "no hay ruta seleccionada");
            
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jRadioEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioEstadoActionPerformed

    private void jtOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtOrigenActionPerformed

    private void jBIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIDActionPerformed
        // Buscar
        
        try{
            
            int id= Integer.parseInt(jTID.getText());
            rutaActual=rutData.buscarRuta(id);
            if(rutaActual!=null){
                jtOrigen.setText(rutaActual.getOrigen());
                jtDestino.setText(rutaActual.getDestino());
                jtDuracion.setText(String.valueOf(rutaActual.getDuracion_estimada()));
            }else {
                JOptionPane.showMessageDialog(this, "No se encontró una ruta con ese ID");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido");
        }
    }//GEN-LAST:event_jBIDActionPerformed
    
    private boolean validarDuracion(String duracion){
        try{
            return true;
        }catch(DateTimeParseException e){
        return false;
    } 
    }
    
    private void limpiarCampos(){
     jtDestino.setText("");
     jtDuracion.setText("");
     jtOrigen.setText("");
     jRadioEstado.setSelected(true);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBID;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioEstado;
    private javax.swing.JTextField jTID;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JTextField jtDestino;
    private javax.swing.JTextField jtDuracion;
    private javax.swing.JTextField jtOrigen;
    // End of variables declaration//GEN-END:variables
}
