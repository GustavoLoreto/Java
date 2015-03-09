
package program_20_static;

/*-----------------------------------------------------------------------------
* Name:        MainStatic
* 
* Purpose:     Mostrar el funcionamiento de la propiedad MainStatic.
* 
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     23/04/2013
* 
*-----------------------------------------------------------------------------*/

public class MainStatic { // Inicio de la clase MainStatic

    public static void main(String[] args) { // Inicio de la funcion Principal
        
        Club Miembro1 = new Club("Pedro","Perez");
        Club Miembro2 = new Club("Juan","Perez");
        System.out.println();
        System.out.println("El nombre del socio es "+Miembro1.GetNombre());
        System.out.println("El Apellido del socio es "+Miembro1.GetApellido());
        System.out.println("El numero total de socios es "+Miembro1.GetMiembros());
        
        
    } // Fin de la funcion Principal
} // Fin de la clase MainStatic
