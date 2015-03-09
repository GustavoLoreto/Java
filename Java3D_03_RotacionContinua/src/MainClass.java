
public class MainClass {

    public static void main(String[] args) {
       VentanaJava3D ventana = new VentanaJava3D(); 
       ventana.setTitle("Java3D_03_RotacionContinua"); 
       EscenaGrafica portalienzo = new EscenaGrafica();   
       
       ventana.getContentPane().add("Center",portalienzo.getLienzo());
       ventana.setVisible(true);
       portalienzo.girarCubo(5.0d); 
    }   
}
