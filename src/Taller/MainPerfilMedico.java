package Taller;

import javax.swing.*;

public class MainPerfilMedico {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");
        String sexo = JOptionPane.showInputDialog("Ingrese su sexo:");

        int dia = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese su dia de nacimiento:")
        );
        int mes = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese su mes de nacimiento:")
        );
        int anio = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese su anio de nacimiento:")
        );

        double altura = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese su altura en centimetros:")
        );
        double peso = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese su peso en kilogramos:")
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

        PerfilMedico persona = new PerfilMedico(
                nombre, apellido, sexo, dia, mes, anio, altura, peso
        );

        int edad = persona.calcularEdad(diaActual, mesActual, anioActual);
        double imc = persona.calcularIMC();

        int frecuenciaMaxima = persona.calcularFrecuenciaMaxima(edad);
        double frecuenciaMinima =
                persona.calcularFrecuenciaMinima(frecuenciaMaxima);
        double frecuenciaEsperadaMaxima =
                persona.calcularFrecuenciaEsperadaMaxima(frecuenciaMaxima);

        System.out.println("--- PERFIL MEDICO ---");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Sexo: " + persona.getSexo());
        System.out.println("Fecha de nacimiento: "
                + persona.getDia() + "/" + persona.getMes() + "/" + persona.getAnio());
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Altura: " + persona.getAltura() + " cm");
        System.out.println("Peso: " + persona.getPeso() + " kg");

        if (persona.getAltura() <= 0 || persona.getPeso() <= 0) {
            System.out.println("No se puede calcular el IMC: "
                    + "la altura y el peso deben ser positivos.");
        } else {
            System.out.println("IMC: " + imc);

            if (imc < 18.5) {
                System.out.println("Categoria de IMC: Bajo peso");
            } else if (imc <= 80) {
                System.out.println("Categoria de IMC: Normal");
            } else if (imc > 90) {
                System.out.println("Categoria de IMC: Sobrepeso");
            } else {
                System.out.println("Categoria de IMC: Obesidad");
            }
        }

        System.out.println("Frecuencia cardiaca maxima: "
                + frecuenciaMaxima + " latidos por minuto");
        System.out.println("Rango esperado de frecuencia cardiaca: "
                + frecuenciaMinima + " a " + frecuenciaEsperadaMaxima
                + " latidos por minuto");

        System.out.println("\n--- TABLA DE IMC ---");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: de 18.5 a menos de 25");
        System.out.println("Sobrepeso: de 25 a menos de 30");
        System.out.println("Obesidad: 30 o mas");

        JOptionPane.showMessageDialog(null,
                "Perfil medico calculado. Revise la consola.");
    }
}