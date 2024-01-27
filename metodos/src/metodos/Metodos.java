package metodos;

import javax.swing.JOptionPane;

public class Metodos {
    public static void main(String[] args) {
        
       int n1,n2,n3,n4,n5,n6;
        datos obj=new datos();
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n1"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n2"));
        
        obj.suma(n1, n2);
        
        n3=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n3"));
        n4=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n4"));
        
        System.out.println("La resta es: "+obj.resta(n3, n4));
        
        n5=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n5"));
        n6=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de n6"));
        
        System.out.println("La resta es: "+obj.multiplicacion(n5, n6));
        
    }
    
}
