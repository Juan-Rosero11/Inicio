package EjercicioscasaS2;

public class Videojuego {
    // Atributos public
    public String nombre;
    public String genero;

    // Atributos con acceso por defecto
    String version;
    boolean activo;

    // Métodos public
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Versión: " + version);
        System.out.println("Activo: " + activo);
    }

    public void iniciar() {
        activo = true;
        System.out.println("El videojuego " + nombre + " ha iniciado.");
    }

    // Métodos con acceso por defecto
    void cerrar() {
        activo = false;
        System.out.println("El videojuego " + nombre + " se ha cerrado.");
    }

    void mostrarVersion() {
        System.out.println("Versión actual: " + version);
    }
}
