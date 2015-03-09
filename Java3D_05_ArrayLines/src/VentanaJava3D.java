
import javax.swing.JFrame;
class VentanaJava3D extends JFrame
{
VentanaJava3D(){
    super("Demo LineArray");
    EscenaGrafica eg = new EscenaGrafica();
    setSize(700,500);
    setLocation(200,200);
    getContentPane().add("Center",eg.getLienzo());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}
public static void main(String[] args){
    VentanaJava3D demo = new VentanaJava3D();
    
    }
}