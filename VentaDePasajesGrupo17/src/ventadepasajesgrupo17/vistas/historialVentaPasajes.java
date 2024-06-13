/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ventadepasajesgrupo17.vistas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ventadepasajesgrupo17.accesoADatos.ColectivoData;
import ventadepasajesgrupo17.accesoADatos.HorarioData;
import ventadepasajesgrupo17.accesoADatos.PasajeData;
import ventadepasajesgrupo17.accesoADatos.PasajeroData;
import ventadepasajesgrupo17.accesoADatos.RutaData;
import ventadepasajesgrupo17.entidades.Colectivo;
import ventadepasajesgrupo17.entidades.Horario;
import ventadepasajesgrupo17.entidades.Pasaje;
import ventadepasajesgrupo17.entidades.Pasajero;
import ventadepasajesgrupo17.entidades.Ruta;

/**
 *
 * @author Damián
 */
public class historialVentaPasajes extends javax.swing.JInternalFrame {

    private List<Colectivo> listaColes;
    private List<Horario> listaHorarios;
    private List<Pasaje> listaPasajes;
    private List<Pasajero> listaPasajeros;
    private List<Ruta> listaRutas;

    private ColectivoData coleData;
    private HorarioData hData;
    private PasajeData pasajeData;
    private PasajeroData pData;
    private RutaData rData;
    private DefaultTableModel modelo;
    private DefaultTableModel modelo2;
    private DefaultTableModel modelo3;

    private Ruta ruta;
    private Pasaje pasaje;
    private Horario horarios;

    public historialVentaPasajes() {
        initComponents();

        coleData = new ColectivoData();
        listaColes = (ArrayList<Colectivo>) coleData.listarColes();
        hData = new HorarioData();
        pasajeData = new PasajeData();
        pData = new PasajeroData();
        listaPasajeros = (ArrayList<Pasajero>) pData.listarPasajeros();
        rData = new RutaData();
        listaRutas = (ArrayList<Ruta>) rData.listarRuta();
        modelo = new DefaultTableModel();
        modelo2 = new DefaultTableModel();
        modelo3 = new DefaultTableModel();
        armarCabeceraTabla();
        armarCabeceraTabla2();
        armarCabeceraTabla3();
    }

//    private DefaultTableModel modeloTabla = new DefaultTableModel() {
//        @Override
//        public boolean isCellEditable(int row, int column) {
//            return false;
//        }
//    };

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Código pasaje");
        filaCabecera.add("Origen");
        filaCabecera.add("Destino");
        filaCabecera.add("Duración estimada");
        filaCabecera.add("Colectivo");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTablePorRuta.setModel(modelo);
    }

    private void armarCabeceraTabla2() {
        ArrayList<Object> filaCabecera2 = new ArrayList<>();
        filaCabecera2.add("Código pasaje");
        filaCabecera2.add("Nombre");
        filaCabecera2.add("Apellido");
        filaCabecera2.add("Colectivo");
        for (Object ite : filaCabecera2) {
            modelo2.addColumn(ite);
        }
        jTableBusquedaidPasajero.setModel(modelo2);
    }

    private void armarCabeceraTabla3() {
        ArrayList<Object> filaCabecera3 = new ArrayList<>();
        filaCabecera3.add("Código Pasaje");
        filaCabecera3.add("Hora de salida");
        filaCabecera3.add("Fecha");
        filaCabecera3.add("Colectivo");
        for (Object iter : filaCabecera3) {
            modelo3.addColumn(iter);
        }
        jTablebusquedaHora.setModel(modelo3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePorRuta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablebusquedaHora = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableBusquedaidPasajero = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jtcodigoRuta = new javax.swing.JTextField();
        btnBuscarRuta = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtcodigoPasajero = new javax.swing.JTextField();
        btnBuscarPasajero = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtFindHora = new javax.swing.JTextField();
        btnBuscarPorHora = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("OCR-B 10 BT", 3, 24)); // NOI18N
        jLabel2.setText("Historial venta de pasajes");

        jTablePorRuta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablePorRuta.setEnabled(false);
        jScrollPane1.setViewportView(jTablePorRuta);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setText("Por rutas");

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel3.setText("iDPasajero");

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel4.setText("Por Horarios");

        jTablebusquedaHora.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTablebusquedaHora.setEnabled(false);
        jScrollPane2.setViewportView(jTablebusquedaHora);

        jTableBusquedaidPasajero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableBusquedaidPasajero.setEnabled(false);
        jScrollPane3.setViewportView(jTableBusquedaidPasajero);

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setText("Código: ");

        btnBuscarRuta.setText("Buscar");
        btnBuscarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRutaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel7.setText("Código: ");

        btnBuscarPasajero.setText("Buscar");
        btnBuscarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPasajeroActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel8.setText("Hora del viaje:");

        btnBuscarPorHora.setText("Buscar");
        btnBuscarPorHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorHoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jtcodigoPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnBuscarPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtcodigoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnBuscarRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtFindHora, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarPorHora))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtcodigoRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarRuta)
                    .addComponent(jLabel8)
                    .addComponent(jtFindHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPorHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(7, 7, 7)
                        .addComponent(jtcodigoPasajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarPasajero)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPorHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorHoraActionPerformed
        borrarFilaTabla3();
        try {
            LocalTime codigo3 = LocalTime.parse(jtFindHora.getText());
            List<Pasaje> listaH = pasajeData.listarPasajesPorHorario(codigo3);
            for (Pasaje pas : listaH) {
                modelo3.addRow(new Object[]{pas.getId_pasaje(), pas.getHora_viaje(), pas.getFecha_viaje(), pas.getColectivo().getMatricula()});
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido");
        }
    }//GEN-LAST:event_btnBuscarPorHoraActionPerformed

    private void btnBuscarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPasajeroActionPerformed
        borrarFilaTabla2();
        try {
            Integer codigo2 = Integer.parseInt(jtcodigoPasajero.getText());
            List<Pasaje> listaP = pasajeData.listarPasajes(codigo2);
            for (Pasaje pass : listaP) {
                modelo2.addRow(new Object[]{pass.getId_pasaje(), pass.getPasajero().getNombre(), pass.getPasajero().getApellido(), pass.getColectivo().getMatricula()});
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido");
        }
    }//GEN-LAST:event_btnBuscarPasajeroActionPerformed

    private void btnBuscarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRutaActionPerformed
        borrarFilaTabla();
        //DefaultTableModel modelo = (DefaultTableModel) jTablePorRuta.getModel();
        try {
            Integer codigo = Integer.parseInt(jtcodigoRuta.getText());
            List<Pasaje> lista = pasajeData.listarPasajesPorRuta(codigo);
            for (Pasaje rut : lista) {
                modelo.addRow(new Object[]{rut.getId_pasaje(), rut.getRuta().getOrigen(), rut.getRuta().getDestino(), rut.getRuta().getDuracion_estimada(), rut.getColectivo().getMatricula()});
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido");
        }
    }//GEN-LAST:event_btnBuscarRutaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarPasajero;
    private javax.swing.JButton btnBuscarPorHora;
    private javax.swing.JButton btnBuscarRuta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableBusquedaidPasajero;
    private javax.swing.JTable jTablePorRuta;
    private javax.swing.JTable jTablebusquedaHora;
    private javax.swing.JTextField jtFindHora;
    private javax.swing.JTextField jtcodigoPasajero;
    private javax.swing.JTextField jtcodigoRuta;
    // End of variables declaration//GEN-END:variables
 private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void borrarFilaTabla2() {
        int indice = modelo2.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo2.removeRow(i);
        }
    }

    private void borrarFilaTabla3() {
        int indice = modelo3.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo3.removeRow(i);
        }
    }

}
