/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DownloaderFunctions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.json.JSONArray;
import org.json.JSONException;
import util.DatabaseConection;

/**
 *
 * @author Uditha Jay
 */
public class CommentDetails {
     public void insertUserComment(String username, String downloaderId, String comment){
        try{
            Connection conn = DatabaseConection.getDbConnection();
            
            UserFunctions.USerDetailsCon userDetailsCon = new UserFunctions.USerDetailsCon();
            Integer userId = userDetailsCon.getUserIdByUserName(username);
            //System.out.println("id " + userId);
            
            PreparedStatement preparedStatement = null;
            
            preparedStatement = conn.prepareStatement("INSERT INTO dw_comment(dw_user_id, dw_downloader_id, dw_comment, dw_comment_date, dw_comment_time) VALUES (?,?,?, CURDATE(), CURTIME())");
            preparedStatement.setInt(1, userId);
            preparedStatement.setInt(2, Integer.parseInt(downloaderId)); 
            preparedStatement.setString(3, comment);
            
            preparedStatement.executeUpdate();
            
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println("cannot establish connecton " + e.toString());
        }
    }
     
     
    public JSONArray getCommentDetails(String downloaderId) throws JSONException, Exception{
        JSONArray jsonArray =new JSONArray();
        try{
            Connection conn = util.DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();

            ResultSet resultset = statement.executeQuery("SELECT dwc.dw_comment, dwc.dw_comment_date, dwc.dw_comment_time, dwua.dw_username FROM dw_comment dwc LEFT JOIN dw_user_account dwua ON dwc.dw_user_id=dwua.dw_user_id WHERE dw_downloader_id="+downloaderId+"");
            
            jsonArray = util.JasonArrayConvertion.convertToJSON(resultset);                               
        }
        
        catch(SQLException | ClassNotFoundException e) {
            
        System.out.println(e);
        
        }
        //System.out.println(jsonArray);
        return jsonArray;
    }
}
