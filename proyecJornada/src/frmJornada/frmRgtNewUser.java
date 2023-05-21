// @uthor: {Yb.M};
package frmJornada;

// IMPORTAMOS LAS CLASES A USAR
import clases.empleados;
import clases.hora;
import clases.listaEmpleado;
import clases.manejoArchivosEmpl;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmRgtNewUser extends javax.swing.JFrame implements Runnable {

    // Variable para el hilo de ejecución
    Thread hilo;

    // Instanciamos las clases
    manejoArchivosEmpl archivo = new manejoArchivosEmpl();

    listaEmpleado listEmpleado = new listaEmpleado();

    hora hr = new hora();

    public frmRgtNewUser() {
        initComponents();

        // Instanciamos el hilo de ejecución para que la hora
        // se vaya cambiando según corresponda.
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);

        // Método para desactivar los botones del frame
        desactivar();

        // Indicamos que el array será igual al método obtener
        // los datos de los trabajadores de nuestro archivo texto
        listEmpleado = archivo.obtenerDTStbrj();

        // Poner un logo al frame
        setIconImage(new ImageIcon(getClass().getResource(
                "/Imagenes/icono-Jornada.png")).getImage());

        // Imágen de fondo
        rsscalelabel.RSScaleLabel.setScaleLabel(lblFondo,
                "F:\\3er Ciclo\\NetBeans\\PROYECTO FINAL\\proyecJornada\\src\\Imagenes\\pampas-galeras.png");

        // Función para extraer del archivo de texto los datos de empleados
        // y ponerlo en el JTextArea
        llenarTxArea();
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

    void llenarTxArea() {
        txaMostrar.setText("");
        int cont = 1;

        // Igualamos para poder usar la clase manejoArchivosEmpl
        listEmpleado = archivo.obtenerDTStbrj();

        // RECORREMOS EL ARCHIVO DE TEXTO SEGÚN SU TAMAÑO
        for (int i = 0; i < listEmpleado.size(); i++) {

            // ESTRUCTURAMOS E INSERTAR LOS DATOS DEL ARCHIVO DE TEXTO
            txaMostrar.append("-------------------\tPERSONA " + cont + "\t-------------------\n");
            cont++;
            txaMostrar.append("              DNI : " + listEmpleado.get(i).DNI + "\n");
            txaMostrar.append("          Nombres : " + listEmpleado.get(i).name + "\n");
            txaMostrar.append("        Apellidos : " + listEmpleado.get(i).apelli + "\n");
            txaMostrar.append("              Cel : " + listEmpleado.get(i).celu + "\n");
            txaMostrar.append("            Cargo : " + listEmpleado.get(i).cargo + "\n");
            txaMostrar.append("          Usuario : " + listEmpleado.get(i).user + "\n");
            txaMostrar.append("         Password : " + listEmpleado.get(i).pass + "\n");
            txaMostrar.append("           Sueldo : S/" + listEmpleado.get(i).sueldo + "\n");
            txaMostrar.append("             Edad : " + listEmpleado.get(i).edad + "\n");
            txaMostrar.append("              Rol : " + listEmpleado.get(i).rol + "\n");
            txaMostrar.append(" Hora de Registro : " + listEmpleado.get(i).hora + "\n");
            txaMostrar.append("Fecha de Registro : " + listEmpleado.get(i).fecha + "\n");
        }
    }

    // Función para DESACTIVAR los Update y Delete
    void desactivar() {
        btnActualizar.setEnabled(false);
        btnDeleteUser.setEnabled(false);
        btnActualizar.setText("DESHABILITADO");
        btnDeleteUser.setText("DESHABILITADO");
    }

    // Función para ACTIVAR los botones Update y Delete
    void activar() {
        btnActualizar.setEnabled(true);
        btnActualizar.setText("ACTUALIZAR DATOS");
        btnDeleteUser.setEnabled(true);
        btnDeleteUser.setText("ELIMINAR USUARIO");
    }

    // Función para VACIAR los TextFields
    void vaciarEntradas() {
        txfApell.setText("");
        txfName.setText("");
        txfDni.setText("");
        txfUser.setText("");
        txfCel.setText("");
        txfEdad.setText("");
        txfSueldo.setText("");
        txfPass.setText("");
        cbxCargo.setSelectedIndex(0);
        cbxRol.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblApell = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblEdad = new javax.swing.JLabel();
        cbxCargo = new javax.swing.JComboBox<>();
        txfName = new javax.swing.JTextField();
        txfApell = new javax.swing.JTextField();
        txfPass = new javax.swing.JTextField();
        txfUser = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        btnRgtr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaMostrar = new javax.swing.JTextArea();
        btnIniciarSesion = new javax.swing.JButton();
        lblEdad1 = new javax.swing.JLabel();
        txfEdad = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        lblDNI = new javax.swing.JLabel();
        txfDni = new javax.swing.JTextField();
        lblUser1 = new javax.swing.JLabel();
        txfCel = new javax.swing.JTextField();
        cbxRol = new javax.swing.JComboBox<>();
        btnMostrarDts1 = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        lblTexto1 = new javax.swing.JLabel();
        txfSueldo = new javax.swing.JTextField();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JORNADA (Nuevo Trabajador)");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Registrar a un Nuevo Trabajador");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 560, 60));

        lblUser.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("USUARIO : ");
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        lblName.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("NOMBRES : ");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        lblApell.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblApell.setForeground(new java.awt.Color(255, 255, 255));
        lblApell.setText("APELLIDOS : ");
        getContentPane().add(lblApell, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        lblPass.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 255, 255));
        lblPass.setText("CONTRASEÑA : ");
        getContentPane().add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        lblEdad.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblEdad.setForeground(new java.awt.Color(255, 255, 255));
        lblEdad.setText("SUELDO : S/");
        getContentPane().add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 100, -1));

        cbxCargo.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        cbxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-------- Tipo de Cargo --------", "Reportero", "Panelista", "Compaginador", "Fotógrafo", "Repartidor", "Publicista", "Director" }));
        getContentPane().add(cbxCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 380, 50));

        txfName.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        getContentPane().add(txfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 270, 50));

        txfApell.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        getContentPane().add(txfApell, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 270, 50));

        txfPass.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        getContentPane().add(txfPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 270, 50));

        txfUser.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        getContentPane().add(txfUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 270, 50));

        btnBuscar.setBackground(new java.awt.Color(0, 255, 204));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(51, 51, 51));
        btnBuscar.setText("EDITAR DATOS DE UN USUARIO");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 190, -1, 50));

        btnDeleteUser.setBackground(new java.awt.Color(255, 0, 51));
        btnDeleteUser.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnDeleteUser.setForeground(new java.awt.Color(51, 51, 51));
        btnDeleteUser.setText("DESHABILITADO");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 260, 50));

        btnRgtr.setBackground(new java.awt.Color(255, 255, 0));
        btnRgtr.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnRgtr.setForeground(new java.awt.Color(51, 51, 51));
        btnRgtr.setText("REGISTRAR");
        btnRgtr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRgtrActionPerformed(evt);
            }
        });
        getContentPane().add(btnRgtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 260, 50));

        txaMostrar.setEditable(false);
        txaMostrar.setColumns(20);
        txaMostrar.setFont(new java.awt.Font("mononoki", 3, 23)); // NOI18N
        txaMostrar.setForeground(new java.awt.Color(0, 204, 0));
        txaMostrar.setRows(5);
        txaMostrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(txaMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 800, 320));

        btnIniciarSesion.setBackground(new java.awt.Color(255, 255, 51));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(51, 51, 51));
        btnIniciarSesion.setText("Volver a Iniciar Sesión");
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 610, 260, 50));

        lblEdad1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblEdad1.setForeground(new java.awt.Color(255, 255, 255));
        lblEdad1.setText("EDAD : ");
        getContentPane().add(lblEdad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, -1, -1));

        txfEdad.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        getContentPane().add(txfEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 280, 80, 50));

        btnActualizar.setBackground(new java.awt.Color(51, 204, 0));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(51, 51, 51));
        btnActualizar.setText("DESHABILITADO");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 260, 50));

        lblDNI.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(255, 255, 255));
        lblDNI.setText("DNI:");
        getContentPane().add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        txfDni.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        getContentPane().add(txfDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 270, 50));

        lblUser1.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblUser1.setForeground(new java.awt.Color(255, 255, 255));
        lblUser1.setText("N° CEL : ");
        getContentPane().add(lblUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        txfCel.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        getContentPane().add(txfCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 270, 50));

        cbxRol.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Permisos ---", "Administrador", "Empleado" }));
        getContentPane().add(cbxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, 260, 50));

        btnMostrarDts1.setBackground(new java.awt.Color(255, 0, 102));
        btnMostrarDts1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMostrarDts1.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarDts1.setText("Ver Todas Las Ventanas");
        btnMostrarDts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarDts1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrarDts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 550, 260, 50));

        lblFecha.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("DD/MM/YYYY");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 150, 70));

        lblHora.setFont(new java.awt.Font("Serif", 1, 21)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("00:00:00");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 80, 50));

        lblTexto.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 2, 24)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto.setText("Hora:");
        getContentPane().add(lblTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 70, 50));

        lblTexto1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 2, 24)); // NOI18N
        lblTexto1.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto1.setText("Fecha:");
        getContentPane().add(lblTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 80, 70));

        txfSueldo.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        getContentPane().add(txfSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 120, 50));

        lblFondo.setText("FONDO");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        desactivar();
        String dni = txfDni.getText();

        listEmpleado.deleteUser(dni);

        archivo.actualizarDatosEditados(listEmpleado);

        llenarTxArea();

        vaciarEntradas();

    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        desactivar();
        vaciarEntradas();

        listaEmpleado empls = archivo.obtenerDTStbrj();

        ImageIcon iconError = new ImageIcon("src\\Imagenes\\user-pregunta.png");
        ImageIcon iconCheck = new ImageIcon("src\\Imagenes\\lupaCheck.png");

        String consulDni = (String) JOptionPane.showInputDialog(null,
                "Inserte el DNI del empleado a buscar : ",
                "Ingrese el identificador (DNI)",
                JOptionPane.QUESTION_MESSAGE);

        activar();
        for (int i = 0; i < empls.size(); i++) {
            if (empls.get(i).DNI.equals(consulDni)) {

                JOptionPane.showMessageDialog(null,
                        "Se encontró al usuario : "
                        + empls.get(i).name + " "
                        + empls.get(i).apelli,
                        "BUSCA CON ÉXITO",
                        JOptionPane.PLAIN_MESSAGE, iconCheck);

                txfDni.setText(empls.get(i).DNI);
                txfName.setText(empls.get(i).name);
                txfApell.setText(empls.get(i).apelli);
                cbxCargo.setSelectedItem(empls.get(i).cargo);
                txfCel.setText(empls.get(i).celu);
                txfUser.setText(empls.get(i).user);
                txfPass.setText(empls.get(i).pass);
                txfSueldo.setText("" + empls.get(i).sueldo);
                txfEdad.setText(empls.get(i).edad);
                cbxRol.setSelectedItem(empls.get(i).rol);

                break;
            }

            if (i == empls.size() - 1) {
                desactivar();
                JOptionPane.showMessageDialog(null,
                        "No se encontró un personal con ese identificador",
                        "Error...Datos no encontrados",
                        JOptionPane.WARNING_MESSAGE,
                        iconError);
            }

        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRgtrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRgtrActionPerformed
        // Extrayendo los datos de los TextFields

        String dni = txfDni.getText();
        String name = txfName.getText();
        String apell = txfApell.getText();
        String cel = txfCel.getText();
        String user = txfUser.getText();
        String pass = txfPass.getText();
        double sueldo = Double.parseDouble(txfSueldo.getText());
        String edad = txfEdad.getText();
        String tipCrg = cbxCargo.getSelectedItem().toString();
        String rol = cbxRol.getSelectedItem().toString();
        String hor = lblHora.getText();
        String fch = lblFecha.getText();

        // Instanciamos la clase empleado
        empleados emp = new empleados(tipCrg, user, pass, sueldo, rol, name,
                apell, dni, cel, edad, hor, fch);

        // Llamamos a la clase manejoArchivosEmpl y la función guardar
        archivo.guardarTbrjEnDB(emp);

        llenarTxArea();

        vaciarEntradas();


    }//GEN-LAST:event_btnRgtrActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        new frmLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnMostrarDts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarDts1ActionPerformed
        new frmAccessAdm().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMostrarDts1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        desactivar();
        String dni = txfDni.getText();
        String name = txfName.getText();
        String apell = txfApell.getText();
        String cel = txfCel.getText();
        String user = txfUser.getText();
        String pass = txfPass.getText();
        double sueldo = Double.parseDouble(txfSueldo.getText());
        String edad = txfEdad.getText();
        String tipCrg = cbxCargo.getSelectedItem().toString();
        String rol = cbxRol.getSelectedItem().toString();
        String hor = lblHora.getText();
        String fch = lblFecha.getText();

        empleados emp = new empleados(tipCrg, user, pass, sueldo, rol, name,
                apell, dni, cel, edad, hor, fch);

        listEmpleado.editarUser(dni, emp);

        archivo.actualizarDatosEditados(listEmpleado);

        llenarTxArea();

        vaciarEntradas();

    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRgtNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRgtNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRgtNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRgtNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRgtNewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnMostrarDts1;
    private javax.swing.JButton btnRgtr;
    private javax.swing.JComboBox<String> cbxCargo;
    private javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApell;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblEdad1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JTextArea txaMostrar;
    private javax.swing.JTextField txfApell;
    private javax.swing.JTextField txfCel;
    private javax.swing.JTextField txfDni;
    private javax.swing.JTextField txfEdad;
    private javax.swing.JTextField txfName;
    private javax.swing.JTextField txfPass;
    private javax.swing.JTextField txfSueldo;
    private javax.swing.JTextField txfUser;
    // End of variables declaration//GEN-END:variables
}
// @uthor: {Yb.M};
