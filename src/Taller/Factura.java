package Taller;

public class Factura {
    private String numeroPieza;
    private String descripcion;
    private int cantidad;
    private double precioArticulo;

    public Factura(String numero, String desc, int cant, double precio) {
        numeroPieza = numero;
        descripcion = desc;
        setCantidad(cant);
        setPrecioArticulo(precio);
    }

    public void setNumeroPieza(String numero) {
        numeroPieza = numero;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setDescripcion(String desc) {
        descripcion = desc;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCantidad(int cant) {
        if (cant > 0)
            cantidad = cant;
        else
            cantidad = 0;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecioArticulo(double precio) {
        if (precio > 0)
            precioArticulo = precio;
        else
            precioArticulo = 0;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public double obtenerMontoFactura() {
        return cantidad * precioArticulo;
    }
}