// @uthor: {Yb.M};
package clases;

// IMPORTAMOS LA CLASE A USAR
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class listaCliente {

    // Declara las variables de Inicio y Fin
    nodoClientes inicio;
    nodoClientes fin;

    public listaCliente() {
        this.inicio = null;
        this.fin = null;
    }

    // Método para indicar que la listaEmpleado está vacia
    public boolean estaVacioClt() {
        return this.inicio == null;
    }

    // Método para agregar los datos al inicio de la listaEmpleado
    public void agregarInicioClt(clientes datos) {

        if (!estaVacioClt()) {
            inicio.anterior = new nodoClientes(datos, inicio, null);
            inicio = inicio.anterior;
        } else {
            inicio = fin = new nodoClientes(datos);
        }
    }

    // Función para editar un usuario
    public void editarClt(String dni, clientes clts) {

        if (!estaVacioClt()) {
            nodoClientes aux = inicio;

            while (aux != null) {

                // Condicional para identificar si hay un dato igual en la listaEmpleado
                if (dni.equals(aux.dato.DNI)) {
                    aux.dato = clts;
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
    public void deleteClt(String DNI) {
        if (!estaVacioClt()) {
            nodoClientes aux = inicio;
            nodoClientes auxTemp = inicio.siguiente;

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

        } else {
            JOptionPane.showMessageDialog(null, "No hay datos");
        }
    }

    // Método para obtener el tamaño de la listaEmpleado
    public int size() {
        nodoClientes aux = inicio;
        int iterador = 0;

        while (aux != null) {
            iterador++;
            aux = aux.siguiente;
        }
        return iterador;
    }

    // Método para obtener de una listaEmpleado al empleado por su índice
    public clientes get(int indice) {
        nodoClientes aux = inicio;
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
    public void MostrarListaIniFinClt() {

        if (!estaVacioClt()) {
            nodoClientes aux = inicio;

            while (aux != null) {
                aux = aux.siguiente;
            }
        }

    }

    // Función para añadir los datos al final
    public void addFinClt(clientes dato) {

        if (!estaVacioClt()) {
            fin.siguiente = new nodoClientes(dato, null, fin);
            fin = fin.siguiente;
        } else {
            inicio = fin = new nodoClientes(dato);
        }
    }

    // Función para que recorra la listaEmpleado desde el último al primero
    public void mostrarListFinIniClt() {

        if (!estaVacioClt()) {
            nodoClientes aux = fin;

            while (aux != null) {
                aux = aux.siguiente;
            }
        }
    }

    // Función para buscar y traer los datos
    public ArrayList<clientes> buscar(String dni) {
        ArrayList<clientes> dtsEncontrados = new ArrayList<>();
        if (!estaVacioClt()) {
            nodoClientes aux = inicio;

            while (aux != null) {
                if (aux.dato.DNI.equals(dni)) {
                    dtsEncontrados.add(aux.dato);
                }
                aux = aux.siguiente;
            }

        }
        return dtsEncontrados;
    }
}
// @uthor: {Yb.M};
