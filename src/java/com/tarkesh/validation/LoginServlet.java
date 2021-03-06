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
import javax.servlet.http.HttpSession;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author nsdc-ey
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

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
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        session.setAttribute("usertype", usertype);
        if (usertype.equalsIgnoreCase("admin")) {
            List<RegisterAdmin> loginCheckAdmin = Operations.loginCheckAdmin(username, password, usertype);
            if (loginCheckAdmin == null) {
                getServletConfig().getServletContext()
                  .getRequestDispatcher("/error.html")
                  .forward(request, response);
            }
            session.setAttribute("informationAdmin", loginCheckAdmin);
            request.setAttribute("workList", true);
            request.getRequestDispatcher("/admin.jsp").forward(request, response);
        }

        if (usertype.equalsIgnoreCase("tp")) {
            List<TrainingPartner> loginCheckTP = Operations.loginCheckTP(username, password, usertype);
            if (loginCheckTP == null) {
                getServletConfig().getServletContext()
                  .getRequestDispatcher("/error.html")
                  .forward(request, response);
            }
            session.setAttribute("informationPartner", loginCheckTP);
            request.setAttribute("workList", true);
            request.getRequestDispatcher("/partner.jsp").forward(request, response);
        }
        if (usertype.equalsIgnoreCase("tc")) {
            List<TrainingCenter> loginCheckTC = Operations.loginCheckTC(username, password, usertype);
           
            if (loginCheckTC == null) {
               getServletConfig().getServletContext()
                  .getRequestDispatcher("/error.html")
                  .forward(request, response);
            }
            session.setAttribute("informationTC", loginCheckTC);
            request.setAttribute("workList", true);
            request.getRequestDispatcher("/center.jsp").forward(request, response);
        }
        if (usertype.equalsIgnoreCase("trainer")) {
            List<Trainer> loginCheckTrainer = Operations.loginCheckTrainer(username, password, usertype);
            if (loginCheckTrainer == null) {
                getServletConfig().getServletContext()
                  .getRequestDispatcher("/error.html")
                  .forward(request, response);
            }
            session.setAttribute("informationTrainer", loginCheckTrainer);
            request.setAttribute("workList", true);
            request.getRequestDispatcher("/trainer.jsp").forward(request, response);
        }

        request.setAttribute("workList", false);
        response.sendRedirect("error.html");

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
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
