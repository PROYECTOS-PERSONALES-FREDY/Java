/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matriz.diagonal;

import java.util.Scanner;

/**
 *
 * @author Sala de Redes
 */
public class MatrizDiagonal {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int filas,columnas;
        
        System.out.print("Intese numero de filas: ");
        filas=entrada.nextInt();
        
        System.out.print("Intese numero de columnas: ");
        columnas=entrada.nextInt();
        
        int matriz1[][]= new int[filas][columnas];
        int matriz2[][]= new int[filas][columnas];
        int matriz3[][]= new int[filas][columnas];
        
        System.out.println("\n Matriz 1");
        
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                
                System.out.print("Digite posicion ["+i+"] ["+j+"] :");
               matriz1[i][j]= entrada.nextInt();
            }
        }
        
        System.out.println("\n Matriz 2");
        
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                
                System.out.print("Digite posicion ["+i+"] ["+j+"] :");
                
                 matriz2[i][j]= entrada.nextInt();
            }
        }
        
        
        
        System.out.println("Suma");
        
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                
                matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
                
                System.out.println("posicion ["+i+"] ["+j+"]: "+matriz3[i][j]);
                
                 
            }
        }
        /*
        Matriz diagonal
        
        System.out.println(matriz[0][0]);
        System.out.println(" "+matriz[1][1]);
        System.out.println("   "+matriz[2][2]);
        System.out.println("     "+matriz[3][3]);
        */
        
        System.out.println("\nSuma de numeros");
        
        
        
    }
    
}
