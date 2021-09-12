
package arreglos;

import java.util.Scanner;
import paquete2.Heroe;


public class Arreglos {

   
    public static void main(String[] args) {
        
     Scanner entrada =new Scanner(System.in);
     int[] numeros=new int[5];  
     
       /* System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]); */
        
         for(int i=0;i<numeros.length;i++){  
             
             System.out.println("Dijita un numero");
             numeros[i]=entrada.nextInt();
        }
     
        
        
        for(int i=0;i<numeros.length;i++){
            
            System.out.println(numeros[i]);
            
        }
     
     
     
     // como se utiliza una clase
     // crear objetos
     //una variable
     
        Heroe heroe=new Heroe();
        
        Enemigo enemigo=new Enemigo();
        
        // acediendo a atributos
        enemigo.nombre = "BORRE";
        heroe.nombre = "LUCHO DIAZ";
       /* System.out.println(heroe.nombre);
        
        //Acceder atributo privado
        heroe.setEdad(-5);
        //imprimir  valore de los atributos
        System.out.println(heroe.getEdad());
       */
        
        
    }
    
}
