
package clases;

/*-----------------------------------------------------------------------------
* Name:        Program_12_DosClases
* Purpose:     Creacion de un proyecto con 2 clases. Y creacion de un metodo sin
*              con parametros.
* 
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     19/04/2013
* 
*-----------------------------------------------------------------------------*/

import java.util.Scanner; /* Scaner: Libreria que permitira introducir elementos
                           * Proporcionados por el usiario*/

public class MainClass { // Inicio De la clase Program_12_DosClases

    public static void main(String[] args) { // Inicio de la funcion Principal
        
        // Creacion de un objeto tipo Scanner para obtener la entrada de la 
        // ventana de comandos.
        Scanner Entrada = new Scanner(System.in);
        
        NuevaClase Nuevo = new NuevaClase(); /* Creacion de un Objeto llamado
                                              * Nuevo del tipo NuevaClase e
                                              * inicializacion del mismo para 
                                              * poder ser usado en el programa*/
        System.out.print("Escriba el nombre del curso: ");
        String NombreDelCurso = Entrada.nextLine(); // Lee una linea de texto
        System.out.println(); // Imprime una linea en blanco
        
        Nuevo.mensaje(NombreDelCurso); /* Llama al metodo mensaje() de la clase
                                        * NuevaClase, donde se usa el objeto 
                                        * Nuevo de la misma clase(NuevaClase)
                                        * y pasa NombreDelCurso como parametro
                                        */
        
   } // Fin de la funcion Principal
} // Fin De la clase Program_12_DosClases
