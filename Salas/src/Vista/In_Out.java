
package Vista;

import javax.swing.JOptionPane;

public class In_Out {
    public int pedir_ent(int m){
        return  Integer.parseInt(JOptionPane.showInputDialog(m));
    }
    public String pedir_pal(int m){
        return JOptionPane.showInputDialog(m);
    }
    public void resultado(String m){
        JOptionPane.showMessageDialog(null, m);
    }
    
}
