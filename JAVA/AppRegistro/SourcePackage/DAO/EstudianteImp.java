package Dao;

import Modelos.Estudiante;
import java.util.ArrayList;
import java.util.List;

public class EstudianteImp implements IEstudiante {

    private static final List<Estudiante> lstEstudiante = new ArrayList<>();

    @Override
    public void guardar(Estudiante estudiante) {
        lstEstudiante.add(estudiante);
    }

    @Override
    public List<Estudiante> recuperarEstudiantes() {
        return lstEstudiante;
    }
}

@Override
public Estudiante recuperarUnEstudiante(String carnet) {
    for (Estudiante estudiante : lstEstudiante) {
        if (estudiante.getCarnet().equals(carnet)) {
            return estudiante;
        }
    }
    return null;
}

@Override
public void modificar(Estudiante estudiante) {
    int id = -1;
    for (int i = 0; i < lstEstudiante.size(); i++) {
        if (lstEstudiante.get(i).getCarnet().equals(estudiante.getCarnet())) {
            id = i;
            break;
        }
    }
    if (id != -1) {
        lstEstudiante.set(id, estudiante);
    }
}
@Override
public void eliminar(String carnet) {
    int id = -1;
    for (int i = 0; i < lstEstudiante.size(); i++) {
        if (lstEstudiante.get(i).getCarnet().equals(carnet)) {
            id = i;
            break;
        }
    }
    lstEstudiante.remove(id);
}
