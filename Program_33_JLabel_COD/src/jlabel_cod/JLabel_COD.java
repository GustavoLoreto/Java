
package jlabel_cod;

/*-----------------------------------------------------------------------------
* Name:        JLabel_COD
* Purpose:     Interfaz Grafica para mostrar el funcionamiento de las 
*              Etiquetas JLabel escribiendo codigo directamente
*
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     11/05/2013
* 
*-----------------------------------------------------------------------------*/

import javax.swing.*; // Importacion de todos los metodos de la clase grafica Swing

public class JLabel_COD extends JFrame { /* Heredar los metodos de la
                                                    clase JFrame*/
    private JLabel Etiqueta1;  // creacion de un objeto de la clase JLabel(Etiqueta)                     
    private JLabel Etiqueta2; 
    private JLabel Etiqueta3; 
    
    public JLabel_COD(){ // Creacion de un metodo Constructor
        
        setLayout(null); // Layado nuevo y vacio (ventana)
        Etiqueta2 = new JLabel("Hola Swing"); // Texto inicial d ela etiqueta
        Etiqueta2.setBounds(20, 10, 200, 30); // setBounds(X,Y,ANCHO,LARGO)
        add(Etiqueta2); // se añade la etiqueta a la ventana
        
        Etiqueta3 = new JLabel("Hola Swing2"); // Texto inicial d ela etiqueta
        Etiqueta3.setBounds(20, 30, 200, 30); // setBounds(X,Y,ANCHO,LARGO)
        add(Etiqueta3); // se añade la etiqueta a la ventana
        
        Etiqueta3 = new JLabel("Hola Swing3"); // Texto inicial d ela etiqueta
        Etiqueta3.setBounds(20, 50, 200, 30); // setBounds(X,Y,ANCHO,LARGO)
        add(Etiqueta3); // se añade la etiqueta a la ventana
    
    } // Fin del metodo constructor
    
    public static void main(String[] args) {
        
        JLabel_COD Ventana1 = new JLabel_COD();
        Ventana1.setBounds(10,10,400,300);// setBounds(X,Y,ANCHO,LARGO)
        Ventana1.setVisible(true); // Ventana visible
        Ventana1.setResizable(false); // Impide cambio de tamaño de la ventana
    }
}
