/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Uditha Jay
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConection {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "1234";
    private static final String CON_STRING = "jdbc:mysql://localhost/downloader_db";
    
    public static Connection getDbConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver"); 
        return DriverManager.getConnection(CON_STRING, USERNAME, PASSWORD);
    }
}
