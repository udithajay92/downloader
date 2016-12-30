/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DownloaderFunctions;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Uditha Jay
 */
public class IMDBDetails {
    public JSONArray getDownloaderDetails(String downloadID) throws JSONException, Exception{
        JSONArray jsonArray =new JSONArray();       //create a json array to pass the data
        try {
            String idToPass;
            //get the imdb id for downoader
            Connection conn = util.DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();

            ResultSet rst = statement.executeQuery("SELECT dw_imdb_id FROM dw_imdb WHERE dw_downloader_id='" + downloadID + "'");
                if(rst.next()){
                    idToPass = rst.getString("dw_imdb_id");
                }
                else
                    idToPass=null;
                
            System.out.println("pass "+idToPass);  
            //get details from IMDB   
            String imdbJson = util.IMDBdataAsJson.getIMDBdataFromURL("http://www.omdbapi.com/?i=" + idToPass + "&plot=full&r=json");

            if (imdbJson != null) {

            JSONObject jsonObject = new JSONObject(imdbJson);   // this will store the jason file that is given by imdb
            Iterator iterator = jsonObject.keys();
            JSONObject object = new JSONObject();       //this contains the created json object which is storing each data
                while (iterator.hasNext()) {
                    String key = (String) iterator.next();
                    //jsonArray.put("\"" + key + "\":" + "\"" + jsonObject.get(key) + "\", ");
                    //System.out.println(key + " : " + jsonObject.get(key)); 
                    object.put(key,jsonObject.get(key));    //put objects to json array
                }
            jsonArray.put(object);
                //System.out.println(jsonArray);
            }

        } catch (IOException | JSONException e) {
        }
        return jsonArray;
    }
}
