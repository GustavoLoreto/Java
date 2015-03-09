
package clases;

/*-----------------------------------------------------------------------------
* Name:        MainClass
* Purpose:     Creacion de un proyecto con 2 clases. Y creacion de un metodo sin
*              Parametros.
* 
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     19/04/2013
* 
*-----------------------------------------------------------------------------*/
 
public class MainClass { // Inicio De la clase MainClass

    public static void main(String[] args) { // Inicio de la funcion Principal
   
        NuevaClase Nuevo = new NuevaClase(); /* Creacion de un Objeto llamado
                                              * Nuevo del tipo NuevaClase e
                                              * inicializacion del mismo para 
                                              * poder ser usado en el programa*/
        Nuevo.mensaje();   // Se llama al metodo mensaje() que muestra un mensaje
   } // Fin de la funcion Principal
} // Fin De la clase MainClass
