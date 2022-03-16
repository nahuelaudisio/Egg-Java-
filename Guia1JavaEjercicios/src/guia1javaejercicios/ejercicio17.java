/*
17. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int n;
        System.out.println("Ingrese el tamaño del cuadrado");
    n = leer.nextInt();
    
    // inicio Ciclo FOR
    
    for(int i=0; i<n;i++){
        //LINEA SUPERIOR DEL CUADRADO
        System.out.print("*");
        
    }
        System.out.println();
        // CENTRO DEL CUADRADO
        for(int i=0;i<n-2;i++){
            System.out.print("*");
            for(int j=0;j<n-2;j++){
                System.out.print(" ");
                
            }
            System.out.println("*");
        }
    
        for(int i=0; i<n;i++){
        //LINEA INFERIOR DEL CUADRADO
        System.out.print("*");
        
    }
    
    
        System.out.println(); 
    }
    
}
