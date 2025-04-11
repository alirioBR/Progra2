package Asistencia;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private String codigo;
    private String estado; // Nuevo campo

    public Estudiante(int id, String nombre, String apellido, String codigo, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.estado = estado;
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

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
