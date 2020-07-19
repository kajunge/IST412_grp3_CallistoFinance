
package Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author kajunge
 */
public class ConnectionSQL {
    
    public static Connection connectDB(){
        
      /*  Connection conn = null;
        
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");  
            //conn = DriverManager.getConnection("jdbc:derby://localhost:1527/mFinance_Customers","nbuser","nbuser");
            conn = DriverManager.getConnection("jdbc:derby:user;create=true","nbuser","nbuser");
            return conn;
        } catch (SQLException | ClassNotFoundException e ) {
            System.err.println(e);
        } */
        return null;
    }
    /*public static void main(String [] args){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS;databaseName=mFinance_Customers;user=root;password=password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from customers");
            while(rs.next())
                System.out.println("Customer ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) + " " + rs.getString(3) + ", Address: " + rs.getString(4) + ", Phone Number: " + rs.getString(5) + ", Email: " + rs.getString(6) + ", Password: " + rs.getString(7) + ", Load ID: " + rs.getString(8));
                conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }*/
}
