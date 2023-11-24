package arboles;

import java.util.ArrayList;
import java.util.List;

class NodoEmpleado {
    String nombre;
    String cargo;
    List<NodoEmpleado> subordinados;

    public NodoEmpleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.subordinados = new ArrayList<>();
    }

    public void agregarSubordinado(NodoEmpleado subordinado) {
        this.subordinados.add(subordinado);
    }

    public void imprimirJerarquia() {
        imprimirJerarquiaRecursivo(this, 0);
    }

    private void imprimirJerarquiaRecursivo(NodoEmpleado empleado, int nivel) {
        for (int i = 0; i < nivel; i++) {
            System.out.print("  ");
        }
        System.out.println("- " + empleado.nombre + " (" + empleado.cargo + ")");

        for (NodoEmpleado subordinado : empleado.subordinados) {
            imprimirJerarquiaRecursivo(subordinado, nivel + 1);
        }
    }
}

class ArbolOrganizacion {
    NodoEmpleado ceo;

    public ArbolOrganizacion(String nombreCEO, String cargoCEO) {
        this.ceo = new NodoEmpleado(nombreCEO, cargoCEO);
    }

    public void imprimirJerarquiaCompleta() {
        System.out.println("Jerarquía completa de la organización:");
        ceo.imprimirJerarquia();
    }

    public static void main(String[] args) {
        ArbolOrganizacion arbol = new ArbolOrganizacion("John Doe", "CEO");

        // Agregar empleados
        NodoEmpleado cto = new NodoEmpleado("Jane Smith", "CTO");
        NodoEmpleado cfo = new NodoEmpleado("Bob Johnson", "CFO");

        arbol.ceo.agregarSubordinado(cto);
        arbol.ceo.agregarSubordinado(cfo);

        // Agregar subordinados a los empleados existentes
        NodoEmpleado gerenteProyecto = new NodoEmpleado("Alice Williams", "Gerente de Proyecto");
        cto.agregarSubordinado(gerenteProyecto);

        NodoEmpleado contadorPrincipal = new NodoEmpleado("Charlie Davis", "Contador Principal");
        cfo.agregarSubordinado(contadorPrincipal);

        // Imprimir la jerarquía completa
        arbol.imprimirJerarquiaCompleta();
    }
}
