package EjercicioscasaS2;

public class Tarea {
    // Atributos public
    public String titulo;
    public String responsable;

    // Atributos con acceso por defecto
    double horasEstimadas;
    boolean completada;

    // Métodos public
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Responsable: " + responsable);
        System.out.println("Horas estimadas: " + horasEstimadas);
        System.out.println("Completada: " + completada);
    }

    public void completar() {
        completada = true;
        System.out.println("La tarea '" + titulo + "' ha sido completada.");
    }

    // Métodos con acceso por defecto
    void mostrarResponsable() {
        System.out.println("Responsable: " + responsable);
    }

    void mostrarEstado() {
        if (completada) {
            System.out.println("Estado: Completada");
        } else {
            System.out.println("Estado: Pendiente");
        }
    }
}
