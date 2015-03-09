
package program_20_static;

public class Club {
    
    // Declaracion de variables del tipo privadas
    private String Nombre;
    private String Apellido;
    private static int Contador = 0; /* La propiedad Static se encarga de que el
                                      * valor sea copartido entre las clases
                                      * En este caso nos interesa que se comparta 
                                      * con la clase pirncipal Program_20_Static*/
                                     
     /* Si no se ocloca la propiedad static cada vez que se intancie el objeto
     dentro de la funcion main Contador toma su valor inicial en este caso
     Contador = 0.*/
    
    /* Creacion de un metodo constructor ( se llama igual que a clase)
      con parametros*/
    public Club(String nom,String ape){ // Metodo Constructor
        
       Nombre = nom;
       Apellido = ape;
       Contador++;
       System.out.printf("Constructor para %s %s, numero de cliente  %d.\n",Nombre,Apellido,Contador);
        
    } // Fin del metodo Constructor
    
    public String GetNombre(){           // Metodo GetNombre
        return Nombre;
    }
    
    public String GetApellido(){        // Metodo GetApellido
        return Apellido;
    }
    
    public static int GetMiembros(){    // Metodo GetMiembros
        return Contador++;
    }
}
