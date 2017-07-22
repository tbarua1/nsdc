/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarkesh.tp;

import com.tarkesh.entity.BatchSchedule;
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

/**
 *
 * @author Abhishek.Sehgal
 */
@WebServlet(name = "ListTrainingPartner", urlPatterns = {"/ListTrainingPartner"})
public class ListTrainingPartner extends HttpServlet {

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
        List<TrainingPartner> tplist = Operations.getTrainingPartnerAll();//BatchSchedule(trainerName,sday,smonth,syear,eday,emonth,eyear);

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html><head><title>Training Partner List</title></head><body><h1>Training Partner List</h1><table border='1'>");
            int totalHours = 0;
            for (TrainingPartner b : tplist) {
                 out.println("<td>" + b.getTpsmartid() + "</td>");               
                out.println("<td>" + b.getSpocName() + "</td>");
                out.println("<td>" + b.getSpocNumber() + "</td>");
               out.println("<td>" + b.getState() + "</td>");
                out.println("<td>" + b.getDistrict() + "</td>");
                out.println("<td>" + b.getCity() + "</td>");
                out.println("<td>" + b.getBuilding() + "</td>");
                out.println("<td>" + b.getUsername() + "</td>");
                out.println("<td>" + b.getPassword() + "</td>");
                out.println("</tr>");
            }
            out.println("</table></body></html>");
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
