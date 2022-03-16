/*
13. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial. 

 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int limite;
        System.out.println("Ingrese limite para sumar: ");
        limite = leer.nextInt();

        // ahora hago un ciclo FOR
        int numsumar, j, suma = 0;

        do {
            System.out.println("ingrese numero a sumar: ");
            numsumar = leer.nextInt();
            suma += numsumar;
            System.out.println("suma:" + suma);

        } while (suma <= limite);

        System.out.println("la suma final es ->" + suma);

    }

}
