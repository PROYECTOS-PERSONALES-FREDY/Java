
package calculadoradecimalabinaria;

import java.util.Scanner;

public class CalculadoraDecimalABinaria {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int a,aux;
        String guardar="";
       
        System.out.print("Ingrese numero Decimal: ");
        a = entrada.nextInt();
        
        if (a>=0){
            do{
                aux = a%2; 
                guardar += aux;
                a = a/2;       
            }while(a>0);
            
            String invertido = new StringBuffer(guardar).reverse().toString();// se usa para invertir una cadena
            System.out.println("La solucion es: "+invertido);
        }
        else {
            a = a*-1;
            do{
                aux = a%2; 
                guardar += aux;
                a = a/2;       
            }while(a>0);
            String invertido = new StringBuffer(guardar).reverse().toString();// se usa para invertir una cadena
            System.out.println("La solucion es: -"+invertido);
        }
        
        
        /*Ejemplo del Ciclo
        numero : 14
            *Primer Ciclo*
            14%2 = 0
            Se guarda ese residuo como caracter: 0
            14/2 = 7

            *Segundo Ciclo*
            7%2 = 1
            Se guarda ese residuo como caracter: 01
            7/2 = 3

            *Tercer Ciclo
            3%2 = 1
            Se guarda ese residuo como caracter: 011
            3/2=1

            *Cuarto Ciclo
            1%2 = 1
            Se guarda ese residuo como caracter: 0111
            1/2=0
        Fin del Ciclo
        
        Con String invertido invertimos la cadena
        
        resultado : 1110
        
        */        
    }
}
