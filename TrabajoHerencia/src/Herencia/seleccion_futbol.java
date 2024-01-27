
package Herencia;

public class seleccion_futbol {
    //variables
    private int id; //protected se usa para que los hijos puedan acceder
    private int edad;//private hace que solo estos datos puedan ser usados por esta clase
    private String nombre;
    private String apellido;

    public seleccion_futbol(int id, int edad, String nombre, String apellido) {
        
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // con getter mostramos los datos
    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    
    
    
    
}

//https://jarroba.com/herencia-en-la-programacion-orientada-a-objetos-ejemplo-en-java/