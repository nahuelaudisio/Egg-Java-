/*
CONDICIONALES
6. Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   
   int numero, numero2;
   
        System.out.println("Ingrese primer numero a comparar: ");
        numero = leer.nextInt();
        
        
           System.out.println("Ingrese Segundo numero a comparar: ");
   numero2 = leer.nextInt();
   
   // utilizo una funcion MATH
   
   int mayor = Math.max(numero, numero2);
   
   // ahora lo muestro
   
        System.out.println("El numero mayor es -> "+mayor);
        
        
           
   
    }
    
}
