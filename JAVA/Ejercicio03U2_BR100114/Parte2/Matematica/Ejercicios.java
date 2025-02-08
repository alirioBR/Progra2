package Ejercicio03U2_BR100114.Parte2.Matematica;

import Ejercicio03U2_BR100114.Parte2.Matematica.Estadistica;
import Ejercicio03U2_BR100114.Parte2.Matematica.OperacionesMatematicas;
import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = solicitarDato(scanner, 1);
        int numero2 = solicitarDato(scanner, 2);

        OperacionesMatematicas operaciones = new OperacionesMatematicas();

        int suma = operaciones.sumar(numero1, numero2);
        int resta = operaciones.restar(numero1, numero2);
        int multiplicacion = operaciones.multiplicar(numero1, numero2);
        double division = operaciones.dividir(numero1, numero2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);

        System.out.print("Ingrese la cantidad de números para calcular el promedio: ");
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        Estadistica estadistica = new Estadistica(numeros);
        double promedio = estadistica.promedio();

        System.out.println("El promedio de los números ingresados es: " + promedio);

        scanner.close();
    }

    private static int solicitarDato(Scanner scanner, int numero) {
        System.out.print("Ingrese el número " + numero + ": ");
        return scanner.nextInt();
    }
}