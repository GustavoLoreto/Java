
package breakcontinue;
import java.util.Scanner;
public class BreakContinue {


    public static void main(String[] args) {
                
        //DECLARACION DE VARIABLES
        int i,inicio,fin;
        
        // CREACION DE UN OBJETO
        Scanner BucleFor = new Scanner(System.in);
        
        System.out.print("Introduce desde que numero debe empezar el bucle For: ");
        inicio = BucleFor.nextInt();
        
        System.out.print("Introduce hasta donde se mostrara el bucle For: ");
        fin = BucleFor.nextInt();
        
        for(i=inicio;i<=fin;i++){
            
            if(i == inicio+1){
                System.out.println("Salta la iteracion: "+i);
                continue;
            }
            
            if(i == fin-2){
                System.out.println("Avandona el bucle en la iteracion: "+i);
                break;
            } 
            
            System.out.print("Iteracion: "+i+"\n");
        }  
    } 
}
