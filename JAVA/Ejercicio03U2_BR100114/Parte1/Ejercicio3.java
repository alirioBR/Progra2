package Ejercicio03U2_BR100114.Parte1;

import java.util.Scanner;

public class Ejercicio3 {
    // Pide datos y muestra cuantas letras tiene cada uno.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese su dirección: ");
        String direccion = scanner.nextLine();

        System.out.println("Sus nombres tienen: " + nombre.length() + " Caracteres");
        System.out.println("Sus apellidos tienen: " + apellido.length() + " Caracteres");
        System.out.println("Su dirección tiene: " + direccion.length() + " Caracteres");

        scanner.close();
    }
}