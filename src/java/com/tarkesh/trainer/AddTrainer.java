/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarkesh.trainer;

import com.tarkesh.entity.Trainer;
import com.tarkesh.operation.Operations;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
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
@WebServlet(name = "AddTrainer", urlPatterns = {"/AddTrainer"})
public class AddTrainer extends HttpServlet {

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
        Trainer trainer=new Trainer();
        trainer.setState(request.getParameter("state"));
        trainer.setDistrict(request.getParameter("district"));
        trainer.setQualification(request.getParameter("qualification"));
        String[] parameterValues = request.getParameterValues("afjobrole11");
        Set<String> sscList=new HashSet<>();
        Set<String> qpList=new HashSet<>();
        Set<String> jobroleList=new HashSet<>();
        for(String p:parameterValues){
            String[] split = p.split("@");
            sscList.add(split[0]);
            qpList.add(split[1]);
            jobroleList.add(split[2]);
        }
        trainer.setJobrole(new ObjectMapper().writeValueAsString(jobroleList));
        trainer.setSsc(new ObjectMapper().writeValueAsString(sscList));
        trainer.setQpcode(new ObjectMapper().writeValueAsString(qpList));
        
        trainer.setRegisteredDate(new Date());
        //trainer.setTotQualification(new ObjectMapper().writeValueAsString(parameterValues));
        trainer.setMobile(request.getParameter("mobile"));
        trainer.setWhatsapp(request.getParameter("txtwhatsapp"));
        trainer.setExperience(Double.parseDouble(request.getParameter("experience")));
        trainer.setName(request.getParameter("name"));
        trainer.setUsername(request.getParameter("username"));
        trainer.setPassword(request.getParameter("password"));
        trainer.setSkype(request.getParameter("skype"));
        trainer.setEmailid(request.getParameter("emailid"));
        trainer.setUsertype("trainer");
        trainer.setNatianality("Indian");
        Operations.addTrainer(trainer);
        response.sendRedirect("addTrainer.jsp");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddTrainer</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddTrainer at " + request.getContextPath() + "</h1>");
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
