package Taller;

public class FrecuenciaCardiaca {
    private String nombre;
    private String apellido;
    private int mes;
    private int dia;
    private int anio;

    public FrecuenciaCardiaca(String nombre, String apellido,
                              int mes, int dia, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public int calcularEdad(int diaActual, int mesActual, int anioActual) {
        int edad = anioActual - anio;

        if (mesActual < mes) {
            edad = edad - 1;
        } else if (mesActual == mes && diaActual < dia) {
            edad = edad - 1;
        }

        return edad;
    }

    public int calcularFrecuenciaMaxima(int edad) {
        return 220 - edad;
    }

    public double calcularFrecuenciaMinima(int frecuenciaMaxima) {
        return frecuenciaMaxima * 0.50;
    }

    public double calcularFrecuenciaEsperadaMaxima(int frecuenciaMaxima) {
        return frecuenciaMaxima * 0.85;
    }

}