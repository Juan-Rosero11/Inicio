package EjercicioscasaS3;

public class Servicio {
    // Atributos privados
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public int getPuerto() {
        return this.puerto;
    }

    public boolean isActivo() {
        return this.activo;
    }

    public int getCantidadPeticiones() {
        return this.cantidadPeticiones;
    }

    // Setters con validaciones y uso de this
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public void setPuerto(int puerto) {
        if (puerto > 0) {
            this.puerto = puerto;
        } else {
            System.out.println("Error: El puerto debe ser mayor que 0.");
        }
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setCantidadPeticiones(int cantidadPeticiones) {
        if (cantidadPeticiones >= 0) {
            this.cantidadPeticiones = cantidadPeticiones;
        } else {
            System.out.println("Error: La cantidad de peticiones no puede ser negativa.");
        }
    }

    // Métodos requeridos
    public void iniciar() {
        this.activo = true;
        System.out.println("El servicio '" + this.nombre + "' se ha iniciado en el puerto " + this.puerto + ".");
    }

    public void detener() {
        this.activo = false;
        System.out.println("El servicio '" + this.nombre + "' se ha detenido.");
    }

    public void registrarPeticion() {
        if (this.activo) {
            this.cantidadPeticiones++;
            System.out.println("Petición registrada correctamente. Total actual: " + this.cantidadPeticiones);
        } else {
            System.out.println("Error: No se puede registrar la petición porque el servicio '" + this.nombre + "' está inactivo.");
        }
    }
}
