package Taller;

import javax.swing.*;

public class MainFrecuenciaCardiaca {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");

        int mes = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese su mes de nacimiento:")
        );
        int dia = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese su dia de nacimiento:")
        );
        int anio = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese su anio de nacimiento:")
        );

        int diaActual = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el dia actual:")
        );
        int mesActual = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el mes actual:")
        );
        int anioActual = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el anio actual:")
        );

        FrecuenciaCardiaca persona = new FrecuenciaCardiaca(
                nombre, apellido, mes, dia, anio
        );

        int edad = persona.calcularEdad(diaActual, mesActual, anioActual);
        int frecuenciaMaxima = persona.calcularFrecuenciaMaxima(edad);
        double frecuenciaMinima = persona.calcularFrecuenciaMinima(frecuenciaMaxima);
        double frecuenciaEsperadaMaxima =
                persona.calcularFrecuenciaEsperadaMaxima(frecuenciaMaxima);

        System.out.println(" PERFIL DE FRECUENCIA CARDIACA ");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Fecha de nacimiento: "
                + persona.getMes() + "/" + persona.getDia() + "/" + persona.getAnio());
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Frecuencia cardiaca maxima: "
                + frecuenciaMaxima + " latidos por minuto");
        System.out.println("Rango esperado: " + frecuenciaMinima
                + " a " + frecuenciaEsperadaMaxima + " latidos por minuto");

        JOptionPane.showMessageDialog(null, "Calculos completados. Revise la consola.");
    }
}

