package program_19_publicoprivado;

/*-----------------------------------------------------------------------------
* Name:        PublicoPrivado
* 
* Purpose:     Mostrar la diferencia entre Publico y privado.
* 
*              Publico(public): Se puede acceder desde dentro de la clase y
*              desde fuera.
* 
*              Privado(private): Solo se puede acceder desde dentro de la 
*              clase que lo ha generado.
* 
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     23/04/2013
* 
*-----------------------------------------------------------------------------*/

public class PublicoPrivado {

        public static void main(String[] args) {
            
            SegundaClase Variable = new SegundaClase();
            //Variable.MiVariable = 1; // Variable tipo privada (No se muestra)
            Variable.MiVariable2 = 1; // Variable Tipo publica (Se muestra)
            System.out.println(Variable.MiVariable2 = 1 );
        
    }
}
