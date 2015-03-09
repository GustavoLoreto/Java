
package escribirfichero;
import java.io.*;
public class EscribirFichero {

    public static void main(String[] args) {
            
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            /*
                Si queremos añadir al final de un fichero ya existente, 
                simplemente debemos poner un flag a true como segundo 
                parámetro del constructor de FileWriter.
            
                FileWriter fichero = new FileWriter("c:/prueba.txt",true);
            
                De lo contrario se sobre escribe la informacion de todo el
                fichero.
            */

            fichero = new FileWriter("archivo.txt");
            pw = new PrintWriter(fichero);
 
            for (int i = 0; i < 20; i++)
                pw.println("Linea " + i);
 
        } 
        
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
                if (null != fichero){
                    fichero.close();
                }
           } 
           catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
  }
