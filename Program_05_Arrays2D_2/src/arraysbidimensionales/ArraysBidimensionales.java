
package arraysbidimensionales;

public class ArraysBidimensionales {

    public static void main(String[] args) {
        
        // DECLARACION E INICIALIZACION DE ARRAYS BIDIMENSIONALES
        // ASIGNANDO VALORES A UN ARRAY BIDIMENSIONAL EN LA DECLARACION
        String Nombres[][] = {{"PEDRO","JUAN"},{"MARIA","ADRIANA"}}; // Nombres[Fil][Col]
        
        // DECLARANDO E INICIALIZANDO ARRAYS BIDIMENSIONALES SIN CARGAR VALORES
        int[][]  matriz = new int[3][2];

        // O alternativamente
        int[][]  matriz2;
        matriz2 = new int[3][2];
        
        // ASIGNACION DE VALORES PARA UN ARRAY BIDIMENSIONAL AL QUE NO SE LE HAN CAEGADO VALORES
        
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;
        
        // ACCESO A CADA UNA DE LAS POSOCIONES DEL ARRAY BIDIMENSIONAL Nombres [][]
        
        System.out.println("Array: Nombres [][]");
        System.out.println(Nombres [0][0]);
        System.out.println(Nombres [0][1]);
        System.out.println(Nombres [1][0]);
        System.out.println(Nombres [1][1]);
        
        System.out.println();
        System.out.println("Array: matriz [][]");
        System.out.println(matriz [0][0]);
        System.out.println(matriz [0][1]);
        System.out.println(matriz [1][0]);
        System.out.println(matriz [1][1]);
        
        
    }
    
}
