
package herencia;

public class A {

    public A() {
        System.out.println("En el cosntructor de A");
        
        
    }

    public A(String dato) {//esta es la firma (sobrecarga)
        /*firma de un metodo se refiere a la primera linea si tiene retorno o no , los parametros(cont,
        tipo, orde)*/
        System.out.println("En el constructor String de A");
        System.out.println(dato);
    }
    
    
    
    
}
