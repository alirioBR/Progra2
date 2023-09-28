package Parcial2;
import java.util.Scanner;

public class NumeroATexto {
    private static final String[] UNIDADES = {
        "Cero", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve"
    };

    private static final String[] DECENAS = {
        "", "", "Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta", "Ochenta", "Noventa"
    };

    private static final String[] CENTENAS = {
        "", "Cien", "Doscientos", "Trescientos", "Cuatrocientos", "Quinientos", "Seiscientos", "Setecientos", "Ochocientos", "Novecientos"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero (0-999) para convertirlo a texto: ");
        
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 999) {
                System.out.println(convertirNumeroATexto(numero));
            } else {
                System.out.println("Número fuera de rango.");
            }
        } else {
            System.out.println("Debe ingresar un número entero válido.");
        }
    }

    public static String convertirNumeroATexto(int numero) {
        if (numero < 0 || numero > 999) {
            return "Número fuera de rango";
        }
        if (numero < 10) {
            return UNIDADES[numero];
        } else if (numero < 100) {
            int unidad = numero % 10;
            int decena = numero / 10;
            if (unidad == 0) {
                return DECENAS[decena];
            } else {
                return DECENAS[decena] + " y " + UNIDADES[unidad];
            }
        } else {
            int centena = numero / 100;
            int resto = numero % 100;
            if (resto == 0) {
                return CENTENAS[centena];
            } else {
                return CENTENAS[centena] + " " + convertirNumeroATexto(resto);
            }
        }
    }
}
