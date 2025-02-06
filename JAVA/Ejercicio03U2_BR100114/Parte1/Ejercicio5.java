package Ejercicio03U2_BR100114.Parte1;

public class Ejercicio5 {
    public static void main(String[] args) {
        String[] datos = {"hola", "mundo", "java", "programacion"};

        for (String dato : datos) {
            String datoMayusculas = dato.toUpperCase();
            String datoConEspacios = String.join(" ", datoMayusculas.split(""));
            System.out.println(datoConEspacios);
        }
    }
}