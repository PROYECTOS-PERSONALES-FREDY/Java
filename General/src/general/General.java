/* Sentencia if:
    
    if (condicion1){
        Instruccion1;
    }
    esle if (condicion 2){
        Instruccion2;
    }
    else{
        Instruccion3;
    }
*/
package general;

//estas dos librerias se usan para introducir valiables , se puede usar cualquiera de las dos

import java.util.Scanner; //(libreria) se usa para utilizar el scanner
import javax.swing.JOptionPane;//se utiliza para los cuadros de texto


public class General {

    public static void main(String[] args) {
        
       //TIPOS DE DATOS PRIMITIVOS
        
       byte numero; // byte acarrea datos desde -128 a 127
       short corto; // short acarrea datos desde -32.768 a 32.767
       int medio;   // int acarrea datos desde -2.147.483.648 a 2.147.483.647
       long largo;  // long acarrea datos desde -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
       float decimal;// se usa para decimales
       double decimalar;// se usa para decimales mas largos
       char caracter; //es para un caracter :n
       boolean decision0;// se usa para decisiones
       boolean decision1;
       
       final int numero0 = 10; //constante
       
       numero = 12;
       corto = 12356;
       medio = 5431*54;
       largo = 118487*1165;        
       decimal = 3.45f;// se le pone la f para q detecte que es un float
       decimalar = 3.4568464;        
       caracter = 'a';// solo se puede guardar una letra
       decision0 = true;
       decision1 = false;
       
       // sout + tab para que sea mas facil copiar los system.out
       
        System.out.println("Hola"); //Comando para escribir titulos
        System.out.println("Byte "+ numero);
        System.out.println("short "+ corto);
        System.out.println("int "+ medio);
        System.out.println("long "+ largo);
        System.out.println("float "+ decimal);
        System.out.println("decimal largo "+ decimalar);
        System.out.println("caracter "+ caracter);
        System.out.println("decision 1 "+ decision0);
        System.out.println("decision 0 "+ decision1);
        
        
        //-----------TIPOS DE DATOS NO PRIMITIVOS---------------//
        
        Integer numero1 = null;  //es como el int pero con la diferencia de que almacena el valor null 
        String palabra = "ira we soy un caracter"; //sirve para guardar cadenas
        
        System.out.println("numero nulo: "+ numero1);
        System.out.println("Palabra: "+ palabra);
        
        //------Scanner se usa para introducir variables, antes se introduce la libreria----//
       
        Scanner entrada = new Scanner (System.in);//solo con un scanner y un nombre basta
        
        // Scanner Enteros (int)
        
        int valor;
        
        System.out.print("Digite numero: ");
        valor = entrada.nextInt(); // se pone nextInt por que es un entero
        
        System.out.println("El numero es: "+valor);
        
        //Scanner decimales (Float)
        
        float valor0;
        
        System.out.print("Digite numero: ");
        valor0 = entrada.nextFloat();//se pone nextfloat por que es un entero
        
        System.out.println("El numero decimal es: "+valor0);
        
        //Scanner string (cadenas)
        
        String valor1;
        
        System.out.print("Digite una palabra larga: ");
        valor1 = entrada.nextLine(); // se pone nextline para que guarde toda la palabra
                                      // y se pone next para guardar una palabra hasta el espacio
        
        System.out.println("la palabra es: "+valor1);
        
        //Scanner char (caracteres)
        
        char valor2;
        
        System.out.print("Digite una letra: ");
        valor2 = entrada.next().charAt(0); //se pone charAt y en () el numero 
                                            //de letras q quiere tomar, en este caso la primera letra
        
        System.out.println("la letra es: "+valor2);
        
        //---------------Operaciones Aritmeticas------------------//
        
       //suma resta multiplicacion divicion
        
        float n1,n2,suma,resta,mult,div,resto,n3,n5,n6;
        int n4,n7,n8;
        
        System.out.println("Digite 2 numeros: ");
        
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        
        suma   = n1+n2;
        resta  = n1-n2;
        mult   = n1*n2;
        div    = n1/n2;
        resto  = n1%n2;
       
        System.out.println("La suma es: "+suma);   
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+mult);
        System.out.println("La divicion es: "+div);
        System.out.println("El resto es: "+resto);
        
        //-------------Raices y Potencias-----------------------//
        
        //Raiz
        
        System.out.print("Introdusca un numero sin raiz exacta: ");
        n3 = entrada.nextFloat();
        System.out.print("Introdusca un numero con raiz exacta: ");
        n4 = entrada.nextInt();
        
        double raiz = Math.sqrt(n3); //solo se usa double para raiz
        int raiz0 = (int) Math.sqrt(n4); // se coloca (int) para que sea en enteroy se transforme
        
        System.out.println("Raiz decimal: "+raiz);
        System.out.println("Raiz entera: "+raiz0);
        
        //Potencia
        
        System.out.print("Introdusca base decimal: ");
        n5 = entrada.nextFloat();
        System.out.print("Introdusca exponente decimal: ");
        n6 = entrada.nextFloat();
        System.out.print("Introdusca base entera: ");
        n7 = entrada.nextInt();
        System.out.print("Introdusca exponente entero: ");
        n8 = entrada.nextInt();
        
        double potencia = Math.pow(n5,n6); //primero la base y luego el exponente 
        int potencia0 =(int)Math.pow(n7,n8);
        
        System.out.println("Su potencia decimal es: "+potencia );
        System.out.println("Su potencia entera es: "+potencia );
        
        //Redondear Decimales
        
        double numero3 = 4.56;
        long resultado = Math.round(numero3); //se usa long con double
        System.out.println("Numero a redondear: "+numero3);
        System.out.println("El redondeo es: "+resultado);
        
        float numero4 = 3.45f;
        int resultado0 = Math.round(numero4); //se usa int con float
        System.out.println("Numero a redondear: "+numero4);
        System.out.println("El redondeo es: "+resultado0);
       
        //numero ramdom
        
        double numero5 =Math.random();
        
        System.out.println("numero random: "+numero5);
        
        
/* Condicionales
--------------------------------------
    Sentencia if:
    
    if (condicion1){
        Instruccion1;
    }
    esle if (condicion 2){
        Instruccion2;
    }
    else{
        Instruccion3;
    }
----------------------------------------
    Sentencia switch:

    switch(dato){
        case 1: Instrucciones1;
                break;
        case 2: Instrucciones2;
                break;
        ...
        case n: Instrucciones n;
                break;
        default: CasoContrario(de no ser ninguna de esas opciones);
                break;
    }            
*/
        
        
    /* Cilos
-------------------------
    Ciclo While

    While(condicion){
        Instrucciones;
    }
-------------------------
    Ciclo do while

    do{
        Instrucciones;
    }while(condicion);
-------------------------
    Ciclo for
    
    for(inicializacion ; condicion ; aumento o decremento){
        Instrucciones;
    }

*/    
      //Bucle while            
      int a=1;  
        while (a<=10){
            System.out.println(a);
            a++;
        }
    //Bucle do while
      int b=11;  
        do{
            System.out.println(b);
        }while(b<=10);// minimo se va a ejecutar una vez
    //Bucle for    
       
        for (int i=10; i>=0 ; i--){
            System.out.println(i);
        }  
        
        
    /*en el jFrame se puede hacer un bloqueo de seleccion , para escoger solo una opccion enlazando 
      button group */ 
        
    }
    
}
