/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarkesh.courses;

import com.tarkesh.entity.JobRole;
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
@WebServlet(name = "AddJobRole", urlPatterns = {"/AddJobRole"})
public class AddJobRole extends HttpServlet {

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
        System.out.println("Adding Job Role");
        String type = request.getParameter("type");
        Boolean booltype;
        if (type == null) {
            booltype = Boolean.FALSE;
        } else {
            booltype = Boolean.TRUE;
        }

        System.out.println("Type " + type);
        String ssc = request.getParameter("ssc");
        String jobrole = request.getParameter("jobrole");
        String qp_code = request.getParameter("qp_code");
        String industry_type = request.getParameter("industry_type");
        String training_type = request.getParameter("training_type");
        Integer industry_visit = Integer.parseInt(request.getParameter("industry_visit"));
        Integer nsqf = Integer.parseInt(request.getParameter("nsqf"));
        Integer theory = Integer.parseInt(request.getParameter("theory"));
        Integer practical = Integer.parseInt(request.getParameter("practical"));
        Integer add_duration = Integer.parseInt(request.getParameter("add_duration"));
        Integer digital = Integer.parseInt(request.getParameter("digital"));
        Integer total_hours = Integer.parseInt(request.getParameter("total_hours"));
        JobRole jobRole = new JobRole();
        jobRole.setPaid(booltype);
        jobRole.setSsc(ssc);
        jobRole.setName(jobrole);
        jobRole.setQp_code(qp_code);
        jobRole.setIndustry_type(industry_type);
        jobRole.setTraining_type(training_type);
        jobRole.setIndustry_visit(industry_visit);
        jobRole.setNsqf_level(nsqf);
        jobRole.setTheory(theory);
        jobRole.setPractical(practical);
        jobRole.setAditional_duration(add_duration);
        jobRole.setDegital_literacy(digital);
        jobRole.setTotal_hours(total_hours);
        Operations.addJobRole(jobRole);
        response.sendRedirect("addJobRole.jsp");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddJobRole</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddJobRole at " + request.getContextPath() + "</h1>");
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
