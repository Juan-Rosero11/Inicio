package EjercicioscasaS3;

public class MainUsuario {
    public static void main(String[] args) {
        // Creación del usuario con new (sin constructor propio)
        Usuario usuario = new Usuario();

        // Asignación de valores válidos
        usuario.setUsername("carlos_dev");
        usuario.setCorreo("carlos@email.com");
        usuario.setNivel(5);

        // Mostrar información inicial
        System.out.println("=== ESTADO INICIAL ===");
        System.out.println("Username: " + usuario.getUsername());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Nivel: " + usuario.getNivel());
        System.out.println("Activo: " + usuario.isActivo());

        // Probar métodos de activación y desactivación
        System.out.println("\n=== PRUEBA DE ACTIVACIÓN ===");
        usuario.activar();

        System.out.println("\n=== PRUEBA DE DESACTIVACIÓN ===");
        usuario.desactivar();

        // Probar validaciones con valores inválidos
        System.out.println("\n=== PROBANDO VALIDACIONES ===");
        usuario.setNivel(-3); // Debe rechazarlo
        usuario.setUsername(""); // Debe rechazarlo

        // Comprobación de que los valores inválidos no cambiaron
        System.out.println("\n=== COMPROBACIÓN FINAL ===");
        System.out.println("Nivel actual (debe mantenerse en 5): " + usuario.getNivel());
        System.out.println("Username actual (debe mantenerse en carlos_dev): " + usuario.getUsername());
    }
}
