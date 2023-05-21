// @uthor: {Yb.M};
package clases;

// Clase PADRE
public class pdrPersona {
    
    // ATRIBUTOS
    public String name;
    public String apelli;
    public String DNI;
    public String celu;
    public String edad;
    public String hora;
    public String fecha;

    // Método constructor
    public pdrPersona(String name, String apelli, String DNI, String celu, 
            String edad, String hora, String fecha) {
        this.name = name;
        this.apelli = apelli;
        this.DNI = DNI;
        this.celu = celu;
        this.edad = edad;
        this.hora = hora;
        this.fecha = fecha;
    }

}
