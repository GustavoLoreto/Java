
package ingresarvalores;
import java.util.Scanner; 
public class IngresarValores {

    public static void main(String[] args) {
        
        // DECLARACION DE VARIABLES
        int Entero;
        double Real;
        String Cadena; 
        
        // CREACION DE OBJETOS
        // Entrada: Objeto para obtener Valores por consola.
        // System.in: Permite Leer los datos introducidos por teclado.
        Scanner Entrada = new Scanner(System.in); 
        
        System.out.print("Escriba el primer numero entero: ");
        //nextInt(): Metodo Solicita un numero entero
        Entero = Entrada.nextInt();
        
        System.out.print("Escriba un numero real:  ");
        //nextInt(): Metodo Solicita un numero Real
        Real = Entrada.nextDouble();
        
        System.out.print("Introduce una Cadena de texto:  ");
        //next: Metodo Solicita una cadena de caracteres
        Cadena = Entrada.next();
        
        System.out.printf("Numero entero Introducido: %d. \n", Entero);
        System.out.printf("Numero real Introducido: %f.\n", Real);
        System.out.printf("Cadena de Caracteres introducida: %s. \n", Cadena);

    }  
}
