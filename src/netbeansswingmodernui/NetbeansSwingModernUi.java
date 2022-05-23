package netbeansswingmodernui;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josephfeleke
 */
public class NetbeansSwingModernUi {

   
    public static void main(String[] args) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
   
                    new LoginPage().setVisible(true);
                
            }
        });
    }
    
}
