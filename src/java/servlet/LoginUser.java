/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import UserFunctions.LoginUserCon;
import UserFunctions.USerDetailsCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Uditha Jay
 */
@WebServlet(name = "LoginUser", urlPatterns = {"/LoginUser"})
public class LoginUser extends HttpServlet {

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

        //HttpSession session = request.getSession();
        
        try{
            String usernameORemail = request.getParameter("txtUsernameORemail");
            String password = request.getParameter("txtPassword");
            
            UserFunctions.LoginUserCon loginUserCon = new UserFunctions.LoginUserCon();
            String username = loginUserCon.loginAutentication(usernameORemail, password);

            //System.out.println("lllll " + username);
            if(username != null && username != ""){
                
                request.getSession().setAttribute("loggedinUsername", username); // add to session
                request.getRequestDispatcher("/Downloader.jsp").forward(request, response);
               
                //response.sendRedirect("Downloader.jsp");
            }
            else
                request.getSession().setAttribute("loggedinUsername", "1"); // add to session
                request.getRequestDispatcher("/LoginConfirmation.jsp").forward(request, response);
                //response.sendRedirect("Downloader.jsp");

        }
        catch(Exception e) {
            e.printStackTrace();
            //session.setAttribute("username", null);
            //response.sendRedirect("Downloader.jsp");
        }
        //System.out.println("session" + session.getAttribute("username"));

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
        //processRequest(request, response);
        
        //request.setAttribute("username", "Uditha");
        //request.getRequestDispatcher("/WEB-INF/Download.jsp").forward(request, response);
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
