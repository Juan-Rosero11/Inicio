package Taller;

import java.util.Scanner;

public class MainFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero de pieza: ");
        String numero = entrada.nextLine();

        System.out.print("Descripcion: ");
        String descripcion = entrada.nextLine();

        System.out.print("Cantidad: ");
        int cantidad = entrada.nextInt();

        System.out.print("Precio por articulo: ");
        double precio = entrada.nextDouble();

        Factura factura = new Factura(numero, descripcion,
                cantidad, precio);

        System.out.println("Numero: " + factura.getNumeroPieza());
        System.out.println("Descripcion: " + factura.getDescripcion());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio: " + factura.getPrecioArticulo());
        System.out.println("Monto total: " + factura.obtenerMontoFactura());

        entrada.close();
    }
}