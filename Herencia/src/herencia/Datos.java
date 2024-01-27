
package herencia;

import javax.swing.JOptionPane;

public class Datos {
    
String nombre;
int salario;

    public Datos () {
        nombre= JOptionPane.showInputDialog("Cual es su nombre");
        salario= Integer.parseInt(JOptionPane.showInputDialog("Cual es su Salario"));
        
    }
    
    public void impuestos () {
        if(salario>=500){
            JOptionPane.showMessageDialog(null,nombre+" paga impuestos");
        }else{
            
            JOptionPane.showMessageDialog(null,nombre+" no paga impuestos");
        }
        
        
    }
    
    
    //el constructor se saca con click derecho, insert code , constructor
    /*public Datos(String nombre, int salario) {//lo que llegue aqui se reemplaza en las variables principales
        this.nombre = nombre;
        this.salario = salario;
    }*/
    
//get y set se utiliza para ser un intermediario        
    
}
