package Taller;

import javax.swing.*;

public class MainEmpleado {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del primer empleado:");
        String apellido1 = JOptionPane.showInputDialog("Ingrese el apellido del primer empleado:");
        double salario1 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el salario mensual del primer empleado:")
        );

        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo empleado:");
        String apellido2 = JOptionPane.showInputDialog("Ingrese el apellido del segundo empleado:");
        double salario2 = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese el salario mensual del segundo empleado:")
        );

        Empleado empleado1 = new Empleado(nombre1, apellido1, salario1);
        Empleado empleado2 = new Empleado(nombre2, apellido2, salario2);

        System.out.println(" SALARIOS ANUALES INICIALES ");
        System.out.println(empleado1.getNombre() + " " + empleado1.getApellido());
        System.out.println("Salario anual: $" + empleado1.getSalarioMensual() * 12);

        System.out.println(empleado2.getNombre() + " " + empleado2.getApellido());
        System.out.println("Salario anual: $" + empleado2.getSalarioMensual() * 12);

        empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.10);
        empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.10);

        System.out.println("\n SALARIOS ANUALES CON AUMENTO DEL 10% ");
        System.out.println(empleado1.getNombre() + " " + empleado1.getApellido());
        System.out.println("Salario mensual: $" + empleado1.getSalarioMensual());
        System.out.println("Salario anual: $" + empleado1.getSalarioMensual() * 12);

        System.out.println(empleado2.getNombre() + " " + empleado2.getApellido());
        System.out.println("Salario mensual: $" + empleado2.getSalarioMensual());
        System.out.println("Salario anual: $" + empleado2.getSalarioMensual() * 12);

        JOptionPane.showMessageDialog(null, "Calculos de salarios completados.");
    }
}