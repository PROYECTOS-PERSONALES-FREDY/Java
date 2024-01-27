
import javax.swing.JOptionPane;

public class Parcial extends javax.swing.JFrame {
    
    public Parcial() {
        initComponents();
    }
    
    
    
    int[] datos = new int[10];
   
    String[] imprimir = new String[10];
    
    
    
    public  void datosi(){
        for (int i=0 ;i<5; i++) {   
        datos[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite numero ["+(+i+1)+"]"));
        
        }
        
    }
    public void ordernar(){
        int aux;
        for(int i = 0; i<5-1;i++){
            for(int j=0;j<5-1;j++){
                if (datos [j] > datos[j+1]){
                aux= datos[j];
                datos[j]= datos[j+1];
                datos[j+1]=aux;
                }   
            }
        }
       txt.setText(datos[0]+" "+datos[1]+" "+datos[2]+" "+datos[3]+" "+datos[4]);
           
      
    }
    
    public void capturar (){
        
        datos[5]=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite numero [6]"));
    }
    
    public void imprimirNuevosDatos(){
        int aux;
        for(int i = 0; i<6-1;i++){
            for(int j=0;j<6-1;j++){
                if (datos [j] > datos[j+1]){
                aux= datos[j];
                datos[j]= datos[j+1];
                datos[j+1]=aux;
                }   
            }
        }
       txt.setText(datos[0]+" "+datos[1]+" "+datos[2]+" "+datos[3]+" "+datos[4]+" "+datos[5]+" ");
           
      
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt = new javax.swing.JTextField();
        opciones = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActionPerformed(evt);
            }
        });

        opciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Introducir Datos", "Ordenar", "Capturar un numero", "Ordenar con numero insertado", " " }));
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if (opciones.getSelectedIndex()==0){
        txt.setText("");
    } 
    if (opciones.getSelectedIndex()==1){
        datosi(); 
    }   
    if (opciones.getSelectedIndex()==2){
        ordernar();
    }
    if (opciones.getSelectedIndex()==3){
        capturar();
    }
    if (opciones.getSelectedIndex()==4){
       imprimirNuevosDatos(); 
    }
    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
    
    }//GEN-LAST:event_opcionesActionPerformed

    private void txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Parcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parcial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Parcial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox opciones;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
