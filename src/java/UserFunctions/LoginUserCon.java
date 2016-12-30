/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserFunctions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Uditha Jay
 */
public class LoginUserCon {
    public String loginAutentication(String usernameORemail, String password){
        String username;
        try{
            Connection conn = util.DatabaseConection.getDbConnection();
            PreparedStatement preparedStatement = null;
            
            preparedStatement = conn.prepareStatement("SELECT dw_username FROM  dw_user_account WHERE (dw_username=? OR dw_email=?) AND dw_password=?");
            preparedStatement.setString(1, usernameORemail);
            preparedStatement.setString(2, usernameORemail);
            preparedStatement.setString(3, password); 
            
            ResultSet rst = preparedStatement.executeQuery();
                if(rst.next()){
                    username = rst.getString("dw_username");
                }
                else
                    username=null;
        }
        
        catch(SQLException | ClassNotFoundException e) {
            username=null;
        }
        System.out.println(username);
        return username;
    }
    
    public String loggedInUserName(String username){
            return username;
            //return null;
    }
}
