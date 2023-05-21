// @uthor: {Yb.M};
package frmJornada;

// Clases a usar
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmAccessAdm extends javax.swing.JFrame {

    public frmAccessAdm() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource(
                "/Imagenes/icono-Jornada.png")).getImage());
        rsscalelabel.RSScaleLabel.setScaleLabel(lblFondo,
                "F:\\3er Ciclo\\NetBeans\\PROYECTO FINAL\\proyecJornada\\src\\Imagenes\\arco2.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblLogoJ,
                "F:\\3er Ciclo\\NetBeans\\PROYECTO FINAL\\proyecJornada\\src\\Imagenes\\logoDiezSeisA.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDetalleEcono = new javax.swing.JPanel();
        lblDetalleEcono = new javax.swing.JLabel();
        pnlRegistrarNuevo = new javax.swing.JPanel();
        lblRegistrarNuevo = new javax.swing.JLabel();
        pnlFrmEmplead = new javax.swing.JPanel();
        lblFrmEmplead = new javax.swing.JLabel();
        pnlCerrarSs = new javax.swing.JPanel();
        lblCerrarSs = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        lblText1 = new javax.swing.JLabel();
        lblLogoJ = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JORNADA (Acceso Como Administrador)");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDetalleEcono.setBackground(new java.awt.Color(57, 78, 142));

        lblDetalleEcono.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblDetalleEcono.setForeground(new java.awt.Color(255, 255, 255));
        lblDetalleEcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetalleEcono.setText("DETALLE ECONÓMICO");
        lblDetalleEcono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDetalleEcono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDetalleEconoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDetalleEconoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDetalleEconoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlDetalleEconoLayout = new javax.swing.GroupLayout(pnlDetalleEcono);
        pnlDetalleEcono.setLayout(pnlDetalleEconoLayout);
        pnlDetalleEconoLayout.setHorizontalGroup(
            pnlDetalleEconoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetalleEconoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDetalleEcono, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlDetalleEconoLayout.setVerticalGroup(
            pnlDetalleEconoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDetalleEconoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblDetalleEcono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnlDetalleEcono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 340, 50));

        pnlRegistrarNuevo.setBackground(new java.awt.Color(57, 78, 142));

        lblRegistrarNuevo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblRegistrarNuevo.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarNuevo.setText("REGISTRAR A UN NUEVO USUARIO");
        lblRegistrarNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarNuevoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistrarNuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistrarNuevoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlRegistrarNuevoLayout = new javax.swing.GroupLayout(pnlRegistrarNuevo);
        pnlRegistrarNuevo.setLayout(pnlRegistrarNuevoLayout);
        pnlRegistrarNuevoLayout.setHorizontalGroup(
            pnlRegistrarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarNuevoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblRegistrarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlRegistrarNuevoLayout.setVerticalGroup(
            pnlRegistrarNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarNuevoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblRegistrarNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnlRegistrarNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 340, 50));

        pnlFrmEmplead.setBackground(new java.awt.Color(57, 78, 142));

        lblFrmEmplead.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblFrmEmplead.setForeground(new java.awt.Color(255, 255, 255));
        lblFrmEmplead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrmEmplead.setText("REGISTRAR INGRESOS ECONÓMICOS");
        lblFrmEmplead.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFrmEmplead.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFrmEmpleadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFrmEmpleadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFrmEmpleadMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlFrmEmpleadLayout = new javax.swing.GroupLayout(pnlFrmEmplead);
        pnlFrmEmplead.setLayout(pnlFrmEmpleadLayout);
        pnlFrmEmpleadLayout.setHorizontalGroup(
            pnlFrmEmpleadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFrmEmpleadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblFrmEmplead, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlFrmEmpleadLayout.setVerticalGroup(
            pnlFrmEmpleadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFrmEmpleadLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblFrmEmplead, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnlFrmEmplead, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 340, 50));

        pnlCerrarSs.setBackground(new java.awt.Color(255, 0, 0));

        lblCerrarSs.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblCerrarSs.setForeground(new java.awt.Color(255, 255, 255));
        lblCerrarSs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrarSs.setText("CERRAR SESIÓN");
        lblCerrarSs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrarSs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarSsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarSsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarSsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlCerrarSsLayout = new javax.swing.GroupLayout(pnlCerrarSs);
        pnlCerrarSs.setLayout(pnlCerrarSsLayout);
        pnlCerrarSsLayout.setHorizontalGroup(
            pnlCerrarSsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCerrarSsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCerrarSs, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlCerrarSsLayout.setVerticalGroup(
            pnlCerrarSsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCerrarSsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblCerrarSs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnlCerrarSs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 340, 50));

        lblText.setFont(new java.awt.Font("Microsoft YaHei Light", 3, 18)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setText("BIENVENIDO, ahora cuenta con los permisos de ADMINISTRADOR y podrá acceder");
        getContentPane().add(lblText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 40));

        lblText1.setFont(new java.awt.Font("Microsoft YaHei Light", 3, 18)); // NOI18N
        lblText1.setForeground(new java.awt.Color(255, 255, 255));
        lblText1.setText("a los siguientes apartados del programa:");
        getContentPane().add(lblText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 430, 40));

        lblLogoJ.setText("jLabel3");
        getContentPane().add(lblLogoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 300, 290));

        lblFondo.setText("jLabel1");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // !!!! frmAdmin !!!!
    private void lblDetalleEconoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDetalleEconoMouseClicked
        //VERIFICAR EL USUARIO Y CONTRASEÑA, Y ABRIR EL FRAME CORRESPONDIENTE
        new frmAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblDetalleEconoMouseClicked

    private void lblDetalleEconoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDetalleEconoMouseEntered
        //EVT CAMBIAR LOS COLORES DEL PANEL Y DEL LABEL CUANDO EL CURSOR ENTRA
        pnlDetalleEcono.setBackground(new Color(87, 100, 172));
    }//GEN-LAST:event_lblDetalleEconoMouseEntered

    private void lblDetalleEconoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDetalleEconoMouseExited
        //EVT CAMBIAR LOS COLORES DEL PANEL Y DEL LABEL CUANDO EL CURSOR SALE
        pnlDetalleEcono.setBackground(new Color(57, 78, 142));
    }//GEN-LAST:event_lblDetalleEconoMouseExited

    // !!!! frmCliente !!!!
    private void lblFrmEmpleadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFrmEmpleadMouseClicked
        ImageIcon icono = new ImageIcon("src\\Imagenes\\user-pregunta.png");
        
        int condi = JOptionPane.showConfirmDialog(null, 
                """
                Recuerda que tendrás que volver a verficar las credenciales
                de administrador, ¿DESEA CONTINUAR?.""",
                "SELECCIONE UNA OPCIÓN", 
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE, icono);
        
        if (condi == 0) {
            new frmCliente().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_lblFrmEmpleadMouseClicked

    private void lblFrmEmpleadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFrmEmpleadMouseEntered
        pnlFrmEmplead.setBackground(new Color(87, 100, 172));
    }//GEN-LAST:event_lblFrmEmpleadMouseEntered

    private void lblFrmEmpleadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFrmEmpleadMouseExited
        pnlFrmEmplead.setBackground(new Color(57, 78, 142));
    }//GEN-LAST:event_lblFrmEmpleadMouseExited

    // !!!! frmRgtNewUser !!!!
    private void lblRegistrarNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarNuevoMouseClicked
        new frmRgtNewUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblRegistrarNuevoMouseClicked

    private void lblRegistrarNuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarNuevoMouseEntered
        pnlRegistrarNuevo.setBackground(new Color(87, 100, 172));
    }//GEN-LAST:event_lblRegistrarNuevoMouseEntered

    private void lblRegistrarNuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarNuevoMouseExited
        pnlRegistrarNuevo.setBackground(new Color(57, 78, 142));
    }//GEN-LAST:event_lblRegistrarNuevoMouseExited

    // !!!! Cerrar Sesión !!!!
    private void lblCerrarSsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSsMouseClicked
        new frmLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblCerrarSsMouseClicked

    private void lblCerrarSsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSsMouseEntered
        pnlCerrarSs.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_lblCerrarSsMouseEntered

    private void lblCerrarSsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarSsMouseExited
        pnlCerrarSs.setBackground(new Color(255, 0, 0));
    }//GEN-LAST:event_lblCerrarSsMouseExited

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmAccessAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAccessAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAccessAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAccessAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAccessAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCerrarSs;
    private javax.swing.JLabel lblDetalleEcono;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblFrmEmplead;
    private javax.swing.JLabel lblLogoJ;
    private javax.swing.JLabel lblRegistrarNuevo;
    private javax.swing.JLabel lblText;
    private javax.swing.JLabel lblText1;
    private javax.swing.JPanel pnlCerrarSs;
    private javax.swing.JPanel pnlDetalleEcono;
    private javax.swing.JPanel pnlFrmEmplead;
    private javax.swing.JPanel pnlRegistrarNuevo;
    // End of variables declaration//GEN-END:variables
}
// @uthor: {Yb.M};