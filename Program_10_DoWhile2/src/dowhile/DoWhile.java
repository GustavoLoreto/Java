
package dowhile;
import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        String palabra;
        Scanner Secreta = new Scanner(System.in);
        
        do{
            
            System.out.print("Ingrese la palabra secreta: ");
            palabra = Secreta.next();
            
        }while(!"mecatronica".equals(palabra));
        System.out.println("La palabra es correcta¡¡¡");
    }
    
}
