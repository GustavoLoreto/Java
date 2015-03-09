
package metodoparametro;
import java.util.Scanner;
public class MetodoParametro {

    public static void main(String[] args) {
        
        // Creacion de un Objeto para almacenar Datos
        Scanner Entrada = new Scanner(System.in);
        String Curso;
        // Creacion de un objeto de la clase LibroCalificaciones llamado Milibro
        LibroCalificaciones Milibro = new LibroCalificaciones();
        
        System.out.print("Escriba el nombre del curso: ");
        
        // Se Obtiene el nombre del curso
        Curso = Entrada.nextLine();
        System.out.println();
        
        // Se imprime un mensaje con el nombre del curso
        Milibro.MostrarMensaje(Curso);
    }
    
}
