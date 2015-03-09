
package sobrecarga;

/*-----------------------------------------------------------------------------
* Name:        Sobrecarga
* 
* Purpose:     Programa Para Mostrar el funcionamiento de la sobrecarga de
*              metodos constructores. Se sobrecargan mediante el uso de 
*              multiples constructores. Es util cuando se crean objetos
*              que pueden tener un numero variable de argumentos.
* 
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     21/04/2013
* 
*-----------------------------------------------------------------------------*/

public class Sobrecarga { // Inicio de la clase Sobrecarga
   
    public static void main(String[] args) { // Inicio de la funcion principal
        
    int Hora = 2;
    int Minuto = 4;
    int Segundo = 7; 
    
         Cargando Objeto = new Cargando(Hora,Minuto,Segundo);
    } // Fin de la funcion principal
} // Fin de la clase Sobrecarga
