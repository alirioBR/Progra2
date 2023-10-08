package OOP.empresa;

import java.util.Scanner;

public class Persona {
    String nombre;
    String apellido1;
    String apellido2;
    String tipoUsuario;

    public void listaPersonas() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de usuarios: ");
        int cantidadUsuarios = input.nextInt();
        input.nextLine();

        String[] nombres = new String[cantidadUsuarios];
        String[] apellidos1 = new String[cantidadUsuarios];
        String[] apellidos2 = new String[cantidadUsuarios];

        TipoUsuario tipoUsuarioSelector = new TipoUsuario();
        tipoUsuario = tipoUsuarioSelector.obtenerTipoUsuario();

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
            System.out.println("Nombre Completo: " + nombres[i] + " " + apellidos1[i] + " " + apellidos2[i]+ " " + "Tipo de Usuario: " + tipoUsuario);
        }
    }
}
