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
@WebServlet(name = "UpdateUserDetails", urlPatterns = {"/UpdateUserDetails"})
public class UpdateUserDetails extends HttpServlet {
    String currentPassword;
    String newPassword;
    String update;
    String firstName;
    String lastName;
    String dob;
    String gender;
    
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
        
        PrintWriter out= response.getWriter();
        
        String userName = (String)request.getSession().getAttribute("loggedinUsername");
        
        UserFunctions.USerDetailsCon userDetailsCon = new UserFunctions.USerDetailsCon();
      
        JSONArray jasonArray=null;
            try {
                jasonArray = userDetailsCon.getUserDetails(userName);
                System.out.println(jasonArray);
                out.print(jasonArray);
            } catch (JSONException ex) {
                Logger.getLogger(DownloaderData.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
            Logger.getLogger(DownloaderData.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        
        try{
            update = request.getParameter("update");
            
            if(update.equals("1")){
                //System.out.println("if");
                firstName = request.getParameter("firstName");
                lastName = request.getParameter("lastName");
                dob = request.getParameter("dob");
                gender = request.getParameter("gender");
                //System.out.println(firstName+lastName+dob+gender);
                
                String userName = (String)request.getSession().getAttribute("loggedinUsername");
                
                UserFunctions.USerDetailsCon userDetailsCon = new UserFunctions.USerDetailsCon();
                int success = userDetailsCon.updateUserDetails(userName, firstName, lastName, dob, gender);
                
                out.print(success);
            }
            
            else{
                //System.out.println("else");
                currentPassword = request.getParameter("currentPassword");
                newPassword = request.getParameter("newPassword");

                String userName = (String)request.getSession().getAttribute("loggedinUsername");

                UserFunctions.USerDetailsCon userDetailsCon = new UserFunctions.USerDetailsCon();
                int success = userDetailsCon.updateUserPassword(userName, currentPassword, newPassword);

                out.print(success);
            }
        }
        catch(Exception e){
            out.print("0");
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
