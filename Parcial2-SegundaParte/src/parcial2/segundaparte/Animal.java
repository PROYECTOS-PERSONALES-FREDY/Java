/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package parcial2.segundaparte;

/**
 *
 * @author Laboratorio Software
 */
public class Animal {

    public void comer() {
        System.out.println("El animal come algo general"); 
    }
    
    public void comer(String comida){
        
        System.out.println("El caballo come "+comida);
        
    }
    
    public void cabalgar(){
        System.out.println("Ahora el caballo Cabalga");
    }
}
