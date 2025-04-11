import Dao.EstudianteImp;

public class Estudiante extends EstudianteImp {

    private int id;
    private String carnet;
    private String nombres;
    private String apellidos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
