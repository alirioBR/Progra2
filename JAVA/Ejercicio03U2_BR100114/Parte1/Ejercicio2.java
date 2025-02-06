package Ejercicio03U2_BR100114.Parte1;

public class Ejercicio2 {
    public static void main(String[] args) {
        //conversion entre datos

        byte Numero1;
        short Numero2;
        int Numero3;
        long Numero4;
        float Numero5;
        double Numero6;


        Numero6 = 1994.0;
        Numero5 = (float) Numero6;
        Numero4 = (long) Numero5;
        Numero3 = (int) Numero4;
        Numero2 = (short) Numero3;
        Numero1 = (byte) Numero2;

        System.out.println("Resultado:  " + Numero1);
        System.out.println("Resultado:  " + Numero2);
        System.out.println("Resultado:  " + Numero3);
        System.out.println("Resultado:  " + Numero4);
        System.out.println("Resultado:  " + Numero5);
        System.out.println("Resultado:  " + Numero6);
        
    }
}