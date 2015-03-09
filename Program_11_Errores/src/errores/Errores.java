
package errores;

/*-----------------------------------------------------------------------------
* Name:        Program_10_DoWhile
* Purpose:     Mostrar el tratamiento de Errores con la estructura Try Catch
*
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     19/04/2013
* 
*-----------------------------------------------------------------------------*/
 
public class Errores { // Inicio De la clase Errores
      
    public static void main(String[] args) { // Inicio de la funcion Principal
        
        int Numero;
        String Cadena = "Hola";
        
        try{ // Codigo que se va a Probar 
            Numero = Integer.parseInt(Cadena); /* Convierte a entero el contenido
                                      de la variable Cadena*/
        } // Fin de Try
        catch(NumberFormatException ex){ // Se indica el tipo de error a capturar
            System.out.println("No es un numero, es una cadena. ");  // Accion
        } // Fin de Catch    
    } // Fin de la funcion Principal
} // Fin De la clase Errores
