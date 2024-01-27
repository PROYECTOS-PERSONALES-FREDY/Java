
package metodo.burbuja.organizar.mayor.a.menor;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodoBurbujaOrganizarMayorAMenor {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int arreglo[],nElementos,aux;
        
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos"));
        
        arreglo = new int [nElementos]; //le asignamos el numero de elementos al arreglo
        
            for (int i=0;i<nElementos;i++){
              arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Introdusca numero posicion ["+i+"]: "));
              
            }
        
        //Metodo Burbuja
        
        for(int i = 0; i<nElementos-1;i++){
            for(int j=0;j<nElementos-1;j++){
                if (arreglo [j] > arreglo[j+1]){ //si numero Actual > numero Siguiente
                aux= arreglo[j];
                arreglo[j]= arreglo[j+1];
                arreglo[j+1]=aux;
                }   
            }
        }
        System.out.println("Arreglo ordenado de forma creciente");
        
        for (int i=0;i<nElementos;i++){
              System.out.println("Posicion ["+i+"]: "+arreglo[i]);
              
            }
        
        System.out.println("\nArreglo ordenado de forma decreciente");
         
        for (int i=(nElementos-1);i>=0;i--){
              System.out.println("Posicion ["+i+"]: "+arreglo[i]);
                   
            }
        
        
        
    }
    
}
