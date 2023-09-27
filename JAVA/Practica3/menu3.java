import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// menu final 
public class menu3 {
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
            int mesa = obj.nextInt();

            System.out.println("Este es nuestro menu:");

            for (int i = 0; i < itemNames.length; i++) {
                System.out.println((i + 1) + ". " + itemNames[i] + " $" + itemPrices[i]);
            }

            while (true) {
                System.out.println("Nueva orden para cliente en la mesa " + mesa + ":");
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
