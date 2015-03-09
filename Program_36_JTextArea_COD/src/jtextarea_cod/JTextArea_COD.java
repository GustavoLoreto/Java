
package jtextarea_cod;

/*-----------------------------------------------------------------------------
* Name:        JTextArea_COD
* Purpose:     Interfaz Grafica para mostrar el funcionamiento de un
*              area de texto JTextArea con scroll escribiendo codigo 
*              directamente.
*
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     11/05/2013
* 
*-----------------------------------------------------------------------------*/

import javax.swing.*;

public class JTextArea_COD extends JFrame {

private JTextField Campo1;
private JTextArea Campo2;
private JScrollPane Scroll1;

    public  JTextArea_COD (){
        setLayout(null);
        Campo1 = new JTextField();
        Campo1.setBounds(10,10,200,30);
        add(Campo1);
        
        Campo2 = new JTextArea();
        Campo2.setBounds(10,50,200,200);
        add(Campo2);
        
        Scroll1 = new JScrollPane(Campo2); /* saca las flechas de scrolling
                                            en el area de texto Campo2*/
        Scroll1.setBounds(10,50,200,200);
        add(Scroll1);
        
    }

    public static void main(String[] args) {
        JTextArea_COD Ventana1 = new JTextArea_COD();
        Ventana1.setBounds(0,0,540,400);// setBounds(X,Y,ANCHO,LARGO)
        Ventana1.setVisible(true); // Ventana visible
        //Ventana1.setResizable(false); // Impide cambio de tamaño de la ventana   
    }
}
