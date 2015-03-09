
package setget;

// Se crearan constructores para almacenar y recuperar elementos.
// Set: Indica que se van a almacenar datos.
// Get: INdica que se van a recuperar datos almacenados o ubicados con Set.

public class Tiempo {
    
    private int Hora,Minuto,Segundo;
     
    public Tiempo(int h, int m, int s){ /* El constructor debe llamarse igual
                                         * que la clase*/
        SetTiempo(h,m,s);
    }
    
    // Supermetodo SetTiempo que llama otros metodos
    public void SetTiempo(int h, int m, int s){ // Super Metodo SetTiempo
        SetHora(h);
        SetMinuto(m);
        SetSegundo(s);
    }
    
    // METODOS SET :Para almacenar datos
    
    public void SetHora(int h){     // Metodo  SetHora
        Hora = h;
    }
    public void SetMinuto(int m){   // Metodo  SetiMinuto
        Minuto = m;
    }
    public void SetSegundo(int s){ // Metodo  SetSegundo
        Segundo = s;
    }
    
    // METODOS GET : Para recuperar datos
    
    public int GetHora(){   // Metodo  GetHora
        return Hora;
    }
    public int GetMinuto(){ // Metodo  GetMinuto
        return Minuto;
    }
    public int GetSegundo(){ // Metodo  GetSegundo
        return Segundo;
    }
    
    /* Metodo que se encargara de recoger cada uno d elos 3 metodos Get
     * Y los devolvera ne pantalla*/
    
    public String DameHora(){
        return String.format("%02d:%02d:%02d", GetHora(),GetMinuto(),GetSegundo());
    }
        
  } // Fin de la clase Tiempo
