

import java.util.LinkedList;

public class Almacencito {
    public static void main(String[] args) {
        LinkedList<Producto> almacen = new LinkedList<>();

        // compra de productos que vencen en Junio 
        agregarProductos(almacen, 100, "Junio 2023");

        // compra de productos que vencen en Julio 
        agregarProductos(almacen,50, "Julio 2023");

        // Venta de 120 productos en la semana del 3 de Mayo
        venderProductos(almacen, 120);
        
        // Imprimimos la cantidad que queda en nuestra bodega
    System.out.println("Productos en bodega: " + almacen.size() + " productos");
}
static class Producto {
    String fechaCaducidad;

    public Producto(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}

static void agregarProductos(LinkedList<Producto> almacen, int cantidad, String fechaCaducidad) {
    for (int i = 0; i < cantidad; i++) {
        almacen.add(new Producto(fechaCaducidad));
    }
    System.out.println("Se han agregado " + cantidad + " productos con fecha de caducidad en " + fechaCaducidad);
}

static void venderProductos(LinkedList<Producto> almacen, int cantidad) {
    int productoVendido  = 0;  
    for (int i = 0; i < cantidad; i++) {
        Producto producto =  almacen.poll(); // sacamos el producto más antiguo
        if (producto != null) {
           productoVendido ++;
            //System.out.println("Producto vendido con fecha de caducidad en " + productoVendido);
        } else {
            System.out.println("No hay más productos en el almacén.");
            break;
        }
    }
    System.out.println("Se han vendido " + productoVendido + " productos");
}
}

        