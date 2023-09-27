import java.util.Scanner;
import javax.swing.JOptionPane;

public class menu {
    public static void main(String[] args) {
        double[] itemPrices = {
            3, 3, 3, 3, 7, 7, 7, 1.50, 1.50, 2, 3, 3, 3, 3
        };

        String[] itemNames = {
            "Ensalada", "Papitas", "Aros de cebolla", "Choripanes",
            "Puyaso", "Pollo", "Paella", "Agua", "Soda", "Refreso",
            "Cerveza", "Tres leches", "Flan", "Donas"
        };

        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Ingrese numero de mesa:");
            int mesa = obj.nextInt();

            System.out.print("Ingrese numero personas en la mesa:");
            int personas = obj.nextInt();

            System.out.println("Este es nuestro menu:");

            for (int i = 0; i < itemNames.length; i++) {
                System.out.println((i + 1) + ". " + itemNames[i] + " $" + itemPrices[i]);
            }

            double total = 0;

            // Arrays to store user selections
            int[] selections = new int[itemPrices.length];

            for (int i = 0; i < itemNames.length; i++) {
                System.out.print("Seleccione cantidad de " + itemNames[i] + ": ");
                int quantity = obj.nextInt();

                // Update the selections array
                selections[i] = quantity;

                // Calculate the cost for the selected items
                total += itemPrices[i] * quantity;
            }

            System.out.println("Su pedido es:");

            for (int i = 0; i < itemNames.length; i++) {
                if (selections[i] > 0) {
                    System.out.println(itemNames[i] + ": " + selections[i]);
                }
            }

            System.out.println("Total: $" + total);

            System.out.print("Desea dar propina (yes/no)?: ");
            String tipInput = obj.next();

            if (tipInput.equalsIgnoreCase("yes") || tipInput.equalsIgnoreCase("y")) {
                System.out.println("Su total es: $" + (total + (total * 0.15)));
            } else {
                System.out.println("Su total es: $" + total);
            }
        }
    }
}
