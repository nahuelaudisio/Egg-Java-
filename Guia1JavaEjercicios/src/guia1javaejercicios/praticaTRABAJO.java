/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class praticaTRABAJO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
        int n;

   System.out.println("Ingrese el valor de - n - : ");
n = leer.nextInt();

for(int i = 1; i<=n ;i++){
    // ahora empiezo a hacer las condiciones
    
    if(i%3==0 && i%5==0){
        System.out.println("FizzBuzz");
    } 
    if(i%3==0 && i%5!=0){
        System.out.println("Fizz");
    }
    if(i%5==0 && i%3!=0){
        System.out.println("Buzz");
    }
    if(i%3!=0 && i%5!=0){
        System.out.println(i);
    }
   
    

}
    }
    
}
