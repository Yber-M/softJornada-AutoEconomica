// @uthor: {Yb.M};
package clases;

// Importamos las clases a usar
import frmJornada.frmAccessAdm;
import frmJornada.frmAdmin;
import frmJornada.frmCliente;
import frmJornada.frmLogin;
import frmJornada.frmVerfiAdmin;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class verificadorCredenciales {

    // Variable para comprobar
    boolean comprobador;

    // Método para verificar las credenciales realizado para el frmLogin
    public void cpbPasswordFrmLogin(String user, String contra) {

        //Creamos un arraylist del empleado
        ArrayList<empleados> arrayEmpld = new ArrayList<>();

        //Leer el archivo de texto pass.txt
        try {
            //Indicar el nombre del archivo de texto
            BufferedReader bf = new BufferedReader(new FileReader("pass.txt"));

            String linea;

            while ((linea = bf.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(linea, "|");

                String dnI = stk.nextToken(),
                        usEr = stk.nextToken(),
                        conTra = stk.nextToken(),
                        rol = stk.nextToken();

                arrayEmpld.add(new empleados("", usEr, conTra, 0, rol,
                        "", "", dnI, "", "", "", ""));

            }

            // Recorremos los datos del empleado
            for (int i = 0; i < arrayEmpld.size(); i++) {

                // Condicional para verificar las credenciales
                if (arrayEmpld.get(i).user.equals(user)
                        && arrayEmpld.get(i).pass.equals(contra)) {

                    // Condicional para que pueda abrir el frame según los permisos
                    if (arrayEmpld.get(i).rol.equals("Administrador")) {
                        new frmAdmin().setVisible(true);
                        break;
                    } else {
                        new frmCliente().setVisible(true);
                        break;
                    }
                }

                // Condicional en caso las credenciales sean incorrectas
                if (i == arrayEmpld.size() - 1) {
                    JOptionPane.showMessageDialog(null,
                            """ 
                            Porfavor, verifique si las credenciales fueron 
                            escritas correctamente...VUELVA A INTENTARLO""",
                            "Error con las credenciales (No Existen)",
                            JOptionPane.ERROR_MESSAGE);
                    new frmLogin().setVisible(true);
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL LEER EL ARCHIVO" + e);
        }
    }

    // Método para verificar las credenciales realizado para el frmVerifiAdmin
    public void cpbPasswordVeriFrmAdmin(String user, String contra) {

        //Creamos un arraylist del empleado
        ArrayList<empleados> arrayEmpld = new ArrayList<>();

        //Leer el archivo de texto .txt
        try {
            //Indicar el nombre del archivo de texto
            BufferedReader bf = new BufferedReader(new FileReader("pass.txt"));

            String linea;

            while ((linea = bf.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(linea, "|");

                String dnI = stk.nextToken(),
                        usEr = stk.nextToken(),
                        conTra = stk.nextToken(),
                        rol = stk.nextToken();

                arrayEmpld.add(new empleados("", usEr, conTra, 0, rol,
                        "", "", dnI, "", "", "", ""));

            }

            for (int i = 0; i < arrayEmpld.size(); i++) {

                if (arrayEmpld.get(i).user.equals(user)
                        && arrayEmpld.get(i).pass.equals(contra)) {
                    if (arrayEmpld.get(i).rol.equals("Administrador")) {
                        new frmAccessAdm().setVisible(true);
                        break;
                    }
                }

                if (i == arrayEmpld.size() - 1) {
                    JOptionPane.showMessageDialog(null,
                            """ 
                            Porfavor, verifique si las credenciales fueron 
                            escritas correctamente...VUELVA A INTENTARLO""",
                            "Error con las credenciales (No Existen)",
                            JOptionPane.ERROR_MESSAGE);
                    new frmVerfiAdmin().setVisible(true);
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR A LEER EL ARCHIVO" + e);
        }
    }

    // Método para verificar las credenciales y modificar los datos del FrmCliente
    public boolean cpbPasswordVeriFrmCliente(String user, String contra) {

        //Creamos un arraylist del empleado
        ArrayList<empleados> arrayEmpld = new ArrayList<>();

        //Leer el archivo de texto .txt
        try {
            //Indicar el nombre del archivo de texto
            BufferedReader bf = new BufferedReader(new FileReader("pass.txt"));

            String linea;

            while ((linea = bf.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(linea, "|");

                String dnI = stk.nextToken(),
                        usEr = stk.nextToken(),
                        conTra = stk.nextToken(),
                        rol = stk.nextToken();

                arrayEmpld.add(new empleados("", usEr, conTra, 0, rol,
                        "", "", dnI, "", "", "", ""));

            }

            for (int i = 0; i < arrayEmpld.size(); i++) {
                ImageIcon icon = new ImageIcon("src\\Imagenes\\lupaCheck.png");
                if (arrayEmpld.get(i).user.equals(user)
                        && arrayEmpld.get(i).pass.equals(contra)) {
                    if (arrayEmpld.get(i).rol.equals("Administrador")) {
                        JOptionPane.showMessageDialog(null,
                                "Botón 'Eliminar de la Tabla' activado con éxito.", 
                                "Credenciales Correctas", JOptionPane.DEFAULT_OPTION, icon);
                        comprobador = true;
                        break;
                    }
                }

                if (i == arrayEmpld.size() - 1) {
                    JOptionPane.showMessageDialog(null,
                            """ 
                            Porfavor, verifique si las credenciales fueron 
                            escritas correctamente...VUELVA A INTENTARLO""",
                            "Error con las credenciales (No Existen)",
                            JOptionPane.ERROR_MESSAGE);
                    comprobador = false;
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR A LEER EL ARCHIVO" + e);
        }
        return comprobador;
    }

}
