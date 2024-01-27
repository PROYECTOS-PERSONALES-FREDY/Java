
package vectores;

import java.util.Scanner;


public class Vectores {

    
    public static void main(String[] args) {
        
      Scanner entrada = new Scanner (System.in);
      
      int a,b;
      
        System.out.print("Introdusca numero de elementos en el vector: ");
        a=entrada.nextInt();
        
      int[] numeros = new int[a];
      
      
      for (int i=0;i<a;i++){
          System.out.print("Introdusca numero posicion ["+i+"]: ");
          numeros[i] = entrada.nextInt();
      }
      for (int i=0;i<a;i++){
          System.out.println("Su numero en la posicion ["+i+"] es: "+numeros[i]);
      }
      
      //utilizacion de .length
      
      String[] letras ={"a","b","c","d","e","f","g","h","i","j","k","l","m"};
      
      for(int i=0;i<letras.length;i++){// el .length cuenta el numero de elementos en los vectores
          System.out.print(letras[i]+" ");
      }
        System.out.println("\n");
        
      //Buble for each
        
      for(String i:letras){
          System.out.print(i+" ");   
      }  
        
         System.out.println("\n");       
        
        
        
    }
    
}
