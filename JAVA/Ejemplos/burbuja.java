import java.util.InputMismatchException;
import java.util.Scanner;

public class burbuja{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int aux = 0;
    boolean orden= true;
    System.out.println("ingrese la cantidad de elementos:");
    int elementos = sc.nextInt();
    System.out.println("Ordenar de forma ascendente SI/NO?:");
    boolean orden = sc.nextBoolean();
  
    if(orden)
        try {
        int nums[] = new int[elementos];
        System.out.println("ingrese elementos:");
            for(int i=0;i<elementos;i++){
            nums[i] = sc.nextInt();
}
    for(int j=0;j<elementos-1;j++){
        for(int k=0;k<elementos-1;k++){
            if(nums[k] > nums[k+1]){
                aux = nums[k];
                nums[k] = nums[k+1];
                nums[k+1] = aux;
            }
            }
            }

    System.out.println("Lista de elementos ordenados: "); 
        for(var i=0; i<elementos; i++) 
        {System.out.println(nums[i]);}
    }
    else{
        System.out.println("Lista de elementos ordenados: "); 
        for(var i=0; i>elementos; i++) 
        {System.out.println(nums[i]);}


    }
    catch (InputMismatchException ex) {
        System.out.println("Debe ingresar obligatoriamente un número entero.");
        }

        
    }
}
