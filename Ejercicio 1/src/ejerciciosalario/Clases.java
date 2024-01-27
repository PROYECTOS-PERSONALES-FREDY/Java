
package ejerciciosalario;

import java.util.Scanner;

public class Clases {
    
    public static void main (String args[]){
     entrar();
  
        
        
    }
    public static void entrar(){
        
        String nombres[] = null;
        int numero,salario[] = null;
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite numero de personas: ");
        numero = entrada.nextInt();
        
            for(int i=0;i<numero;i++){
                System.out.print("Digite nombre: ");
                nombres[i] = entrada.nextLine();
            }
            
            
            
            for(int i=0;i<numero;i++){
                System.out.print("Digite salario de perona ["+(i+1)+"]: ");
                salario[i] = entrada.nextInt();
            }
            
            salida(nombres,salario,numero);
            
    }
    
    public static void salida(String[] nombres,int[] numeros,int personas){
        int aux=0;
        for(int i=0;i<personas;i++){
            for(int j=0;j<(i-1);j++){
                
                if(numeros[j]>numeros[j+1]){
                  aux=numeros[j];
                numeros[j]=numeros[j+1];
                numeros[j+1]=aux;  
                }
            }
        }
        
        for (int i=0;i<personas;i++){
            
            System.out.println(numeros[i]);
        }
        
    }

}
    
    

