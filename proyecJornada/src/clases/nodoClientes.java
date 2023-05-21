package clases;

// @uthor: {Yb.M};

public class nodoClientes {

    // Variable de tipo empleado y nodoEmpleante
    clientes dato;
    nodoClientes siguiente;
    nodoClientes anterior;

    // Método Constructor
    public nodoClientes(clientes dato, nodoClientes siguiente, nodoClientes anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }

    public nodoClientes(clientes dato) {
        this(dato, null, null);
    }

}
// @uthor: {Yb.M};