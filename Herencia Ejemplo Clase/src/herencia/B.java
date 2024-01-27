

package herencia;


public class B extends A{

    public B(String cadena) {
        
        super(cadena);//con super citamos las variables que estan dentro del constructor A
        System.out.println("En el cosntructor de B");
        System.out.println(cadena);
        
    }
    
    
}
