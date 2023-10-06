package Parcial2;
import java.util.Scanner;

public class cambioSolo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Ingrese total del cliente: $");
        double total = obj.nextDouble();
        System.out.print("Ingrese la cantidad pagada por el cliente: $");
        double amountPaid = obj.nextDouble();
        double change = amountPaid - total;
        System.out.println("Cambio para el cliente: $" + change);

        // Calculate and display change denominations
        calcularYSabercambio(change);
    }

    // Method to calculate and display change denominations
    public static void calcularYSabercambio(double change) {
        int[] denominations = { 100, 50, 20, 10, 5, 1 };
        double remainingChange = change;

        System.out.println("Desglose del cambio:");
        for (int denomination : denominations) {
            if (remainingChange >= denomination) {
                int count = (int) (remainingChange / denomination);
                System.out.println("Billetes de $" + denomination + " dar: " + count);
                remainingChange -= count * denomination;
            }
        }

        int remainingChangeInCents = (int) (remainingChange * 100);
        int[] coinDenominations = { 25, 10, 5, 1 };

        for (int coinDenomination : coinDenominations) {
            if (remainingChangeInCents >= coinDenomination) {
                int count = remainingChangeInCents / coinDenomination;
                System.out.println("Monedas de " + coinDenomination + " centavos dar: " + count);
                remainingChangeInCents -= count * coinDenomination;
            }
        }
    }
}
