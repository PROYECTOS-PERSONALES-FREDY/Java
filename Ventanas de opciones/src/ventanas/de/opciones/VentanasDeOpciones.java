
package ventanas.de.opciones;

import javax.swing.JOptionPane;

public class VentanasDeOpciones {

   
    public static void main(String[] args) {
     
      String cadena;
      int entero;
      char letra;
      double decimal;
      float decimal0;
      
      //se usa para guardar datos en cuadros
        cadena = JOptionPane.showInputDialog("Digite una cadena: ");//se usa para string (cadenas = textos)
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite una entero: "));// se usa el Integer.parseInt() para transformar esos datos a enteros , si no , saldria error
        letra = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0); // se usa para un caracter :n
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));// se usa el Double.parseDouble() para transformar esos datos a decimales , si no , saldria error
        decimal0 = Float.parseFloat(JOptionPane.showInputDialog("Digite un decimal 2: "));// lo mismo de arriba pero con float
        
      //se usa para titulos 
        JOptionPane.showMessageDialog(null,"la cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"el numero entero es: "+entero);
        JOptionPane.showMessageDialog(null,"el caracter es: "+letra);
        JOptionPane.showMessageDialog(null,"el decimal es: "+decimal);
        JOptionPane.showMessageDialog(null,"el decimal 2 es: "+decimal0);
    }
    
}
