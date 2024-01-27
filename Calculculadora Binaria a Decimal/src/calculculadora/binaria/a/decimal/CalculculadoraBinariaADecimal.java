
package calculculadora.binaria.a.decimal;

import java.util.Scanner;


public class CalculculadoraBinariaADecimal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int a,b,guardar,aux;
        
       
        System.out.print("Ingrese numero Binario: ");
        
        a = entrada.nextInt();
        b = 0;
        guardar=0;
        
        if (a>=0){
            do{
               aux = a%10;
               guardar +=aux*(int)Math.pow(2,b++);
               a = a/10;
            }while(a>0);
            System.out.println("El numero Decimal es: "+guardar);
        }
        else{
            a*=-1;
            do{
               aux = a%10;
               guardar +=aux*(int)Math.pow(2,b++);
               a = a/10;
            }while(a>0);
            System.out.println("El numero Decimal es: -"+guardar);
        }
       
        /*Ejemplo del Ciclo
        numero : 1010
            *Primer Ciclo*
            1010%10 = 0
            se multiplica el residuo por 2^0: (0*2^0) = 0
            se suma el resultado de la potencia: 0+0 = 0 
            1010/10 = 101
            
            *Segundo Ciclo*
            101%10 = 1
            se multiplica el residuo por 2^1: (1*2^1) = 2
            se suma el resultado de la potencia: 0+0+2 = 2 
            101/10 = 10

            *Tercer Ciclo
            10%10 = 0
            se multiplica el residuo por 2^2: (0*2^2) = 0
            se suma el resultado de la potencia: 0+0+2+0 = 2 
            10/10 = 1
    
    }
            *Cuarto Ciclo
            1%10 = 1
            se multiplica el residuo por 2^3: (1*2^3) = 8
            se suma el resultado de la potencia: 0+0+2+0+8 = 10
            1/10 = 0
        
        Fin del Ciclo
        
        resultado : 10
        
        */        
        
        
        
        
    }
    
}
