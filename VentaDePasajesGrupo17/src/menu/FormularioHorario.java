/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package menu;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ventadepasajesgrupo17.accesoADatos.HorarioData;
import ventadepasajesgrupo17.accesoADatos.RutaData;
import ventadepasajesgrupo17.entidades.Horario;
import ventadepasajesgrupo17.entidades.Ruta;

/**
 *
 * @author Castro Maria Victoria
 */
public class FormularioHorario extends javax.swing.JInternalFrame {

    private Ruta ruta;
    private Horario horario;
    private List<Ruta> listaR;

    private HorarioData hdata;
    private RutaData rdata;

    public FormularioHorario() {
        initComponents();
        ruta = new Ruta();
        horario = new Horario();
        hdata = new HorarioData();
        rdata = new RutaData();
        listaR = (ArrayList<Ruta>) rdata.listarRuta();
        cargarRutas();

    }

    private void cargarRutas() {
        for (Ruta item : listaR) {
            cbRutas.addItem(item);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jThorasalida = new javax.swing.JTextField();
        jThorallegada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBotonguardar = new javax.swing.JButton();
        jrEstado = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jBotoneliminar = new javax.swing.JButton();
        jBotonactualizar = new javax.swing.JButton();
        jBotonsalir = new javax.swing.JButton();
        cbRutas = new javax.swing.JComboBox<>();
        jBotonuevo = new javax.swing.JButton();

        jLabel1.setText("Añadir Horario");

        jLabel2.setText("Hora de Llegada:");

        jLabel3.setText("Hora de Salida:");

        jLabel4.setText("Elegir Ruta:");

        jBotonguardar.setText("Guardar");
        jBotonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonguardarActionPerformed(evt);
            }
        });

        jLabel5.setText("Estado:");

        jBotoneliminar.setText("Eliminar");
        jBotoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotoneliminarActionPerformed(evt);
            }
        });

        jBotonactualizar.setText("Actualizar");

        jBotonsalir.setText("Salir");
        jBotonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonsalirActionPerformed(evt);
            }
        });

        jBotonuevo.setText("Nuevo");
        jBotonuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jThorasalida)
                                .addComponent(jrEstado)
                                .addComponent(jThorallegada, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBotonuevo)
                .addGap(18, 18, 18)
                .addComponent(jBotonguardar)
                .addGap(18, 18, 18)
                .addComponent(jBotoneliminar)
                .addGap(18, 18, 18)
                .addComponent(jBotonactualizar)
                .addGap(18, 18, 18)
                .addComponent(jBotonsalir)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(cbRutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jThorasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jThorallegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jrEstado))
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBotonactualizar)
                            .addComponent(jBotoneliminar)
                            .addComponent(jBotonguardar)
                            .addComponent(jBotonsalir)
                            .addComponent(jBotonuevo))
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBotonsalirActionPerformed

    private void jBotoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotoneliminarActionPerformed
        // TODO add your handling code here:
        if (horario != null) {
            hdata.eliminarHorario(horario.getId_horario());
            horario = null;
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No hay horario seleccionado");
        }

    }//GEN-LAST:event_jBotoneliminarActionPerformed

    private void jBotonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonguardarActionPerformed
        // TODO add your handling code here:

//        try {
//            Integer rutaa = Integer.parseInt(jTruta.getText());
//            LocalTime hsalida = jThorasalida.getText();
//            Lo
//            
//        } catch (Exception e) {
//        }
    }//GEN-LAST:event_jBotonguardarActionPerformed

    private void jBotonuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jBotonuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Ruta> cbRutas;
    private javax.swing.JButton jBotonactualizar;
    private javax.swing.JButton jBotoneliminar;
    private javax.swing.JButton jBotonguardar;
    private javax.swing.JButton jBotonsalir;
    private javax.swing.JButton jBotonuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jThorallegada;
    private javax.swing.JTextField jThorasalida;
    private javax.swing.JRadioButton jrEstado;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        cbRutas.setSelectedIndex(-1);
        jThorasalida.setText("");
        jThorallegada.setText("");
        jrEstado.setSelected(false);

    }

    private boolean validarHora(String nro) {
        Pattern patron = Pattern.compile("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
        Matcher m = patron.matcher(nro);
        return m.matches();
    }

}
