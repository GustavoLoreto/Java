
package claseswing;

import javax.swing.*;

public class ClaseSwing extends JFrame{ /* La clase ClaseSwing
 * Hereda los metodos de la clase JFrame*/
     
    private JLabel Etiqueta1;   // Creacion de una etiqueta
    private JLabel Etiqueta2; 
    private JLabel Etiqueta3; 
    
    public ClaseSwing(){  // Metodo Constructor
        
        setLayout(null); // se crea un layado vacio
        Etiqueta1 = new JLabel("Etiqueta2 en X = 10 ; Y = 10 "); /* Instanciacion Del objeto 
                                               * Etiqueta tipo JLabel*/
        Etiqueta1.setBounds(10,10, 200,30); /* Posicion de la etiqueta
                                         Proporciones de la ventana(setBounds)*/
        add(Etiqueta1); // añadir una etiqueta al layado
        
        Etiqueta2 = new JLabel("Etiqueta2 en X = 10 ; Y = 100 ");
        Etiqueta2.setBounds(10,100, 200,30);
        add(Etiqueta2);
        
        Etiqueta3 = new JLabel("Etiqueta2 en X = 10 ; Y = 200 ");
        Etiqueta3.setBounds(10,200, 200,30);
        add(Etiqueta3);
        
    } // fin del Metodo Constructor

    public static void main(String[] args) {
        
        ClaseSwing Ventana1 = new ClaseSwing(); /* Se LLama al Metodo
                                ClaseSwing y se crea un objeto de esa clase*/
        
        Ventana1.setBounds(10,10,400,300);// setBounds(X,Y,ANCHO,LARGO)
        Ventana1.setVisible(true); // Ventana visible
        Ventana1.setResizable(false); // Impide cambio de tamaño de la ventana
                
    }
}