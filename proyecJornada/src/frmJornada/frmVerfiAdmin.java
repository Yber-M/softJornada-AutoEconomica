/**
 *
 * @author Yb-M
 */
package frmJornada;

import java.awt.Color;
import javax.swing.ImageIcon;
import clases.verificadorCredenciales;

public class frmVerfiAdmin extends javax.swing.JFrame {

    // Instanciamos la clase para verificar el usuario y contraseña
    verificadorCredenciales veriCred = new verificadorCredenciales();

    public frmVerfiAdmin() {
        initComponents();
        lblOjo1.setVisible(false);
        // Poner el logo de la empresa en la ventana del frame
        setIconImage(new ImageIcon(getClass().getResource(
                "/Imagenes/icono-Jornada.png")).getImage());

        // Colocar la imágen en el label
        rsscalelabel.RSScaleLabel.setScaleLabel(lblLogoJornada, "src\\Imagenes\\portada-infoTrue.png");

        rsscalelabel.RSScaleLabel.setScaleLabel(lblOjo1, "src\\Imagenes\\ojo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblDormir, "src\\Imagenes\\dormir.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txfUsuario = new javax.swing.JTextField();
        lblPass = new javax.swing.JLabel();
        pswContraseña = new javax.swing.JPasswordField();
        lblParr1 = new javax.swing.JLabel();
        lblLogoJornada = new javax.swing.JLabel();
        pnlBackSession = new javax.swing.JPanel();
        lblBackSesssion = new javax.swing.JLabel();
        pnlVerificar = new javax.swing.JPanel();
        lblVerificar = new javax.swing.JLabel();
        lblDormir = new javax.swing.JLabel();
        lblOjo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JORNADA (Verificador de Credenciales)");
        setFocusable(false);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setBackground(new java.awt.Color(57, 78, 142));
        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(57, 78, 142));
        lblTitle.setText("Verificación de Administrador");
        jPanel1.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, -1));

        lblUser.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(57, 78, 142));
        lblUser.setText("USUARIO :");
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        txfUsuario.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        txfUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfUsuario.setText("Ingrese su nombre de usuario");
        txfUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, new java.awt.Color(57, 78, 142), new java.awt.Color(57, 78, 142)));
        txfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfUsuarioMousePressed(evt);
            }
        });
        jPanel1.add(txfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 300, 50));

        lblPass.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPass.setForeground(new java.awt.Color(57, 78, 142));
        lblPass.setText("CONTRASEÑA :");
        jPanel1.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        pswContraseña.setFont(new java.awt.Font("Fira Code Light", 0, 18)); // NOI18N
        pswContraseña.setForeground(new java.awt.Color(204, 204, 204));
        pswContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pswContraseña.setText("************");
        pswContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, new java.awt.Color(57, 78, 142), new java.awt.Color(57, 78, 142)));
        pswContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pswContraseñaMousePressed(evt);
            }
        });
        jPanel1.add(pswContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 300, 50));

        lblParr1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        lblParr1.setForeground(new java.awt.Color(51, 51, 51));
        lblParr1.setText("Ingrese las credenciales de ADMINISTARDOR  para obtener acceso completo a las ventanas.");
        jPanel1.add(lblParr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblLogoJornada.setText("jLabel1");
        jPanel1.add(lblLogoJornada, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 900, 320));

        pnlBackSession.setBackground(new java.awt.Color(57, 78, 142));

        lblBackSesssion.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblBackSesssion.setForeground(new java.awt.Color(255, 255, 255));
        lblBackSesssion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBackSesssion.setText("Volver al Inicio de Sesión");
        lblBackSesssion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBackSesssion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackSesssionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBackSesssionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBackSesssionMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBackSessionLayout = new javax.swing.GroupLayout(pnlBackSession);
        pnlBackSession.setLayout(pnlBackSessionLayout);
        pnlBackSessionLayout.setHorizontalGroup(
            pnlBackSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackSessionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBackSesssion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBackSessionLayout.setVerticalGroup(
            pnlBackSessionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackSessionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblBackSesssion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnlBackSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 210, 50));

        pnlVerificar.setBackground(new java.awt.Color(57, 78, 142));

        lblVerificar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblVerificar.setForeground(new java.awt.Color(255, 255, 255));
        lblVerificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVerificar.setText("VERIFICAR");
        lblVerificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVerificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVerificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVerificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVerificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlVerificarLayout = new javax.swing.GroupLayout(pnlVerificar);
        pnlVerificar.setLayout(pnlVerificarLayout);
        pnlVerificarLayout.setHorizontalGroup(
            pnlVerificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVerificarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlVerificarLayout.setVerticalGroup(
            pnlVerificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVerificarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnlVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 210, 50));

        lblDormir.setText("jLabel2");
        lblDormir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDormir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDormirMouseClicked(evt);
            }
        });
        jPanel1.add(lblDormir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 30, 30));

        lblOjo1.setText("jLabel2");
        lblOjo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOjo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOjo1MouseClicked(evt);
            }
        });
        jPanel1.add(lblOjo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txfUsuarioMousePressed
        //EVT
        //CONDICIONALES PARA VACIAR LOS TextFields si es que se entra en el
        //E IDENTIFICA SI SE A ESCRITO ALGO EN EL TEXT FIEL
        if (txfUsuario.getText().equals("Ingrese su nombre de usuario")) {
            txfUsuario.setText("");
            txfUsuario.setForeground(Color.black);
        }

        if (String.valueOf(pswContraseña.getPassword()).isEmpty()) {
            pswContraseña.setText("************");
            pswContraseña.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_txfUsuarioMousePressed

    private void pswContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pswContraseñaMousePressed
        //EVT
        //CONDICIONALES PARA VACIAR LOS TextFields si es que se entra en el
        //E IDENTIFICA SI SE A ESCRITO ALGO EN EL TEXT FIEL
        if (String.valueOf(pswContraseña.getPassword()).equals("************")) {
            pswContraseña.setText("");
            pswContraseña.setForeground(Color.black);
        }
        if (txfUsuario.getText().isEmpty()) {
            txfUsuario.setText("Ingrese su nombre de usuario");
            txfUsuario.setForeground(new Color(204, 204, 204));
        }
    }//GEN-LAST:event_pswContraseñaMousePressed

    private void lblBackSesssionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackSesssionMouseClicked
        new frmLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_lblBackSesssionMouseClicked

    private void lblBackSesssionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackSesssionMouseEntered
        //EVT CAMBIAR LOS COLORES DEL PANEL Y DEL LABEL CUANDO EL CURSOR ENTRA
        pnlBackSession.setBackground(new Color(87, 100, 172));
    }//GEN-LAST:event_lblBackSesssionMouseEntered

    private void lblBackSesssionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackSesssionMouseExited
        //EVT CAMBIAR LOS COLORES DEL PANEL Y DEL LABEL CUANDO EL CURSOR SALE
        pnlBackSession.setBackground(new Color(57, 78, 142));
    }//GEN-LAST:event_lblBackSesssionMouseExited

    private void lblVerificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerificarMouseClicked

        //VERIFICAR EL USUARIO Y CONTRASEÑA, Y ABRIR EL FRAME CORRESPONDIENTE
        String user = txfUsuario.getText();
        String contra = new String(pswContraseña.getPassword());

        //Método en la cual se verificará las credenciales
        veriCred.cpbPasswordVeriFrmAdmin(user, contra);

        dispose();
    }//GEN-LAST:event_lblVerificarMouseClicked

    private void lblVerificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerificarMouseEntered
        pnlVerificar.setBackground(new Color(87, 100, 172));
    }//GEN-LAST:event_lblVerificarMouseEntered

    private void lblVerificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerificarMouseExited
        pnlVerificar.setBackground(new Color(57, 78, 142));
    }//GEN-LAST:event_lblVerificarMouseExited

    private void lblDormirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDormirMouseClicked
        lblDormir.setVisible(false);
        lblOjo1.setVisible(true);
        pswContraseña.setEchoChar((char) 0);

    }//GEN-LAST:event_lblDormirMouseClicked

    private void lblOjo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOjo1MouseClicked
        lblOjo1.setVisible(false);
        lblDormir.setVisible(true);
        pswContraseña.setEchoChar('*');


    }//GEN-LAST:event_lblOjo1MouseClicked

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
            java.util.logging.Logger.getLogger(frmVerfiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVerfiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVerfiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVerfiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVerfiAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBackSesssion;
    private javax.swing.JLabel lblDormir;
    private javax.swing.JLabel lblLogoJornada;
    private javax.swing.JLabel lblOjo1;
    private javax.swing.JLabel lblParr1;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblVerificar;
    private javax.swing.JPanel pnlBackSession;
    private javax.swing.JPanel pnlVerificar;
    private javax.swing.JPasswordField pswContraseña;
    private javax.swing.JTextField txfUsuario;
    // End of variables declaration//GEN-END:variables
}
