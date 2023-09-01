import java.util.Scanner;
import javax.swing.JOptionPane;

public class menu{

public static void main(String[] args) {
    double totalsin, totalcon, mesa, personas, cliente;
    double Ensalada, Papitas, Aros_de_cebolla, Choripanes, Puyaso, Pollo, Paella, Agua, Soda, Refreso, Cerveza,Tres_leches,Flan, Donas;

Ensalada = 3;
Papitas=3;
Aros_de_cebolla= 3;
Choripanes=3;
Puyaso = 7;
Pollo =7;
Paella = 7;
Agua= 1.50;
Soda=1.50;
Refreso=2;
Cerveza=3;
Tres_leches=3;
Flan=3;
Donas=3;

    try (Scanner obj = new Scanner(System.in)) {
        System.out.print("Ingrese numero de mesa:");
        mesa = obj.nextDouble();
        System.out.print("Ingrese numero personas en la mesa:");
        personas = obj.nextDouble();
        System.out.print("Este es nuestro menu:\n");
        System.out.print("Entradas:\n");
        System.out.print("Ensalada " + Ensalada + "\n");
        System.out.print("Papitas " + Papitas + "\n");
        System.out.print("Aros de cebolla " + Aros_de_cebolla + "\n");
        System.out.print("Choripanes " + Choripanes + "\n");
        int Entradas = obj.nextInt();
        System.out.print("Plato Fuerte:\n");
        System.out.print("Puyaso " + Puyaso + "\n");
        System.out.print("Pollo " + Pollo + "\n");
        System.out.print("Paella " + Paella + "\n");
        int Plato_Fuerte =obj.nextInt();
        System.out.print("Bebidas:\n");
        System.out.print("Agua " + Agua + "\n");
        System.out.print("Soda " + Soda + "\n");
        System.out.print("Refreso " + Refreso + "\n");
        System.out.print("Cerveza " + Cerveza + "\n");
        int Bebidas = obj.nextInt();
        System.out.print("Postre:\n");
        System.out.print("Tres leches " + Tres_leches + "\n");
        System.out.print("Flan " + Flan + "\n");
        System.out.print("Donas " + Donas + "\n");
        int Postre = obj.nextInt();
        {
        switch (Entradas){
            case 1:
            case 2:
            case 3:
            case 4:
                break;
        }
        switch (Plato_Fuerte){
            case 1:
            case 2:
            case 3:
                break;
        }
        switch (Bebidas){
            case 1:
            case 2:
            case 3:
            case 4:
                break;
        }      
        switch(Postre){
            case 1:
            case 2:
            case 3:
                break;
        }
        System.out.println("Su pedido es: "  );
}
        
        totalsin = 10;
        totalcon = (totalsin * 0.15);
        double total = (totalcon + totalsin);

        System.out.println("Desea dar propina?");
        var propina = obj.nextBoolean();

            if(propina)
            System.out.print("Su total es: " + totalsin);
            else
            System.out.print("Su total es: " + total );
    }

}
}
