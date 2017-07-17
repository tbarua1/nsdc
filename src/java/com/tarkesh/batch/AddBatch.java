/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarkesh.batch;

import com.tarkesh.entity.BatchCodes;
import com.tarkesh.operation.Operations;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Abhishek.Sehgal
 */
@WebServlet(name = "AddBatch", urlPatterns = {"/AddBatch"})
public class AddBatch extends HttpServlet {

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
        BatchCodes batchCodes = new BatchCodes();
        batchCodes.setBatchCode(request.getParameter("state") + "_" + request.getParameter("district") + "_" + request.getParameter("smarttcid") + "_" + request.getParameter("qpcode") + "_" + request.getParameter("trainer"));
        batchCodes.setState(request.getParameter("state"));
        batchCodes.setDistrict(request.getParameter("district"));
        batchCodes.setSmarttcid(request.getParameter("smarttcid"));
        batchCodes.setTariningcentername(request.getParameter("tariningcentername"));
        batchCodes.setJobrole(request.getParameter("jobrole"));
        batchCodes.setSsc(request.getParameter("ssc"));
        batchCodes.setQpcode(request.getParameter("qpcode"));
        batchCodes.setTrainer_name(request.getParameter("trainer"));
        batchCodes.setTrainer_contact(request.getParameter("trainercontact"));
        batchCodes.setBatchSize_start(Integer.parseInt(request.getParameter("initstudents")));
        batchCodes.setBatchSize_ondate(Integer.parseInt(request.getParameter("ondatestudents")));
        batchCodes.setCompleted_hours(Integer.parseInt(request.getParameter("completedhour")));
        System.out.println(batchCodes);
        Operations.addBatchCode(batchCodes);
        response.sendRedirect("addBatchCode.jsp");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddBatch</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddBatch at " + request.getContextPath() + "</h1>");
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
