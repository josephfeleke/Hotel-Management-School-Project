package netbeansswingmodernui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author josephfeleke
 */


public class SqlConnection{
    
   
    
        public static Connection con;
        public static Statement statement;
        
        private static String url = "jdbc:mysql://localhost:3306/HOTEL";
        private static String username = "root";
        private static String pass = "jonanako66!";
        
        public static void startSqlConnection() throws SQLException{
               
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
               e.printStackTrace();
            }
            con = DriverManager.getConnection(url,username,pass);
            statement = con.createStatement();
        }
        
         
         
          
    
}
