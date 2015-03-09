
package clasemath;

/*-----------------------------------------------------------------------------
* Name:        Program_22_Herencia
* 
* Purpose:     Mostrar el funcionamiento de algunas funciones de la clase ClaseMath
* ClaseMath.
* 
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     24/04/2013
* 
*-----------------------------------------------------------------------------*/
public class ClaseMath {

    public static void main(String[] args) {
        
        System.out.println((-20)); // Muestra el -20
        System.out.println(Math.abs(20)); // Muestra el valor abosoluto
        System.out.println(Math.round(7.6));  // Redonde al entero mas priximo
        System.out.println(Math.floor(7.6));  /* Redondea al entero mas proximo
                                               * Hacia arriba*/
          
        System.out.println(Math.ceil(7.6));     /* Redondea al entero mas proximo
                                                * Hacia abajo*/
        System.out.println(Math.min(7.6,8.1)); // Calcula el minimo entre 2 Numeros
        System.out.println(Math.max(7.6,8.1)); // Calcula el maximo entre 2 Numeros
        System.out.println(Math.pow(2,16)); // Eleva una base (2) a un exponente (32)
        System.out.println(Math.sqrt(64));  // Saca la raiz cuadrada d eun numero
        
     }
}
