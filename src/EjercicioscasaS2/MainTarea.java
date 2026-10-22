package EjercicioscasaS2;

public class MainTarea {
    public static void main(String[] args) {
        // Creación de tres tareas utilizando new
        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        // Asignación de valores independientes a la tarea 1
        tarea1.titulo = "Diseño de Base de Datos";
        tarea1.responsable = "Ana Pérez";
        tarea1.horasEstimadas = 15.5;
        tarea1.completada = false;

        // Asignación de valores independientes a la tarea 2
        tarea2.titulo = "Implementación de API";
        tarea2.responsable = "Carlos Gómez";
        tarea2.horasEstimadas = 20.0;
        tarea2.completada = false;

        // Asignación de valores independientes a la tarea 3
        tarea3.titulo = "Pruebas Unitarias";
        tarea3.responsable = "Lucía Torres";
        tarea3.horasEstimadas = 8.0;
        tarea3.completada = false;

        // Mostrar estado inicial de las tareas
        System.out.println("=== ESTADO INICIAL ===");
        System.out.println("\n--- Tarea 1 ---");
        tarea1.mostrarInformacion();
        System.out.println("\n--- Tarea 2 ---");
        tarea2.mostrarInformacion();
        System.out.println("\n--- Tarea 3 ---");
        tarea3.mostrarInformacion();

        // Completar solamente la tarea 2
        System.out.println("\n=== ACCIÓN: COMPLETAR TAREA 2 ===");
        tarea2.completar();

        // Comprobación de los resultados
        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("\n--- Tarea 1 ---");
        tarea1.mostrarInformacion();
        System.out.println("\n--- Tarea 2 ---");
        tarea2.mostrarInformacion();
        System.out.println("\n--- Tarea 3 ---");
        tarea3.mostrarInformacion();
    }
}
