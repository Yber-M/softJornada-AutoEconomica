package frmJornada;

import clases.verificadorCredenciales;
import java.awt.Color;
import javax.swing.ImageIcon;
import clases.hora;

public class frmLogin extends javax.swing.JFrame implements Runnable {

    // Variable para el hilo de ejecución
    Thread hilo;

    // Instanciamos las clase verficadorCredenciales
    verificadorCredenciales veriCred = new verificadorCredenciales();

    hora hr = new hora();

    public frmLogin() {
        initComponents();
        lblAcceder.requestFocus();
        
        // Instanciamos el hilo de ejecución para que la hora
        // se vaya cambiando según corresponda.
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
        
        lblOjo1.setVisible(false);

        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono-Jornada.png")).getImage());
        rsscalelabel.RSScaleLabel.setScaleLabel(lblFondo, "src\\Imagenes\\fondoLogin.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblLogoLargo, "src\\Imagenes\\logo-jornadaCompleto.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblUser, "src\\Imagenes\\user-circle-regular-36.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblLine, "src\\Imagenes\\detener.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblLine1, "src\\Imagenes\\detener.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblOjo1, "src\\Imagenes\\ojo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblDormir, "src\\Imagenes\\dormir.png");
    }

    // Función que se va estar ejecutando y pueda actualizarce la hora según corresponda
    public void run() {
        Thread current = Thread.currentThread();

        while (current == hilo) {

            hr.hora();
            // Poner la fecha y la hora en el label correspondiente
            lblFecha.setText(hora.fecha());
            lblHora.setText(hr.hora());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblAcceder = new javax.swing.JLabel();
        lblUsu = new javax.swing.JLabel();
        lblLogoLargo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        pswContraseña = new javax.swing.JPasswordField();
        pnlSesion = new javax.swing.JPanel();
        lblInSs = new javax.swing.JLabel();
        pnlAdmin = new javax.swing.JPanel();
        lblAdmin = new javax.swing.JLabel();
        lblContra = new javax.swing.JLabel();
        txfUsuario = new javax.swing.JTextField();
        lblLine = new javax.swing.JLabel();
        lblLine1 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblTextHora = new javax.swing.JLabel();
        lblDormir = new javax.swing.JLabel();
        lblOjo1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jornada Diario Judicial (Automatización Económica de la Empresa)");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAcceder.setBackground(new java.awt.Color(51, 51, 51));
        lblAcceder.setFont(new java.awt.Font("Ubuntu Condensed", 1, 30)); // NOI18N
        lblAcceder.setForeground(new java.awt.Color(51, 51, 51));
        lblAcceder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcceder.setText("Iniciar Sesión");
        jPanel1.add(lblAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 300, 50));

        lblUsu.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        lblUsu.setForeground(new java.awt.Color(51, 51, 51));
        lblUsu.setText("USUARIO");
        jPanel1.add(lblUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        lblLogoLargo.setText("jLabel1");
        jPanel1.add(lblLogoLargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 420, 130));

        lblFecha.setFont(new java.awt.Font("Baloo 2 SemiBold", 0, 21)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("DD/MM/YYYY");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 590, 390, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUser.setBackground(new java.awt.Color(51, 153, 255));
        lblUser.setForeground(new java.awt.Color(51, 153, 255));
        lblUser.setText("jLabel1");
        jPanel2.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 190, 180));

        pswContraseña.setFont(new java.awt.Font("Fira Code Light", 0, 18)); // NOI18N
        pswContraseña.setForeground(new java.awt.Color(204, 204, 204));
        pswContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pswContraseña.setText("************");
        pswContraseña.setBorder(null);
        pswContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pswContraseñaMousePressed(evt);
            }
        });
        jPanel2.add(pswContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 300, 40));

        pnlSesion.setBackground(new java.awt.Color(57, 78, 142));

        lblInSs.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblInSs.setForeground(new java.awt.Color(255, 255, 255));
        lblInSs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInSs.setText("INICIAR SESIÓN");
        lblInSs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInSs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInSsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInSsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInSsMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlSesionLayout = new javax.swing.GroupLayout(pnlSesion);
        pnlSesion.setLayout(pnlSesionLayout);
        pnlSesionLayout.setHorizontalGroup(
            pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblInSs, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlSesionLayout.setVerticalGroup(
            pnlSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblInSs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(pnlSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, -1, -1));

        pnlAdmin.setBackground(new java.awt.Color(57, 78, 142));

        lblAdmin.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        lblAdmin.setForeground(new java.awt.Color(255, 255, 255));
        lblAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdmin.setText("ADMINISTRADOR");
        lblAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdminMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlAdminLayout = new javax.swing.GroupLayout(pnlAdmin);
        pnlAdmin.setLayout(pnlAdminLayout);
        pnlAdminLayout.setHorizontalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlAdminLayout.setVerticalGroup(
            pnlAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdminLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(pnlAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, -1, -1));

        lblContra.setFont(new java.awt.Font("Roboto Thin", 0, 18)); // NOI18N
        lblContra.setForeground(new java.awt.Color(51, 51, 51));
        lblContra.setText("CONTRASEÑA");
        jPanel2.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        txfUsuario.setFont(new java.awt.Font("Fira Code Light", 0, 14)); // NOI18N
        txfUsuario.setForeground(new java.awt.Color(204, 204, 204));
        txfUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfUsuario.setText("Ingrese su nombre de usuario");
        txfUsuario.setBorder(null);
        txfUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txfUsuarioMousePressed(evt);
            }
        });
        jPanel2.add(txfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 300, 40));

        lblLine.setText("jLabel1");
        jPanel2.add(lblLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 300, 20));

        lblLine1.setText("jLabel1");
        jPanel2.add(lblLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 300, 20));

        lblHora.setBackground(new java.awt.Color(51, 51, 51));
        lblHora.setFont(new java.awt.Font("Baloo 2 SemiBold", 0, 18)); // NOI18N
        lblHora.setForeground(new java.awt.Color(204, 204, 204));
        lblHora.setText("00:00:00");
        jPanel2.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 90, 50));

        lblTextHora.setFont(new java.awt.Font("Baloo 2 SemiBold", 0, 18)); // NOI18N
        lblTextHora.setForeground(new java.awt.Color(204, 204, 204));
        lblTextHora.setText("Hora:");
        jPanel2.add(lblTextHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 50));

        lblDormir.setText("jLabel2");
        lblDormir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDormir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDormirMouseClicked(evt);
            }
        });
        jPanel2.add(lblDormir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 30, 30));

        lblOjo1.setText("jLabel2");
        lblOjo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOjo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOjo1MouseClicked(evt);
            }
        });
        jPanel2.add(lblOjo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 650));

        lblFondo.setText("FONDO");
        jPanel1.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 650));

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

    private void lblInSsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInSsMouseClicked
        //VERIFICAR EL USUARIO Y CONTRASEÑA, Y ABRIR EL FRAME CORRESPONDIENTE
        String user = txfUsuario.getText();
        String contra = new String(pswContraseña.getPassword());

        //Método en la cual se verificará las credenciales
        veriCred.cpbPasswordFrmLogin(user, contra);

        dispose();
    }//GEN-LAST:event_lblInSsMouseClicked

    private void lblInSsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInSsMouseEntered
        //EVT CAMBIAR LOS COLORES DEL PANEL Y DEL LABEL CUANDO EL CURSOR ENTRA
        pnlSesion.setBackground(new Color(87, 100, 172));

    }//GEN-LAST:event_lblInSsMouseEntered

    private void lblInSsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInSsMouseExited
        //EVT CAMBIAR LOS COLORES DEL PANEL Y DEL LABEL CUANDO EL CURSOR SALE
        pnlSesion.setBackground(new Color(57, 78, 142));
    }//GEN-LAST:event_lblInSsMouseExited

    private void lblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseClicked
        // VERIFICARÁ LA CONTRASEÑA DE ADMINISTRADOR Y LUEGO SE AÑADIRÁ UN
        // NUEVO USUARIO
        new frmVerfiAdmin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblAdminMouseClicked

    private void lblAdminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseEntered
        pnlAdmin.setBackground(new Color(87, 100, 172));
    }//GEN-LAST:event_lblAdminMouseEntered

    private void lblAdminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdminMouseExited
        pnlAdmin.setBackground(new Color(57, 78, 142));
    }//GEN-LAST:event_lblAdminMouseExited

    private void lblOjo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOjo1MouseClicked
        lblOjo1.setVisible(false);
        lblDormir.setVisible(true);
        pswContraseña.setEchoChar('*');

    }//GEN-LAST:event_lblOjo1MouseClicked

    private void lblDormirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDormirMouseClicked
        pswContraseña.requestFocus();
        
        lblDormir.setVisible(false);
        lblOjo1.setVisible(true);
        pswContraseña.setEchoChar((char) 0);
        

    }//GEN-LAST:event_lblDormirMouseClicked

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAcceder;
    private javax.swing.JLabel lblAdmin;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblDormir;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblInSs;
    private javax.swing.JLabel lblLine;
    private javax.swing.JLabel lblLine1;
    private javax.swing.JLabel lblLogoLargo;
    private javax.swing.JLabel lblOjo1;
    private javax.swing.JLabel lblTextHora;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUsu;
    private javax.swing.JPanel pnlAdmin;
    private javax.swing.JPanel pnlSesion;
    private javax.swing.JPasswordField pswContraseña;
    private javax.swing.JTextField txfUsuario;
    // End of variables declaration//GEN-END:variables
}
