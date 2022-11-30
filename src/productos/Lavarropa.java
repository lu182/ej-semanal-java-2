package productos;

import tarea2.Producto;
import tarea2.Supermercado;

public class Lavarropa extends Producto implements Supermercado{

    public Lavarropa(String nombre, String marca, int cantidad, double precioSinIva) {
        super(nombre, marca, cantidad, precioSinIva);
    }

    @Override
    public void datos() {
        System.out.println("\nProducto: " + this.getNombre() +
                "\nMarca: " + this.getMarca() +
                "\nCantidad: " + this.getCantidad() + 
                "\nPrecio sin IVA: " + this.getPrecioSinIva() + 
                "\nPrecio Final: " + precioFinal());        
    }


    @Override
    public double precioFinal() {
        double x = (precioSinIva / 100) * 21;
        double y = (precioSinIva + x);
        double c = (y * this.getCantidad());
        return c;
    }    
   
}