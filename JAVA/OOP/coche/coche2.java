package OOP.coche;

import java.util.Scanner;

public class coche2 {
    // Atributos
    String color;
    String marca;
    int kilometraje;

    // Método para ingresar información de coches
    public void ingresarInformacion() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de carros: ");
        int cantidadCoches = input.nextInt();
        input.nextLine();

        String[] colores = new String[cantidadCoches];
        String[] marcas = new String[cantidadCoches];
        int[] kilometrajes = new int[cantidadCoches];

        for (int i = 0; i < cantidadCoches; i++) {
            System.out.println("\nIngrese información del carro " + (i + 1) + ":");
            System.out.print("Color del carro: ");
            colores[i] = input.nextLine();
            System.out.print("Marca del carro: ");
            marcas[i] = input.nextLine();
            System.out.print("Kilometraje del carro: ");
            kilometrajes[i] = input.nextInt();
            input.nextLine();
        }

        System.out.println("\nLista de carros:");
        for (int i = 0; i < cantidadCoches; i++) {
            System.out.println(marcas[i] + " " + colores[i] + " " + kilometrajes[i]);
        }
    }

    public static void main(String[] args) {
        coche2 coche = new coche2();
        coche.ingresarInformacion();
    }
}
