
package agenda;

/*-----------------------------------------------------------------------------
* Name:        Agenda
* Purpose:     Agenda de contactos
*
* Author:      Wilmer Planchez(Mentor Anonymous)
*
* Created:     23/10/2013
* 
*-----------------------------------------------------------------------------*/

import javax.swing.*; /* Libreria que permite incluir elementos de interfaz
                        de usuario*/
import java.awt.event.*;
import java.awt.*; // Libreria para crear objetos graficos a pattir de codigo
import java.sql.*;
import java.io.*; // Libreria para trabajar con archivos
import java.util.*;
import javax.swing.JOptionPane;

public abstract class Agenda extends JFrame implements ActionListener {

/* 
 * 1) Preparar Variables
 * 2) Crear un metodo constructor sin argumentos
 * 3) Crear los Objetos dentro del metodo constructor e instanciarlos
 * 4) Añadir los Objetos Creados
 * 5) Añadir la barra de menu
 * 6) Añadir el menu
 * 7) Añadir los items del menu
*/
// Variables de Swing
    
    private JMenuBar barra;
    private JMenu menu1;
    private JMenuItem mi1,mi2,mi3;
    private JTextField camponuevonombre,campobuscarnombre,camponuevotelefono,campobuscartelefono;
    private JLabel etiquetanuevonombre,etiquetanuevotelefono,imprimenombre,imprimetelefono,nombreautor,nombreprograma,numeroversion,dibusca;
    private JButton botonnuevo,botonbuscar;
    
 // Mas variables
    File archivo = new File("C://Users//Anonymous//Documents//NetBeansProjects//Program_47_Agenda//archivo.txt");
    Formatter nuevoarchivo;
    Scanner x;
    
 // Creacion del metodo constructor
    
    public Agenda(){
    setLayout(null);
    
    // Textos de introduccion
    nombreprograma = new JLabel("Agenda telefonica");
        nombreprograma.setBounds(0, 0, 180, 30); //setBounds(x,y,ancho,alto)
        add(nombreprograma);
    
    nombreautor = new JLabel("Wilmer Planchez");
        nombreautor.setBounds(0, 30, 180, 30);
        add(nombreautor);
        
    numeroversion = new JLabel("Version 2.0");
        numeroversion.setBounds(0,50,180,30);
        add(numeroversion);
        
    // Menu superior
    barra = new JMenuBar();
        setJMenuBar(barra);
    menu1 = new JMenu("Archivo");
        barra.add(menu1);
        mi1 = new JMenuItem("Nuevo");
        mi1.addActionListener(this);
        menu1.add(mi1);
        
        mi2 = new JMenuItem("Buscar");
        mi2.addActionListener(this);
        menu1.add(mi2);
        
        mi3 = new JMenuItem("Salir");
        mi3.addActionListener(this);
        menu1.add(mi3);        
    }
    
    // Creaccion de un metodo para controlar los eventos del menu
    @Override
    public void actionPerformed(ActionEvent e){
        
        Container f =this.getContentPane();
        if(e.getSource()== mi1){ // Item Agregar
            // Ocultar elementos creados
            nombreprograma.setVisible(false);
            nombreautor.setVisible(false);
            numeroversion.setVisible(false);
            
            
            // Formulario

            etiquetanuevonombre = new JLabel("Nuevo Nombre:");
                etiquetanuevonombre.setBounds(0,0,180,30);
                add(etiquetanuevonombre);
                etiquetanuevonombre.setVisible(true);
            
            camponuevonombre = new JTextField();
                camponuevonombre.setBounds(200,0,180,30);
                add(camponuevonombre);
                camponuevonombre.setVisible(true);
                
            etiquetanuevotelefono = new JLabel("Nuevo Telefono:");
                etiquetanuevotelefono.setBounds(0,50,180,30);
                add(etiquetanuevotelefono);
                etiquetanuevotelefono.setVisible(true);
                
            camponuevotelefono = new JTextField();
                camponuevotelefono.setBounds(200,50,180,30);
                add(camponuevotelefono);
                camponuevotelefono.setVisible(true);
           
            botonnuevo = new JButton("Crear");
                botonnuevo.setBounds(200,100,180,30);
                add(botonnuevo);
                botonnuevo.addActionListener(this);
                botonnuevo.setVisible(true);    
            
        }
        if(e.getSource()== mi2){ // Item Boton Buscar
            nombreprograma.setVisible(false);
            nombreautor.setVisible(false);
            numeroversion.setVisible(false);
            etiquetanuevonombre.setVisible(false);
            camponuevonombre.setVisible(false);
            etiquetanuevotelefono.setVisible(false);
            camponuevotelefono.setVisible(false);
            botonnuevo.setVisible(false);
            
            // Formulario

            imprimenombre = new JLabel("Buscar Nombre:");
                imprimenombre.setBounds(0,0,180,30);
                add(imprimenombre);
                imprimenombre.setVisible(true);
            
            campobuscarnombre = new JTextField();
                campobuscarnombre.setBounds(200,0,180,30);
                add(campobuscarnombre);
                campobuscarnombre.setVisible(true);
                  
            botonbuscar = new JButton("Buscar");
                botonbuscar.setBounds(200,50,180,30);
                add(botonbuscar);
                botonbuscar.addActionListener(this);
                botonbuscar.setVisible(true);    
        }
        
        if(e.getSource()== mi3){ // Item salir
            System.exit(0);
        }  
        
        if(e.getSource()== botonnuevo){ // Si fue seleccionado mi2 ejecutar
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/agendatelefonica","root","1accesso1");
                Statement estado = con.createStatement();
                estado.executeUpdate("INSERT INTO agenda VALUES (' ',  '"+camponuevonombre.getText()+"', '"+camponuevotelefono.getText()+"')");
                JOptionPane.showMessageDialog(this, "Datos Agregados a la agenda","Datos creados",JOptionPane.INFORMATION_MESSAGE);
            }
            /*catch(SQLException ex){
                System.out.println("Error de MySQL");
            }*/
            catch(ClassNotFoundException err){ // No se encontro la clase
                err.printStackTrace();
            }
            catch(Exception err){
                System.out.println("Se ha encontrado un error inesperado, que es: " +err.getMessage());
            }
            
            if(e.getSource()== botonbuscar){
                // Conectar a la base de datos
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/agendatelefonica","root","1accesso1");
                    Statement estado = con.createStatement();
                    ResultSet resultado = estado.executeQuery("SELECT * FROM agenda WHERE nombre = '"+ campobuscarnombre.getText() +"'");
                    
                    //Exportar resultado
                    while(resultado.next()){
                        if(archivo.exists()){
                            if(archivo.canWrite()){
                                nuevoarchivo = new Formatter("C://Users//Anonymous//Documents//NetBeansProjects//Program_47_Agenda//archivo.txt");
                                nuevoarchivo.format("%s %s %s",resultado.getString("Nombre"),resultado.getString("Telefono"),"Telefono");
                                nuevoarchivo.close();
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "El archivo existe, pero no se puede escribir","Advertencia",JOptionPane.ERROR_MESSAGE);
                            }   
                        }
                        else{
                            try{
                                nuevoarchivo = new Formatter("C://Users//Anonymous//Documents//NetBeansProjects//Program_47_Agenda//archivo.txt");
                                nuevoarchivo.format("%s %s %s",resultado.getString("Nombre"),resultado.getString("Telefono"),"Telefono");
                                System.out.println("El Archivo ha sido creado."); 
                                nuevoarchivo.close();
                            }
                            catch(Exception ex1){
                                System.out.println("Error"+ex1);
                                //JOptionPane.showMessageDialog(this, "Error"+ex1,"Mensaje de Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
                catch(ClassNotFoundException err){ // No se encontro la clase
                    err.printStackTrace();
                }
                catch(Exception err){
                    System.out.println("Se ha encontrado un error inesperado, que es: " +err.getMessage());
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Agenda ventana;
        ventana = new Agenda() {};
        ventana.setBounds(10,20,640,250);
        ventana.setVisible(true);
    }
}
