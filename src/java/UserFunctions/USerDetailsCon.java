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
import org.json.JSONArray;
import util.DatabaseConection;

/**
 *
 * @author Uditha Jay
 */
public class USerDetailsCon {
    public void registerUserToDb(String username, String email, String password, String firstName, String lastName, String dob, String gender){
        try{
            Connection conn = DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();

            PreparedStatement preparedStatement = null;

            preparedStatement = conn.prepareStatement("INSERT INTO dw_user_account (dw_username, dw_email, dw_password, dw_user_isactive) VALUES(?,?,?,1)");
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email); 
            preparedStatement.setString(3, password);

            preparedStatement.executeUpdate();       
            
            ResultSet rst = statement.executeQuery("SELECT MAX(dw_user_id) as id FROM dw_user_account");
            int id;
            if(rst.next()){
                id = rst.getInt("id");
            }
            else
                id=0;
            System.out.println(String.valueOf(id));
            
            PreparedStatement preparedStatement2 = null;

            preparedStatement2 = conn.prepareStatement("INSERT INTO dw_user_details (dw_user_id, dw_first_name, dw_last_name, dw_dob,dw_gender,dw_username) VALUES(?,?,?,?,?,?)");
            preparedStatement2.setInt(1, id);
            preparedStatement2.setString(2, firstName); 
            preparedStatement2.setString(3, lastName);
            preparedStatement2.setString(4, dob);
            preparedStatement2.setString(5, gender); 
            preparedStatement2.setString(6, username);

            preparedStatement2.executeUpdate();
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println("cannot establish connecton " + e.toString());
        }
    }
    
    public int updateUserPassword(String userName, String currentPassword, String newPassword){
        int success;
        try
            {Connection conn = DatabaseConection.getDbConnection();

            Integer userId = getUserIdByUserName(userName);

            String currentPasswordFromDB = getCurrentPassword(userId);
            
            PreparedStatement preparedStatement = null;
            
            if(currentPassword.equals(currentPasswordFromDB)){
                preparedStatement = conn.prepareStatement("UPDATE dw_user_account SET dw_password=? WHERE dw_user_id=?");
                preparedStatement.setString(1, newPassword);
                preparedStatement.setInt(2, userId); 
                
                preparedStatement.executeUpdate();
                
                success=1;
            }
            else{
                success=0;
            }
           
        }
        catch(SQLException | ClassNotFoundException e){
            success=0;
            System.out.println("cannot establish connecton " + e.toString());
        }
        return success;
    }
    
    public int updateUserDetails(String userName, String firstName, String lastName, String dob, String gender){
        int success;
        try
            {Connection conn = DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();
            
            Integer userId = getUserIdByUserName(userName);
            
            PreparedStatement preparedStatement = null;

            preparedStatement = conn.prepareStatement("UPDATE dw_user_details SET dw_first_name=?, dw_last_name=?, dw_dob=?, dw_gender=? WHERE dw_user_id=?");
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName); 
            preparedStatement.setString(3, dob);
            preparedStatement.setString(4, gender); 
            preparedStatement.setInt(5, userId);

            preparedStatement.executeUpdate();           
            success=1;
            
        }
        catch(SQLException | ClassNotFoundException e){
            success=0;
            System.out.println("cannot establish connecton " + e.toString());
        }
        return success;
    }
    
    
    public JSONArray getUserDetails(String userName) throws Exception{
        JSONArray jsonArray =new JSONArray();
        try{
            Connection conn = DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();

            Integer userId = getUserIdByUserName(userName);

            ResultSet resultset = statement.executeQuery("SELECT dw_first_name, dw_last_name, dw_dob, dw_gender FROM dw_user_details WHERE dw_user_id="+userId+"");
            
            jsonArray = util.JasonArrayConvertion.convertToJSON(resultset);   
            
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println("cannot establish connecton " + e.toString());
        }
        return jsonArray;
    }
    
    
    
    
    public Integer getUserIdByUserName(String username){
        Integer userId;
        try{
            Connection conn = util.DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();

        
            //System.out.println(usernameORemail + " " + password);
        
            ResultSet rst = statement.executeQuery("SELECT dw_user_id FROM  dw_user_account WHERE dw_username='" + username + "'");
                if(rst.next()){
                    userId = rst.getInt("dw_user_id");
                }
                else
                    userId=0;
        }
        
        catch(SQLException | ClassNotFoundException e) {
            userId=0;
        }
        //System.out.println(username);
        return userId;
    }
    
    
    public String getCurrentPassword(int userId){
        String password;
        try{
            Connection conn = util.DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();

        
            //System.out.println(usernameORemail + " " + password);
        
            ResultSet rst = statement.executeQuery("SELECT dw_password FROM  dw_user_account WHERE dw_user_id='" + userId + "'");
                if(rst.next()){
                    password = rst.getString("dw_password");
                }
                else
                    password=null;
        }
        
        catch(SQLException | ClassNotFoundException e) {
            password=null;
        }
        System.out.println(password);
        return password;
    }
}
