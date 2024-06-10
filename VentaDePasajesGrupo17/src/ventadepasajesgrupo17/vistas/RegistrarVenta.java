package ventadepasajesgrupo17.vistas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbColes = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jtAsiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbRutas = new javax.swing.JComboBox<>();
        cbPasajeros = new javax.swing.JComboBox<>();
        cbHorarios = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVentaPasaje = new javax.swing.JTable();
        btnAnular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Hora:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Precio:");

        btnRegistrar.setBackground(new java.awt.Color(102, 153, 0));
        btnRegistrar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Colectivo");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Asiento:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Ruta:");

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

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Venta de pasajes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cbPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(cbRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(cbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbColes, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(374, 374, 374)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAnular)
                        .addGap(330, 330, 330)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPasajeros)
                    .addComponent(cbRutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtAsiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbColes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnular)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(38, 38, 38))))
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
        int filaSeleccionada = jTableVentaPasaje.getSelectedRow();
        if (filaSeleccionada != -1) {

            int codigoP = (Integer) modelo.getValueAt(filaSeleccionada, 1);
            int codigoC = (Integer) modelo.getValueAt(filaSeleccionada, 2);
            int codigoR = (Integer) modelo.getValueAt(filaSeleccionada, 3);
            pasajeData.anularVenta(codigoP, codigoC, codigoR);
            //modelo.removeRow(filaSeleccionada);

        }
    }//GEN-LAST:event_btnAnularActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<Colectivo> cbColes;
    private javax.swing.JComboBox<Horario> cbHorarios;
    private javax.swing.JComboBox<Pasajero> cbPasajeros;
    private javax.swing.JComboBox<Ruta> cbRutas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
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

    public class RegistroAsientosOcupados {

        private static Set<Integer> asientosOcupados = new HashSet<>();

        public static void actualizarAsientosOcupados(int asiento) {
            asientosOcupados.add(asiento);
        }

        public static void liberarAsiento(int asiento) {
            asientosOcupados.remove(asiento);
        }

        public static boolean verificarAsientoDisponible(int asiento) {
            return !asientosOcupados.contains(asiento);
        }
    }
}
