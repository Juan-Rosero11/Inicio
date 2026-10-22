package EjercicioscasaS4;

public class MainCliente {
    public static void main(String[] args) {
        // Creación de clientes utilizando el constructor
        Cliente cliente1 = new Cliente("Ana Pérez", "ana@correo.com");
        Cliente cliente2 = new Cliente("Carlos Gómez", "carlos@correo.com");
        Cliente cliente3 = new Cliente("Sofía Ruiz", "sofia@correo.com");

        // Mostrar información de los clientes registrados
        System.out.println("=== LISTA DE CLIENTES ===");
        cliente1.mostrarInformacion();
        cliente2.mostrarInformacion();
        cliente3.mostrarInformacion();

        // Comprobación del miembro estático total de clientes
        System.out.println("Total de clientes registrados: " + Cliente.getTotalClientes());
    }
}
