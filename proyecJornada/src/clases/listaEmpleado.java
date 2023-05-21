// @uthor: {Yb.M};
package clases;

// IMPORTAMOS LA CLASE A USAR
import javax.swing.JOptionPane;

public class listaEmpleado {

    // Declara las variables de Inicio y Fin
    nodoEmpleante inicio;
    nodoEmpleante fin;

    public listaEmpleado() {
        this.inicio = null;
        this.fin = null;
    }

    // Método para indicar que la listaEmpleado está vacia
    public boolean estaVacio() {

        return this.inicio == null;
    }

    // Método para agregar los datos al inicio de la listaEmpleado
    public void agregarInicio(empleados dato) {

        if (!estaVacio()) {
            inicio.anterior = new nodoEmpleante(dato, inicio, null);
            inicio = inicio.anterior;

        } else {
            inicio = fin = new nodoEmpleante(dato);
        }
    }

    // Función para editar un usuario
    public void editarUser(String dni, empleados emp) {

        if (!estaVacio()) {
            nodoEmpleante aux = inicio;

            while (aux != null) {

                // Condicional para identificar si hay un dato igual en la listaEmpleado
                if (dni.equals(aux.dato.DNI)) {
                    aux.dato = emp;
                    break;
                }

                // Si no, seguirá pasando al siguiente dato de la listaEmpleado
                aux = aux.siguiente;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos");
        }

    }

    // Función para eliminar un usuario
    public void deleteUser(String DNI) {
        if (!estaVacio()) {
            if (inicio.dato.DNI.equals(DNI)) {
                inicio = inicio.siguiente;
            } else if (fin.dato.DNI.equals(DNI)) {
                fin = fin.anterior;
                fin.siguiente = null;
            } else {
                nodoEmpleante aux = inicio;
                nodoEmpleante auxTemp = inicio.siguiente;

                while (auxTemp != null) {
                    if (DNI.equals(auxTemp.dato.DNI)) {
                        break;
                    }
                    aux = aux.siguiente;
                    auxTemp = auxTemp.siguiente;
                }

                if (auxTemp != null) {
                    aux.siguiente = auxTemp.siguiente;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay datos");
        }

    }

    // Método para obtener el tamaño de la listaEmpleado
    public int size() {
        nodoEmpleante aux = inicio;
        int iterador = 0;

        while (aux != null) {
            iterador++;
            aux = aux.siguiente;
        }
        return iterador;
    }

    // Método para obtener de una listaEmpleado al empleado por su índice
    public empleados get(int indice) {
        nodoEmpleante aux = inicio;
        int iterador = 0;

        while (aux != null) {
            if (iterador == indice) {
                return aux.dato;
            }
            iterador++;
            aux = aux.siguiente;
        }

        return null;
    }

    // Función para que recorra la listaEmpleado desde el primero a último
    public void MostrarListaIniFin() {

        if (!estaVacio()) {
            nodoEmpleante aux = inicio;

            while (aux != null) {
                aux = aux.siguiente;
            }
        }

    }

    // Función para añadir los datos al final
    public void addFin(empleados dato) {

        if (!estaVacio()) {
            fin.siguiente = new nodoEmpleante(dato, null, fin);
            fin = fin.siguiente;
        } else {
            inicio = fin = new nodoEmpleante(dato);
        }
    }

    // Función para que recorra la listaEmpleado desde el último al primero
    public void mostrarListFinIni() {
        if (!estaVacio()) {
            nodoEmpleante aux = fin;

            while (aux != null) {
                aux = aux.anterior;
            }
        }
    }

}
// @uthor: {Yb.M};
