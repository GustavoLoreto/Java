
package arrays;

/*-----------------------------------------------------------------------------
* Name:        Arrays
* Purpose:     Mostrar el funcionamiento de los arrays.
*
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     19/04/2013
* 
*-----------------------------------------------------------------------------*/

public class Arrays { // Inicio De la clase Arrays

    public static void main(String[] args) { // Inicio de la funcion Principal
        
        // Declaracion e instanciacion de Arrays
        String Nombre[] = new String[10];
        String Ciudad[] = new String[10];
        
        // Asignacion de valores
        Nombre [0] = "PEDRO";
        Nombre [1] = "JUAN";
        Ciudad[0] = "CARACAS";
        Ciudad[1] = "VALENCIA";  
        
        /* Otra Forma
         * Nombre[] = {"PEDRO","JUAN"};
         * Ciudad[] = {"CARACAS","VALENCIA"}
        */
        
        System.out.println(Nombre [1]);
        System.out.println(Ciudad[0]);
                       
    } // Fin de la funcion Principal
} // Fin De la clase Arrays
