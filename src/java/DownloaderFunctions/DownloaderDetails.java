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
public class DownloaderDetails {
    public JSONArray getDownloaderDetails(String downloaderId) throws JSONException, Exception{
        JSONArray jsonArray =new JSONArray();
        try{
            Connection conn = util.DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();

            ResultSet resultset = statement.executeQuery("SELECT dw.*, dwp.dw_provider_name, dwq.dw_quality_type_name FROM dw_downloader dw LEFT JOIN dw_provider dwp ON dw.dw_downloader_provider_id = dwp.dw_provider_id LEFT JOIN dw_quality_type dwq ON dw.dw_downloader_quality_id = dwq.dw_quality_type_id WHERE dw_downloader_isactive = 1 AND dw_downloader_id="+downloaderId+"");
            
            jsonArray = util.JasonArrayConvertion.convertToJSON(resultset);                               
        }
        
        catch(SQLException | ClassNotFoundException e) {
            
        System.out.println(e);
        
        }
        //System.out.println(jsonArray);
        return jsonArray;
    }
}
