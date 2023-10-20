package Enlazados;

class NodoE2 {
    int valor;
    Nodo anterior;
    Nodo siguiente;

    public NodoE2(int valor) {
        this.valor = valor;
        this.anterior = null;
        this.siguiente = null;
    }
}

class ListaEnlazadaDoble {
    Nodo inicio;
    Nodo fin;

    public ListaEnlazadaDoble() {
        this.inicio = null;
        this.fin = null;
    }

    public void insertar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (this.inicio == null) {
            this.inicio = nuevoNodo;
            this.fin = nuevoNodo;
        } else {
            this.fin.siguiente = nuevoNodo;
            nuevoNodo.anterior = this.fin;
            this.fin = nuevoNodo;
        }
    }

    public void eliminar(int valor) {
        Nodo nodoActual = this.inicio;

        while (nodoActual != null) {
            if (nodoActual.valor == valor) {
                if (nodoActual.anterior != null) {
                    nodoActual.anterior.siguiente = nodoActual.siguiente;
                } else {
                    this.inicio = nodoActual.siguiente;
                }

                if (nodoActual.siguiente != null) {
                    nodoActual.siguiente.anterior = nodoActual.anterior;
                } else {
                    this.fin = nodoActual.anterior;
                }

                return; // Valor encontrado y eliminado, salimos del método.
            }

            nodoActual = nodoActual.siguiente;
        }
    }

    public void recorrer() {
        Nodo nodoActual = this.inicio;

        while (nodoActual != null) {
            System.out.println(nodoActual.valor);
            nodoActual = nodoActual.siguiente;
        }
    }

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaDoble lista = new ListaEnlazadaDoble();

        lista.insertar(10);
        lista.insertar(20);
        lista.insertar(30);

        System.out.println("Lista original:");
        lista.recorrer();

        lista.eliminar(20);

        System.out.println("Lista después de eliminar el valor 20:");
        lista.recorrer();
        }
    }
}
