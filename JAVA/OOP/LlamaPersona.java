package OOP;

public class LlamaPersona {
    public static void main(String[] args) {
        Persona p = new Persona();

        p.inicializar("Alirio", "Bailon", "Rosales", 29);
        String nombre2 = p.nombreCompleto();
        if (p.esMayorEdad()) {
            System.out.println(nombre2 + " es mayor de edad");
        } else {
            System.out.println(nombre2 + " no es mayor de edad");
        }
    }
}
