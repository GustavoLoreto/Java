
package jbutton_cod;

/*-----------------------------------------------------------------------------
* Name:        JButton_COD
* Purpose:     Interfaz Grafica para mostrar el funcionamiento de los 
*              Botones JButton escribiendo codigo directamente
*
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     11/05/2013
* 
*-----------------------------------------------------------------------------*/

import javax.swing.*;
import java.awt.event.*;

public class JButton_COD extends JFrame implements ActionListener {
    
    private JLabel Etiqueta1,Etiqueta2,Etiqueta3;  // creacion de un objeto de la clase JLabel(Etiqueta)                       
    JButton BotonSalida; // creacion de un Objeto de la clase JButton
    
    
 public JButton_COD(){ // Creacion de un metodo Constructor
        
        setLayout(null); // Layado nuevo y vacio (ventana)
        Etiqueta2 = new JLabel("Hola Swing"); // Texto inicial d ela etiqueta
        Etiqueta2.setBounds(20, 10, 200, 30); // setBounds(X,Y,ANCHO,LARGO)
        add(Etiqueta2); // se añade la etiqueta a la ventana
        
        Etiqueta3 = new JLabel("Hola Swing 2"); // Texto inicial d ela etiqueta
        Etiqueta3.setBounds(20, 30, 200, 30); // setBounds(X,Y,ANCHO,LARGO)
        add(Etiqueta3); // se añade la etiqueta a la ventana
        
        Etiqueta3 = new JLabel("Hola Swing 3"); // Texto inicial d ela etiqueta
        Etiqueta3.setBounds(20, 50, 200, 30); // setBounds(X,Y,ANCHO,LARGO)
        add(Etiqueta3); // se añade la etiqueta a la ventana
        
        BotonSalida = new JButton("Salir");
        BotonSalida.setBounds(20, 100, 100, 30);
        add(BotonSalida);
        BotonSalida.addActionListener(this);
    } // Fin del metodo constructor
 
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==BotonSalida){
            System.exit(0);
        }
    }
 
    public static void main(String[] args) {
        
        JButton_COD Ventana1 = new JButton_COD();
        Ventana1.setBounds(10,10,400,300);// setBounds(X,Y,ANCHO,LARGO)
        Ventana1.setVisible(true); // Ventana visible
        Ventana1.setResizable(false); // Impide cambio de tamaño de la ventana
    }
}
