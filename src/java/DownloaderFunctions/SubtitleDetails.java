/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DownloaderFunctions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.json.JSONArray;
import org.json.JSONException;

/**
 *
 * @author Uditha Jay
 */
public class SubtitleDetails {
    public JSONArray getSubtitleDetails(String downloaderId) throws JSONException, Exception{
        JSONArray jsonArray =new JSONArray();
        try{
            Connection conn = util.DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();

            //ResultSet resultset = statement.executeQuery("SELECT dwsl.dw_subtitle_language_type. dwsl.dw_subtitle_languagec_description, dws.dw_subtitle_link FROM dw_subtitle sws WHERE dw_downloader_id="+downloaderId+" LEFT JOIN dw_subtitle_language dwsl ON dws.dw_subtitle_language_id = dwsl.dw_subtitle_language_id");
            ResultSet resultset = statement.executeQuery("SELECT dwsl.dw_subtitle_language_type, dwsl.dw_subtitle_languagec_description, dws.dw_subtitle_link FROM dw_subtitle dws LEFT JOIN dw_subtitle_language dwsl ON dws.dw_subtitle_language_id = dwsl.dw_subtitle_language_id WHERE dw_downloader_id="+downloaderId+"");
                
            
            jsonArray = util.JasonArrayConvertion.convertToJSON(resultset);                               
        }
        
        catch(SQLException | ClassNotFoundException e) {
            
        System.out.println(e);
        
        }
        //System.out.println(jsonArray);
        return jsonArray;
    }
}
