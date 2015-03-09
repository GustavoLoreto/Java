

package cuadrosdedialogo;
import javax.swing.JOptionPane;
public class CuadrosDeDialogo {

    public static void main(String[] args) {
        String nombre;
        nombre=JOptionPane.showInputDialog(null,"Escribe tu nombre");
        JOptionPane.showMessageDialog(null,"Hola "+nombre);
        
        JOptionPane.showMessageDialog(null, "Hasta la proxima . . . ¡¡¡","DESPEDIDA",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Aun aqui??? . . . ¡¡¡","PREGUNTA",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Es hora de avandonar la aplicacion.","ERROR",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "Adios . . . ¡¡¡","CERRAR",JOptionPane.CLOSED_OPTION);
        
    }
    
}
