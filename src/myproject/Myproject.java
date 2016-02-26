/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author MEENA
 */
public class Myproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
      
   try {
        
        Class.forName("com.mysql.jdbc.driver").newInstance();
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2014","root","meena.");
      
        con.close();}
     catch( SQLException  | ClassNotFoundException | IllegalAccessException | InstantiationException e)
     {
         System.out.println(e.getMessage());
     }
        
        // TODO code application logic here
    }
    
}
