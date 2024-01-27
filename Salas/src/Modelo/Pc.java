
package Modelo;

public class Pc {
    private int id;
    private String sistema_op;
    private String caracteristicas;
    private boolean funcion;
    
    public Pc(int id, String sistema_op, String caracteristicas, boolean funcion){
        this.id=id;
        this.sistema_op=sistema_op;
        this.caracteristicas=caracteristicas;
        this.funcion=funcion;
    }
     public int getid(){
         return id;
     }
     public String getsistem(){
         return sistema_op;
     }
     public String getcaract(){
         return caracteristicas;
     }
     public boolean getfunc(){
         return funcion;
     }
}
