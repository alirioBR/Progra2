package Enlazados;

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
