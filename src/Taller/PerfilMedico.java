package Taller;

public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura;
    private double peso;

    public PerfilMedico(String nombre, String apellido, String sexo,
                        int dia, int mes, int anio,
                        double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        setAltura(altura);
        setPeso(peso);
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

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            this.altura = 0;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            this.peso = 0;
        }
    }

    public double getPeso() {
        return peso;
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

    public double calcularIMC() {
        if (altura <= 0 || peso <= 0) {
            return 0;
        }

        double alturaMetros = altura / 100;
        return peso / (alturaMetros * alturaMetros);
    }
}