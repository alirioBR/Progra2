package Ejercicio03U2_BR100114.Parte1;

import java.util.Scanner;

class Operaciones {
    private int numero1;
    private int numero2;

    public Operaciones(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int sumar() {
        return numero1 + numero2;
    }

    public int restar() {
        return numero1 - numero2;
    }

    public int multiplicar() {
        return numero1 * numero2;
    }

    public double dividir() {
        if (numero2 != 0) {
            return (double) numero1 / numero2;
        } else {
            throw new ArithmeticException("División por cero no permitida");
        }
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        Operaciones operaciones = new Operaciones(numero1, numero2);

        System.out.println("Suma: " + operaciones.sumar());
        System.out.println("Resta: " + operaciones.restar());
        System.out.println("Multiplicación: " + operaciones.multiplicar());
        System.out.println("División: " + operaciones.dividir());

        scanner.close();
    }
}