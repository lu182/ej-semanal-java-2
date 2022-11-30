package tarea2;

import productos.Cafetera;
import productos.Lavarropa;

public class Tarea2 {

    public static void main(String[] args) {
        
        Producto p1 = new Lavarropa("Lavarropas automático", "Drean", 1 , 150000);
        p1.datos();
        
        Producto p2 = new Cafetera("Cafetera eléctrica", "Liliana", 1, 12000);
        p2.datos();
        
        System.out.println("\n******************************************************************************");
        
        Lavarropa l1 = new Lavarropa("Lavarropas automático", "Philips", 2 , 160000);
        l1.datos();
        
        Cafetera c1 = new Cafetera("Cafetera eléctrica", "Atma", 2, 15000);
        c1.datos();
        
       
    }
    
}
