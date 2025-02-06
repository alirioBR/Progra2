package Ejercicio03U2_BR100114.Parte1;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] datos = {100,200,150,45,50,5,40,4,25};

        int suma = 0;
        for (int dato : datos) {
            suma += dato;
        }

        double promedio = (double) suma / datos.length;

        System.out.println("La suma de todos los valores es: " + suma);
        System.out.println("El promedio de todos los valores es: " + promedio);
    }
}