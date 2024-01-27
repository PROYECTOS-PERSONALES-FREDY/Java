
package VectoresConObjetos;

import java.util.Scanner;

public class Arreglos {
    
    Scanner entrada = new Scanner (System.in);
    
    public float[] entrada(){
        
        float[] estatura = new float[5];
        
        for(int i = 0;i<5;i++){
            
            System.out.print("Digite estatura de la persona ["+(i+1)+"]: ");
            estatura[i]=entrada.nextFloat();
        }
        
        return estatura;
        
    }
    
    public float calcular(float[] a) {
        float suma = 0,promedio;
        
        for (int i=0;i<5;i++){
            
            suma +=a[i];
            
        }
        promedio = suma/5;
        System.out.print("\nEl promedio es: "+promedio+"\n");
        return promedio;
    }
    
    public void mayores(float promedio,float[] estatura){
        System.out.println("\nEstaturas mayores que el promedio ("+promedio+") son:");
        
        for (int i=0;i<5;i++){
            if(estatura[i]>promedio){
                System.out.println("Persona ["+(i+1)+"]:"+estatura[i]);
            }
        }
        
    }
}
