
package estructuraswitch;

/*-----------------------------------------------------------------------------
* Name:        EstructuraSwitch
* Purpose:     Mostrar el funcionamiento de la estructura de control Switch
*
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     19/04/2013
* 
*-----------------------------------------------------------------------------*/

import java.util.Scanner; /* Scaner: Libreria que permitira introducir elementos
                           * Proporcionados por el usiario*/

public class EstructuraSwitch { // Inicio De la clase EstructuraSwitch

    public static void main(String[] args) { // Inicio de la funcion Principal
        
        // Creacion de un objeto del tipo Scanner
        Scanner Entrada = new Scanner(System.in);
        
        // Declaracion de variables
        int Dia;
                
        System.out.print("Introduzca un numero entero  del 1 al 7: ");// Pide un numero
        Dia = Entrada.nextInt();
        
        /* Dia = Entrada.nextInt(): Utiliza el metodo nextInt del objeto Entrada 
         * clase Scanner para obtener un numero introducido por teclado.
         * 
         * NOTA:
         * Se debe introducir un numero entero para que no se genere un error.
        */
        
        switch (Dia){ // Inicio de la estructura Switch
            case 1 : 
                System.out.println("El dia es Lunes.");
                break;
            case 2 : 
                System.out.println("El dia es Martes.");
                break;
            case 3 : 
                System.out.println("El dia es Miercoles.");
                break;
            case 4 : 
                System.out.println("El dia es Jueves.");
                break;
            case 5 : 
                System.out.println("El dia es Viernes.");
                break;
            case 6 : 
                System.out.println("El dia es Sabado.");
                break;
            case 7 : 
                System.out.println("El dia es Lunes.");
                break;
            default:
               System.out.println("El nuemero introducido no corresponde a un dia de la semana.");
                
        } // Inicio de la estructura Switch
    } // Fin De la clase EstructuraSwitch
} // Fin de la funcion Principal
