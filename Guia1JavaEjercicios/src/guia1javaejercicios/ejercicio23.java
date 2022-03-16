/*
23. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre
la traspuesta de la matriz.

MATRIz
****
****
****
****
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner leer = new Scanner(System.in);

int nColum,nFilas;

        System.out.println("Ingrese cantidad de filas de la matriz: ");
        nFilas = leer.nextInt();
        System.out.println("Ingrese cantidad de Columnas de la matriz: ");
        nColum = leer.nextInt();
       
        int [][] matriz = new int [nFilas][nColum];
        
        //aca lleno la matriz de manera aleatoria
        for(int i=0;i <nFilas;i++){
            for(int j=0;j<nColum;j++){
                
                matriz [i][j] = (int) (Math.random() * 10);
                
                
            }
            
        }
        
        // ahora muestro la matriz 
        
        System.out.println("\n La MATRIZ quedo ASI: ");
        
                for(int i=0;i <nFilas;i++){
            for(int j=0;j<nColum;j++){
                
                System.out.print("[ "+matriz[i][j]+" ]");
                
                
            }
                    System.out.println();
        }

    }
    
}
