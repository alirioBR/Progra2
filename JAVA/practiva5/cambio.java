package practiva5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cambio {
    public static void main(String[] args) {
        double[] itemPrices = { 3, 3, 3, 3, 7, 7, 7, 1.50, 1.50, 2, 3, 3, 3, 3 };
        String[] itemNames = {
            "Ensalada", "Papitas", "Aros de cebolla", "Choripanes",
            "Puyaso", "Pollo", "Paella", "Agua", "Soda", "Refreso",
            "Cerveza", "Tres leches", "Flan", "Donas"
        };

        try (Scanner obj = new Scanner(System.in)) {
            List<ClientOrder> orders = new ArrayList<>();

            System.out.print("Ingrese numero de mesa:");
            int table = obj.nextInt();

            System.out.println("Este es nuestro menu:");

            for (int i = 0; i < itemNames.length; i++) {
                System.out.println((i + 1) + ". " + itemNames[i] + " $" + itemPrices[i]);
            }

            while (true) {
                System.out.println("Nueva orden para cliente en la mesa " + table + ":");
                ClientOrder clientOrder = new ClientOrder();

                for (int i = 0; i < itemNames.length; i++) {
                    System.out.print("Seleccione cantidad de " + itemNames[i] + ": ");
                    int quantity = obj.nextInt();
                    clientOrder.addOrder(itemNames[i], itemPrices[i], quantity);
                }

                orders.add(clientOrder);

                System.out.print("¿Agregar otra orden para esta mesa? (yes/no): ");
                String anotherOrder = obj.next();
                if (!anotherOrder.equalsIgnoreCase("yes") && !anotherOrder.equalsIgnoreCase("y")) {
                    break;
                }
            }

            System.out.print("¿Desea dar propina (yes/no)?: ");
            String tipInput = obj.next();

            double total = 0;

            for (int i = 0; i < orders.size(); i++) {
                ClientOrder clientOrder = orders.get(i);
                total += clientOrder.calculateTotal();
            }

            if (tipInput.equalsIgnoreCase("yes") || tipInput.equalsIgnoreCase("y")) {
                double tipAmount = total * 0.15;
                total += tipAmount;
                System.out.println("Propina del 15% agregada. Su total es: $" + total);
            } else {
                System.out.println("Su total es: $" + total);
            }

            // Calculate and display change
            System.out.print("Ingrese la cantidad pagada por el cliente: $");
            double amountPaid = obj.nextDouble();
            double change = amountPaid - total;
            System.out.println("Cambio para el cliente: $" + change);

            // Calculate and display change denominations
            calculateAndDisplayChangeDenominations(change);
        }
    }

    // Method to calculate and display change denominations
    public static void calculateAndDisplayChangeDenominations(double change) {
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
                System.out.println( "Monedas de " + coinDenomination +" centavos dar: " + count);
                remainingChangeInCents -= count * coinDenomination;
            }
        }
    }
}

class ClientOrder {
    private List<OrderItem> orderItems = new ArrayList<>();

    public void addOrder(String itemName, double itemPrice, int quantity) {
        orderItems.add(new OrderItem(itemName, itemPrice, quantity));
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : orderItems) {
            total += item.calculateItemTotal();
        }
        return total;
    }
}

class OrderItem {
    private String itemName;
    private double itemPrice;
    private int quantity;

    public OrderItem(String itemName, double itemPrice, int quantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public double calculateItemTotal() {
        return itemPrice * quantity;
    }
}