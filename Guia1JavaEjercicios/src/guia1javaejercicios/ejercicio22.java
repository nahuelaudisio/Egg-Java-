/*
22. Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int N;
    int cont1C,cont2C,cont3C,cont4C,cont5C;
cont1C = 0;
cont2C = 0;
cont4C = 0;
        cont3C = 0;
        cont5C = 0;

        System.out.println("Ingrese cantidad de elementos del vector: ");
        N = leer.nextInt();
        
        int [] vector = new int [N];
        
        // lleno el vector 
        
        for(int i=0;i<N;i++){
            System.out.println("Ingrese numeros para el vector entre 1 y 5 digitos: ");
            vector [i] = leer.nextInt();
            
        }
        
       // mmuestro vector
       
      for(int i:vector){
          System.out.print("[ "+i+" ]");
      }
        System.out.println();
    // comienzo a verificar cuatas cifras tiene cada eleemnto del vectot
    
    for(int i=0;i<N;i++){
         int cont = 0;
         if(vector[i]==0){
             cont1C += 1;
         }
         
        while(vector[i]>=1 || vector[i]<=-1){
            vector[i] = vector[i]/10;
                cont += 1;
    
        }

        
                 if(cont == 1 ){
                cont1C += 1; 
                
            } else if(cont==2){
                cont2C += 1;
            } else if(cont ==3){
                cont3C += 1;
                
            }        else    if(cont == 4){
                cont4C += 1; 
                
            }  else          if(cont == 5){
                cont5C += 1; 
                
            }
        
        
    }
    
        System.out.println("Elementos de 1 DIGITO: "+cont1C);
          System.out.println("Elementos de 2 DIGITOs: "+cont2C);
  System.out.println("Elementos de 3 DIGITOs: "+cont3C);
  System.out.println("Elementos de 4 DIGITOs: "+cont4C);

  System.out.println("Elementos de 5 DIGITOs: "+cont5C);

// este imprimo pantalla es para separar el fin de programa ordenado 
        System.out.println();
    }
    
}
