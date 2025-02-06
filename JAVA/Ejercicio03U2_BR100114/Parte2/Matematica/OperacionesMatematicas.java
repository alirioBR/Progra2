package Ejercicio03U2_BR100114.Parte2.Matematica;

public class OperacionesMatematicas {

    protected int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    protected int restar(int numero1, int numero2) {
        return numero1 - numero2;
    }

    protected int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    protected double dividir(int numero1, int numero2) {
        if (numero2 != 0) {
            return (double) numero1 / numero2;
        } else {
            throw new ArithmeticException("División por cero no permitida");
        }
    }
}