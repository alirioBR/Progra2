package Parcial2;
import java.util.Scanner;

public class NumeroATexto1 {
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
        System.out.print("Ingrese un número entero para convertirlo a texto: ");

        if (scanner.hasNext()) {
            String entrada = scanner.nextLine();
            try {
                int numero = Integer.parseInt(entrada);
                System.out.println(convertirNumeroATexto(numero));
            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar un número entero válido.");
            }
        }
    }

    public static String convertirNumeroATexto(int numero) {
        if (numero < 0 || numero > 999999999) {
            return "Número fuera de rango";
        }

        if (numero < 10) {
            return UNIDADES[numero];
        } else if (numero < 20) {
            return "Dieci" + UNIDADES[numero - 10];
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