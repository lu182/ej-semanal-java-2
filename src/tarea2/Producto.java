package tarea2;

public abstract class Producto {
    
    private String nombre;
    private String marca;
    private int cantidad;
    protected double precioSinIva;    
    
    //protected abstract double precioFinal();
    
    public abstract void datos();

    public Producto(String nombre, String marca, int cantidad, double precioSinIva) {
        this.nombre = nombre;
        this.marca = marca;
        this.cantidad = cantidad;
        this.precioSinIva = precioSinIva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public void setPrecioSinIva(double precioSinIva) {
        this.precioSinIva = precioSinIva;
    }   
    
}
