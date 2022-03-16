/*
1. Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class Guia1JavaEjercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int num1,num2,num3,suma;
        System.out.println("Ingrese tres numeros para la suma de los mismos: ");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        num3 = leer.nextInt();
        
       suma = num1 + num2 + num3 ;
       
        System.out.println("la suma de los numeros ingresados es: "+suma);
      
    }
    
}
