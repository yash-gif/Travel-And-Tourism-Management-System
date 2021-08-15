package travel.management.system;
import java.sql.*;

/**
 
 * JDBC stands for Java Database Connectivity. JDBC is a java api to connect 
 and execute the query with the database.
 * 5 Steps in jDBC:
 * Registering the Driver class
 * Create connection String
 * Create statement
 * Execute queries
 * Close connection
 
  
 */
public class Conn {
    Connection c;
    Statement s;
    // we have to do try and catch because it is an extrnal database so there is a change of exception.
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");// is in this library.&& forName is a static methis in Class.
            //connection string which is stored in connection interface object.
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","root");
            s=c.createStatement();
        }catch(Exception e){
            
        }
    }
}
