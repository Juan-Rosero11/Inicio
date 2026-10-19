package Taller;

import java.util.Scanner;

public class MainFecha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el mes:");
        int mes = entrada.nextInt();

        System.out.println("Ingrese el dia:");
        int dia = entrada.nextInt();

        System.out.println("Ingrese el anio:");
        int anio = entrada.nextInt();

        Fecha f1 = new Fecha(mes, dia, anio);

        System.out.println("La fecha ingresada es:");
        f1.mostrarFecha();

        entrada.close();
    }
}

