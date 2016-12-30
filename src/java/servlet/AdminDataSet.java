/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Uditha Jay
 */
@WebServlet(name = "AdminDataSet", urlPatterns = {"/AdminDataSet"})
public class AdminDataSet extends HttpServlet {
    
    int dataSave;
    String downloaderName;
    String downloadLink;
    int fileSize;
    String subtitleLink;
    int typeId;
    int active;
    int verified;
    int providerId;
    int qualityId;
    int subtitleLanguageId;
    String imdbId;
    
    int downloaderId;
    
    String providerName;
    String providerDescription;
    
    String qualityType;
    String qualityDescription;
    
    String subtitleLanguage;
    String subtitleLanguageDescription;
    
    int success;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        processRequest(request, response);
        
        PrintWriter out= response.getWriter();
        
        dataSave = Integer.parseInt(request.getParameter("dataSave"));
        
        if(dataSave == 1){
            downloaderName = request.getParameter("downloaderName");
            downloadLink = request.getParameter("downloadLink");
            fileSize = Integer.parseInt(request.getParameter("fileSize"));
            subtitleLink = request.getParameter("subtitleLink");
            typeId = Integer.parseInt(request.getParameter("typeId"));
            active = Integer.parseInt(request.getParameter("active"));
            verified = Integer.parseInt(request.getParameter("verified"));
            providerId = Integer.parseInt(request.getParameter("providerId"));
            qualityId = Integer.parseInt(request.getParameter("qualityId"));
            subtitleLanguageId = Integer.parseInt(request.getParameter("subtitleLanguageId"));
            imdbId = request.getParameter("imdbId");

            
            try{
                Admin.DataSet dataSet = new Admin.DataSet();
                //System.out.println(downloaderName+ downloadLink+ fileSize+ typeId+ active+ verified+ providerId+ qualityId);
                
                success = dataSet.insertDownloaderItem(downloaderName, downloadLink, fileSize, typeId, active, verified, providerId, qualityId);
                 
                dataSet.insertDownloaderItemSubtitles(dataSet.getMaxDownloaderId(), subtitleLanguageId, subtitleLink);
                
                dataSet.insertDownloaderItemImdbId(dataSet.getMaxDownloaderId(), imdbId);
            }
            catch(Exception e){
                success = 0;
            }
        }
        
        else if(dataSave == 2){
            downloaderId = Integer.parseInt(request.getParameter("downloaderId"));
            subtitleLanguageId = Integer.parseInt(request.getParameter("subtitleLanguageId"));
            subtitleLink = request.getParameter("subtitleLink");

            
            try{
                Admin.DataSet dataSet = new Admin.DataSet();
 
                success =dataSet.insertDownloaderItemSubtitles(downloaderId, subtitleLanguageId, subtitleLink);
            }
            catch(Exception e){
                success = 0;
            }
        }
        
        else if(dataSave == 3){
            providerName = request.getParameter("providerName");
            providerDescription = request.getParameter("providerDescription");
            
            try{
                Admin.DataSet dataSet = new Admin.DataSet();
 
                success =dataSet.insertProviders(providerName, providerDescription);
            }
            catch(Exception e){
                success = 0;
            }
        }
        
        else if(dataSave == 4){
            qualityType = request.getParameter("qualityType");
            qualityDescription = request.getParameter("qualityDescription");
            
            try{
                Admin.DataSet dataSet = new Admin.DataSet();
 
                success =dataSet.insertQualityTypes(qualityType, qualityDescription);
            }
            catch(Exception e){
                success = 0;
            }
        }
        
        else if(dataSave == 5){
            subtitleLanguage = request.getParameter("subtitleLanguage");
            subtitleLanguageDescription = request.getParameter("subtitleLanguageDescription");            
            try{
                Admin.DataSet dataSet = new Admin.DataSet();
 
                success =dataSet.insertSubtitleLanguages(subtitleLanguage, subtitleLanguageDescription);
            }
            catch(Exception e){
                success = 0;
            }
        }
        //System.out.println("aaaa "+success);
        out.print(success);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
