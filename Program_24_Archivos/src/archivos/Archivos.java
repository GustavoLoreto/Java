
package archivos;

/*-----------------------------------------------------------------------------
* Name:        Archivos
* 
* Purpose:     Mostrar el funcionamiento de la Clase File para la manipulacion
*              de archivos.
* 
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     24/04/2013
* 
*-----------------------------------------------------------------------------*/

// Biblioteca para trabajar con archivos
import java.io.File;
import java.util.*;

public class Archivos {

    public static void main(String[] args) { // Inicio de la funcion Principal.
        
        // Se indica la direccion en la que se va a buscar el archivo.
        File archivo = new File("C:\\Users\\Anonymous\\Documents\\NetBeansProjects\\Program_24_Archivos\\Archivo2.txt");
        final Formatter  nuevoarchivo;
        // Verifica si el archivo existe
        if(archivo.exists()){ // Inicio del If Principal
            
            // If anidado para indicar si se puede escribir el archivo 
            if(archivo.canWrite()){ // Inicio del If Anidado
              System.out.println("El Archivo se puede escribir.");  
            } // Fin del If Anidado
            else{ // Inicio del Else Anidado
             System.out.println("El Archivo se no puede escribir.");   
            } // Fin del Else Anidado
            
        } // Fin del If Principal
        
        else{ // Inicio del Else
            
            try{ // Si no se genera un error hara . . .
                nuevoarchivo = new Formatter("C:\\Users\\Anonymous\\Documents\\NetBeansProjects\\Program_24_Archivos\\Archivo2.txt");
                System.out.println("El Archivo ha sido creado."); 
                nuevoarchivo.format("%s %s %s","Wilmer","Planchez","24");
                nuevoarchivo.close();
            }
            catch(Exception e){ // Si se genera un error hara . ..
                System.out.println("Error: " + e); 
            }
            
        } // Fin del Else
        
    } // Fin de la funcion principal
}
