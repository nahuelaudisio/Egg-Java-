/*
12. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int nota;

        do {
            System.out.println("Ingrese una nota entre 0 y 10: ");
            nota = leer.nextInt();
            if(nota <0 || nota>10){
                System.out.println("Incorrecto, vuelva a ingresar ");
        }
            System.out.println();
        } while (nota < 0 || nota >10);

        System.out.println("Ingreso la nota correspondida entre los valores mencionados");
    }
    

}
