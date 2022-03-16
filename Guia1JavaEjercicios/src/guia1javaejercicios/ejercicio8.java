/*
 ----8. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   String frase;
    String frase2 = "eureka";
 
   
        System.out.println("Ingrese una FRASE: ");
        
        frase = leer.nextLine();
        
        if (frase.equals(frase2)){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
   
   
    }
    
}
