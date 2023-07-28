import java.util.Scanner;
public class LeaNumeros{
public static void main(String[] args) {
    double num1, num2, num3, num4, promedio, suma;        
    Scanner obj = new Scanner(System.in);

    System.out.print("Valor 1:\t");
    num1 = obj.nextDouble();      

    System.out.print("Valor 2:\t");
    num2 = obj.nextDouble();

    System.out.print("Valor 3:\t");
    num3 = obj.nextDouble();

    System.out.print("Valor 4:\t");
    num4 = obj.nextDouble();      
    
    suma = num1 + num4 ;

    System.out.println("Suma del primero y cuarto: "+suma);

    promedio = ((num1+num2+num3+num4)/4);

    System.out.println("Promedio:\t"+promedio);

    if(num1 % 2 == 0) {
        System.out.println(num1+" es un número par.");
    }else {
        System.out.println(num1+" no es un número par.");
    }
    if(num2 % 2 == 0) {
        System.out.println(num2+" es un número par.");
    }else {
        System.out.println(num2+" no es un número par.");
    }
    if(num3 % 2 == 0) {
        System.out.println(num3+" es un número par.");
    }else {
        System.out.println(num3+" no es un número par.");
    }
    if(num4 % 2 == 0) {
        System.out.println(num4+" es un número par.");
    }else {
        System.out.println(num4+" no es un número par.");
    }
}
 
}
