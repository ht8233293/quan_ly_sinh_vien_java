

import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class databaseConnection {

    final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3306/student";

    final static String USER = "root";
    final static String PASS = "";

    
   public static Connection connection() throws ClassNotFoundException, SQLException {
    Class.forName(JDBC_DRIVER);
    Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    return conn;
}

}
