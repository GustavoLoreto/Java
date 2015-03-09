
package jdbc;
 
import java.sql.*;
public class JDBC {
    
    public static void main(String[] args) {
        try{
        System.out.println("Intento conectarme a la base de datos...");
        Class.forName("com.mysql.jdbc.Driver"); // se carga la hherramienta para realizar conexion con mySQL
        
         
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/agendatelefonica","root","1accesso1");
        System.out.println("La conexion se ha realizado con exito");
        System.out.println("");
        //Devolver la agenda telefonica
        Statement estado = con.createStatement();
        ResultSet resultado = estado.executeQuery("SELECT * FROM agenda");
        
        System.out.println("Id \tNombre \t\tTelefono");
        while(resultado.next()){
            System.out.println(resultado.getString("Id")+"\t"+resultado.getString("Nombre")+"\t\t"+resultado.getString("Telefono"));
        }
        
        }
        catch(SQLException ex){
            System.out.println("Error de mysql");
        }
        
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }

        catch(Exception e){
            System.out.println("Se ha encontrado un error que es: "+e.getMessage());
        
        }
    }
}
