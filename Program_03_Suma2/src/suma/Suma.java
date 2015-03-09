package suma;
import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int Num1,Num2,Resultado;
        double real = 0.1;
        System.out.print("Escriba el primer numero entero: ");
        Num1 = Entrada.nextInt();
        
        System.out.print("Escriba el segundo numero entero: ");
        Num2 = Entrada.nextInt();
        
        Resultado = Num1 + Num2;
        System.out.printf("La suma es %d\n",Resultado);
               
    }  
}
