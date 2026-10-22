package EjercicioscasaS4;

public class Pedido {
    // Atributos privados de instancia
    private int numero;
    private String cliente;
    private double total;
    private String estado;

    // Atributos estáticos (miembros de clase)
    private static int contadorPedidos = 0;
    private static double ventasTotales = 0;

    // Constructor requerido
    public Pedido(String cliente, double total) {
        contadorPedidos++;
        this.numero = contadorPedidos;
        this.cliente = cliente;
        this.total = total;
        this.estado = "Pendiente";
    }

    // Método para confirmar el pedido y sumar a las ventas totales sin duplicar
    public void confirmar() {
        if (!this.estado.equals("Confirmado")) {
            this.estado = "Confirmado";
            ventasTotales += this.total;
            System.out.println("El pedido #" + this.numero + " ha sido confirmado exitosamente.");
        } else {
            System.out.println("El pedido #" + this.numero + " ya se encuentra confirmado previamente.");
        }
    }

    // Getters de instancia
    public int getNumero() {
        return this.numero;
    }

    public String getCliente() {
        return this.cliente;
    }

    public double getTotal() {
        return this.total;
    }

    public String getEstado() {
        return this.estado;
    }

    // Getters estáticos
    public static int getContadorPedidos() {
        return contadorPedidos;
    }

    public static double getVentasTotales() {
        return ventasTotales;
    }

    // Método auxiliar para mostrar información
    public void mostrarInformacion() {
        System.out.println("Número de Pedido: " + this.numero);
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Total: $" + this.total);
        System.out.println("Estado: " + this.estado);
        System.out.println("--------------------------");
    }
}
