/*
19. Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).

El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $(DOLARES) es un 1 €
 * 129.852 yenes es un 1 €


 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("APLICACION DE CAMBIO DE MONEDAS(dolares,libras,yenes)");
        System.out.println();
        
        int cantEuros;
        String moneda;
        
        System.out.println("Ingrese cantidad de EUROS a cambiar: ");
        cantEuros = leer.nextInt();
        
        System.out.println("Ingrese a que moneda quiere convertir sus EUROS -> ");
        moneda = leer.next();
        
  
cambio(cantEuros,moneda);

       
        
        
      
    }
           public static void cambio(int cantEuros,String moneda){
              
           switch (moneda) {
            case "dolares":
                float dolar = 1.28611f * cantEuros;
                System.out.println("Su cambio de EUROS a "+moneda+" es de: "+dolar);
                break;
            case "libras":
                float libra =  0.86f * cantEuros;
                System.out.println("Su cambio de EUROS a "+moneda+" es de: "+libra);
                break;
            default:
                float yene = 129.852f * cantEuros;
                System.out.println("Su cambio de EUROS a "+moneda+" es de: "+yene);
                break;
        }
           }

 
    
    
}
