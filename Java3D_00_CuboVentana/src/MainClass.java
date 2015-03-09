
public class MainClass {

    public static void main(String[] args) {
       VentanaJava3D ventana = new VentanaJava3D(); 
       ventana.setTitle("Java3D_00_CuboVentana"); 
       Canvas3D_00 portalienzo = new Canvas3D_00(); 
       
       ventana.getContentPane().add("Center",portalienzo.getLienzo());
       ventana.setVisible(true);
    }   
}
