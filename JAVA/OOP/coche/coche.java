package OOP.coche;

public class coche {
    //atributos
    String color;
    String marca;
    int km;
    
    //metodo
    public static void main(String[] args) {
        coche coche1 = new coche();

        coche1.color = "White";
        coche1.marca = "BMW";
        coche1.km = 0;

        System.out.print(coche1.color + " " + coche1.marca + " " + coche1.km);


    }
}

