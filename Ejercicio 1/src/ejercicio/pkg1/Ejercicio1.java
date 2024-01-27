
package ejercicio.pkg1;

import java.util.Scanner;


public class Ejercicio1 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        float g,l,j,total;
        
        System.out.print("Ingrese cantidad de dolares de Guillermo: ");
        g = entrada.nextFloat();
        l = g/2;
        j = (l+g)/2;
        total = g+l+j;
        
        System.out.println("Guillermo tiene: $"+g);
        System.out.println("Luis tiene: $"+l);
        System.out.println("Juan tiene: $"+j);
        System.out.println("La cantidad de dinero entre los tres es: $"+total);
    }
    
}
