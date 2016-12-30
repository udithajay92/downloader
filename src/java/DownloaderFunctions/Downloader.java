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
import org.json.JSONObject;
import util.JasonArrayConvertion;

/**
 *
 * @author Uditha Jay
 */
public class Downloader {
    public JSONArray getDownloaderDetails() throws JSONException, Exception{
        JSONArray jsonArray =new JSONArray();
        try{
            Connection conn = util.DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();

            ResultSet resultset = statement.executeQuery("SELECT dw.*, dwp.dw_provider_name, dwq.dw_quality_type_name FROM dw_downloader dw LEFT JOIN dw_provider dwp ON dw.dw_downloader_provider_id = dwp.dw_provider_id LEFT JOIN dw_quality_type dwq ON dw.dw_downloader_quality_id = dwq.dw_quality_type_id WHERE dw_downloader_isactive = 1 ORDER BY dw_downloader_id DESC LIMIT 25");
            
            jsonArray = util.JasonArrayConvertion.convertToJSON(resultset);                               
        }
        
        catch(SQLException | ClassNotFoundException e) {
            
        System.out.println(e);
        
        }
        //System.out.println(jsonArray);
        return jsonArray;
    }
    
    public JSONArray getDownloaderSpecialistDetails(String id) throws JSONException, Exception{
        JSONArray jsonArray =new JSONArray();
        try{
            Connection conn = util.DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();

            ResultSet resultset = statement.executeQuery("SELECT dw.*, dwp.dw_provider_name, dwq.dw_quality_type_name FROM dw_downloader dw LEFT JOIN dw_provider dwp ON dw.dw_downloader_provider_id = dwp.dw_provider_id LEFT JOIN dw_quality_type dwq ON dw.dw_downloader_quality_id = dwq.dw_quality_type_id WHERE dw_downloader_isactive = 1 AND dw_downloader_type_id="+id+" ORDER BY dw_downloader_id DESC");
            
            jsonArray = util.JasonArrayConvertion.convertToJSON(resultset);                               
        }
        
        catch(SQLException | ClassNotFoundException e) {
            
        System.out.println(e);
        
        }
        //System.out.println(jsonArray);
        return jsonArray;
    }
    
    
    public JSONArray getDownloaderSearchDetails(String keyWord) throws JSONException, Exception{
        JSONArray jsonArray =new JSONArray();
        try{
            Connection conn = util.DatabaseConection.getDbConnection();
            
            PreparedStatement preparedStatement = null;
            
            preparedStatement = conn.prepareStatement("SELECT dw.*, dwp.dw_provider_name, dwq.dw_quality_type_name FROM dw_downloader dw LEFT JOIN dw_provider dwp ON dw.dw_downloader_provider_id = dwp.dw_provider_id LEFT JOIN dw_quality_type dwq ON dw.dw_downloader_quality_id = dwq.dw_quality_type_id WHERE dw_downloader_isactive = 1 AND dw_downloader_display_name LIKE ? ORDER BY dw_downloader_id DESC LIMIT 25");
            preparedStatement.setString(1, "%"+keyWord+"%");
            
            ResultSet resultset = preparedStatement.executeQuery();

            jsonArray = util.JasonArrayConvertion.convertToJSON(resultset);                               
        }
        
        catch(SQLException | ClassNotFoundException e) {
            
        System.out.println(e);
        
        }
        //System.out.println(jsonArray);
        return jsonArray;
    }
    
    public JSONArray getDownloaderSearchSpecialistDetails(String id, String keyWord) throws JSONException, Exception{
        JSONArray jsonArray =new JSONArray();
        try{
            Connection conn = util.DatabaseConection.getDbConnection();
            
            PreparedStatement preparedStatement = null;
            
            preparedStatement = conn.prepareStatement("SELECT dw.*, dwp.dw_provider_name, dwq.dw_quality_type_name FROM dw_downloader dw LEFT JOIN dw_provider dwp ON dw.dw_downloader_provider_id = dwp.dw_provider_id LEFT JOIN dw_quality_type dwq ON dw.dw_downloader_quality_id = dwq.dw_quality_type_id WHERE dw_downloader_isactive = 1 AND dw_downloader_type_id=? AND dw_downloader_display_name LIKE ? ORDER BY dw_downloader_id DESC");
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, "%"+keyWord+"%");
            
            ResultSet resultset = preparedStatement.executeQuery();

            jsonArray = util.JasonArrayConvertion.convertToJSON(resultset);                               
        }
        
        catch(SQLException | ClassNotFoundException e) {
            
        System.out.println(e);
        
        }
        //System.out.println(jsonArray);
        return jsonArray;
    }
}
