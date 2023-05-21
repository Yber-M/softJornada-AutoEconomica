package frmJornada;

import clases.listaCliente;
import javax.swing.ImageIcon;
import clases.manejoArchivosClientes;

public class frmAdmin extends javax.swing.JFrame {

    // Instanciamos las clases cliente
    manejoArchivosClientes archi = new manejoArchivosClientes();

    listaCliente lstCliente = new listaCliente();

    //VARIABLES GLOBALES PARA REALIZAR CALCULOS
    double totalGanado = 0.0;
    double depo = 0.0;
    double efect = 0.0;
    double yape = 0.0;

    public frmAdmin() {
        initComponents();

        // Imágenes
        setIconImage(new ImageIcon(getClass().getResource(
                "/Imagenes/icono-Jornada.png")).getImage());
        rsscalelabel.RSScaleLabel.setScaleLabel(lblFondo,
                "F:\\3er Ciclo\\NetBeans\\PROYECTO FINAL\\proyecJornada\\src\\Imagenes\\arco-ayacucho.png");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniciarSesion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMostrar = new javax.swing.JTextArea();
        btnMostrar = new javax.swing.JButton();
        btnCalculos = new javax.swing.JButton();
        btnIniAdmin = new javax.swing.JButton();
        txfYape = new javax.swing.JTextField();
        txfEfectivo = new javax.swing.JTextField();
        txfBCP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txfTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Detalle Económico");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciarSesion.setBackground(new java.awt.Color(255, 0, 51));
        btnIniciarSesion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion.setText("CERRAR SESIÓN");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 660, 350, 40));

        txaMostrar.setEditable(false);
        txaMostrar.setBackground(new java.awt.Color(51, 51, 51));
        txaMostrar.setColumns(20);
        txaMostrar.setFont(new java.awt.Font("mononoki", 1, 21)); // NOI18N
        txaMostrar.setForeground(new java.awt.Color(255, 255, 0));
        txaMostrar.setRows(5);
        txaMostrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txaMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(txaMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 760, 630));

        btnMostrar.setBackground(new java.awt.Color(255, 255, 0));
        btnMostrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnMostrar.setForeground(new java.awt.Color(51, 51, 51));
        btnMostrar.setText("Mostrar Detalle Económico");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 350, 40));

        btnCalculos.setBackground(new java.awt.Color(0, 255, 204));
        btnCalculos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCalculos.setForeground(new java.awt.Color(51, 51, 51));
        btnCalculos.setText("Mostrar Cálculos");
        btnCalculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, 350, 40));

        btnIniAdmin.setBackground(new java.awt.Color(51, 255, 51));
        btnIniAdmin.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnIniAdmin.setForeground(new java.awt.Color(51, 51, 51));
        btnIniAdmin.setText("Ver Todas Las Ventanas");
        btnIniAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIniAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 620, 350, 40));

        txfYape.setEditable(false);
        txfYape.setBackground(new java.awt.Color(51, 51, 51));
        txfYape.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txfYape.setForeground(new java.awt.Color(255, 0, 255));
        txfYape.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txfYape, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 290, 240, 40));

        txfEfectivo.setEditable(false);
        txfEfectivo.setBackground(new java.awt.Color(51, 51, 51));
        txfEfectivo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txfEfectivo.setForeground(new java.awt.Color(51, 255, 0));
        txfEfectivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txfEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 190, 240, 40));

        txfBCP.setEditable(false);
        txfBCP.setBackground(new java.awt.Color(51, 51, 51));
        txfBCP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txfBCP.setForeground(new java.awt.Color(51, 255, 255));
        txfBCP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txfBCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 240, 240, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(66, 174, 146));
        jLabel1.setText("TOTAL S/");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        jLabel6.setText("Efectivo S/");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 121, 234));
        jLabel7.setText("BCP S/");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 250, 60, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(158, 79, 224));
        jLabel8.setText("YAPE S/");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 300, -1, -1));

        txfTotal.setEditable(false);
        txfTotal.setBackground(new java.awt.Color(51, 51, 51));
        txfTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txfTotal.setForeground(new java.awt.Color(53, 208, 107));
        txfTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txfTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 340, 240, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Total de pagos por :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, -1, -1));

        lblFondo.setText("rrespuesta");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Función para extraer del archivo de texto los datos de empleados
    // y ponerlo en el JTextArea
    void llenarTxArea() {
        txaMostrar.setText("");
        int cont = 1;

        // IGUALAMOS PARA PODER USAR LA CLASE manejoArchivoClientes
        lstCliente = archi.obtenerDTSclts();

        // RECORREMOS EL ARCHIVO DE TEXTO SEGÚN SU TAMAÑO
        for (int i = 0; i < lstCliente.size(); i++) {
            // ESTRUCTURAMOS E INSERTAR LOS DATOS DEL ARCHIVO DE TEXTO
            txaMostrar.append("      ------------------- CLIENTE " + cont + " -------------------\n");
            cont++;
            txaMostrar.append("                      DNI : " + lstCliente.get(i).DNI + "\n");
            txaMostrar.append("                  Nombres : " + lstCliente.get(i).name + "\n");
            txaMostrar.append("                Apellidos : " + lstCliente.get(i).apelli + "\n");
            txaMostrar.append("                      Cel : " + lstCliente.get(i).celu + "\n");
            txaMostrar.append("         Tipo de Servicio : " + lstCliente.get(i).tipServ + "\n");
            txaMostrar.append("       Precio de Servicio : S/" + lstCliente.get(i).precioNeto() + "\n");
            txaMostrar.append("                    R.U.C : " + lstCliente.get(i).ruc + "\n");
            txaMostrar.append("                 Pago por : " + lstCliente.get(i).medioPago + "\n");
            txaMostrar.append("         Hora de Registro : " + lstCliente.get(i).hora + "\n");
            txaMostrar.append("        Fecha de Registro : " + lstCliente.get(i).fecha + "\n");
            txaMostrar.append("-------------------------------------------------------------\n");

            //IDENTIFICAR LOS TIPOS DE PAGO Y ACUMULAR LO QUE SE PAGO POR EL TIPAGO
            switch (lstCliente.get(i).medioPago) {
                case "Yape" ->
                    yape += lstCliente.get(i).precioNeto();
                case "Efectivo" ->
                    efect += lstCliente.get(i).precioNeto();
                case "Transferencia Bancaria" ->
                    depo += lstCliente.get(i).precioNeto();
            }
            totalGanado += lstCliente.get(i).precioNeto();

        }
    }

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        new frmLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnIniAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniAdminActionPerformed
        new frmAccessAdm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIniAdminActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // Llamamos a la función para que ponga el registro económico
        llenarTxArea();

    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnCalculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculosActionPerformed
        txfTotal.setText("" + totalGanado);
        txfYape.setText("" + yape);
        txfEfectivo.setText("" + efect);
        txfBCP.setText("" + depo);

    }//GEN-LAST:event_btnCalculosActionPerformed

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
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculos;
    private javax.swing.JButton btnIniAdmin;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JTextArea txaMostrar;
    private javax.swing.JTextField txfBCP;
    private javax.swing.JTextField txfEfectivo;
    private javax.swing.JTextField txfTotal;
    private javax.swing.JTextField txfYape;
    // End of variables declaration//GEN-END:variables
}
