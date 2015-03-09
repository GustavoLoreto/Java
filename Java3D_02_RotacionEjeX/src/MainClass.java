
public class MainClass {

    public static void main(String[] args) {
       VentanaJava3D ventana = new VentanaJava3D(); 
       ventana.setTitle("Java3D_02_RotacionEjeX"); 
       EscenaGrafica portalienzo = new EscenaGrafica();   
       
       ventana.getContentPane().add("Center",portalienzo.getLienzo());
       ventana.setVisible(true);
      
    }   
}
