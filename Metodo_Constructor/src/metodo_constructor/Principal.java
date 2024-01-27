/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo_constructor;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Principal {
    
    public static void main(String[] args) {
       
        Metodos c1;
        float lado1 , lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite lado1: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite lado2: "));
        
        if (lado1 == lado2) {
            c1 = new Metodos(lado1);
        }
        else{
            c1 = new Metodos(lado1,lado2);
        }
        
        JOptionPane.showMessageDialog(null,"El perimetro es: "+c1.getPerimetro()+"\n"
                                        +"El area es: "+c1.getArea());
        
    }
        
    
}
