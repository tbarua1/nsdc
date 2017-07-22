/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarkesh.tc;

import com.tarkesh.entity.Address;
import com.tarkesh.entity.JobRole;
import com.tarkesh.entity.TrainingCenter;
import com.tarkesh.operation.Operations;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Abhishek.Sehgal
 */
@WebServlet(name = "AddTrainingCenter", urlPatterns = {"/AddTrainingCenter"})
public class AddTrainingCenter extends HttpServlet {

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
        TrainingCenter tc = new TrainingCenter();
        tc.setRdate(new Date());
        HttpSession session = request.getSession();
        if(session==null){
        response.sendRedirect("expire.html");
        }
        String toString = session.getAttribute("username").toString();
        tc.setCreator(toString);
        System.out.println("TP Smart id - "+request.getParameter("tcsmartid"));
        tc.setTpsmartid(request.getParameter("tcsmartid"));
        tc.setNameSPOC(request.getParameter("spoc"));
        tc.setContactSPOC(request.getParameter("spocphone"));
        tc.setName(request.getParameter("trainingcenter"));
        tc.setUsername(request.getParameter("username"));
        tc.setPassword(request.getParameter("password"));
        tc.setUsertype("tc");
        tc.setSsc(request.getParameter("ssc"));
        tc.setBuildingNo(request.getParameter("building"));
        tc.setCity(request.getParameter("city"));
        tc.setDistrict(request.getParameter("district"));
        tc.setLatitude(Double.parseDouble(request.getParameter("latitute")));
        tc.setLongitude(Double.parseDouble(request.getParameter("longitute")));
        tc.setLocality(request.getParameter("locality"));
        tc.setPin(Integer.parseInt(request.getParameter("pin")));
        tc.setState(request.getParameter("state"));
        tc.setStreetNo(request.getParameter("street"));
        String[] parameterValues = request.getParameterValues("afjobrole");
        Set<String> sscList=new HashSet<>();
        Set<String> qpList=new HashSet<>();
        Set<String> jobroleList=new HashSet<>();
        for(String p:parameterValues){
            String[] split = p.split("@");
            sscList.add(split[0]);
            qpList.add(split[1]);
            jobroleList.add(split[2]);
        }
        tc.setJobrole(new ObjectMapper().writeValueAsString(jobroleList));
        tc.setSsc(new ObjectMapper().writeValueAsString(sscList));
        tc.setQpcode(new ObjectMapper().writeValueAsString(qpList));
        tc.setLatitude(Double.parseDouble(request.getParameter("latitute")));
        tc.setLongitude(Double.parseDouble(request.getParameter("longitute")));
        System.out.println("Record Saved " + Operations.addTrainingCenter(tc));
        response.sendRedirect("addTrainingCenter.jsp");
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
