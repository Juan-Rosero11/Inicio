package EjercicioscasaS2;

public class MainVideojuego {
    public static void main(String[] args) {
        // Creación de tres videojuegos utilizando new
        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego();
        Videojuego juego3 = new Videojuego();

        // Asignación de valores independientes al juego 1
        juego1.nombre = "Minecraft";
        juego1.genero = "Sandbox";
        juego1.version = "1.20";
        juego1.activo = false;

        // Asignación de valores independientes al juego 2
        juego2.nombre = "The Legend of Zelda";
        juego2.genero = "Aventura";
        juego2.version = "1.1";
        juego2.activo = true;

        // Asignación de valores independientes al juego 3
        juego3.nombre = "FIFA 24";
        juego3.genero = "Deportes";
        juego3.version = "1.0";
        juego3.activo = false;

        // Comprobación de que cada objeto mantiene sus propios valores
        System.out.println("=== INFORMACIÓN VIDEOJUEGO 1 ===");
        juego1.mostrarInformacion();

        System.out.println("\n=== INFORMACIÓN VIDEOJUEGO 2 ===");
        juego2.mostrarInformacion();

        System.out.println("\n=== INFORMACIÓN VIDEOJUEGO 3 ===");
        juego3.mostrarInformacion();
    }
}
