/*
18. Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int n1,n2,n3,n4;
    //String aste1;
        System.out.println("Los numeros a ingresar deben estar comprendidos entre 1 y 20");
        System.out.println();
    do{
        System.out.println("Ingrese primer numero: ");
        n1 = leer.nextInt();
    }while(n1<=0 || n1>=21);
    
   
           do{
        System.out.println("Ingrese segundo numero: ");
        n2 = leer.nextInt();
    }while(n2<=0 || n2>=21);
           
               do{
        System.out.println("Ingrese tercer numero: ");
        n3 = leer.nextInt();
    }while(n3<=0 || n3>=21);
               
                   do{
        System.out.println("Ingrese cuarto numero: ");
        n4 = leer.nextInt();
    }while(n4<=0 || n4>=21);
                   
  
 // aca genero un for que guarde la misca cantidad de elementos a los numeros ingresados    
    ////////////////////////////////////
   //se imprime primer numero
    System.out.print(n1+" ");
    for(int i=1;i<=n1;i++){
        System.out.print("*");
        
    }
        System.out.println();
       
        System.out.print(n2+" ");
    for(int i=1;i<=n2;i++){
        System.out.print("*");
        
    }
 
                System.out.println();
       
        System.out.print(n3+" ");
    for(int i=1;i<=n3;i++){
        System.out.print("*");
        
    }
                System.out.println();
       
        System.out.print(n4+" ");
    for(int i=1;i<=n4;i++){
        System.out.print("*");
        
    }
    
        System.out.println();
    }
   
    
    
    
    
    
    
    
    
    
    
    
    }

