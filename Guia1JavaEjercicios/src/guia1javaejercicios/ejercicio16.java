/*
16. Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package guia1javaejercicios;

import java.util.Scanner;

/**
 *
 * @author nahue
 */
public class ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String secuencia;
        String FDE ="&&&&&";
        int contCorrecto = 0;
        int contIncorrecto = 0;

                    System.out.println("Dispositivo RS232");
        do {
                /// ejmplo de como mostrar el ultimo caracter de una cadena STRING de "n" elementos
           /// System.out.println(secuencia.substring(secuencia.length()-1, secuencia.length()));
            
    

            System.out.println("Ingrese una cadena: ");
            secuencia = leer.nextLine();
            if(secuencia.length() == 5 && "X".equals(secuencia.substring(0, 1)) && "O".equals(secuencia.substring(secuencia.length()-1,secuencia.length() ))  ){
                contCorrecto += 1;
                
                
            }else {
    contIncorrecto += 1;
    
}

    
    
    
    
} while(!secuencia.equals(FDE));

        System.out.println("Lecturas recibidas correctas: "+contCorrecto);
        System.out.println("Lecturas recibidas incorrectas: "+contIncorrecto);
    
    
    
    }
            
            
  
        
    }
    

