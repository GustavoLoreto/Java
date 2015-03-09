
package suma;

/*-----------------------------------------------------------------------------
* Name:        Suma
* Purpose:     Pedir al usuario 2 numeros, para realizar la suma de ambos.
*
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     19/04/2013
* 
*-----------------------------------------------------------------------------*/

import java.util.Scanner; /* Scaner: Libreria que permitira introducir elementos
                           * Proporcionados por el usiario*/

public class Suma { // Inicio De la clase Suma
   
    public static void main(String[] args) { // Inicio de la funcion Principal
        
        // Se crea un objeto tipo Scanner Para obtener valores por consola
        Scanner Entrada = new Scanner(System.in);
        
        // Pag.46 Libro.
        
        /* new Scanner(System.in): Se inicializa la variable Tipo Scanner para 
         * poder usarla en el programa. 
         * 
         * (System.in) = Crea un objeto tipo Scanner, que le los 
         * datos escritos que lee los datos escritos pr el usuario mediante
         * el teclado.
         * 
         * System.out : El objeto permite mostrar  mostrar Caracteres en 
         * la ventana de comandos de Java.
         * 
         * System.out : El objeto permite leer la informacion escrita por el
         * usuario.
        */
        
        // Declaracion de Variables
        int Num1,Num2,Resultado;
        
        System.out.print("Escriba el primer numero entero: ");// Pide un numero
        Num1 = Entrada.nextInt();
        
        // Pag.47 Libro. 
        
        /* Num1 = Entrada.nextInt(): Utiliza el metodo nextInt del objeto entrada 
         * clase Scanner para obtener un numero introducido por teclado.
         * 
         * NOTA:
         * Se debe introducir un numero entero para que no se genere un error.
        */
        System.out.print("Escriba el segundo numero entero: ");// Pide otro numero
        Num2 = Entrada.nextInt();
        
        Resultado = Num1 + Num2;
        
        System.out.printf("La suma es %d\n",Resultado);
        
    } // Fin De la  Suma
} // Fin de La funcion Principal
