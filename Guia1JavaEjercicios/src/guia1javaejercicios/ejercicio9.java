/*
9. Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     String frase;
     
        System.out.println("Ingresa una frase o palabra: ");
        frase = leer.nextLine();
        
        
        System.out.println("la cantidad de caracteres de la cadena STRING es -> "+frase.length());
      
        
 if (frase.length()== 8){
           System.out.println("Coreccto");
       } else {
            
           System.out.println("Incorrecto");
        }
        
     
    }
    
}
