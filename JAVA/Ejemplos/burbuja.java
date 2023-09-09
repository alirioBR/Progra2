import java.util.InputMismatchException;
import java.util.Scanner;

public class burbuja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos:");
        int elementos = sc.nextInt();
        int[] nums = new int[elementos];

        try {
            System.out.println("Ingrese elementos:");
            for (int i = 0; i < elementos; i++) {
                nums[i] = sc.nextInt();
            }

            System.out.println("1. Ordenar de forma ascendente");
            System.out.println("2. Ordenar de forma descendente");
            int orden = sc.nextInt();

            switch (orden) {
                case 1:
                    for (int j = 0; j < nums.length - 1; j++) {
                        for (int k = 0; k < nums.length - 1 - j; k++) {
                            if (nums[k] > nums[k + 1]) {
                                int aux = nums[k];
                                nums[k] = nums[k + 1];
                                nums[k + 1] = aux;
                            }
                        }
                    }
                    System.out.println("Lista de elementos ordenados ascendente:");
                        for (var num : nums) {
                        System.out.print(num + "\n");
                        }                    
                    break;
                case 2:
                    for (int j = 0; j < nums.length - 1; j++) {
                        for (int k = j + 1; k < nums.length; k++) {
                            if (nums[j] < nums[k]) {
                                int aux = nums[j];
                                nums[j] = nums[k];
                                nums[k] = aux;
                            }
                        }
                    }
                    System.out.println("Lista de elementos ordenados descendiente:");
                        for (var num : nums) {
                        System.out.print(num + "\n");
                        }
                    break;
                default:
                    System.out.println("Opción no válida");
                    return;
            }
            System.out.println();
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número entero.");
        }
    }
}