/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;


//cantidad de importes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;


/**
 *
 * @author Danilo
 */





//clase conectar en el paquete conexion
public class conectar {
    
 
    
    
// ejemplo del combobox en la base de datos   
    private final String DB="pruebas";
    private final String URL="jdbc:mysql://192.168.1.25:3306/"+DB;
    private final String USER="UserVinculo";
    private final String PASS="1234";    
    
    public DataSource initializeDataSource(){

        BasicDataSource basicDataSource = new BasicDataSource();

        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUsername(USER);
        basicDataSource.setPassword(PASS);
        basicDataSource.setUrl(URL);
        basicDataSource.setMaxActive(50);
        
        return basicDataSource;

    }    
    
    
    
    //usuarios registrados en la base de datos
    
    public String db = "usuarios_login";
    public String url = "jdbc:mysql://192.168.1.25:3306/" + db;
    public String user = "UserVinculo";
    public String pass = "1234";
    

        static PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
 public conectar (){  
    
 }
 
 
 // usuarios registrados en la base de datos PUBLICO
 
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
    conectar=DriverManager.getConnection("jdbc:mysql://192.168.1.25:3306/conexion","UserVinculo","1234");
    //conectar=DriverManager.getConnection("jdbc:mysql://192.168.1.5:3306/personas","luis","");
   
  }catch(SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
         }catch(ClassNotFoundException ex) {                                                                }
  return conectar;
}




}


