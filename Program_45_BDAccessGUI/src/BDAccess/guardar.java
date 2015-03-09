
package BDAccess;

public class guardar {
    // nueva instancia de la clase conexion
    BDAccess.conexion bd = new BDAccess.conexion(); 
    
    // Creacion de un metodo dentro de la clase guardar
    public void registrar_datos(String id,String n,String a,String o){        
        try{
            bd.sentencia.execute("INSERTINTODatos_Personales(identificacion,nombres,apellidos,ocupacion)VALUES('"+id+"','"+n+"','"+a+"','"+o+"'"+")");



        }
        catch(Exception e){}
    }    
}
