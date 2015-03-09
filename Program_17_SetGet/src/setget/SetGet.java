
package setget;

/*-----------------------------------------------------------------------------
* Name:        Program_17_GetGet
* Purpose:     Programa Para Mostrar el funcionamiento de los metodos Set y Get
* 
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     20/04/2013
* 
*-----------------------------------------------------------------------------*/

public class SetGet {
    
    public static void main(String[] args) { // Inicio de la funcion principal
        
        int Hora = 2;
        int Minuto = 4;
        int Segundo = 7;
        
        Tiempo Objeto = new Tiempo(Hora,Minuto,Segundo);
        System.out.printf("%s\n", Objeto.DameHora());
        
    } // Fin de la funcion principal
}
