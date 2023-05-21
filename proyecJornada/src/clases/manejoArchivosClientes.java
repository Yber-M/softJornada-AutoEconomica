// @uthor: {Yb.M};
package clases;

// IMPORTAMOS LAS CLASES QUE USAREMOS
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class manejoArchivosClientes {

    // SEÑALAMOS AL PROGRAMA CUALES SON LOS NOMBRES DE NUESTRO ARCHIVO DE TEXTO
    File fileCliente = new File("rgtrEcono.txt");

    // Función para usar de forma óptima los demás métodos
    public void manejoArchivos() {
        crearDBCliente();
    }

    // Función para Crear los datos de los trabajadores
    void crearDBCliente() {
        try {

            if (!fileCliente.exists()) {
                new FileWriter(fileCliente, true).close();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de lectura" + e);
        }
    }

    // Función para guardar los datos en el archivo de texto
    public void guardarClienteEnDb(clientes clnts) {
        try {
            
            FileWriter fwClnts = new FileWriter(fileCliente, true);
            
            String dataClnts = clnts.cont + "|" + clnts.DNI + "|" + clnts.name + 
                    "|" + clnts.apelli + "|" + clnts.celu + "|" + clnts.ruc + "|" 
                    + clnts.tipServ + "|" + clnts.precioNeto() + "|" + clnts.medioPago
                    + "|"+ clnts.hora + "|" + clnts.fecha + "\n";

            fwClnts.append(dataClnts);
            
            fwClnts.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de lectura" + e);
        }
    }

    // Función para formatear y volver a llenar de nuevo los datos editados
    public void actualizarDatosEditadosClt(listaCliente lst) {
        try {
            FileWriter clnts = new FileWriter(fileCliente);
            clnts.write("");

            for (int i = 0; i < lst.size(); i++) {
                guardarClienteEnDb(lst.get(i));
            }

            clnts.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de lectura" + e);
        }
    }
    
    public void eliminarDTS() {
        
        
        
    }
    

    // Función para obtener los datos del archivo
    public listaCliente obtenerDTSclts() {

        listaCliente clts = new listaCliente();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileCliente));

            String linea;

            while ((linea = bf.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(linea, "|");
                
                int cont = Integer.parseInt(stk.nextToken());
                String dni = stk.nextToken();
                String name = stk.nextToken();
                String apell = stk.nextToken();
                String cel = stk.nextToken();
                String ruc = stk.nextToken();
                String servi = stk.nextToken();
                double precio = Double.parseDouble(stk.nextToken());
                String pago = stk.nextToken();
                String hora = stk.nextToken();
                String fecha = stk.nextToken();
                
                clts.addFinClt(new clientes(servi, ruc, pago,
                        precio, cont, name, apell, 
                        dni, cel, "", hora, fecha));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de grabación -> " + e);
        }
        return clts;
    }
}
// @uthor: {Yb.M};