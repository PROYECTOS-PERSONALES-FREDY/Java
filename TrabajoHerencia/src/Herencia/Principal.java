
package Herencia;


public class Principal  {
    public static void main(String[] args) {
      
       futbolista ft = new futbolista("James","Rodriguez",28,2564,"amarillo",10,"Colombia" );
       
       ft.mostrardatos();
       
       Entrenador et = new Entrenador("Fredy","Camacho",40,"Colombia",15632456,100);
       
       et.mostrardatos();
    }
}
