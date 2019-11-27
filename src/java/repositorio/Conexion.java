
package repositorio;

import com.mysql.jdbc.Connection;
import static com.sun.xml.ws.security.addressing.impl.policy.Constants.logger;
import java.util.logging.Level; 
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
  //datos necesarios para poder 
    private String username = "root";
    private String password="";
    private String hostname = "localhost";
    private String port = "3306";
    private String database = "almacenamiento";
    private String classname = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://"+hostname+":"+port+"/"+database;
    private Connection con;
    
    public Conexion(){
        try{
            Class.forName(classname);
            //se almacena la conexion en una variable
            con = (Connection) DriverManager.getConnection(url,username,password);
        }catch(ClassNotFoundException | SQLException e){
            logger.log(Level.INFO,e.getMessage());
        }
    }
    public Connection getConnection(){
        return con;
    }
    public void desconectar(){
        con = null;
    }
}
