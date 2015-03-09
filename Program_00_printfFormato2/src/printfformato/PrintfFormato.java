
package printfformato;

public class PrintfFormato {

    public static void main(String[] args) {
        int num1 = 1,num2 = 2;
        double real1= 0.1,real2=0.3;
        String Cadena = "Cadena";
        
        System.out.printf("Formato de numeros enteros: num1=%d , num2=%d. \n", num1,num2);
        System.out.printf("Formato de numeros reales: real1=%1.2f , real2=%1.2f. \n", real1,real2);
        System.out.printf("Formato de un string: %s. \n", Cadena);
    }
}
