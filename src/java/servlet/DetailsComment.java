/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONException;

/**
 *
 * @author Uditha Jay
 */
@WebServlet(name = "DetailsComment", urlPatterns = {"/DetailsComment"})
public class DetailsComment extends HttpServlet {

    String username;
    String downloaderId;
    String comment;
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
        
        downloaderId = request.getParameter("downloaderId");
        comment = request.getParameter("comment");
        //System.out.println("1  "+downloaderId + "  " + comment);
        
        username = (String)request.getSession().getAttribute("loggedinUsername");
        
        DownloaderFunctions.CommentDetails commentDetails = new DownloaderFunctions.CommentDetails();
        commentDetails.insertUserComment(username, downloaderId, comment);
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
        
        downloaderId = request.getParameter("downloaderid");
        
        DownloaderFunctions.CommentDetails commentDetails = new DownloaderFunctions.CommentDetails();
      
        JSONArray jasonArray=null;
            try {
                jasonArray = commentDetails.getCommentDetails(downloaderId);
                //System.out.println(jasonArray);
                out.print(jasonArray);
            } catch (JSONException ex) {
                Logger.getLogger(DownloaderData.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
            Logger.getLogger(DownloaderData.class.getName()).log(Level.SEVERE, null, ex);
        }
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
