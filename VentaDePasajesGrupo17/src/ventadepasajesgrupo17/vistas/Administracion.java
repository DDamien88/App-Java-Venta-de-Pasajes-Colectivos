package ventadepasajesgrupo17.vistas;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Administracion extends javax.swing.JFrame {

    /**
     * Creates new form Administracion
     */
    public Administracion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1010, 700);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        ImageIcon icono= new ImageIcon(getClass().getResource("/VentaDePasajesGrupo17/recursos/coles.jpg"));
        Image miImagen=icono.getImage();
        escritorio = new javax.swing.JDesktopPane() {

            public void paintComponent(Graphics g){

                g.drawImage(miImagen,0,0,getWidth(), getHeight(), this);

            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jmGestionRuta = new javax.swing.JMenu();
        jmAgregarRutas = new javax.swing.JMenuItem();
        jmBuscarRutas = new javax.swing.JMenuItem();
        jmGestionHorario = new javax.swing.JMenu();
        jmAgregarHorario = new javax.swing.JMenuItem();
        jmBuscarHorario = new javax.swing.JMenuItem();
        jmGestionPasajeros = new javax.swing.JMenu();
        jmAgregarPasajeros = new javax.swing.JMenuItem();
        jmBuscarPasajeros = new javax.swing.JMenuItem();
        jmColectivos = new javax.swing.JMenu();
        jmGestionColectivos = new javax.swing.JMenuItem();
        jmGestionVentas = new javax.swing.JMenu();
        jmAgregarVenta = new javax.swing.JMenuItem();
        jmGestionVenta = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        jmGestionRuta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventadepasajesgrupo17/recursos/rutas.png"))); // NOI18N
        jmGestionRuta.setText("Rutas");
        jmGestionRuta.setMaximumSize(new java.awt.Dimension(100, 32767));

        jmAgregarRutas.setText("Añadir Rutas");
        jmGestionRuta.add(jmAgregarRutas);

        jmBuscarRutas.setText("Buscar Rutas");
        jmGestionRuta.add(jmBuscarRutas);

        jMenuBar1.add(jmGestionRuta);

        jmGestionHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventadepasajesgrupo17/recursos/horarios.png"))); // NOI18N
        jmGestionHorario.setText("Horarios");

        jmAgregarHorario.setText("Añadir Horario");
        jmAgregarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarHorarioActionPerformed(evt);
            }
        });
        jmGestionHorario.add(jmAgregarHorario);

        jmBuscarHorario.setText("Buscar Horario");
        jmGestionHorario.add(jmBuscarHorario);

        jMenuBar1.add(jmGestionHorario);

        jmGestionPasajeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventadepasajesgrupo17/recursos/pasajeros.png"))); // NOI18N
        jmGestionPasajeros.setText("Pasajeros");

        jmAgregarPasajeros.setText("Añadir Pasajeros");
        jmAgregarPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarPasajerosActionPerformed(evt);
            }
        });
        jmGestionPasajeros.add(jmAgregarPasajeros);

        jmBuscarPasajeros.setText("Buscar Pasajeros");
        jmBuscarPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmBuscarPasajerosActionPerformed(evt);
            }
        });
        jmGestionPasajeros.add(jmBuscarPasajeros);

        jMenuBar1.add(jmGestionPasajeros);

        jmColectivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventadepasajesgrupo17/recursos/colectivo.png"))); // NOI18N
        jmColectivos.setText("Colectivo");

        jmGestionColectivos.setText("Gestion Colectivo");
        jmGestionColectivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGestionColectivosActionPerformed(evt);
            }
        });
        jmColectivos.add(jmGestionColectivos);

        jMenuBar1.add(jmColectivos);

        jmGestionVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventadepasajesgrupo17/recursos/ventas.png"))); // NOI18N
        jmGestionVentas.setText("Ventas");

        jmAgregarVenta.setText("Añadir Venta ");
        jmAgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarVentaActionPerformed(evt);
            }
        });
        jmGestionVentas.add(jmAgregarVenta);

        jmGestionVenta.setText("Historial de ventas");
        jmGestionVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGestionVentaActionPerformed(evt);
            }
        });
        jmGestionVentas.add(jmGestionVenta);

        jMenuBar1.add(jmGestionVentas);

        jmSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ventadepasajesgrupo17/recursos/salir.png"))); // NOI18N
        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Seguro?");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmSalir.add(jMenuItem1);

        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAgregarPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarPasajerosActionPerformed
        /*escritorio.removeAll();
        escritorio.repaint();
        AñadirPasajero aluXMat = new AñadirPasajero();
        aluXMat.setVisible(true);
        escritorio.add(aluXMat);*/
    }//GEN-LAST:event_jmAgregarPasajerosActionPerformed

    private void jmBuscarPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmBuscarPasajerosActionPerformed
        /*escritorio.removeAll();
        escritorio.repaint();
        //BuscarPasajero aluXMat = new BuscarPasajero();
        aluXMat.setVisible(true);
        escritorio.add(aluXMat);*/
    }//GEN-LAST:event_jmBuscarPasajerosActionPerformed

    private void jmGestionColectivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGestionColectivosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        gestionColectivos gColes = new gestionColectivos();
        gColes.setVisible(true);
        escritorio.add(gColes);
    }//GEN-LAST:event_jmGestionColectivosActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSalirActionPerformed

    private void jmGestionVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGestionVentaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        historialVentaPasajes historial = new historialVentaPasajes();
        historial.setVisible(true);
        escritorio.add(historial);
    }//GEN-LAST:event_jmGestionVentaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarVentaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        RegistrarVenta venta = new RegistrarVenta();
        venta.setVisible(true);
        escritorio.add(venta);
    }//GEN-LAST:event_jmAgregarVentaActionPerformed

    private void jmAgregarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarHorarioActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        FormularioHorario anadirHora = new FormularioHorario();
        anadirHora.setVisible(true);
        escritorio.add(anadirHora);
    }//GEN-LAST:event_jmAgregarHorarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmAgregarHorario;
    private javax.swing.JMenuItem jmAgregarPasajeros;
    private javax.swing.JMenuItem jmAgregarRutas;
    private javax.swing.JMenuItem jmAgregarVenta;
    private javax.swing.JMenuItem jmBuscarHorario;
    private javax.swing.JMenuItem jmBuscarPasajeros;
    private javax.swing.JMenuItem jmBuscarRutas;
    private javax.swing.JMenu jmColectivos;
    private javax.swing.JMenuItem jmGestionColectivos;
    private javax.swing.JMenu jmGestionHorario;
    private javax.swing.JMenu jmGestionPasajeros;
    private javax.swing.JMenu jmGestionRuta;
    private javax.swing.JMenuItem jmGestionVenta;
    private javax.swing.JMenu jmGestionVentas;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}
