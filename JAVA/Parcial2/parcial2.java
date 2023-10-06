import java.text.DecimalFormat;
import java.util.Scanner;

public class parcial2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Se le pide al usuario que ingrese el presupuesto del equipo y que tan grande es el equipo
        System.out.print("Ingrese el presupuesto del equipo: ");
        double presupuesto = input.nextDouble();
        input.nextLine(); 
        System.out.print("Ingrese la cantidad de miembros del equipo: ");
        int cantidadJugadores = input.nextInt();
        input.nextLine();
        
        //Se crean las listas que contendran el nombre, numero y salario de los jugadores del equipo
        String[] nombresJ = new String[cantidadJugadores];
        int[] numeroJ = new int[cantidadJugadores];
        double[] salarioJ = new double[cantidadJugadores];

        //Le pedimos los datos a los usuarios
        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.println("\nIngrese información del Jugador " + (i + 1) + ":");
            System.out.print("Nombre del jugador: ");
            nombresJ[i] = input.nextLine();
            System.out.print("Número de jugador: ");
            try {
                numeroJ[i] = Integer.parseInt(input.nextLine()); // Convertir a entero
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido para el dorsal.");
                i--; // Volver a solicitar los datos para el mismo jugador
                continue;
            }
            System.out.print("Salario anual del jugador: ");
            salarioJ[i] = input.nextDouble();
            input.nextLine();
        }

        // Ordenar jugadores de manera descendente basado en el numero de dorsal
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

                    double tempSalario = salarioJ[j];
                    salarioJ[j] = salarioJ[j + 1];
                    salarioJ[j + 1] = tempSalario;
                }
            }
        }

        // Imprimir información de los jugadores y calcular el presupuesto restante
        System.out.println("\nLista de jugadores (ordenados por dorsal):");
        DecimalFormat df = new DecimalFormat("#,###.00");
        double presupuestoRestante = presupuesto;
        for (int i = 0; i < cantidadJugadores; i++) {
            System.out.println("Dorsal: " + numeroJ[i] + ", Salario: $" + df.format(salarioJ[i]) +
                    ", Nombre: " + nombresJ[i] + ", Salario en letras: " + NumeroALetras.convertirNumeroALetras(salarioJ[i]));
            presupuestoRestante -= salarioJ[i];
        }

        System.out.println("\nPresupuesto no utilizado: $" + df.format(presupuestoRestante));
    }
}
    //conversion de numeros a texto de los salarios
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


    public static String convertirNumeroALetras(double numero) {
        int parteEntera = (int) numero;
        int parteDecimal = (int) ((numero - parteEntera) * 999999999);

        String numeroEnLetras = convertirParteEntera(parteEntera);

        if (parteDecimal > 0) {
            numeroEnLetras += " con " + convertirParteEntera(parteDecimal) + " centavos";
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