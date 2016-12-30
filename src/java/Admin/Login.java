/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Uditha Jay
 */
public class Login {
    public String loginAutentication(String username, String password){
        String adminUsername;
        try{
            Connection conn = util.DatabaseConection.getDbConnection();
            PreparedStatement preparedStatement = null;
            
            preparedStatement = conn.prepareStatement("SELECT dw_admin_username FROM  dw_admin WHERE dw_admin_username=? AND dw_admin_password=?");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password); 
            
            ResultSet rst = preparedStatement.executeQuery();
                if(rst.next()){
                    adminUsername = rst.getString("dw_admin_username");
                }
                else
                    adminUsername=null;
        }
        
        catch(SQLException | ClassNotFoundException e) {
            adminUsername=null;
        }
        System.out.println(adminUsername);
        return adminUsername;
    }
}
