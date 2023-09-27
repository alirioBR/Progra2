package Practica4;

import java.util.Scanner;

public class binaria {
    // Function to perform binary search on a sorted array
    // Returns the index of the target element if found, or -1 if not found
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is at the middle
            if (arr[mid] == target) {
                return mid;
            }

            // If the target is greater, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // Target not found in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] datos = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner obj = new Scanner(System.in);
        System.out.print("Ingrese el valor a buscar:");
        int objetivo = obj.nextInt();

        int resultado = binarySearch(datos, objetivo);
        if (resultado != -1) {
            System.out.println("Element found at index " + resultado);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
