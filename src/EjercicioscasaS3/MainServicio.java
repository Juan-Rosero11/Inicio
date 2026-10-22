package EjercicioscasaS3;

public class MainServicio {
    public static void main(String[] args) {
        // Creación del servicio utilizando new (sin constructor propio)
        Servicio servicio = new Servicio();

        // Asignación de valores iniciales válidos
        servicio.setNombre("API de Pagos");
        servicio.setPuerto(8080);
        servicio.setActivo(false);
        servicio.setCantidadPeticiones(0);

        // Mostrar estado inicial
        System.out.println("=== ESTADO INICIAL ===");
        System.out.println("Nombre: " + servicio.getNombre());
        System.out.println("Puerto: " + servicio.getPuerto());
        System.out.println("Activo: " + servicio.isActivo());
        System.out.println("Peticiones: " + servicio.getCantidadPeticiones());

        // Probar validaciones con valores incorrectos
        System.out.println("\n=== PROBANDO VALIDACIONES INCORRECTAS ===");
        servicio.setPuerto(-50); // Debe fallar
        servicio.setNombre(""); // Debe fallar
        servicio.setCantidadPeticiones(-5); // Debe fallar

        // Iniciar servicio y registrar peticiones
        System.out.println("\n=== INICIANDO Y REGISTRANDO PETICIONES ===");
        servicio.setPuerto(8081); // Puerto válido
        servicio.iniciar();
        servicio.registrarPeticion();
        servicio.registrarPeticion();

        // Detener servicio e intentar registrar otra petición
        System.out.println("\n=== DETENIENDO SERVICIO ===");
        servicio.detener();
        servicio.registrarPeticion(); // Debe mostrar error por estar inactivo

        // Comprobación final del estado
        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Total de peticiones registradas: " + servicio.getCantidadPeticiones());
    }
}
