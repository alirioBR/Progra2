package Enlazados;

class NodoE {
  int valor;
  Nodo anterior;
  Nodo siguiente;
  
public NodoE(int valor) {
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
    lista.recorrer();
  }
}
}