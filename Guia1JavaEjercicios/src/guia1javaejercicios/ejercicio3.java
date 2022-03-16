/*
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String frase;
        System.out.println("Ingrese una frase: ");
        // PARA QUE guarde una cadena de caracteres con ESPACIOS se una
        // VARIABLE = leer.nextLine();
        frase = leer.nextLine();
        
        // ahora muestro la frase en minuscula con -> toLowerCase() 
        // tengo que crear una variable para guardar la que ingrese por teclado
        
        String fraseminuscula = frase.toUpperCase();
        
        System.out.println("La frase ingresada queda asi -> "+fraseminuscula);
        
        // ahora muestro es mayusculas
        
        String FRASEmauscula = frase.toLowerCase();
        
        System.out.println("La frase queda asi -> "+FRASEmauscula);
        
        
        
        
        
        
    
       
    }
    
}
