
package operadores.aritmeticos;

import java.util.Scanner;

public class OperadoresAritmeticos {

    
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);
        
        //--------suma resta multiplicacion divicion------//
        
        float n1,n2,suma,resta,mult,div,resto,n3,n5,n6;
        int n4,n7,n8;
        
        System.out.println("Digite 2 numeros: ");
        
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        
        suma   = n1+n2;
        resta  = n1-n2;
        mult   = n1*n2;
        div    = n1/n2;
        resto  = n1%n2;
       
        System.out.println("La suma es: "+suma);   
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+mult);
        System.out.println("La divicion es: "+div);
        System.out.println("El resto es: "+resto);
        
        //-------------Raices y Potencias-----------------------//
        
        //Raiz
        
        System.out.print("Introdusca un numero sin raiz exacta: ");
        n3 = entrada.nextFloat();
        System.out.print("Introdusca un numero con raiz exacta: ");
        n4 = entrada.nextInt();
        
        double raiz = Math.sqrt(n3); //solo se usa double para raiz
        int raiz0 = (int) Math.sqrt(n4); // se coloca (int) para que sea en enteroy se transforme
        
        System.out.println("Raiz decimal: "+raiz);
        System.out.println("Raiz entera: "+raiz0);
        
        //Potencia
        
        System.out.print("Introdusca base decimal: ");
        n5 = entrada.nextFloat();
        System.out.print("Introdusca exponente decimal: ");
        n6 = entrada.nextFloat();
        System.out.print("Introdusca base entera: ");
        n7 = entrada.nextInt();
        System.out.print("Introdusca exponente entero: ");
        n8 = entrada.nextInt();
        
        double potencia = Math.pow(n5,n6); //primero la base y luego el exponente 
        int potencia0 =(int)Math.pow(n7,n8);
        
        System.out.println("Su potencia decimal es: "+potencia );
        System.out.println("Su potencia entera es: "+potencia0 );
        
        //Redondear Decimales
        
        double numero = 4.56;
        long resultado = Math.round(numero); //se usa long con double
        System.out.println("Numero a redondear: "+numero);
        System.out.println("El redondeo es: "+resultado);
        
        float numero0 = 3.45f;
        int resultado0 = Math.round(numero0); //se usa int con float
        System.out.println("Numero a redondear: "+numero0);
        System.out.println("El redondeo es: "+resultado0);
        
        //numero ramdom
        
        double numero1 =Math.random();
        
        System.out.println("numero random: "+numero1);
        
        
        
    }
    
}
