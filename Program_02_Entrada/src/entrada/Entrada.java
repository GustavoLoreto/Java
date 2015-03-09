

package entrada;

/*-----------------------------------------------------------------------------
* Name:        Entrada
* Purpose:     Pedir al usuario que introduzca una palabra.
*
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     17/04/2013
* 
*-----------------------------------------------------------------------------*/

import java.util.Scanner; /* Scaner: Libreria que permitira introducir elementos
                           * Proporcionados por el usuario*/
 
public class Entrada { // Inicio De la clase Entrada

    public static void main(String[] args) { // Inicio de la funcion Principal
        
        // Creacion de una variable tipo Scaner e instanciacion
        // segmento para la introduccion de datos
        System.out.println("Introduce una palabra:");
        Scanner PrimeraEntrada = new Scanner(System.in); // Pide ingresar un
                                                         // Valor al usuario
        
        // Segmento para devolver datos en pantalla
        // Devuelve lo Mismo Que hemos escrito
        System.out.println("La palabra que has escrito es: "+PrimeraEntrada.nextLine()); 
                                                                               
    } // Fin de la funcion Principal
} // Fin De la clase Program_03_Entrada
