package OOP.empresa;

import java.util.Scanner;

public class TipoUsuario {
    public static String obtenerTipoUsuario() {
        Scanner input = new Scanner(System.in);
        System.out.println("Seleccione el tipo de usuario:");
        System.out.println("1. Administrador");
        System.out.println("2. Jefe de Sucursal");
        System.out.println("3. Cliente");
        System.out.println("4. Mensajero");
        System.out.println("5. Colaborador");

        int opcion = input.nextInt();
        input.nextLine();

        switch (opcion) {
            case 1:
                return "Administrador";
            case 2:
                return "Jefe de Sucursal";
            case 3:
                return "Cliente";
            case 4:
                return "Mensajero";
            case 5:
                return "Colaborador";
            default:
                return "Desconocido";
        }
    }

    public static Administrador obtenerAdministrador() {
        return new Administrador();
    }

    public static JefeSucursal obtenerJefeSucursal() {
        return new JefeSucursal();
    }

    public static Cliente obtenerCliente() {
        return new Cliente();
    }

    public static Mensajero obtenerMensajero() {
        return new Mensajero();
    }

    public static Colaborador obtenerColaborador() {
        return new Colaborador();
    }
}

    public static class Administrador extends Usuario {
        public Administrador() {
            // Constructor vacío
        }
    
        // Métodos específicos para el administrador
        public void crearUsuario() {
            // Implementación para crear usuarios
        }
    
        public void modificarEstatusEnvios() {
            // Implementación para modificar estatus de envíos
        }
    
        public void modificarLiquidaciones() {
            // Implementación para modificar liquidaciones
        }
    
        // Otros métodos específicos para el administrador
    }

    public static class JefeSucursal extends Usuario {
        public JefeSucursal() {
            // Constructor vacío
        }
    
        // Métodos específicos para el jefe de sucursal
        public void agregarEnvio() {
            // Implementación para agregar envíos
        }
    
        public void revisarEstadoPedidos() {
            // Implementación para revisar estados de pedidos
        }
    
        public void generarReporteFacturacion() {
            // Implementación para generar reportes de facturación
        }
    
        public void generarOrdenTraslado() {
            // Implementación para generar órdenes de traslado
        }
    
        // Otros métodos específicos para el jefe de sucursal
    }

    public static class Cliente extends Usuario {
        private int codigoCliente;
        private int tipoCliente;
    
        public Cliente() {
            // Constructor vacío
        }
    
        // Getters y setters para codigoCliente y tipoCliente
    
        // Métodos específicos para el cliente
        public void marcarPaqueteEntregado() {
            // Implementación para marcar paquetes como entregados
        }
    
        // Otros métodos específicos para el cliente
    }

    public static class Mensajero extends Usuario {
        public Mensajero() {
            // Constructor vacío
        }
    
        // Métodos específicos para el mensajero
        public void agregarEnvio() {
            // Implementación para agregar envíos sin modificarlos
        }
    
        public void marcarPaqueteEntregadoConPago() {
            // Implementación para marcar paquetes como entregados con la forma de pago
        }
    
        // Otros métodos específicos para el mensajero
    }

    public static class Colaborador extends Usuario {
        private int codigoTrabajador;
        private String labor;
        private String sucursalAsignada;
        private double sueldo;
        private double descuentos;
        private double adelantosSalariales;
        private String direccionCasa;
        private String informacionContactos;
        private String fechaInicio;
        private String fechaFinalizacion;
        private String periodosVacaciones;
    
        public Colaborador() {
            // Constructor vacío
        }
    
        // Getters y setters para los atributos
    
        // Métodos específicos para el colaborador
        public void crearUsuarioColaborador() {
            // Implementación para crear usuarios de colaboradores
        }
    
        // Otros métodos específicos para el colaborador
    }
}
