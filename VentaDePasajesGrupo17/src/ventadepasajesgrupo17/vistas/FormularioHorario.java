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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtCodigoRuta = new javax.swing.JTextField();
        btnBuscarHora = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cbRutas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jThorasalida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jThorallegada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBotonuevo = new javax.swing.JButton();
        jBotonguardar = new javax.swing.JButton();
        jBotoneliminar = new javax.swing.JButton();
        jrEstado = new javax.swing.JRadioButton();
        jBotonsalir = new javax.swing.JButton();
        jtCodigoHora = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("OCR-B 10 BT", 3, 24)); // NOI18N
        jLabel1.setText("Agregar Horario");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Código Ruta");

        btnBuscarHora.setText("Buscar");
        btnBuscarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHoraActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Elegir Ruta:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Hora de Salida:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Hora de Llegada:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Estado:");

        jBotonuevo.setText("Nuevo");
        jBotonuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonuevoActionPerformed(evt);
            }
        });

        jBotonguardar.setText("Guardar");
        jBotonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonguardarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBotoneliminar)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrEstado)
                                            .addComponent(jThorallegada, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtCodigoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jThorasalida, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jtCodigoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(75, 75, 75)
                                                .addComponent(btnBuscarHora)))))
                                .addGap(53, 53, 53)
                                .addComponent(jBotonsalir))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jBotonuevo)
                        .addGap(93, 93, 93)
                        .addComponent(jBotonguardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtCodigoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarHora))
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCodigoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jThorasalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jThorallegada, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jrEstado))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonuevo)
                    .addComponent(jBotonguardar)
                    .addComponent(jBotoneliminar)
                    .addComponent(jBotonsalir))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonsalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBotonsalirActionPerformed

    private void jBotoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotoneliminarActionPerformed
        // TODO add your handling code here:
        if (horaActual != null) {
            hdata.eliminarHorario(horaActual.getId_horario());
            horaActual = null;
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(this, "No hay horario seleccionado");
        }
    }//GEN-LAST:event_jBotoneliminarActionPerformed

    private void jBotonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonguardarActionPerformed
        //horaActual = null;
        try {
            Ruta rut = (Ruta) cbRutas.getSelectedItem();
            LocalTime hSalida = LocalTime.parse(jThorasalida.getText());
            LocalTime hLlegada = LocalTime.parse(jThorallegada.getText());
            Boolean estado = jrEstado.isSelected();

            if (horaActual == null) {
                horaActual = new Horario(rut, hSalida, hLlegada, estado);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jThorallegada;
    private javax.swing.JTextField jThorasalida;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtCodigoHora;
    private javax.swing.JTextField jtCodigoRuta;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jtCodigoHora.setText("");
        jtCodigoRuta.setText("");
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