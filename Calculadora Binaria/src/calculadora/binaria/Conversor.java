
package calculadora.binaria;

import java.util.Scanner;


public class Conversor {
    Scanner entrada = new Scanner(System.in);
    
    public int BinADec(int a){
        int b=0,guardar=0,aux;
        
        
            if (a>=0){
                do{
                   aux = a%10;
                   guardar +=aux*(int)Math.pow(2,b++);
                   a = a/10;
                }while(a>0); 
                return guardar;
            }
            else{
                a*=-1;
                do{
                   aux = a%10;
                   guardar +=aux*(int)Math.pow(2,b++);
                   a = a/10;
                }while(a>0);
                guardar *=-1;
                return guardar;
            }
    }
    public int DecABin(int a){
        int aux;
        String guardar="",invertido;
       
        if (a>=0){
            do{
                aux = a%2; 
                guardar += aux;
                a = a/2;       
            }while(a>0);
            
            invertido = new StringBuffer(guardar).reverse().toString();// se usa para invertir una cadena
            int solucion = Integer.parseInt(invertido);
            return solucion;
        }
        else {
            
            a = a*-1;
            do{
                aux = a%2; 
                guardar += aux;
                a = a/2;       
            }while(a>0);
            invertido = new StringBuffer(guardar).reverse().toString();// se usa para invertir una cadena
            int solucion = Integer.parseInt(invertido);
            solucion *=-1;
            return solucion;
            
        }
    }
    
}