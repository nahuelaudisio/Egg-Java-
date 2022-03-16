/*
21. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner leer = new Scanner(System.in);
int N,num;
int contador = 0;
        System.out.println("Ingrese la cantidad de elementos del VECTOR: ");
        N = leer.nextInt();
        
        int[] vector = new int[N];
        
        System.out.println("ingresar el numero a buscar en el vector: ");
        num = leer.nextInt();
        
        
        //lleno el vector
        
        for(int i=0;i<N;i++){
            vector[i] = (int) (Math.random()*100);
            
                    
        }
        
        // busco numero y posiciones donde esta
        
                for(int i=0;i<N;i++){
          
            if (vector[i]== num){
                contador += 1;
                System.out.println("Se encontro en la POSICIÓN "+(i+1)+" el numero: "+num);
                
            }
                    
        }
        
        
        // lo muestro
               
        System.out.println("AHORA MUESTRO EL VECTOR");
                
        for(int i:vector){
            System.out.print("[ "+i+" ]");
        }
        System.out.println();
      if(contador == 1){
          System.out.println("El numero "+num+" se encontro una vez en el arreglo");
          
      }else {
          System.out.println("el numero a buscar se encontro "+contador+" veces");
          
      }
    }
    
}
