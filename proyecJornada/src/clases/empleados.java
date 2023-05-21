 // @uthor: {Yb.M};
package clases;

// Extends para la clase padre para que pueda sus atributos
public class empleados extends pdrPersona {

    // VARIABLES PARA REGISTRAR A LOS EMPLEADOS
    public String cargo;
    public String user;
    public String pass;
    public double sueldo = 0;
    public String rol;
    
    // MÉTODO CONSTRUCTOR
    public empleados(String cargo, String user, String pass, double sueldo,
            String rol, String name, String apelli, String DNI, String celu,
            String edad, String hora, String fecha) {

        super(name, apelli, DNI, celu, edad, hora, fecha);
        this.cargo = cargo;
        this.user = user;
        this.pass = pass;
        this.sueldo = sueldo;
        this.rol = rol;
    }
}
// @uthor: {Yb.M};