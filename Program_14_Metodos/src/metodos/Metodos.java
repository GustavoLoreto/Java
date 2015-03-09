
package metodos;

/*-----------------------------------------------------------------------------
* Name:        Metodos
* Purpose:     Creacion de un proyecto con 2 clases. Y creacion de mas de un
*              metodo sin parametros.
* 
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     19/04/2013
* 
*-----------------------------------------------------------------------------*/
 
public class Metodos { // Inicio De la clase Metodos

    public static void main(String[] args) { // Inicio de la funcion Principal
   
        NuevaClase Nuevo = new NuevaClase(); /* Creacion de un Objeto llamado
                                              * Nuevo del tipo NuevaClase e
                                              * inicializacion del mismo para 
                                              * poder ser usado en el programa*/
        Nuevo.mensaje();   // Se llama al metodo mensaje() que muestra un mensaje
        Nuevo.otromensaje();
   } // Fin de la funcion Principal
} // Fin De la clase Metodos
