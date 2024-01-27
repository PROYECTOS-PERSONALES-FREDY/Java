
package Animales;


public class Pollo extends Animal{
    
    public void hablar() {
        System.out.println("Pio Pio");
        
    }

    public void hablar (int x) { //sobrecarga
        
    String mensaje="";
    
        for (int f = 0; f < x ; f++) {
            mensaje += "pio";
        }
        
        System.out.println(mensaje); 
    }
    
    
    
}
