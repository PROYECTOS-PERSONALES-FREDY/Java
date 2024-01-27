

package polimorfismo;


public class Polimorfismo {
    
public static void muevete(Mamifero m){
    /* 
    decido si tiene retorno , parametros , tipó de dato, el metodo ToString esta sobre-escrito
    */
    m.mover();
}
    public static void main(String[] args) {
        
       Gato g = new Gato();
       Perro p = new Perro();
       
        muevete(g);
        muevete(p);
        
    }
    
}
