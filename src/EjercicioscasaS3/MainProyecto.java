package EjercicioscasaS3;

public class MainProyecto {
    public static void main(String[] args) {
        // Creación del proyecto utilizando new (sin constructor propio)
        Proyecto proyecto = new Proyecto();

        // Asignación de valores iniciales válidos
        proyecto.setNombre("Sistema de Ventas");
        proyecto.setResponsable("Laura Martínez");
        proyecto.setProgreso(30);
        proyecto.setTerminado(false);

        // Mostrar estado inicial
        System.out.println("=== ESTADO INICIAL ===");
        System.out.println("Nombre: " + proyecto.getNombre());
        System.out.println("Responsable: " + proyecto.getResponsable());
        System.out.println("Progreso: " + proyecto.getProgreso() + "%");
        System.out.println("Terminado: " + proyecto.isTerminado());

        // Probar avance normal
        System.out.println("\n=== AVANZANDO PROYECTO ===");
        proyecto.avanzar(40); // 30 + 40 = 70%

        // Probar avance que intenta superar el 100%
        System.out.println("\n=== INTENTANDO SUPERAR EL 100% ===");
        proyecto.avanzar(50); // 70 + 50 = 120 -> debe ajustarse a 100%

        // Comprobación final del estado
        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Progreso actual: " + proyecto.getProgreso() + "%");
        System.out.println("¿Está terminado?: " + proyecto.isTerminado());
    }
}
