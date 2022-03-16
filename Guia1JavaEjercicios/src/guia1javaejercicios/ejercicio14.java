/*
14. Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa 
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el 
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // aqui arranco el codigo 
        Scanner leer = new Scanner(System.in);

        int numeros = 0;
        int suma = 0;
        int condicion = 0;

        for (int i = 1; i <= 20; i++) {

            System.out.println("Ingrese numeros a sumar: ");
            numeros = (int) (Math.random() * 10);
            // realizo condisiones
            if (numeros == 0) {
                condicion += 1;
                break; //me salgo del bucle for actual y se detiene la iteracion

            }

            if (numeros < 0) {
                continue;// no suma los numeros menos a CERO que ingrese
            }
            suma += numeros;

        }

        if (condicion == 1) {
            System.out.println("Se capturo el numero CERO");
            System.out.println("La suma quedo en: " + suma);

        } else {
            System.out.println("la suma total es: " + suma);
        }

    }

}
