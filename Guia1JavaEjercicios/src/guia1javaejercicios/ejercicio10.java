/*
-10-. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   String frase;
   
   String letra = "A";
        System.out.println("Ingrese una frase o palabra: ");
        frase = leer.nextLine();
       
        
        System.out.println("El primer Caracter es -> "+frase.substring(0,1));
      
        System.out.println("la letra a verificar en el ejercicio es -> "+letra);
        
        /// creo otra variable que guarde la primer letra de mi frase a ingresar 
        
       String fraseletra = frase.substring(0, 1);
       
       // verifico si se guardo y se muestra en pantalla
         
        System.out.println("la letra guardada en esta variable es: "+fraseletra);
        
        if(fraseletra.equals(letra)) {
            System.out.println("Correcto");
            
        } else {
            System.out.println("Incorrecto");
            
        }
   
    }
    
}
