package EjercicioscasaS3;

public class Usuario {
    // Atributos privados
    private String username;
    private String correo;
    private int nivel;
    private boolean activo;

    // Getters
    public String getUsername() {
        return this.username;
    }

    public String getCorreo() {
        return this.correo;
    }

    public int getNivel() {
        return this.nivel;
    }

    public boolean isActivo() {
        return this.activo;
    }

    // Setters con validaciones y uso de this
    public void setUsername(String username) {
        if (username != null && !username.trim().isEmpty()) {
            this.username = username;
        } else {
            System.out.println("Error: El nombre de usuario no puede estar vacío.");
        }
    }

    public void setCorreo(String correo) {
        if (correo != null && !correo.trim().isEmpty()) {
            this.correo = correo;
        } else {
            System.out.println("Error: El correo no puede estar vacío.");
        }
    }

    public void setNivel(int nivel) {
        if (nivel >= 0) {
            this.nivel = nivel;
        } else {
            System.out.println("Error: El nivel debe ser mayor o igual a 0.");
        }
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Métodos adicionales requeridos
    public void activar() {
        this.activo = true;
        System.out.println("El usuario '" + this.username + "' ha sido activado.");
    }

    public void desactivar() {
        this.activo = false;
        System.out.println("El usuario '" + this.username + "' ha sido desactivado.");
    }
}
