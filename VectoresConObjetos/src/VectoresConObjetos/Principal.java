
package VectoresConObjetos;

public class Principal {
    
    
            
    public static void main(String[] args) {
        
        Arreglos arr = new Arreglos();


        float[] estatura =arr.entrada();

        float promedio = arr.calcular(estatura);

        arr.mayores(promedio, estatura);
        
        
    }
}
