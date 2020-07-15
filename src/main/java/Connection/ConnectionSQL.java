
package Connection;
import java.sql.*;
/**
 *
 * @author kajunge
 */
public class ConnectionSQL {
    public static void main(String [] args){
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
    }
}
//testing changes for MYSQl branch