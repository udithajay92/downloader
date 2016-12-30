/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Uditha Jay
 */
@WebServlet(name = "RegisterUser", urlPatterns = {"/RegisterUser"})
public class RegisterUser extends HttpServlet {

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
        
        try{
            String username;
            String email;
            String password;
            String firstName;
            String lastName;
            String dobDate;
            String dobMonth;
            String dobYear;            
            String gender;
            String dob;

            
            
            username = request.getParameter("txtUserName");
            email = request.getParameter("txtEmail");
            password = request.getParameter("txtPassword");
            firstName = request.getParameter("txtFirstName");
            lastName = request.getParameter("txtLastName");
            dobDate = request.getParameter("selectDobDate");
            dobMonth = request.getParameter("selectDobMonth");
            dobYear = request.getParameter("txtDobYear");           
            gender = request.getParameter("optionsRadios");
            
            dob = dobDate + "/" + dobMonth + "/" + dobYear; 
            
            if(username.trim().toString()== null || username.trim().toString().isEmpty() ||
                    username.trim().toString()== null || username.trim().toString().isEmpty() ||
                    email.trim().toString()== null || email.trim().toString().isEmpty() ||
                    password.trim().toString()== null || password.trim().toString().isEmpty() ||
                    firstName.trim().toString()== null || firstName.trim().toString().isEmpty() ||
                    lastName.trim().toString()== null || lastName.trim().toString().isEmpty() ||
                    dobDate.trim().toString()== null || dobDate.trim().toString().isEmpty() ||
                    dobMonth.trim().toString()== null || dobMonth.trim().toString().isEmpty() ||
                    dobYear.trim().toString()== null || dobYear.trim().toString().isEmpty() ||
                    gender.trim().toString()== null || gender.trim().toString().isEmpty()){
                response.sendRedirect("Users/CreateAccount.jsp");
            }
            else{
                try{
                    UserFunctions.USerDetailsCon registerUserCon = new UserFunctions.USerDetailsCon();
                    registerUserCon.registerUserToDb(username, email, password, firstName, lastName, dob, gender);
                    response.sendRedirect("Downloader.jsp");
                }
                catch(Exception e){
                    response.sendRedirect("Users/CreateAccount.jsp"); 
                }
            }
                        
            
        }
        catch(Exception e){
            response.sendRedirect("Users/CreateAccount.jsp");    
        }
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
