import java.util.ArrayList;
import java.util.Scanner;

public class Gestionadorcito {
    public static void main(String[] args) {
        ArrayList<String> tareasPendientes = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Gestión de tareas");
                System.out.println("Por favor elija una opción:");
                System.out.println("1. Agregar tarea");
                System.out.println("2. Marcar tarea como completada");
                System.out.println("3. Ver tareas pendientes o incompletas");

                String opcion = scanner.nextLine();

                switch (opcion) {
                    case "1":
                        System.out.print("Ingresa la nueva tarea: ");
                        String nuevaTarea = scanner.nextLine();
                        tareasPendientes.add(nuevaTarea);
                        System.out.println("Tarea agregada.");
                        break;
                    case "2":
                        System.out.print("Ingrese el índice de la tarea completada: ");
                            int indice = Integer.parseInt(scanner.nextLine());
                            if (indice >= 0 && indice < tareasPendientes.size()) {
                                tareasPendientes.remove(indice);
                                System.out.println("Tarea marcada como completada.");
                            } else {
                                System.out.println("Tarea no encontrada.");
                            }
                        break;
                    case "3":
                    if (tareasPendientes.isEmpty()) {
                        System.out.println("No hay tareas pendientes.");
                    } else {
                        System.out.println("Tareas pendientes:");
                        for (int i = 0; i < tareasPendientes.size(); i++) {
                            System.out.println(i + ": " + tareasPendientes.get(i));
                        }
                    }
                    break;
                    default:
                        System.out.println("Opción incorrecta. Por favor, elija una opción válida.");
                }
            }
        }
    }
}
