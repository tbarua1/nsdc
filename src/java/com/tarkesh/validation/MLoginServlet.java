/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarkesh.validation;

import com.tarkesh.entity.RegisterAdmin;
import com.tarkesh.entity.Trainer;
import com.tarkesh.entity.TrainingCenter;
import com.tarkesh.entity.TrainingPartner;
import com.tarkesh.operation.Operations;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Abhishek.Sehgal
 */
@WebServlet(name = "MLoginServlet", urlPatterns = {"/MLoginServlet"})
public class MLoginServlet extends HttpServlet {

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
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String usertype = request.getParameter("usertype");
        System.out.println(password + " " + username + " " + usertype);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            if (usertype.equalsIgnoreCase("Administrator")) {
            List<RegisterAdmin> loginCheckAdmin = Operations.loginCheckAdmin(username, password, usertype);
            if (loginCheckAdmin == null) {
               out.println("error");
            }
            out.println(new ObjectMapper().writeValueAsString(loginCheckAdmin));
        }

        if (usertype.equalsIgnoreCase("Training_Partner")) {
            List<TrainingPartner> loginCheckTP = Operations.loginCheckTP(username, password, usertype);
            if (loginCheckTP == null) {
                 out.println("error");
            }
            out.println(new ObjectMapper().writeValueAsString(loginCheckTP));}
        if (usertype.equalsIgnoreCase("Tarining_Center")) {
            List<TrainingCenter> loginCheckTC = Operations.loginCheckTC(username, password, usertype);
           
            if (loginCheckTC == null) {
               out.println("error");
            }
           out.println(new ObjectMapper().writeValueAsString(loginCheckTC)); }
        if (usertype.equalsIgnoreCase("Trainer")) {
            List<Trainer> loginCheckTrainer = Operations.loginCheckTrainer(username, password, usertype);
            if (loginCheckTrainer == null) {
                out.println("error");
            }
        out.println(new ObjectMapper().writeValueAsString(loginCheckTrainer));
        }

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
