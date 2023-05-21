package clases;

// @uthor: {Yb.M};

public class nodoEmpleante {
    
    // Variable de tipo empleado y nodoEmpleante
    empleados dato;
    nodoEmpleante siguiente;
    nodoEmpleante anterior;
    
    // MÉTODO CONSTRUCTOR
    public nodoEmpleante(empleados dato, nodoEmpleante siguiente, nodoEmpleante anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
    public nodoEmpleante(empleados dato) {
        this(dato, null, null);
    }
    
}
// @uthor: {Yb.M};