
package herencia;

public class Principal {
    
    public static void main(String[] args) {
        
        Avion obj1 = new Avion();
        Jet obj2 = new Jet();
        Heli obj3 = new Heli();
        
        obj1.drive();
        obj1.fly();
        obj2.drive();
        obj2.fly();
        obj2.down();
        obj3.girar();
        
    }
    
    
}
