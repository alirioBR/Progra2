package OOP;

public class Persona2 {

    private String nombre;
    private String apellido1;
    private String apellido2;

    public void inicializar(String n, String a1, String a2, int e) {
        nombre = n;
        apellido1 = a1;
        apellido2 = a2;
    }

    public String nombreCompleto() {
        return nombre + " " + apellido1 + " " + apellido2;
    }
    }

