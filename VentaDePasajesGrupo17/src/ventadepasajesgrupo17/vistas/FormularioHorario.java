/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ventadepasajesgrupo17.vistas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
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
    private Horario horaActual=null;

    private HorarioData hdata;
    private RutaData rdata;

    public FormularioHorario() {
        initComponents();
        jrEstado.setSelected(true);
        
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
        jBotonsalir = new javax.swing.JButton();
        cbRutas = new javax.swing.JComboBox<>();
        jBotonuevo = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtCodigoRuta = new javax.swing.JTextField();
        btnBuscarHora = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtCodigoHora = new javax.swing.JTextField();

        jLabel1.setText("Añadir Horario");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Hora de Llegada:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Hora de Salida:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Elegir Ruta:");

        jBotonguardar.setText("Guardar");
        jBotonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonguardarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Estado:");

        jBotoneliminar.setText("Eliminar");
        jBotoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotoneliminarActionPerformed(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Código:");

        btnBuscarHora.setText("Buscar");
        btnBuscarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHoraActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Código Ruta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jBotonguardar)
                        .addGap(44, 44, 44)
                        .addComponent(jBotoneliminar)
                        .addGap(50, 50, 50)
                        .addComponent(jBotonsalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(cbRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jThorallegada, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jThorasalida, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jtCodigoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBotonuevo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrEstado)
                                .addGap(361, 361, 361))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(34, 34, 34)
                                        .addComponent(jtCodigoHora)
                                        .addGap(129, 129, 129)))
                                .addComponent(btnBuscarHora)
                                .addGap(136, 136, 136)))))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(btnBuscarHora)
                    .addComponent(jtCodigoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtCodigoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jThorasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jThorallegada, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jrEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotoneliminar)
                    .addComponent(jBotonguardar)
                    .addComponent(jBotonsalir)
                    .addComponent(jBotonuevo))
                .addGap(38, 38, 38))
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

        try {
            Ruta rut = (Ruta) cbRutas.getSelectedItem();
            LocalTime hSalida = LocalTime.parse(jThorasalida.getText());
            LocalTime hLlegada = LocalTime.parse(jThorallegada.getText());
            jrEstado.isSelected();
            horaActual = null;

            if (horaActual == null) {
                horaActual = new Horario(rut, hSalida, hLlegada, true);
                hdata.guardarHorario(horaActual);
            } else {
                horaActual.setRuta(rut);
                horaActual.setHora_salida(hSalida);
                horaActual.setHora_llegada(hLlegada);
                hdata.actualizarHorario(horaActual);

            }

        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this, " Error formato hh:mm");
        }
    }//GEN-LAST:event_jBotonguardarActionPerformed

    private void jBotonuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jBotonuevoActionPerformed

    private void btnBuscarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHoraActionPerformed
//        try {
//            int codigo = Integer.parseInt(jtCodigoHora.getText());
//             String codigoR = jtCodigoRuta.getText();
//            Horario horario = (Horario) hdata.buscarHorarios(codigo);
//            if (horario != null) {          
//                jtCodigoRuta.setText(codigoR);
//                jThorasalida.setText(horario.getHora_salida().toString());
//                jThorallegada.setText(horario.getHora_llegada().toString());
//                jrEstado.setSelected(horario.isEstado());
//            } else {
//                JOptionPane.showMessageDialog(this, "No se encontró un horario con ese ID");
//            }
//        } catch (NumberFormatException ex) {
//            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido");
//        }

        try {
            int codigo = Integer.parseInt(jtCodigoHora.getText());
            horaActual=hdata.buscarHorarios(codigo);
            //Horario horario = hdata.buscarHorarios(codigo);
            if (horaActual != null) {
                //cbRutas.setSelectedItem(horario.getRuta());
                jThorasalida.setText(horaActual.getHora_salida().toString());
                jThorallegada.setText(horaActual.getHora_llegada().toString());
                jrEstado.setSelected(horaActual.isEstado());
                jtCodigoRuta.setText(String.valueOf(horaActual.getRuta().getId_ruta())); // Llenar jtCodigoRuta con el ID de la ruta
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró un horario con ese ID");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido");
        }
    }//GEN-LAST:event_btnBuscarHoraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarHora;
    private javax.swing.JComboBox<Ruta> cbRutas;
    private javax.swing.JButton jBotoneliminar;
    private javax.swing.JButton jBotonguardar;
    private javax.swing.JButton jBotonsalir;
    private javax.swing.JButton jBotonuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jThorallegada;
    private javax.swing.JTextField jThorasalida;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtCodigoHora;
    private javax.swing.JTextField jtCodigoRuta;
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
