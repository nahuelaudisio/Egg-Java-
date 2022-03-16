/*
15. Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
//////
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción

///

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // codigo aqui
     
            Scanner leer = new Scanner(System.in);
        String salir = null;
        int num,num2, opc,oper;
        salir = "N";
        do{
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            System.out.println("Elija opcion:");
            opc = leer.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Ingrese los dos numero que desea sumar");
                    num = leer.nextInt();
                    num2 = leer.nextInt();
                    oper = num +num2;
                    System.out.println("El resultado de la operacion es "+ oper);
                    break;
                case 2:
                    System.out.println("Ingrese los dos numero que desea restar");
                    num = leer.nextInt();
                    num2 = leer.nextInt();
                    oper = num - num2;
                    System.out.println("El resultado de la operacion es "+ oper);
                    break;
                case 3:
                    System.out.println("Ingrese los dos numero que desea multiplicar");
                    num = leer.nextInt();
                    num2 = leer.nextInt();
                    oper = num * num2;
                    System.out.println("El resultado de la operacion es "+ oper);
                    break;
                case 4:
                    System.out.println("Ingrese los dos numero que desea dividir");
                    num = leer.nextInt();
                    num2 = leer.nextInt();
                    oper = num / num2;
                    System.out.println("El resultado de la operacion es "+ oper);
                    break;
                case 5:
                    System.out.println("Seguro que desea salir? S/N");
                    salir = leer.next();
                    break;
            }
        }while((!"s".equals(salir)) && (!"S".equals(salir)));
    }
    
}

