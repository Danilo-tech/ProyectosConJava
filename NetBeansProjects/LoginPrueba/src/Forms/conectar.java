/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */




public class conectar {
    
    //USUARIOS BASE DE DATOS
    
    public String db = "usuarios_login";
    public String url = "jdbc:mysql://localhost/" + db;
    public String user = "root";
    public String pass = "php.Zoomorfo159";
    

        static PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 public conectar (){
    
    
 }
 // USUARIOS BASE DE DATOS PUBLIC
public Connection Connectar(){  
    Connection link = null;
  try{
    Class.forName("org.gjt.mm.mysql.Driver");
    link=DriverManager.getConnection(url,user,pass);
    
   
  }catch(Exception e) {
         JOptionPane.showMessageDialog(null, e);
         }                                                               
  return link;
}  
   Connection conectar=null;
   
public Connection conexion(){   
  try{
    Class.forName("org.gjt.mm.mysql.Driver");//.newInstance();
    conectar=DriverManager.getConnection("jdbc:mysql://localhost/conexion","root","php.Zoomorfo159");
    //conectar=DriverManager.getConnection("jdbc:mysql://192.168.1.5:3306/personas","luis","");
   
  }catch(SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
         }catch(ClassNotFoundException ex) {                                                                }
  return conectar;
}




}


