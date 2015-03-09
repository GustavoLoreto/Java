
package div_sinexcepciones;
import java.util.Scanner;

public class Div_SinExcepciones {
    // Metodo del tipo static(no requiere un objeto para su llamada.)
    public static int cociente( int numerador, int denominador ){
        return numerador / denominador; // posible división entre cero
    } // fin del método cociente

    public static void main(String[] args) {
    // demuestra el lanzamiento de una excepción cuando ocurre una división entre cero

    Scanner explorador = new Scanner( System.in ); // objeto Scanner para entrada

    System.out.print( "Introduzca un numerador entero: " );
    int numerador = explorador.nextInt();
    System.out.print( "Introduzca un denominador entero: " );
    int denominador = explorador.nextInt();

    int resultado = cociente( numerador, denominador );
    System.out.printf(
    "\nResultado: %d / %d = %d\n", numerador, denominador, resultado );
    }
    
}
