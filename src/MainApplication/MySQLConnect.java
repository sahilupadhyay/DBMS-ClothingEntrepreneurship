package MainApplication; 
import java.sql.*;
import javax.swing.*;
public class MySQLConnect 
{
Connection conn=null;
public static void main(String a[]) 
       {
    try 
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project2014","root","meena.");
    }
    catch(ClassNotFoundException | SQLException e)
    {
        JOptionPane.showMessageDialog(null, e);
        //return null;
    }
}
}
