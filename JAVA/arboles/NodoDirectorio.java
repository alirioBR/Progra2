package arboles;

import java.util.List;
import java.util.ArrayList;

class NodoDirectorio {
    String nombre;
    List<NodoDirectorio> subdirectorios;
    List<String> archivos;

    public NodoDirectorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public void agregarSubdirectorio(NodoDirectorio subdirectorio) {
        this.subdirectorios.add(subdirectorio);
    }

    public void agregarArchivo(String nombreArchivo) {
        this.archivos.add(nombreArchivo);
    }

    public void imprimirDirectorio() {
        imprimirDirectorioRecursivo(this, 0);
    }

    private void imprimirDirectorioRecursivo(NodoDirectorio directorio, int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("  "); // Agrega espacios para la indentación
        }
        System.out.println("- " + directorio.nombre + "/");

        for (String archivo : directorio.archivos) {
            for (int i = 0; i < nivel + 1; i++) {
                System.out.print("  ");
            }
            System.out.println(archivo);
        }

        for (NodoDirectorio subdirectorio : directorio.subdirectorios) {
            imprimirDirectorioRecursivo(subdirectorio, nivel + 1);
        }
    }

    public NodoDirectorio buscarDirectorio(String nombreDirectorio) {
        return buscarDirectorioRecursivo(this, nombreDirectorio);
    }

    private NodoDirectorio buscarDirectorioRecursivo(NodoDirectorio directorio, String nombre) {
        if (directorio.nombre.equals(nombre)) {
            return directorio;
        }

        for (NodoDirectorio subdirectorio : directorio.subdirectorios) {
            NodoDirectorio resultado = buscarDirectorioRecursivo(subdirectorio, nombre);
            if (resultado != null) {
                return resultado;
            }
        }

        return null; // No se encontró el directorio
    }
    public static void main(String[] args) {
        NodoDirectorio raiz = new NodoDirectorio("Raiz");

        NodoDirectorio directorio1 = new NodoDirectorio("Directorio1");
        NodoDirectorio directorio2 = new NodoDirectorio("Directorio2");

        raiz.agregarSubdirectorio(directorio1);
        raiz.agregarSubdirectorio(directorio2);

        directorio1.agregarArchivo("Archivo1");
        directorio1.agregarArchivo("Archivo2");
        directorio2.agregarArchivo("Archivo3");
        directorio2.agregarArchivo("Archivo4");
        // Imprime la estructura del árbol
        raiz.imprimirDirectorio();

        // Busca un directorio específico
        String nombreDirectorioBuscado = "Directorio1";
        NodoDirectorio directorioBuscado = raiz.buscarDirectorio(nombreDirectorioBuscado);

        if (directorioBuscado != null) {
            System.out.println("\nSe encontró el directorio '" + nombreDirectorioBuscado + "'.");
        } else {
            System.out.println("\nNo se encontró el directorio '" + nombreDirectorioBuscado + "'.");
        }
    }
}
