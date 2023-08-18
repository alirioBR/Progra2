package Lab1;
import java.util.Scanner;

public class factoriales {

    public static void main(String[] args) {
    int n;
    double factorial = 1;
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Introduce un numero entero mayor a 0: ");
        n = sc.nextInt();
    }
		
    {

    while (n < 0);
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
            }
		
        System.out.printf("%d! = %.0f %n", n, factorial);                                                         
        }
    }
}