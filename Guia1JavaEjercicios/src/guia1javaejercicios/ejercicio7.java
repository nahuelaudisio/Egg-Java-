/*
7. Crear un programa que dado un numero determine si es par o impar
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

int numero;

        System.out.print("Ingrese un numero ->  ");
        numero = leer.nextInt();
        
        if (numero%2 == 0){
            
            System.out.println("ES PAR");
            
        }else {
            System.out.println("NO ES PAR");
        }
            

    }
    
}
