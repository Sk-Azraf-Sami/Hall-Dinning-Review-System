/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sami
 */
public class ConnectionProvider {
    
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dms","root","password"); 
            return con; 
        }
        catch(Exception e)
        {
            return null;
        }
    }
    public static void main(String args[])
    {
        Connection con = getCon();
        if(con != null) {
            JOptionPane.showMessageDialog(null, "Connected");
        } else {
            JOptionPane.showMessageDialog(null, "Connection failed");
        }
    }
       
}
//package dao;
//import java.sql.Connection;
//import java.sql.DriverManager;

/*public class ConnectionProvider {

    String driver;
    String dbName;
    String connectionURL;

    String username;
    String password;

    public ConnectionProvider() {
        driver = "com.mysql.jdbc.Driver";
        connectionURL = "jdbc:mysql://localhost/";
        dbName = "moviedatabase";
        username = "root";
        password = "";

    }

    public Connection getConnection() throws Exception {

        Class.forName(driver);
        Connection connection = DriverManager.getConnection(connectionURL + dbName, username, password);

        return connection;

    }

    public static void main(String[] args) {
        ConnectionProvider db = new ConnectionProvider();
        try {
            Connection conn = db.getConnection();
            System.out.println("Database successfully connected!");
            conn.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}*/