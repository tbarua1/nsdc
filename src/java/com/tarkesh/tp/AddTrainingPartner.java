/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarkesh.tp;

import com.tarkesh.entity.TrainingPartner;
import com.tarkesh.operation.Operations;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek.Sehgal
 */
@WebServlet(name = "AddTrainingPartner", urlPatterns = {"/AddTrainingPartner"})
public class AddTrainingPartner extends HttpServlet {

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
        TrainingPartner tp = new TrainingPartner();
        tp.setUsername(request.getParameter("username"));
        tp.setPassword(request.getParameter("password"));
        tp.setUsertype("tp");  
        tp.setRegisteredDate(new Date());
        tp.setCreator(request.getSession().getAttribute("username").toString());
        tp.setTpsmartid(request.getParameter("tpsmartid"));
        //tp.setName(request.getParameter("name"));
        tp.setSpocNumber(request.getParameter("mobile"));
        tp.setWhatsapp(request.getParameter("txtwhatsapp"));
        tp.setSpocName(request.getParameter("name"));
        tp.setEmail(request.getParameter("emailid"));
        tp.setBuilding(request.getParameter("building"));
        tp.setCity(request.getParameter("city"));
        tp.setLocality(request.getParameter("locality"));
        tp.setDistrict(request.getParameter("district"));
        tp.setState(request.getParameter("state"));
        tp.setPin(request.getParameter("pin"));
        Operations.addTrainingPartner(tp);
        response.sendRedirect("addTrainingPartner.jsp");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddAdmin</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddAdmin at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
