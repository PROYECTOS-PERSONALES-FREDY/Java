
package Herencia;


public class Entrenador extends seleccion_futbol {
    
    private String Lugar_nacimiento;
    private int idfederacion;
    
    public Entrenador(String nombre, String apellido, int edad, String Lugar_nacimiento, int idfederacion, int id ) {
        
        super(id, edad, nombre, apellido);
        
        this.Lugar_nacimiento = Lugar_nacimiento;
        this.idfederacion = idfederacion;
    }
    
    public void mostrardatos(){    
        System.out.println("\n**Datos Entrenador**"
                + "\nNombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nid: "+getId()+
                "\nLugar de nacimiento: "+Lugar_nacimiento+
                "\nId Federacion: "+idfederacion );
    }
    
}
