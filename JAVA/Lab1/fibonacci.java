package Lab1;
import java.util.Scanner;

public class fibonacci {

public static void main(String[] args){ 
try (Scanner sc = new Scanner(System.in)) {
    int numero,termino1,termino2,i;
      
            do{
                System.out.print("Introduce numero mayor que 1: ");
                numero = sc.nextInt();
            }while(numero<=1);
      
            System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");                 
    
            termino1=1;
            termino2=1;
    
            System.out.print(termino1 + " ");
            for(i=2;i<=numero;i++){
                System.out.print(termino2 + " ");
                termino2 = termino1 + termino2;
                termino1 = termino2 - termino1;
            }
}
System.out.println();
    }
}
    