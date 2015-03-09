
package estructuraif;
import java.util.Scanner; 

public class EstructuraIf {

    public static void main(String[] args) {
        
        // DECLARACION DE VARIABLES
        double numero;
        
        // CREACION DE OBJETOS
        Scanner IngresarNumero = new Scanner(System.in);
        
        System.out.print("Escriba un numero : ");
        numero = IngresarNumero.nextDouble();
        
        if(numero > 0){
            System.out.printf("El numero %7.2f es Positivo.\n", numero);
        }
        
        else if(numero == 0){
            System.out.printf("El numero %7.2f no es ni positivo ni negativo.\n", numero);
        }
        
        if(numero < 0){
            System.out.printf("El numero %7.2f es Negativo.\n", numero);
        }
        
    }
    
}
