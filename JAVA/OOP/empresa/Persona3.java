package OOP.empresa;

import java.util.Scanner;

public class Persona3 {
    String nombre;
    String apellido1;
    String apellido2;
    String tipoUsuario; // Nuevo atributo para almacenar el tipo de usuario

    public void listaPersonas() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de usuarios: ");
        int cantidadUsuarios = input.nextInt();
        input.nextLine();

        String[] nombres = new String[cantidadUsuarios];
        String[] apellidos1 = new String[cantidadUsuarios];
        String[] apellidos2 = new String[cantidadUsuarios];

        // Agregar un menú para seleccionar el tipo de usuario
        System.out.println("Seleccione el tipo de usuario:");
        System.out.println("1. Administrador");
        System.out.println("2. Jefe de Sucursal");
        System.out.println("3. Cliente");
        System.out.println("4. Mensajero");
        System.out.println("5. Colaborador");
        int opcion = input.nextInt();
        input.nextLine();

        switch (opcion) {
            case 1:
                tipoUsuario = "Administrador";
                break;
            case 2:
                tipoUsuario = "Jefe de Sucursal";
                break;
            case 3:
                tipoUsuario = "Cliente";
                break;
            case 4:
                tipoUsuario = "Mensajero";
                break;
            case 5:
                tipoUsuario = "Colaborador";
                break;
            default:
                tipoUsuario = "Desconocido";
                break;
        }

        for (int i = 0; i < cantidadUsuarios; i++) {
            System.out.println("\nIngrese información del usuario " + (i + 1) + ":");
            System.out.print("Nombre: ");
            nombres[i] = input.nextLine();
            System.out.print("Apellido 1: ");
            apellidos1[i] = input.nextLine();
            System.out.print("Apellido 2: ");
            apellidos2[i] = input.nextLine();
        }

        System.out.println("\nNombres completos de personas:");
        for (int i = 0; i < cantidadUsuarios; i++) {
            System.out.println("Tipo de Usuario: " + tipoUsuario);
            System.out.println("Nombre Completo: " + nombres[i] + " " + apellidos1[i] + " " + apellidos2[i]);
        }
    }
}
