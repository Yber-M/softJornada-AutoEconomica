package frmJornada;

// Clases a usar
import clases.clientes;
import clases.hora;
import clases.listaCliente;
import clases.manejoArchivosClientes;
import clases.verificadorCredenciales;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class frmCliente extends javax.swing.JFrame implements Runnable {

    // Variable Icon
    Icon modificar, modificar2;
    // Variable para el hilo de ejecución
    Thread hilo;

    // Contador para la Table
    int cont = 0;

    // Arraylist para guardar en el table
    ArrayList<clientes> arrayTemporal = new ArrayList<>();

    // Inicializamos la tabla
    DefaultTableModel tblDts;
    
    //Clase clientes para que guarde los datos de la tabla
    clientes clits;
    
    // Instanciamos las clases
    verificadorCredenciales verCred = new verificadorCredenciales();
    hora hr = new hora();
    listaCliente listClt = new listaCliente();
    manejoArchivosClientes arcManager = new manejoArchivosClientes();

    //Valores que tomará la tabla
    String[][] data = {};
    String[] cbcra = {"N°", "DNI", "Cel",
        "Tipo de Servicio", "Precio S/", "Hora", "Fecha"};

    //Poner un valor Nulo al RUC
    String ruc = "No se indico el RUC";

    // Variables para comprobar las credenciales
    String user, pass;

    public frmCliente() {
        initComponents();
        // Instanciamos el hilo de ejecución para que la hora
        // se vaya cambiando según corresponda.
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);

        // Imágenes del Frame
        modificar = new ImageIcon("src/imagenes/qrYape.jpg");
        modificar2 = new ImageIcon("src/imagenes/bancaria.png");
        setIconImage(new ImageIcon(getClass().getResource(
                "/Imagenes/icono-Jornada.png")).getImage());
        rsscalelabel.RSScaleLabel.setScaleLabel(lblFondo,
                "F:\\3er Ciclo\\NetBeans\\PROYECTO FINAL\\proyecJornada\\src\\Imagenes\\obelisco.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblLogo,
                "F:\\3er Ciclo\\NetBeans\\PROYECTO FINAL\\proyecJornada\\src\\Imagenes\\logo-jornadaCompleto.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblEfectivo,
                "F:\\3er Ciclo\\NetBeans\\PROYECTO FINAL\\proyecJornada\\src\\Imagenes\\efectivo.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblYape,
                "F:\\3er Ciclo\\NetBeans\\PROYECTO FINAL\\proyecJornada\\src\\Imagenes\\yape.jpg");
        rsscalelabel.RSScaleLabel.setScaleLabel(lblBCP,
                "F:\\3er Ciclo\\NetBeans\\PROYECTO FINAL\\proyecJornada\\src\\Imagenes\\bcp.png");
        tblDts = new DefaultTableModel(data, cbcra);
        tblDatos.setModel(tblDts);
        desactivar();
    }

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

        btnIniciarSesion = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCe = new javax.swing.JLabel();
        cbxTipServ = new javax.swing.JComboBox<>();
        btnRgtr = new javax.swing.JButton();
        lblApell = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        txfCelular = new javax.swing.JTextField();
        txfName = new javax.swing.JTextField();
        txfApell = new javax.swing.JTextField();
        txfDNI = new javax.swing.JTextField();
        lblLogo = new javax.swing.JLabel();
        btnRuc = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnSearchCliente = new javax.swing.JButton();
        lblFecha = new javax.swing.JLabel();
        lblTexto1 = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        txtSalidaRUC = new javax.swing.JTextField();
        txtFechaHora = new javax.swing.JTextField();
        txtMetPago = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSalidaName = new javax.swing.JTextField();
        btnEliminarTbl = new javax.swing.JButton();
        txtSubtotal = new javax.swing.JTextField();
        lblSubTotal = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtIGV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        btnIniAdmin = new javax.swing.JButton();
        cbxMedioPago = new javax.swing.JComboBox<>();
        btnCalcularBoleta = new javax.swing.JButton();
        btnNewCliente = new javax.swing.JButton();
        lblBCP = new javax.swing.JLabel();
        lblEfectivo = new javax.swing.JLabel();
        lblYape = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JORNADA (Registro de Ingresos)");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniciarSesion.setBackground(new java.awt.Color(255, 0, 102));
        btnIniciarSesion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setText("CERRAR SESIÓN");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 600, 190, 40));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("REGISTRAR UN NUEVO CLIENTE");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 860, 60));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Nombre : ");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        lblCe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCe.setForeground(new java.awt.Color(255, 255, 255));
        lblCe.setText("Celular : ");
        getContentPane().add(lblCe, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 80, -1));

        cbxTipServ.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cbxTipServ.setForeground(new java.awt.Color(255, 255, 255));
        cbxTipServ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- TIPO DE SERVICIO ----", "Publicidad", "Ordenanza", "Petitorio", "Nota Informativa", "Cintillo Publicitario", "Cintillo de Impresión" }));
        getContentPane().add(cbxTipServ, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 280, 40));

        btnRgtr.setBackground(new java.awt.Color(51, 51, 255));
        btnRgtr.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnRgtr.setForeground(new java.awt.Color(255, 255, 255));
        btnRgtr.setText("REGISTRAR");
        btnRgtr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRgtrActionPerformed(evt);
            }
        });
        getContentPane().add(btnRgtr, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 170, 40));

        lblApell.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblApell.setForeground(new java.awt.Color(255, 255, 255));
        lblApell.setText("Apellidos : ");
        getContentPane().add(lblApell, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        lblDNI.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(255, 255, 255));
        lblDNI.setText("DNI : ");
        getContentPane().add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 50, -1));

        txfCelular.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        getContentPane().add(txfCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 230, 40));

        txfName.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        getContentPane().add(txfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 260, 40));

        txfApell.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        getContentPane().add(txfApell, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 260, 40));

        txfDNI.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        getContentPane().add(txfDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 230, 40));

        lblLogo.setText("lblLogo");
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 90, 250, 70));

        btnRuc.setBackground(new java.awt.Color(0, 102, 102));
        btnRuc.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnRuc.setForeground(new java.awt.Color(255, 255, 255));
        btnRuc.setText("INGRESAR R.U.C.");
        btnRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRucActionPerformed(evt);
            }
        });
        getContentPane().add(btnRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 190, 40));

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setVerifyInputWhenFocusTarget(false);

        tblDatos.setBackground(new java.awt.Color(51, 102, 255));
        tblDatos.setFont(new java.awt.Font("Baloo 2", 0, 16)); // NOI18N
        tblDatos.setForeground(new java.awt.Color(255, 255, 255));
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatos.setToolTipText("");
        tblDatos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        tblDatos.setSelectionBackground(new java.awt.Color(153, 153, 255));
        tblDatos.setShowGrid(false);
        jScrollPane2.setViewportView(tblDatos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 710, 300));
        jScrollPane2.getAccessibleContext().setAccessibleName("");

        btnSearchCliente.setBackground(new java.awt.Color(0, 255, 204));
        btnSearchCliente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnSearchCliente.setForeground(new java.awt.Color(51, 51, 51));
        btnSearchCliente.setText("Buscar un Cliente");
        btnSearchCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearchCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 230, 190, 50));

        lblFecha.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("DD/MM/YYYY");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, 130, 40));

        lblTexto1.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 2, 14)); // NOI18N
        lblTexto1.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto1.setText("Fecha:");
        getContentPane().add(lblTexto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 50, 40));

        lblTexto.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 2, 14)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto.setText("Hora:");
        getContentPane().add(lblTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 50, 40));

        lblHora.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("00:00:00");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, 90, 40));

        txtSalidaRUC.setEditable(false);
        txtSalidaRUC.setFont(new java.awt.Font("mononoki", 3, 18)); // NOI18N
        txtSalidaRUC.setForeground(new java.awt.Color(0, 204, 204));
        txtSalidaRUC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtSalidaRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 220, 50));

        txtFechaHora.setEditable(false);
        txtFechaHora.setFont(new java.awt.Font("mononoki", 1, 14)); // NOI18N
        txtFechaHora.setForeground(new java.awt.Color(0, 204, 204));
        txtFechaHora.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 360, 190, 50));

        txtMetPago.setEditable(false);
        txtMetPago.setFont(new java.awt.Font("mononoki", 3, 18)); // NOI18N
        txtMetPago.setForeground(new java.awt.Color(204, 0, 204));
        txtMetPago.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtMetPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 250, 50));

        jLabel14.setFont(new java.awt.Font("Fira Code Medium", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("R.U.C");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 60, -1));

        jLabel6.setFont(new java.awt.Font("Fira Code Medium", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha y Hora");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 120, -1));

        jLabel5.setFont(new java.awt.Font("Fira Code Medium", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo De Pago");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 120, -1));

        jLabel4.setFont(new java.awt.Font("Fira Code Medium", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre y Apellidos del Cliente:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        txtSalidaName.setEditable(false);
        txtSalidaName.setFont(new java.awt.Font("mononoki", 3, 18)); // NOI18N
        txtSalidaName.setForeground(new java.awt.Color(0, 204, 204));
        txtSalidaName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtSalidaName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 430, 50));

        btnEliminarTbl.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminarTbl.setFont(new java.awt.Font("Century Gothic", 1, 17)); // NOI18N
        btnEliminarTbl.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarTbl.setText("Eliminar de la Tabla");
        btnEliminarTbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTblActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarTbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 280, 190, 50));

        txtSubtotal.setEditable(false);
        txtSubtotal.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        txtSubtotal.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 160, 40));

        lblSubTotal.setFont(new java.awt.Font("Fira Code Medium", 1, 12)); // NOI18N
        lblSubTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTotal.setText("SUBTOTAL");
        getContentPane().add(lblSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 60, 20));

        jLabel11.setFont(new java.awt.Font("Fira Code Medium", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("S/");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 30, 20));

        jLabel2.setFont(new java.awt.Font("Fira Code Medium", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("I.G.V. 18%");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 80, 20));

        jLabel12.setFont(new java.awt.Font("Fira Code Medium", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("S/");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, -1, 30));

        txtIGV.setEditable(false);
        txtIGV.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        txtIGV.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(txtIGV, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 160, 40));

        jLabel3.setFont(new java.awt.Font("Fira Code Medium", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TOTAL ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 580, 50, 20));

        jLabel13.setFont(new java.awt.Font("Fira Code Medium", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("S/");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 600, -1, 30));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("mononoki", 3, 14)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 204, 0));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, 160, 40));

        btnIniAdmin.setBackground(new java.awt.Color(255, 255, 51));
        btnIniAdmin.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnIniAdmin.setForeground(new java.awt.Color(51, 51, 51));
        btnIniAdmin.setText("ADMINISTRADOR");
        btnIniAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 560, 190, 40));

        cbxMedioPago.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cbxMedioPago.setForeground(new java.awt.Color(255, 255, 255));
        cbxMedioPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- PAGO ----", "Efectivo", "Yape", "Transferencia Bancaria" }));
        getContentPane().add(cbxMedioPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 240, 40));

        btnCalcularBoleta.setBackground(new java.awt.Color(255, 0, 153));
        btnCalcularBoleta.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnCalcularBoleta.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularBoleta.setText("Calcular Boleta");
        btnCalcularBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularBoletaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcularBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 170, 40));

        btnNewCliente.setBackground(new java.awt.Color(51, 255, 51));
        btnNewCliente.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnNewCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNewCliente.setText("Nuevo Cliente");
        btnNewCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, 190, 50));

        lblBCP.setText("bc");
        lblBCP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBCP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBCPMouseClicked(evt);
            }
        });
        getContentPane().add(lblBCP, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 360, 190, 80));

        lblEfectivo.setText("ef");
        lblEfectivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEfectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEfectivoMouseClicked(evt);
            }
        });
        getContentPane().add(lblEfectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 440, 80, 80));

        lblYape.setText("ya");
        lblYape.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblYape.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblYapeMouseClicked(evt);
            }
        });
        getContentPane().add(lblYape, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 440, 80, 80));

        lblFondo.setText("jLabel2");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 670));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void vaciarEntradas() {
        txfName.setText("");
        txfApell.setText("");
        txfDNI.setText("");
        txfCelular.setText("");
        cbxMedioPago.setSelectedIndex(0);
        cbxTipServ.setSelectedIndex(0);
        tblDts.setDataVector(new Object[][]{}, cbcra);
        txtFechaHora.setText("");
        txtIGV.setText("");
        txtMetPago.setText("");
        txtSalidaName.setText("");
        txtSalidaRUC.setText("");
        txtSubtotal.setText("");
        txtTotal.setText("");
    }

    void activar() {

        btnEliminarTbl.setEnabled(true);
    }

    void desactivar() {
        btnCalcularBoleta.setEnabled(false);
        btnEliminarTbl.setEnabled(false);
    }

    // COMPROBAR PARA ACTIVAR LOS BOTON DE ELIMINAR
    void comprobar(String user, String pass) {
        ImageIcon icon = new ImageIcon("src\\Imagenes\\searchUser.png");
        int condi = JOptionPane.showConfirmDialog(null,
                """
                ¿Desea buscar un cliente con PERMISOS de administrador?""",
                "SELECCIONE UNA OPCIÓN",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE, icon);

        if (condi == 0) {
            user = JOptionPane.showInputDialog(null,
                    "Ingrese el USUARIO de administrador: ",
                    "Usuario Administrador", JOptionPane.DEFAULT_OPTION);
            pass = JOptionPane.showInputDialog(null,
                    "Ingrese la CONSTRASEÑA de administrador: ",
                    "Contraseña Administrador", JOptionPane.DEFAULT_OPTION);

            if (verCred.cpbPasswordVeriFrmCliente(user, pass) == true) {
                activar();

            } else {
                desactivar();
            }
        }

    }
    
    // Función para vaciar dinamicamente entradas
    void vaciarEntradasPrimarias(JTextField[] campos, JComboBox[] combox) {
        for (int i = 0; i < campos.length; i++) {
            campos[i].setText("");
        }

        for (int i = 0; i < combox.length; i++) {
            combox[i].setSelectedIndex(0);
        }
    }
    
    // Función para llenar el table
    void llenarTable() {
        tblDts.setDataVector(new Object[][]{}, cbcra);

        listClt = arcManager.obtenerDTSclts();

        btnEliminarTbl.setEnabled(true);
        
        for (int i = 0; i < listClt.size(); i++) {
            tblDts.addRow(new Object[]{i + 1, listClt.get(i).DNI,
                listClt.get(i).celu, listClt.get(i).tipServ,
                listClt.get(i).precioNeto(), listClt.get(i).hora,
                listClt.get(i).fecha});
        }
    }

    // BOTÓN Volver al frame de Iniciar Sesión
    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        new frmLogin().setVisible(true);
            this.setVisible(false);
            dispose();
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    // BOTÓN que sirve para que el usuario ingrese el RUC del Cliente (Si es que se requiere)
    private void btnRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRucActionPerformed

        ruc = JOptionPane.showInputDialog(null,
                "Por favor, indique el RUC : ",
                "Registro Único de Contribuyentes",
                JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_btnRucActionPerformed

    private void btnIniAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniAdminActionPerformed
        new frmVerfiAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnIniAdminActionPerformed

    private void btnSearchClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchClienteActionPerformed

        listClt = arcManager.obtenerDTSclts();

        btnCalcularBoleta.setEnabled(false);

        vaciarEntradas();

        comprobar(user, pass);

        String dni = JOptionPane.showInputDialog(null,
                "Ingrese el DNI del cliente:",
                "Buscar Registro Económico de un Cliente",
                JOptionPane.DEFAULT_OPTION);

        btnNewCliente.setVisible(true);
        btnCalcularBoleta.setEnabled(true);

        if (!listClt.buscar(dni).isEmpty()) {
            clits = listClt.buscar(dni).get(0);
        }
        if (clits != null) {
            ImageIcon icon = new ImageIcon("src\\Imagenes\\lupaCheck.png");
            String name = clits.name, apell = clits.apelli;
            
            JOptionPane.showMessageDialog(null,
                    "Se encontro al cliente: " + name + " " + apell,
                    "Búsqueda con éxito", JOptionPane.ERROR_MESSAGE, icon);
            txtSalidaName.setText(clits.name + " " + clits.apelli);
            txtMetPago.setText(clits.medioPago);
            txtSalidaRUC.setText(clits.ruc.equals("No se indico el RUC")
                    ? "No se indico el RUC" : clits.ruc);
        } else {
            JOptionPane.showMessageDialog(null,
                    "No se encontró ningún usuario con el N° de DNI ingresado",
                    "Error al buscar DNI", JOptionPane.ERROR_MESSAGE);
        }

        for (int i = 0; i < listClt.buscar(dni).size(); i++) {
            tblDts.addRow(new Object[]{i + 1,
                listClt.buscar(dni).get(i).DNI,
                listClt.buscar(dni).get(i).celu,
                listClt.buscar(dni).get(i).tipServ,
                listClt.buscar(dni).get(i).precioNeto(),
                listClt.buscar(dni).get(i).hora,
                listClt.buscar(dni).get(i).fecha
            });
        }

    }//GEN-LAST:event_btnSearchClienteActionPerformed

    private void btnRgtrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRgtrActionPerformed

        if ("---- TIPO DE SERVICIO ----".equals(cbxTipServ.getSelectedItem().toString())
                || "".equals(txfApell.getText()) || "".equals(txfName.getText())
                || "".equals(txfCelular.getText()) || "".equals(txfDNI.getText())) {

            JOptionPane.showMessageDialog(null,
                    "Verfique que los datos no sean nulos y vuelva intentarlo",
                    "ERROR...DATOS INCOMPLETOS", JOptionPane.ERROR_MESSAGE);

        } else {
            btnCalcularBoleta.setEnabled(true);
            btnNewCliente.setEnabled(true);

            cont++;
            String name = txfName.getText();
            String apell = txfApell.getText();
            String dni = txfDNI.getText();
            String cel = txfCelular.getText();
            String tipServ = cbxTipServ.getSelectedItem().toString();
            String medioPago = cbxMedioPago.getSelectedItem().toString();
            String hora = lblHora.getText();
            String fecha = lblFecha.getText();

            txtSalidaName.setText(name + " " + apell);
            txtMetPago.setText(medioPago);
            txtSalidaRUC.setText(ruc);
            txtFechaHora.setText(fecha + " | " + hora);

            clits = new clientes(tipServ, ruc, medioPago, 0, cont,
                    name, apell, dni, cel, dni, hora, fecha);

            arrayTemporal.add(clits);

            arrayTemporal.forEach((data) -> {
                tblDts.addRow(new Object[]{cont,
                    data.DNI, data.celu, data.tipServ,
                    data.precioNeto(), data.hora, data.fecha
                });
            });

            arcManager.guardarClienteEnDb(clits);

            vaciarEntradasPrimarias(new JTextField[]{txfName, txfApell,
                txfCelular, txfDNI}, new JComboBox[]{cbxMedioPago, cbxTipServ});
        }
    }//GEN-LAST:event_btnRgtrActionPerformed

    private void btnEliminarTblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTblActionPerformed

        if (tblDatos.getSelectedRowCount() != 1) {
            return;
        }

        int fill = tblDatos.getSelectedRow();
        tblDts.removeRow(fill);
    }//GEN-LAST:event_btnEliminarTblActionPerformed

    private void btnCalcularBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularBoletaActionPerformed
        DecimalFormat df = new DecimalFormat("##.00");
        double subTotal = 0, precioIgv = 0.18;

        if (!listClt.estaVacioClt()) {

            for (int i = 0; i < listClt.size(); i++) {
                if (listClt.get(i).DNI.equals(clits.DNI)) {

                    subTotal += listClt.get(i).precioNeto();
                }
            }
            precioIgv = subTotal * 0.18;

            txtSubtotal.setText("" + df.format(subTotal));
            txtIGV.setText("" + df.format(precioIgv));

            txtTotal.setText(String.valueOf(df.format(subTotal + precioIgv)));
        } else {

            for (int i = 0; i < arrayTemporal.size(); i++) {
                subTotal += arrayTemporal.get(i).precioNeto();
            }

            precioIgv = subTotal * 0.18;

            txtSubtotal.setText("" + df.format(subTotal));
            txtIGV.setText("" + df.format(precioIgv));

            txtTotal.setText(String.valueOf(df.format(subTotal + precioIgv)));
        }

    }//GEN-LAST:event_btnCalcularBoletaActionPerformed

    private void btnNewClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewClienteActionPerformed
        vaciarEntradas();

        arrayTemporal.removeAll(arrayTemporal);
    }//GEN-LAST:event_btnNewClienteActionPerformed

    private void lblBCPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBCPMouseClicked
        cbxMedioPago.setSelectedIndex(3);
        txtMetPago.setText("Transferencia");

        JOptionPane.showMessageDialog(null, "", "DEPOSITAR",
                JOptionPane.WARNING_MESSAGE, modificar2);
    }//GEN-LAST:event_lblBCPMouseClicked

    private void lblEfectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEfectivoMouseClicked
        cbxMedioPago.setSelectedIndex(1);
        txtMetPago.setText("EFECTIVO");
    }//GEN-LAST:event_lblEfectivoMouseClicked

    private void lblYapeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblYapeMouseClicked
        cbxMedioPago.setSelectedIndex(2);
        txtMetPago.setText("Yape");

        JOptionPane.showMessageDialog(null, "", "YAPEAR",
                JOptionPane.WARNING_MESSAGE, modificar);
    }//GEN-LAST:event_lblYapeMouseClicked

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
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularBoleta;
    private javax.swing.JButton btnEliminarTbl;
    private javax.swing.JButton btnIniAdmin;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnNewCliente;
    private javax.swing.JButton btnRgtr;
    private javax.swing.JButton btnRuc;
    private javax.swing.JButton btnSearchCliente;
    private javax.swing.JComboBox<String> cbxMedioPago;
    private javax.swing.JComboBox<String> cbxTipServ;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApell;
    private javax.swing.JLabel lblBCP;
    private javax.swing.JLabel lblCe;
    private javax.swing.JLabel lblDNI;
    private javax.swing.JLabel lblEfectivo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYape;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txfApell;
    private javax.swing.JTextField txfCelular;
    private javax.swing.JTextField txfDNI;
    private javax.swing.JTextField txfName;
    private javax.swing.JTextField txtFechaHora;
    private javax.swing.JTextField txtIGV;
    private javax.swing.JTextField txtMetPago;
    private javax.swing.JTextField txtSalidaName;
    private javax.swing.JTextField txtSalidaRUC;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
