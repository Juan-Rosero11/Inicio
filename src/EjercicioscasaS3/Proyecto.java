package EjercicioscasaS3;

public class Proyecto {
    // Atributos privados
    private String nombre;
    private int progreso;
    private String responsable;
    private boolean terminado;

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public int getProgreso() {
        return this.progreso;
    }

    public String getResponsable() {
        return this.responsable;
    }

    public boolean isTerminado() {
        return this.terminado;
    }

    // Setters con validaciones y uso de this
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
            if (this.progreso == 100) {
                this.terminado = true;
            }
        } else {
            System.out.println("Error: El progreso debe estar entre 0 y 100.");
        }
    }

    public void setResponsable(String responsable) {
        if (responsable != null && !responsable.trim().isEmpty()) {
            this.responsable = responsable;
        } else {
            System.out.println("Error: El responsable no puede estar vacío.");
        }
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }

    // Método para avanzar el progreso asegurando que no supere 100
    public void avanzar(int porcentaje) {
        if (porcentaje > 0) {
            int nuevoProgreso = this.progreso + porcentaje;
            if (nuevoProgreso > 100) {
                this.progreso = 100;
                this.terminado = true;
            } else {
                this.progreso = nuevoProgreso;
                if (this.progreso == 100) {
                    this.terminado = true;
                }
            }
            System.out.println("El proyecto '" + this.nombre + "' ha avanzado. Progreso actual: " + this.progreso + "%");
        } else {
            System.out.println("Error: El porcentaje de avance debe ser mayor a 0.");
        }
    }
}
