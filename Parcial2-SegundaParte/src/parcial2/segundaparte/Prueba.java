/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial2.segundaparte;

import java.util.Scanner;


public class Prueba extends Animal{
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dato;
        
        Animal obj = new Animal();
        Animal obj2 = new Caballo();
        
        obj.comer();
        obj2.comer();
        
        System.out.println("¿Que come el caballo?: ");
        dato = entrada.next();
        obj.comer(dato);
        
        obj.cabalgar();
        
    }
    
}
