package EjercicioscasaS4;

public class Cliente {
        // Atributos privados de instancia
        private int id;
        private String nombre;
        private String correo;
        private boolean activo;

        // Atributo estático (miembro de clase)
        private static int contadorClientes = 0;

        // Constructor requerido
        public Cliente(String nombre, String correo) {
            contadorClientes++;
            this.id = contadorClientes;
            this.nombre = nombre;
            this.correo = correo;
            this.activo = true;
        }

        // Métodos requeridos
        public void activar() {
            this.activo = true;
            System.out.println("El cliente " + this.nombre + " ha sido activado.");
        }

        public void desactivar() {
            this.activo = false;
            System.out.println("El cliente " + this.nombre + " ha sido desactivado.");
        }

        public static int getTotalClientes() {
            return contadorClientes;
        }

        // Getters
        public int getId() {
            return this.id;
        }

        public String getNombre() {
            return this.nombre;
        }

        public String getCorreo() {
            return this.correo;
        }

        public boolean isActivo() {
            return this.activo;
        }

        // Método auxiliar para mostrar la información
        public void mostrarInformacion() {
            System.out.println("ID: " + this.id);
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Correo: " + this.correo);
            System.out.println("Activo: " + this.activo);
            System.out.println("--------------------------");
        }
    }
