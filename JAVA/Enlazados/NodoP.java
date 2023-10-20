package Enlazados;

class NodoP {
    int valor;
    NodoP siguiente;

    public NodoP(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

class ListaEnlazada {
    NodoP inicio;

    public ListaEnlazada() {
        this.inicio = null;
    }

    public void insertar(int valor) {
        NodoP nuevoNodo = new NodoP(valor);
        if (this.inicio == null) {
            this.inicio = nuevoNodo;
        } else {
            NodoP nodoActual = this.inicio;
            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
            }
            nodoActual.siguiente = nuevoNodo;
        }
    }

    public ListaEnlazada revertir() {
        ListaEnlazada listaRevertida = new ListaEnlazada();
        NodoP nodoActual = this.inicio;
        while (nodoActual != null) {
            listaRevertida.insertar(nodoActual.valor);
            nodoActual = nodoActual.siguiente;
        }
        return listaRevertida;
    }

    public boolean esPalindromo() {
        ListaEnlazada listaRevertida = this.revertir();
        NodoP nodoOriginal = this.inicio;
        NodoP nodoRevertido = listaRevertida.inicio;

        while (nodoOriginal != null) {
            if (nodoOriginal.valor != nodoRevertido.valor) {
                return false; // No es un palíndromo
            }
            nodoOriginal = nodoOriginal.siguiente;
            nodoRevertido = nodoRevertido.siguiente;
        }

        return true; // Es un palíndromo
    }
}

public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(2);
        lista.insertar(1);

        if (lista.esPalindromo()) {
            System.out.println("El número es un palíndromo.");
        } else {
            System.out.println("El número no es un palíndromo.");
        }
    }
}
