/*
4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      
      float centigrados;
      
      
        System.out.println("ingrese grados centigrados: ");
        centigrados = leer.nextFloat();
        float F = 32 + (9 * (centigrados / 5));
        
        System.out.println("Grados Fahrenheit: "+F);
        
        
        
        
        
      
    }
    
}
