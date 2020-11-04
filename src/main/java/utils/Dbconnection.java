/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
import java.sql.*;
/**
 *
 * @author Dell
 */
public class Dbconnection {
    public Connection createConnection() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/foodorderingsystem?user=root&password=Dkj24/03");
            return conn;
        } catch( SQLException e){
            System.err.println(e);
            return null;
        }
    }
}
