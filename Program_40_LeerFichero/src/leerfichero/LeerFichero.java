
package leerfichero;
import java.io.*;
public class LeerFichero {

    public static void main(String[] args) {
      File archivo = null;      // Objeto del tipo File
      FileReader fr = null;     // Objeto del tipo Filereader
      BufferedReader br = null; // Objeto del tipo BufferedReader
      
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         //("C:\\archivo.txt") ruta absoluta en el disco
         //(archivo.txt") ruta relativa en lamisma carpeta del proyecto
         archivo = new File ("archivos.txt");
        
         fr = new FileReader (archivo); // A Filereader se le asigna el archivo a Leer por caracter
         br = new BufferedReader(fr); // A BufferedReader se le asigna el archivo a Leer por lineas
 
         // Lectura del fichero
         String linea; // Variable Linea donde se guardaran las lineas del fichero
         // ReadLine(): Metodo que lee las lineas del archivo
         while((linea=br.readLine())!=null) // Mientras  existan lineas para leer
            System.out.println(linea); // Imprimelas  lineas
      }
      
      catch(Exception e){
          System.out.println("El archivo no existe.");
         e.printStackTrace();
      }
      
           
      finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){ // Si el fichero existe  
               fr.close();   // Cerrar archivo  
            }                  
         }catch (Exception e2){ 
             System.out.println("Algo ha salido mal.");
            e2.printStackTrace();
         }
      }
    }
    
}
