package tablas; // paquete tablas

/*importes*/
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*clase publica conexion*/
public class Conexion {
    
    private final String base = "tienda"; //base de datos tienda
    private final String user = "root"; // usuario root
    private final String password = "php.Zoomorfo159"; //password de acceso
    
    private final String url = "jdbc:mysql://localhost:3306/" + base; //link de acceso
    
    private Connection con = null; // representar Connection con "con"
    
    /*  */
    public Connection getConexion() //hacerlo publico Connection
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
    }

}
