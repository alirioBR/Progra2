public interface IEstudiante {

    public void guardar(Estudiante estudiante);

    public List<Estudiante> recuperarEstudiantes();

    public Estudiante recuperarUnEstudiante(String carnet);

    public void modificar(Estudiante estudiante);

    public void eliminar(String carnet);
}
