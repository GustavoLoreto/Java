
package herencia;

/*-----------------------------------------------------------------------------
* Name:        Herencia
* 
* Purpose:     Mostrar el funcionamiento de la Herencia. La Herencia permite que
* una clase(SubClase), herede / reciba automanticamente, las propiedades o metodos 
* de otra clase (SuperClase)
* 
* Polimorfismo: Permite variar las propiedades de un objeto que ha heredado de
* otra clase.
* 
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     23/04/2013
* 
*-----------------------------------------------------------------------------*/

public class Herencia {
    
    public static void main(String[] args) {
        
        Recibe DigoHola = new Recibe();
        DigoHola.YoDigoHola();
        DigoHola.YoDigoAdios();
    }
}
