
package ejercicio2;

import javax.swing.JOptionPane;


public class Ejercicio2 {
    private static Object JOptionpane;

    public static void main(String[] args) {
        
        int numero,aleatorio,contador =0;
        
        aleatorio = (int) (Math.random()*100);//generar un numero aleatorio entre 0 y 100
        
        numero =Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
        do{
            
            if (aleatorio > numero){
                numero =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero mayor"));
            }
            else{
                numero =Integer.parseInt(JOptionPane.showInputDialog("Digite un numero menor"));
            }
            contador ++;
        }while (numero != aleatorio);
        
        System.out.println("\nGenial adivinaste el numero en: "+contador+" intentos");
        
        
    }
    
}
