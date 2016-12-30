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
import java.sql.Statement;
import util.DatabaseConection;

/*String dataSave;
    String downloaderName;
    String downloadLink;
    String subtitleLink;
    String typeId;
    String active;
    String verified;
    String providerId;
    String qualityId;
    String subtitleLanguageId;*/

/**
 *
 * @author Uditha Jay
 */
public class DataSet {
    public int insertDownloaderItem(String downloaderName, String downloadLink, int fileSize, int typeId, int active, int verified, int providerId, int qualityId){
        int success;
        try{
            Connection conn = DatabaseConection.getDbConnection();
            PreparedStatement preparedStatement = null;
        
            preparedStatement = conn.prepareStatement("INSERT INTO dw_downloader (dw_downloader_display_name, dw_downloader_inserted_date, dw_downloader_file_size, dw_downloader_isactive, dw_downloader_verrified, dw_downloader_provider_id, dw_downloader_quality_id, dw_downloader_link, dw_downloader_type_id) VALUES (?, CURDATE(), ?, ?, ?, ?, ?, ?, ?)");
            preparedStatement.setString(1, downloaderName);
            preparedStatement.setInt(2, fileSize); 
            preparedStatement.setInt(3, active);
            preparedStatement.setInt(4, verified);
            preparedStatement.setInt(5, providerId);
            preparedStatement.setInt(6, qualityId);
            preparedStatement.setString(7, downloadLink);
            preparedStatement.setInt(8, typeId);
            
            preparedStatement.executeUpdate();
            
            success = 1;
      
        }
        catch(SQLException | ClassNotFoundException e){
            success = 0;
            System.out.println("cannot establish connecton " + e.toString());
        }
        return success;
    }
    
    
    public int getMaxDownloaderId(){
        int id;
        try{
            Connection conn = DatabaseConection.getDbConnection();
            Statement statement =  conn.createStatement();
        
            //preparedStatement = conn.prepareStatement("SELECT MAX(dw_downloader_id) FROM dw_downloader");
            ResultSet resultset = statement.executeQuery("SELECT MAX(dw_downloader_id) AS dw_downloader_id FROM dw_downloader");
            
            if(resultset.next()){
                    id = Integer.parseInt(resultset.getString("dw_downloader_id"));
                }
                else
                    id=0;
            //id = preparedStatement.executeUpdate();
            System.out.println("max "+id);
      
        }
        catch(SQLException | ClassNotFoundException e){
            id = 0;
            System.out.println("cannot establish connecton " + e.toString());
        }
        return id;
    }
    
    
    public int insertDownloaderItemSubtitles(int downloaderId, int subtitleLanguageId, String subtitleLink){
        int success;
        try{
            Connection conn = DatabaseConection.getDbConnection();
            PreparedStatement preparedStatement = null;
        
            preparedStatement = conn.prepareStatement("INSERT INTO dw_subtitle (dw_downloader_id, dw_subtitle_language_id, dw_subtitle_link) VALUES (?, ?, ?)");
            preparedStatement.setInt(1, downloaderId);
            preparedStatement.setInt(2, subtitleLanguageId); 
            preparedStatement.setString(3, subtitleLink);
            
            preparedStatement.executeUpdate();
            
            success = 1;
      
        }
        catch(SQLException | ClassNotFoundException e){
            success = 0;
            System.out.println("cannot establish connecton " + e.toString());
        }
        return success;
    }
    
    
    
    public int insertProviders(String providerName, String providerDescription){
        int success;
        try{
            Connection conn = DatabaseConection.getDbConnection();
            PreparedStatement preparedStatement = null;
        
            preparedStatement = conn.prepareStatement("INSERT INTO dw_provider (dw_provider_name, dw_provider_description) VALUES (?, ?)");
            preparedStatement.setString(1, providerName);
            preparedStatement.setString(2, providerDescription); 
            
            preparedStatement.executeUpdate();
            
            success = 1;
      
        }
        catch(SQLException | ClassNotFoundException e){
            success = 0;
            System.out.println("cannot establish connecton " + e.toString());
        }
        return success;
    }
    
    public int insertQualityTypes(String qualityName, String qualityDescription){
        int success;
        try{
            Connection conn = DatabaseConection.getDbConnection();
            PreparedStatement preparedStatement = null;
        
            preparedStatement = conn.prepareStatement("INSERT INTO dw_quality_type (dw_quality_type_name, dw_quality_type_descriptionl) VALUES (?, ?)");
            preparedStatement.setString(1, qualityName);
            preparedStatement.setString(2, qualityDescription); 
            
            preparedStatement.executeUpdate();
            
            success = 1;
      
        }
        catch(SQLException | ClassNotFoundException e){
            success = 0;
            System.out.println("cannot establish connecton " + e.toString());
        }
        return success;
    }
    
    public int insertSubtitleLanguages(String subtitleLanguage, String subtitleDescription){
        int success;
        try{
            Connection conn = DatabaseConection.getDbConnection();
            PreparedStatement preparedStatement = null;
        
            preparedStatement = conn.prepareStatement("INSERT INTO dw_subtitle_language (dw_subtitle_language_type, dw_subtitle_languagec_description) VALUES (?, ?)");
            preparedStatement.setString(1, subtitleLanguage);
            preparedStatement.setString(2, subtitleDescription);
            
            preparedStatement.executeUpdate();
            
            success = 1;
      
        }
        catch(SQLException | ClassNotFoundException e){
            success = 0;
            System.out.println("cannot establish connecton " + e.toString());
        }
        return success;
    }
    
    
    public int insertDownloaderItemImdbId(int downloaderId, String imdbId){
        int success;
        try{
            Connection conn = DatabaseConection.getDbConnection();
            PreparedStatement preparedStatement = null;
        
            preparedStatement = conn.prepareStatement("INSERT INTO dw_imdb (dw_downloader_id, dw_imdb_id) VALUES (?,?)");
            preparedStatement.setInt(1, downloaderId);
            preparedStatement.setString(2, imdbId);
            
            preparedStatement.executeUpdate();
            
            success = 1;
      
        }
        catch(SQLException | ClassNotFoundException e){
            success = 0;
            System.out.println("cannot establish connecton " + e.toString());
        }
        return success;
    }
}
