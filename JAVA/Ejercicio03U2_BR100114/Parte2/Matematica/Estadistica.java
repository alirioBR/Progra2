package Ejercicio03U2_BR100114.Parte2.Matematica;

public class Estadistica {
    private int[] datos;

    public Estadistica(int[] datos) {
        this.datos = datos;
    }

    public double promedio() {
        int suma = 0;
        for (int dato : datos) {
            suma += dato;
        }
        return (double) suma / datos.length;
    }
}