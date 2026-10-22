package EjercicioscasaS4;

public class MainPedido {
    public static void main(String[] args) {
        // Creación de pedidos utilizando el constructor
        Pedido pedido1 = new Pedido("Carlos", 120.50);
        Pedido pedido2 = new Pedido("Lucía", 85.00);

        // Mostrar información inicial
        System.out.println("=== ESTADO INICIAL DE LOS PEDIDOS ===");
        pedido1.mostrarInformacion();
        pedido2.mostrarInformacion();

        // Confirmar pedidos y probar la restricción de doble contabilización
        System.out.println("\n=== PROCESO DE CONFIRMACIÓN ===");
        pedido1.confirmar();
        pedido1.confirmar(); // Intento de confirmar nuevamente (no debe sumar dos veces)
        pedido2.confirmar();

        // Mostrar estadísticas finales
        System.out.println("\n=== ESTADÍSTICAS GLOBALES ===");
        System.out.println("Total de pedidos creados: " + Pedido.getContadorPedidos());
        System.out.println("Ventas totales acumuladas: $" + Pedido.getVentasTotales());
    }
}
