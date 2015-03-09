
package claserandom;

/*-----------------------------------------------------------------------------
* Name:        ClaseRandom
* 
* Purpose:     Mostrar el funcionamiento de la Clase Random.
* 
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     24/04/2013
* 
*-----------------------------------------------------------------------------*/

import java.util.Random;

public class ClaseRandom {

    public static void main(String[] args) {
        
        Random Dado = new Random();
        int numero;
        for(int Contador = 0; Contador<10;Contador++){
            numero = Dado.nextInt(3);
            System.out.println(numero+1);
        }
    }
}
