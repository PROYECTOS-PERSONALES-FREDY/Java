/* Cilos
-------------------------
    Ciclo ehile

    While(condicion){
        Instrucciones;
    }
-------------------------
    Ciclo do while

    do{
        Instrucciones;
    }while(condicion);
-------------------------
    Ciclo for
    
    for(inicializacion ; condicion ; aumento o decremento){
        Instrucciones;
    }

*/
package ciclos;

import java.util.Scanner;


public class Ciclos {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    //Bucle while            
      int a=1;  
        while (a<=10){
            System.out.println(a);
            a++;
        }
    //Bucle do while
      int b=11;  
        do{
            System.out.println(b);
        }while(b<=10);// minimo se va a ejecutar una vez
    //Bucle for    
       
        for (int i=10; i>=0 ; i--){
            System.out.println(i);
        }
   
        
        
    }
    
}
