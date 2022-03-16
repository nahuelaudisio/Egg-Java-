/*
5. Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

int numero;
        System.out.println("Ingrese u numero: ");
        numero = leer.nextInt();
        
        System.out.println("El numero ingresado es -> "+numero);
        
        int num2 = numero * 2;
        
        //muestro el numero ingresado con los requisitos del ejercicio
        
        System.out.println("El doble de "+numero+" es-> "+num2);
        
        int num3 = numero * 3 ;
        
        System.out.println("El triple de "+numero+" es-> "+num3);
        
        double raiz = Math.sqrt(numero);
        System.out.println("La raiz Cuadrada de "+numero+" es->"+raiz);
        
        
    }
    
}
