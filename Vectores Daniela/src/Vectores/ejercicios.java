
package Vectores;

public class ejercicios {
    
        public static void main(String[] args){// static void crea parametros generales para todas las clases
            int arr[]={1,2,3,4,5};

            for (int i=0 ;i<5 ; i++){
                    System.out.println(arr[i]);
            }

            modificarArreglo(arr);

            System.out.println("Los datos modificados son:");
                for (int i=0;i<5;i++){
                    System.out.println(arr[i]);
                }


            modificarElemento(arr[3]);

        }
    
        public static void modificarArreglo(int modificar[]){
                for (int i=0;i<5;i++){
                    modificar[i]*=2;
                }
        }
    
        public static void modificarElemento(int elemento){
            
            elemento*=2;
            
            System.out.println("El elemento de la posicion [3] es:"+elemento);
        }
        
        
    }
    
    
 

