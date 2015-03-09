/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BDAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexion { // Clase Conexion
private Connection conexion;
public Statement sentencia;

    public void conectarBaseDeDatos(){ /* Creacion de un metodo dentro de la
                                        clase conexion*/
        try{
            final String CONTROLADOR = "sun.jdbc.odbc.JdbcOdbcDriver";                                                                                             
            Class.forName(CONTROLADOR);
            final String RUTA_BD = "jdbc:odbc:Driver={MicrosoftAccessDriver(*.accdb)};DBQ="+System.getProperty("user.dir")+"/BaseDatos/BD.accdb";
            conexion = DriverManager.getConnection(RUTA_BD);
            sentencia = conexion.createStatement();
        }
        
        catch(SQLException ex1){
            ex1.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(null,"Error Carga Driver");
            System.exit(1);  
            
       } 
        
        catch (ClassNotFoundException ex) { 
        Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
       } 
   }
}