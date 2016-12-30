/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.json.JSONArray;
import util.DatabaseConection;

/**
 *
 * @author Uditha Jay
 */
public class DataRetrive {
    public JSONArray getSubtitleLanguages() throws Exception{
        JSONArray jsonArray =new JSONArray();
        try{
            Connection conn = DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();


            ResultSet resultset = statement.executeQuery("SELECT dw_subtitle_language_id, dw_subtitle_language_type, dw_subtitle_languagec_description FROM dw_subtitle_language");
            
            jsonArray = util.JasonArrayConvertion.convertToJSON(resultset);   
            
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println("cannot establish connecton " + e.toString());
        }
        return jsonArray;
    }
    
    public JSONArray getProviders() throws Exception{
        JSONArray jsonArray =new JSONArray();
        try{
            Connection conn = DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();


            ResultSet resultset = statement.executeQuery("SELECT dw_provider_id, dw_provider_name, dw_provider_description FROM dw_provider");
            
            jsonArray = util.JasonArrayConvertion.convertToJSON(resultset);   
            
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println("cannot establish connecton " + e.toString());
        }
        return jsonArray;
    }
    
    public JSONArray getQualityTypes() throws Exception{
        JSONArray jsonArray =new JSONArray();
        try{
            Connection conn = DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();


            ResultSet resultset = statement.executeQuery("SELECT dw_quality_type_id , dw_quality_type_name, dw_quality_type_descriptionl FROM dw_quality_type");
            
            jsonArray = util.JasonArrayConvertion.convertToJSON(resultset);   
            
        }
        catch(SQLException | ClassNotFoundException e){
            System.out.println("cannot establish connecton " + e.toString());
        }
        return jsonArray;
    }
    
    public String getDisplayName(int downloaderId) throws Exception{
        String displayName;
        try{
            Connection conn = DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();


            ResultSet resultset = statement.executeQuery("SELECT dw_downloader_display_name FROM dw_downloader WHERE dw_downloader_id = "+downloaderId+"");
            
            if(resultset.next()){
                    displayName = resultset.getString("dw_downloader_display_name");
                }
                else
                    displayName=null;  
            
        }
        catch(SQLException | ClassNotFoundException e){
            displayName=null;  
            System.out.println("cannot establish connecton " + e.toString());
        }
        return displayName;
    }
}
