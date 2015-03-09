
package estructuraswitch;
import java.util.Scanner;

public class EstructuraSwitch {

    public static void main(String[] args) {
        String opcion;
        Scanner IngresarOpcion = new Scanner(System.in);
        
        System.out.println("MENU DE OPCIONES: ");
        System.out.println();
        System.out.println("a) Suma.");
        System.out.println("b) Resta.");
        System.out.println("c) Multiplicacion.");
        System.out.println("d) Division.");
        System.out.println();
        System.out.print("Selecciona una opcion del menu: ");
       
        opcion = IngresarOpcion.next();
        
        switch(opcion){
            case "a":
                System.out.printf("Usted ha seleccionado la opcion: (%s).\n",opcion);
                break;  
            case "b":
                System.out.printf("Usted ha seleccionado la opcion: (%s).\n",opcion);
                break; 
            case "c":
                System.out.printf("Usted ha seleccionado la opcion: (%s).\n",opcion);
                break; 
            case "d":
                System.out.printf("Usted ha seleccionado la opcion: (%s).\n",opcion);
                break;
            default:
                System.out.printf("La opcion: (%s) no es valida.",opcion);
                
        }
        
    }
    
}
