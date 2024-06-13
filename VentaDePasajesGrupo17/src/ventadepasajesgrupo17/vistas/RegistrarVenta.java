package ventadepasajesgrupo17.vistas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
public class RegistrarVenta extends javax.swing.JInternalFrame {

    private Set<Integer> asientosSeleccionados = new HashSet<>();
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

    private Ruta ruta;
    private Pasaje pasaje;
    private Horario horarios;
    private Pasajero pasajero;

    public RegistrarVenta() {
        initComponents();

        coleData = new ColectivoData();
        listaColes = (ArrayList<Colectivo>) coleData.listarColes();
        hData = new HorarioData();
        pasajeData = new PasajeData();
        pData = new PasajeroData();
        listaPasajeros = (ArrayList<Pasajero>) pData.listarPasajeros();
        rData = new RutaData();
        listaRutas = (ArrayList<Ruta>) rData.listarRuta();
        //listaHorarios = (ArrayList<Horario>) hData.
        modelo = new DefaultTableModel();
        cargarRutas();
        cargarColes();
        cargarPasajeros();
        cargarHorarios();
        armarCabeceraTabla();
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Pasaje");
        filaCabecera.add("Pasajero");
        filaCabecera.add("Colectivo");
        filaCabecera.add("Ruta");
        filaCabecera.add("Fecha");
        filaCabecera.add("Hora");
        filaCabecera.add("Asiento");
        filaCabecera.add("Precio");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTableVentaPasaje.setModel(modelo);
    }

    private void cargarRutas() {
        for (Ruta item : listaRutas) {
            cbRutas.addItem(item);
        }
    }

    private void cargarColes() {
        for (Colectivo it : listaColes) {
            cbColes.addItem(it);
        }
    }

    private void cargarPasajeros() {
        //cbPasajeros.removeAllItems();
        for (Pasajero iter : listaPasajeros) {
            cbPasajeros.addItem(iter);
        }
    }

    private void cargarHorarios() {
        //cbHorarios.removeAllItems();  // Limpiamos el JComboBox de horarios
        Ruta rutaSeleccionada = (Ruta) cbRutas.getSelectedItem();
        if (rutaSeleccionada != null) {
            listaHorarios = (ArrayList<Horario>) hData.buscarHorariosPorRuta(rutaSeleccionada.getId_ruta());
            for (Horario horario : listaHorarios) {
                cbHorarios.addItem(horario);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbRutas = new javax.swing.JComboBox<>();
        cbHorarios = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jtAsiento = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbColes = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        cbPasajeros = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVentaPasaje = new javax.swing.JTable();
        btnAnular = new javax.swing.JButton();

        setClosable(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("OCR-B 10 BT", 3, 24)); // NOI18N
        jLabel1.setText("Venta de pasajes");

        cbRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRutasActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setText("Asiento:");

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setText("Precio:");

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setText("Colectivo");

        cbColes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbColesActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(51, 153, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jTableVentaPasaje.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableVentaPasaje);

        btnAnular.setBackground(new java.awt.Color(204, 0, 0));
        btnAnular.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnAnular.setText("Anular");
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(cbPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(cbRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(cbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbColes, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar))
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(582, 582, 582)
                        .addComponent(btnAnular)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(311, 311, 311))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbColes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnRegistrar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(btnAnular)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(139, 139, 139))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        try {
            Integer asiento = Integer.parseInt(jtAsiento.getText());
            Double precio = Double.parseDouble(jtPrecio.getText());

            Ruta rutaSeleccionada = (Ruta) cbRutas.getSelectedItem();
            Colectivo colec = (Colectivo) cbColes.getSelectedItem();
            Pasajero pasajero = (Pasajero) cbPasajeros.getSelectedItem();
            Horario horarioSeleccionado = (Horario) cbHorarios.getSelectedItem();

            if (asiento == null || precio == null) {
                JOptionPane.showMessageDialog(this, "Los campos precio o asiento no pueden estar vacíos");
                return;
            }

            if (rutaSeleccionada == null || colec == null || pasajero == null || horarioSeleccionado == null) {
                JOptionPane.showMessageDialog(this, "Debe seleccionar ruta, colectivo, pasajero y horario");
                return;
            }

            // Verificar si el asiento ya ha sido seleccionado
            if (asientosSeleccionados.contains(asiento)) {
                JOptionPane.showMessageDialog(this, "Ese asiento ya fue seleccionado");
                return;
            }

            // Verificar si el colectivo está lleno
            if (asientosSeleccionados.size() >= colec.getCapacidad()) {
                JOptionPane.showMessageDialog(this, "Colectivo lleno!");
                return;
            }

            // Registrar la venta del pasaje
            pasaje = new Pasaje(pasajero, colec, rutaSeleccionada, LocalDate.now(), horarioSeleccionado.getHora_salida(), asiento, precio);
            pasajeData.registrarVenta(pasaje);

            // Agregar el asiento al conjunto de asientos seleccionados
            asientosSeleccionados.add(asiento);

            // Agregar la venta al modelo de la tabla
            modelo.addRow(new Object[]{pasaje.getId_pasaje(), pasaje.getPasajero().getId_pasajero(), pasaje.getColectivo().getId_colectivo(), pasaje.getRuta().getId_ruta(), pasaje.getFecha_viaje(), pasaje.getHora_viaje(), pasaje.getAsiento(), pasaje.getPrecio()});

            // Limpiar los campos de entrada
            jtAsiento.setText("");
            jtPrecio.setText("");

            JOptionPane.showMessageDialog(this, "Venta registrada con éxito");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido");
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        int filaSelec = jTableVentaPasaje.getSelectedRow();
        if (filaSelec == -1) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una venta para anular");
            return;
        }
        int idPasaje = (Integer) jTableVentaPasaje.getValueAt(filaSelec, 0);
        modelo.removeRow(filaSelec);
        pasajeData.anularVenta(idPasaje);
    }//GEN-LAST:event_btnAnularActionPerformed

    private void cbColesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbColesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbColesActionPerformed

    private void cbRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRutasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRutasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<Colectivo> cbColes;
    private javax.swing.JComboBox<Horario> cbHorarios;
    private javax.swing.JComboBox<Pasajero> cbPasajeros;
    private javax.swing.JComboBox<Ruta> cbRutas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVentaPasaje;
    private javax.swing.JTextField jtAsiento;
    private javax.swing.JTextField jtPrecio;
    // End of variables declaration//GEN-END:variables

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);

        }
    }

//    public class RegistroAsientosOcupados {
//
//        private static Set<Integer> asientosOcupados = new HashSet<>();
//
//        public static void actualizarAsientosOcupados(int asiento) {
//            asientosOcupados.add(asiento);
//        }
//
//        public static void liberarAsiento(int asiento) {
//            asientosOcupados.remove(asiento);
//        }
//
//        public static boolean verificarAsientoDisponible(int asiento) {
//            return !asientosOcupados.contains(asiento);
//        }
//    }
}
