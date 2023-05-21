// @uthor: {Yb.M};
package clases;

// IMPORTAMOS LAS CLASES QUE USAREMOS
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class manejoArchivosEmpl {
    
    // SEÑALAMOS AL PROGRAMA CUALES SON LOS NOMBRES DE NUESTRO ARCHIVO DE TEXTO
    File fileEmplds = new File("datosEmpleados.txt");
    File filePass = new File("pass.txt");
    
    // Función para usar de forma óptima los demás métodos
    public void manejoArchivos() {
        crearDBTrabajador();
        crearDBPassTbrj();
    }
    
    // Función para Crear los datos de los trabajadores
    void crearDBTrabajador() {
        try {

            if (!fileEmplds.exists()) {
                new FileWriter(fileEmplds, true).close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de lectura" + e);
        }
    }
    
    // Función para Crear las contraseñas de los trabajadores
    void crearDBPassTbrj() {
        try {

            if (!filePass.exists()) {
                new FileWriter(filePass, true).close();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de lectra" + e);
        }
    }
    
    // Función para guardar los datos en el archivo de texto
    public void guardarTbrjEnDB(empleados empld) {
        try {
            FileWriter fwEmpls = new FileWriter(fileEmplds, true);
            FileWriter fwPass = new FileWriter(filePass, true);

            String datoEmp = empld.DNI + "|" + empld.name + "|" + empld.apelli + "|"
                    + empld.cargo + "|" + empld.celu + "|" + empld.edad + "|"
                    + empld.sueldo + "|" + empld.user + "|" + empld.pass + "|"
                    + empld.rol + "|" + empld.hora + "|" + empld.fecha + "\n";

            String datoPass = empld.DNI + "|" + empld.user + "|"
                    + empld.pass + "|" + empld.rol + "\n";

            fwEmpls.write(datoEmp);
            fwEmpls.close();

            fwPass.write(datoPass);
            fwPass.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE GUARDO CORRECTAMENTE" + e);
        }
    }

    // Función para formatear y volver a llenar de nuevo los datos editados
    public void actualizarDatosEditados(listaEmpleado lst) {    
        try {
            FileWriter empl = new FileWriter(fileEmplds);
            FileWriter pass = new FileWriter(filePass);
            empl.write("");
            pass.write("");

            for (int i = 0; i < lst.size(); i++) {
                guardarTbrjEnDB(lst.get(i));
            }

            empl.close();
            pass.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error con la lectura" + e);
        }
    }

    // Función para obtener los datos del archivo
    public listaEmpleado obtenerDTStbrj() {

        listaEmpleado empld = new listaEmpleado();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileEmplds));

            String linea;

            while ((linea = bf.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(linea, "|");

                String dni = stk.nextToken();
                String name = stk.nextToken();
                String apell = stk.nextToken();
                String tipCrg = stk.nextToken();
                String cel = stk.nextToken();
                String edad = stk.nextToken();
                double sueldo = Double.parseDouble(stk.nextToken());
                String user = stk.nextToken();
                String pass = stk.nextToken();
                String rol = stk.nextToken();
                String hor = stk.nextToken();
                String fch = stk.nextToken();

                empld.addFin(new empleados(tipCrg, user, pass, sueldo, rol,
                        name, apell, dni, cel, edad, hor, fch));

            }

        } catch (Exception e) {
        }

        return empld;
    }

}
// @uthor: {Yb.M};