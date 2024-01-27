/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericicio.vectores;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class EjericicioVectores {
    
    
    
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       
       int numeroV;
       int introducir;
       
       System.out.println("Digite el numero del vector: ");
       numeroV = entrada.nextInt();
        
       int ingresar[] = new int[numeroV];
       
        for (int i = 0; i < numeroV; i++) {
            System.out.println("Digite numero ["+(i+1)+"]: ");
            
            ingresar[i] = entrada.nextInt();
            
        }
        for (int i = 0; i < numeroV; i++) {
            System.out.println("Numero posicion ["+(i+1)+"] :"+ingresar[i]);
        }
        
    }
    
}
