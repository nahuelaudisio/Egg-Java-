/*
20. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
       // Declaración y creación de un Vector
       
       int[] vector = new int[100];
       
           
           
           
           
           System.out.println("Rellenar un VECTOR");
//RElleno el vector

        for(int i=0;i<=99;i++){
            
            vector[i] = 100 - i;
            
        }
        
        
        /// ahora lo muestro con el for ecth
        System.out.println("\nmuestro los elementos del vector");
        for(int i:vector){
            System.out.println("[ "+i+" ]");
        }
        
        System.out.println();
        
    }
    
}
