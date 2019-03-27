/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anil
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnecting {
    Connection con;
    public static Connection ConnectDb()
    {
        try{
            Class.forName("org.sqlite.JDBC");
                Connection con=DriverManager.getConnection("jdbc.sqlite");
                return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
