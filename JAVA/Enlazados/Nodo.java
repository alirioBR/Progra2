package Enlazados;

class Nodo {
int valor;
Nodo siguiente;
public Nodo anterior;
public Nodo(int valor) {
this.valor = valor;
this.siguiente = null;
}
}
class ListaEnlazada {
Nodo inicio;
Nodo fin;
public ListaEnlazada() {
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
this.fin = nuevoNodo;
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
ListaEnlazada lista = new ListaEnlazada();
lista.insertar(10);
lista.insertar(20);
lista.insertar(30);
lista.recorrer();
}
}
}