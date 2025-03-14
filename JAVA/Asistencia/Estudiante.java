package Asistencia;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private String codigo;

    // Constructor with all parameters
    public Estudiante(int id, String nombre, String apellido, String codigo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }
    
    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
}
