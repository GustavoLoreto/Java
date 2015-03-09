
package sobrecarga;

/* Creacion de multiples constructores dentro de la clase Cargando
 * Los constructores tienen el mismo nombre de la clase.
 */

public class Cargando { // Clase Cargando
    
    public Cargando(int h){ // Metodo Constructor
        System.out.println("La hora es:" + h);
    }
    public Cargando(int h,int m){ // Metodo Constructor
        System.out.println("La hora es: "+h+" El minuto es: "+m);
    }
    public Cargando(int h, int m, int s){ // Metodo Constructor
        System.out.println("La hora es: "+h+" El minuto es: "+m+" Y el segundo es: "+s);
    }
 }
