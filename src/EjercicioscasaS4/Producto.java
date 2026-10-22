package EjercicioscasaS4;

public class Producto {
    // Atributos privados de instancia
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    // Atributo estático (miembro de clase)
    private static int contadorProductos = 0;

    // Constructor requerido
    public Producto(String nombre, double precio, int stock) {
        contadorProductos++;
        this.id = contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters
    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getStock() {
        return this.stock;
    }

    // Método estático para consultar el total de productos
    public static int getContadorProductos() {
        return contadorProductos;
    }

    // Método para mostrar la información del producto
    public void mostrarInformacion() {
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: $" + this.precio);
        System.out.println("Stock: " + this.stock);
        System.out.println("--------------------------");
    }
}
