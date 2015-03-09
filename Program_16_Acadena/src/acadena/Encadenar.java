
package acadena;


public class Encadenar { // clase Encadenar
    private int mes;
    private int dia;
    private int anio;
    
    public Encadenar(int d, int m, int a){ /* Las variables definidas 
                                            * anteriormente son las variables 
                                            * que se le pasaran al metodo
                                            * Encadenar.*/
    mes = m;
    dia = d;
    anio = a;
    System.out.printf("El constructor es: %s\n",this);/* This espera el texto
                                                        Formateado que se envia
                                                        desde toString*/
    }       
    
    // Metodo que devolvera una cadena.He indicaremos como formatear con el 
    // metodo(Encadenar) que envio la cadena usando this.
    public String toString(){ /* toString Perpite formatear todas aquellas
                               * cadenas que son enviadas por otros metodos*/
     
        return String.format("%d/%d/%d", dia, mes, anio);
    }   
}
