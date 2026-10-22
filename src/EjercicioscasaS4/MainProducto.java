package EjercicioscasaS4;

public class MainProducto {
    public static void main(String[] args) {
        // Creación de cinco productos utilizando el constructor
        Producto producto1 = new Producto("Mouse", 25.50, 10);
        Producto producto2 = new Producto("Teclado Mecánico", 45.00, 15);
        Producto producto3 = new Producto("Monitor 24\"", 180.00, 5);
        Producto producto4 = new Producto("Audífonos Bluetooth", 35.00, 20);
        Producto producto5 = new Producto("Laptop Gamer", 850.00, 8);

        // Mostrar información de los productos
        System.out.println("=== LISTA DE PRODUCTOS ===");
        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
        producto3.mostrarInformacion();
        producto4.mostrarInformacion();
        producto5.mostrarInformacion();

        // Comprobación del resultado esperado
        System.out.println("Total de productos: " + Producto.getContadorProductos());
    }
}
