// @uthor: {Yb.M};
package clases;

// Extends para la clase padre para que pueda sus atributos
public class clientes extends pdrPersona {

    // VARIABLES PARA REGISTRAR A LOS CLIENTES
    public String tipServ;
    public String ruc;
    public String medioPago;
    public double precio;
    public int cont;

    // MÉTODO CONSTRUCTOR
    public clientes(String tipServ, String ruc, String medioPago, double precio, int cont, String name, String apelli, String DNI, String celu, String edad, String hora, String fecha) {
        super(name, apelli, DNI, celu, edad, hora, fecha);
        this.tipServ = tipServ;
        this.ruc = ruc;
        this.medioPago = medioPago;
        this.precio = precio;
        this.cont = cont;
    }

    // Método para calcular el costo de cada servicio
    public double precioNeto() {
        precio = 0;
        switch (tipServ) {
            case "Publicidad" ->
                precio = 100;
            case "Ordenanza" ->
                precio = 150;
            case "Petitorio" ->
                precio = 80;
            case "Nota Informativa" ->
                precio = 100;
            case "Cintillo Publicitario" ->
                precio = 200;
            case "Cintillo de Impresión" ->
                precio = 160;
        }
        return precio;
    }
}
// @uthor: {Yb.M};
