
package Herencia;


public class futbolista extends seleccion_futbol{
    
    private String ColorCamisa;
    private int numero;
    private String equipo;
    
    public futbolista(String nombre,String apellido,int edad,int id,String ColorCamisa, int numero,String equipo) {
        
        super(id,edad,nombre,apellido);//se usa para sacar valores inicialidados dentro de la clase padre
        
        this.ColorCamisa = ColorCamisa;//esto se usa para inicializar una variable
        this.numero = numero;
        this.equipo = equipo;
    }    
        
    public void mostrardatos(){    
        System.out.println("**Datos Futbolista**"
                + "\nNombre : "+getNombre()+//se pone get** para mostrar los datos por los modificadores de acceso
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nid: "+getId()+
                "\nColor Camisa: "+ColorCamisa+
                "\nNumero Camisa: "+numero+
                "\nEquipo: "+equipo);
    }
    
    //super.(nombre de metodo);
    
    
    
    
    
}
