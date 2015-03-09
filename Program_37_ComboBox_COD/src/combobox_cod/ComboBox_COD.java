
package combobox_cod;

/*-----------------------------------------------------------------------------
* Name:        ComboBox_COD
* Purpose:     Interfaz Grafica para mostrar el funcionamiento de las 
*              Cajas de Combo JCombox 
*
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     11/05/2013
* 
*-----------------------------------------------------------------------------*/

import javax.swing.*;
import java.awt.event.*;

public class ComboBox_COD extends JFrame implements ItemListener{
   private JComboBox Combo1;
   
   public ComboBox_COD(){
       setLayout(null);
       Combo1 = new JComboBox();
       Combo1.setBounds(10, 10, 80, 20);
       add(Combo1);
       Combo1.addItem("Rojo");
       Combo1.addItem("Verde");
       Combo1.addItem("azul");
       Combo1.addItemListener(this);
   }
   
   public void itemStateChanged(ItemEvent e){
       if(e.getSource()== Combo1){
           String Seleccionado = (String)Combo1.getSelectedItem();
           setTitle(Seleccionado);
       }
   }
   public static void main(String[] args) {
        ComboBox_COD Ventana1 = new ComboBox_COD();
        Ventana1.setBounds(0,0,200,150);// setBounds(X,Y,ANCHO,LARGO)
        Ventana1.setVisible(true); // Ventana visible
    }
}
