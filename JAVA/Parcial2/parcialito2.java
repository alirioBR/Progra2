//Alirio Bailon Rosales BR100114

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class parcialito2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el presupuesto del equipo: ");
        BigDecimal presupuesto = input.nextBigDecimal();
        input.nextLine(); 
        System.out.print("Ingrese la cantidad de miembros del equipo: ");
        int cantidadJugadores = input.nextInt();
        input.nextLine();
        
        String[] nombresJ = new String[cantidadJugadores];
        int[] numeroJ = new int[cantidadJugadores];
        BigDecimal[] salarioJ = new BigDecimal[cantidadJugadores];

        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.println("\nIngrese información del Jugador " + (i + 1) + ":");
            System.out.print("Nombre del jugador: ");
            nombresJ[i] = input.nextLine();
            System.out.print("Número de jugador: ");
            try {
                numeroJ[i] = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido para el dorsal.");
                i--;
                continue;
            }
            System.out.print("Salario anual del jugador: ");
            salarioJ[i] = input.nextBigDecimal();
            input.nextLine();
        }

        for (int i = 0; i < cantidadJugadores - 1; i++) {
            for (int j = 0; j < cantidadJugadores - 1 - i; j++) {
                if (numeroJ[j] < numeroJ[j + 1]) {
                    // Intercambiar información de los jugadores
                    String tempNombre = nombresJ[j];
                    nombresJ[j] = nombresJ[j + 1];
                    nombresJ[j + 1] = tempNombre;

                    int tempDorsal = numeroJ[j];
                    numeroJ[j] = numeroJ[j + 1];
                    numeroJ[j + 1] = tempDorsal;

                    BigDecimal tempSalario = salarioJ[j];
                    salarioJ[j] = salarioJ[j + 1];
                    salarioJ[j + 1] = tempSalario;
                }
            }
        }

        System.out.println("\nLista de jugadores (ordenados por dorsal):");
        DecimalFormat df = new DecimalFormat("#,###.00");
        BigDecimal presupuestoRestante = presupuesto;
        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.println("Dorsal: " + numeroJ[i] + ", Salario: $" + df.format(salarioJ[i]) +
                    ", Nombre: " + nombresJ[i] + ", Salario en letras: " + convertirNumeroALetras(salarioJ[i]));
            presupuestoRestante = presupuestoRestante.subtract(salarioJ[i]);
        }

        System.out.println("\nPresupuesto no utilizado: $" + df.format(presupuestoRestante));
    }
        private static String convertirNumeroALetras(BigDecimal bigDecimal) {
        return null;
    }
        class NumeroALetras {
        private static final String[] unidades = {
        "", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"
        };
        private static final String[] decenas = {
        "", "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta", "noventa"
        };
        private static final String[] especiales = {
        "diez", "once", "doce", "trece", "catorce", "quince", "dieciséis", "diecisiete", "dieciocho", "diecinueve"
        };
        private static final String[] CENTENAS = {
        "", "Cien", "Doscientos", "Trescientos", "Cuatrocientos", "Quinientos", "Seiscientos", "Setecientos", "Ochocientos", "Novecientos"
    };
    
    private static String convertirNumeroALetras(BigDecimal numero) {
        int parteEntera = numero.intValue(); 
        BigDecimal parteDecimal = numero.subtract(new BigDecimal(parteEntera)); 
        String numeroEnLetras = convertirParteEntera(parteEntera);

        if (parteDecimal.compareTo(BigDecimal.ZERO) > 0) {
        }

        return numeroEnLetras;
    }


    private static String convertirParteEntera(int numero) {

        if (numero < 0 || numero > 999999999) {
            return "Número fuera de rango";
        }

        if (numero < 10) {
            return unidades[numero];
        } else if (numero < 20) {
            return "Dieci" + unidades[numero - 10];
        } else if (numero < 100) {
            int unidad = numero % 10;
            int decena = numero / 10;
            if (unidad == 0) {
                return decenas[decena];
            } else {
                return decenas[decena] + " y " + unidades[unidad];
            }
        } else {
            int centena = numero / 100;
            int resto = numero % 100;
            if (resto == 0) {
                return CENTENAS[centena];
            } else {
                return CENTENAS[centena] + " " + convertirParteEntera(resto);
            }
        }
    }
}
}