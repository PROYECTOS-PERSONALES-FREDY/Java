/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retorno.de.valores;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Principal {
    public static void main(String[] args) {
        
    Retorno variables = new Retorno();
    Scanner entrada = new Scanner(System.in);
    
    int n1,n2;
    
    n1=entrada.nextInt();
    n2=entrada.nextInt();
    
    int total = variables.suma(n1, n2);
    
        System.out.println(total);
    }
   
}
