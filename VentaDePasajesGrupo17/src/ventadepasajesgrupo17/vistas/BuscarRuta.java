/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ventadepasajesgrupo17.vistas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import ventadepasajesgrupo17.accesoADatos.RutaData;
import ventadepasajesgrupo17.entidades.Ruta;


/**
 *
 * @author joack
 */
public class BuscarRuta extends javax.swing.JInternalFrame {
    private List<Ruta> lista;
    private List<Ruta>listarRutaOrigen;
    private List<Ruta>listarRutaDestino;       
    private RutaData rutaData;
    private Ruta rutaActual=null;
    private DefaultTableModel modelo;
   
    public BuscarRuta() {
        initComponents();
        modelo = new DefaultTableModel();
        rutaData=new RutaData();
        armarCabeceraTabla(); 

    }
    
    private boolean validarTexto(String nro){
        Pattern patron=Pattern.compile("^[a-zA-Z\\s]+$");
        Matcher m=patron.matcher(nro);
        return m.matches();
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jrRutasDisponibles = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaRuta = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtOrigen = new javax.swing.JTextPane();
        jBuscarOrigen = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jtDestino = new javax.swing.JTextPane();
        jBuscarDestino = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("OCR-B 10 BT", 3, 24)); // NOI18N
        jLabel1.setText("Ruta ");

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setText("Origen");

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setText("Destino");

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setText("Listado De rutas ");

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 12)); // NOI18N
        jLabel2.setText("Rutas Disponibles");

        jrRutasDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrRutasDisponiblesActionPerformed(evt);
            }
        });

        jtTablaRuta.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTablaRuta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtTablaRutaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jtTablaRuta);

        jtOrigen.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jtOrigenAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane4.setViewportView(jtOrigen);

        jBuscarOrigen.setText("Buscar");
        jBuscarOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarOrigenActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(jtDestino);

        jBuscarDestino.setText("Buscar");
        jBuscarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarDestinoActionPerformed(evt);
            }
        });

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
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrRutasDisponibles))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBuscarOrigen))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBuscarDestino)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBuscarOrigen))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscarDestino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jrRutasDisponibles))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBuscarOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarOrigenActionPerformed
       //buscar 
        borrarFilaTabla();
        jBuscarDestino.setEnabled(false);
        String origen= jtOrigen.getText();
        try{
            if(jtOrigen.getText().isEmpty()){
              JOptionPane.showMessageDialog(this, "Por favor, ingrese un origen.");
              jBuscarDestino.setEnabled(true);
              return;  
            }
            
            if(!validarTexto(origen)){
                JOptionPane.showMessageDialog(this, "Formato incorrecto ingrese un texto ");
                jtOrigen.setText("");
                jBuscarDestino.setEnabled(true);
                return;
            }
            buscarOrigen(); 
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error: ");
        }
        limpiarCampos();
    }//GEN-LAST:event_jBuscarOrigenActionPerformed

    private void jrRutasDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrRutasDisponiblesActionPerformed
        //tabla
        borrarFilaTabla();
        jBuscarOrigen.setEnabled(false);
        jBuscarDestino.setEnabled(false);
        cargarRutasDisponibles();
        if(!jrRutasDisponibles.isSelected()){
            borrarFilaTabla();
            jBuscarOrigen.setEnabled(true);
            jBuscarDestino.setEnabled(true);
        }
    }//GEN-LAST:event_jrRutasDisponiblesActionPerformed

    private void jtOrigenAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtOrigenAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtOrigenAncestorAdded

    private void jtTablaRutaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jtTablaRutaAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTablaRutaAncestorAdded

    private void jBuscarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarDestinoActionPerformed
        // Buscar destino
        borrarFilaTabla();
        jBuscarOrigen.setEnabled(false);
        String destino =jtDestino.getText();
        try{
            if(jtDestino.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un destino.");
                jBuscarOrigen.setEnabled(true);
                return;  
            }

            if(!validarTexto(destino)){
                JOptionPane.showMessageDialog(this, "formato incorrecto,ingrese un texto");
                jBuscarOrigen.setEnabled(true);
                jtDestino.setText("");
                return;
            }
            buscarDestino();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error: " );
        }      
        limpiarCampos();  
    }//GEN-LAST:event_jBuscarDestinoActionPerformed

    private void armarCabeceraTabla() {
    ArrayList<Object> filaCabecera = new ArrayList<>();
    filaCabecera.add("ID");
    filaCabecera.add("Origen");
    filaCabecera.add("Destino");
    filaCabecera.add("Duracion estimada");
        for (Object object : filaCabecera) {
            modelo.addColumn(object);
        }
        jtTablaRuta.setModel(modelo);
    }
    
    private void cargarRutasDisponibles(){
        List<Ruta> lista= rutaData.listarRuta();
        rutaData.listarRuta();
        for (Ruta ruta : lista) {            
            modelo.addRow(new Object[]{ruta.getId_ruta(),ruta.getOrigen(),ruta.getDestino(),ruta.getDuracion_estimada()});
        }
    }
    
    private void buscarOrigen(){
       List<Ruta> listar=rutaData.buscarOrigen(jtOrigen.getText());
        for (Ruta ruta : listar) {
           modelo.addRow(new Object[]{ruta.getId_ruta(),ruta.getOrigen(),ruta.getDestino(),ruta.getDuracion_estimada()}); 
        }
    }
    
    private void buscarDestino(){
    List<Ruta> listar2=rutaData.buscarDestino(jtDestino.getText());
        for (Ruta ruta2 : listar2) {
            modelo.addRow(new Object[]{ruta2.getId_ruta(),ruta2.getOrigen(),ruta2.getDestino(),ruta2.getDuracion_estimada()});
        }
    }
    
    private void limpiarCampos(){
     jBuscarOrigen.setEnabled(true);
     jBuscarDestino.setEnabled(true);  
     jtOrigen.setText("");
     jtDestino.setText("");
    }
    
    
    private void borrarFilaTabla(){
    int indice = modelo.getRowCount()-1;
        for (int i = indice; i >=0; i--) {
            modelo.removeRow(i);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBuscarDestino;
    private javax.swing.JButton jBuscarOrigen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton jrRutasDisponibles;
    private javax.swing.JTextPane jtDestino;
    private javax.swing.JTextPane jtOrigen;
    private javax.swing.JTable jtTablaRuta;
    // End of variables declaration//GEN-END:variables

    
}
