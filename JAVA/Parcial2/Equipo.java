import java.text.DecimalFormat;
import java.util.Scanner;

public class Equipo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir el presupuesto inicial
        System.out.print("Ingrese el presupuesto inicial del club: ");
        double presupuestoInicial = input.nextDouble();

        // Arreglos para almacenar información de jugadores
        String[] nombres = new String[22];
        int[] dorsales = new int[22];
        double[] salarios = new double[22];

        // Pedir información de los jugadores
        for (int i = 0; i < 22; i++) {
            System.out.println("\nIngrese información del Jugador " + (i + 1) + ":");
            System.out.print("Nombre del jugador: ");
            nombres[i] = input.next();
            System.out.print("Número de dorsal: ");
            dorsales[i] = input.nextInt();
            System.out.print("Salario neto anual del jugador: ");
            salarios[i] = input.nextDouble();
        }

        // Ordenar jugadores por dorsal usando el método de burbuja
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21 - i; j++) {
                if (dorsales[j] < dorsales[j + 1]) {
                    // Intercambiar información de los jugadores
                    String tempNombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = tempNombre;

                    int tempDorsal = dorsales[j];
                    dorsales[j] = dorsales[j + 1];
                    dorsales[j + 1] = tempDorsal;

                    double tempSalario = salarios[j];
                    salarios[j] = salarios[j + 1];
                    salarios[j + 1] = tempSalario;
                }
            }
        }

        // Imprimir información de los jugadores y calcular el presupuesto restante
        System.out.println("\nLista de jugadores (ordenados por dorsal):");
        DecimalFormat df = new DecimalFormat("#,###.00");
        double presupuestoRestante = presupuestoInicial;
        for (int i = 0; i < 22; i++) {
            System.out.println("Dorsal: " + dorsales[i] + ", Salario: $" + df.format(salarios[i]) +
                    ", Posición: " + nombres[i] + ", Salario en letras: " + convertirSalarioALetras(salarios[i]));
            presupuestoRestante -= salarios[i];
        }

        System.out.println("\nPresupuesto restante: $" + df.format(presupuestoRestante));
    }

    // Método para convertir un salario en números a letras
    public static String convertirSalarioALetras(double salario) {
        // Implementa la lógica de conversión aquí
        // Retorna el salario en letras como una cadena de texto
        return "Implementar lógica de conversión aquí";
    }
}
