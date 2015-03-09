
package jtextfield_cod;

/*-----------------------------------------------------------------------------
* Name:        JTextField_COD
* Purpose:     Interfaz Grafica para mostrar el funcionamiento de los 
*              campos de texto JTextField escribiendo codigo directamente
*
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     11/05/2013
* 
*-----------------------------------------------------------------------------*/

import javax.swing.*;
import java.awt.event.*;

public class JTextField_COD extends JFrame implements ActionListener {
    
    private JLabel Etiqueta1;  // creacion de un objeto de la clase JLabel(Etiqueta)                       
    private JButton Cambiar, Limpiar, Salir; // creacion de un Objeto de la clase JButton
    private JTextField CampoTexto;
    
    public JTextField_COD(){
        
        setLayout(null); // Layado nuevo y vacio (ventana)
        Etiqueta1 = new JLabel("Pon el titulo de la ventana"); // Texto inicial d ela etiqueta
        Etiqueta1.setBounds(30, 10, 150, 30); // setBounds(X,Y,ANCHO,LARGO)
        add(Etiqueta1); // se añade la etiqueta a la ventana
        
        CampoTexto = new JTextField(); // Creacion de un campo de texto
        CampoTexto.setBounds(30, 50, 150, 30);
        add(CampoTexto);
        
        Cambiar = new JButton("Cambiar");
        Cambiar.setBounds(30, 90, 150, 30);
        add(Cambiar);
        Cambiar.addActionListener(this); /* Se le asigna al boton la capacidad
                                       de ser escuchado por el el programa*/
        
        Limpiar = new JButton("Limpiar");
        Limpiar.setBounds(30, 130, 150, 30);
        add(Limpiar);
        Limpiar.addActionListener(this);
        
        Salir = new JButton("Salir");
        Salir.setBounds(30, 170, 150, 30);
        add(Salir);
        Salir.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()== Cambiar){
            String Titulo = CampoTexto.getText(); /* getText(): Obtiene lo que
                                                    este en el campo de texto*/
            setTitle(Titulo); // Cambia el titulo de la ventana
        }
        
        if(ae.getSource()== Limpiar){
            CampoTexto.setText(" ");
            setTitle(" ");
        }
        
         if(ae.getSource()== Salir){
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        JTextField_COD Ventana1 = new JTextField_COD();
        Ventana1.setBounds(10,10,210,250);// setBounds(X,Y,ANCHO,LARGO)
        Ventana1.setVisible(true); // Ventana visible
        Ventana1.setResizable(false); // Impide cambio de tamaño de la ventana     
    }
}
