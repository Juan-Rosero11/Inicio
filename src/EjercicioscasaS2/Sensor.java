package EjercicioscasaS2;

public class Sensor {
    // Atributos public
    public String nombre;
    public double lectura;

    // Atributos con acceso por defecto
    String tipo;
    String unidad;

    // Métodos public
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Lectura: " + lectura + " " + unidad);
    }

    public void actualizarLectura(double nuevaLectura) {
        lectura = nuevaLectura;
        System.out.println("La lectura del sensor " + nombre + " ha sido actualizada a: " + lectura + " " + unidad);
    }

    // Métodos con acceso por defecto
    void mostrarLectura() {
        System.out.println("Lectura actual: " + lectura + " " + unidad);
    }

    void reiniciarLectura() {
        lectura = 0.0;
        System.out.println("El sensor " + nombre + " ha reiniciado su lectura a 0.0 " + unidad);
    }
}

