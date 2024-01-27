/* Sentencia if:
    
    if (condicion1){
        Instruccion1;
    }
    esle if (condicion 2){
        Instruccion2;
    }
    else{
        Instruccion3;
    }
----------------------------------------
    Sentencia switch:

    switch(dato){
        case 1: Instrucciones1;
                break;
        case 2: Instrucciones2;
                break;
        ...
        case n: Instrucciones n;
                break;
        default: CasoContrario(de no ser ninguna de esas opciones);
                break;
    }            
*/

package condicionales;

import java.util.Scanner;


public class Condicionales {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        // Condicional If
        
        float a,b,c;
        
        System.out.println("PROGRAMA PARA CALCULAR EL MAYOR DE TRES NUMEROS");
         
        System.out.println("Indrodusca tres numeros: ");
        a = entrada.nextFloat();
        b = entrada.nextFloat();
        c = entrada.nextFloat();
        
            if (a>b && a>c){
                System.out.println("El numero mayor es: "+a);
            }
            else if (b>a && b>c){
                System.out.println("El numero mayor es: "+b);
            }
            else if (c>a && c>b){
                System.out.println("El numero mayor es: "+c);
            }   
            else{
                System.out.println("Hay dos numeros mayores iguales");
            }
        //----------------------------------------------------
        // Condicional switch
        float e,f;    
        int d;    
        System.out.println("PROGRAMA PARA OPERADORES ARITMETICOS");
        System.out.println("Introdusca numero 1");
        e = entrada.nextFloat();
        System.out.println("Introdusca numero 2");
        f = entrada.nextFloat();
        System.out.println("Eliga que operador quiere");     
        System.out.println("Suma = introdusca numero 1");      
        System.out.println("Resta = introdusca numero 2");
        System.out.println("Multiplicacion = introdusca numero 3");
        System.out.println("Divicion = introdusca numero 4");
        d = entrada.nextInt();
        
        switch(d){
            case 1: System.out.println("Su suma es: "+(e+f));
                    break;
            case 2: System.out.println("Su resta es: "+(e-f));
                    break;
            case 3: System.out.println("Su multiplicacion es: "+(e*f));
                    break;
            case 4: System.out.println("Su divicion es: "+(e/f));
                    break; 
            default: System.out.println("No existe esa opcion");
                    break;
        } 
        
    }   
}