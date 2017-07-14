package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tarkesh.entity.JobRole;
import java.util.List;
import com.tarkesh.entity.BatchCodes;
import com.tarkesh.operation.Operations;

public final class addJobRole_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=”Content-Type” content=”text/html; charset=ISO-8859-1″>\n");
      out.write("        <title>Add Batch Code</title>\n");
      out.write("        <script type=”text/javascript”>\n");
      out.write("            function ValidateForm()\n");
      out.write("            {\n");
      out.write("\n");
      out.write("            if (document.frm.userName.value == ””)\n");
      out.write("            {\n");
      out.write("            alert(“Please Enter User Name “);\n");
      out.write("            return false;\n");
      out.write("            }\n");
      out.write("            if (document.frm.userAge.value == ””)\n");
      out.write("            {\n");
      out.write("            alert(“Please Enter Age”);\n");
      out.write("            return false;\n");
      out.write("            }\n");
      out.write("            if (document.frm.usercellNO.value == ””)\n");
      out.write("            {\n");
      out.write("            alert(“Please Enter Cell No”);\n");
      out.write("            return false;\n");
      out.write("            }\n");
      out.write("            if (document.frm.userAddress.value == ””)\n");
      out.write("            {\n");
      out.write("            alert(“Please Enter Address “);\n");
      out.write("            return false;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            return true;\n");
      out.write("            }\n");
      out.write("            function save(){\n");
      out.write("\n");
      out.write("            if (!ValidateForm()) return; {\n");
      out.write("            document.frm.action = \"AddJobRole\";\n");
      out.write("            document.frm.submit();\n");
      out.write("            }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body><center>\n");
      out.write("        <form name=frm method=\"post\" action=\"AddJobRole\">\n");
      out.write("            <table border=”1″>\n");
      out.write("                <font size=”3″>Add Job Role</font>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Type (Free/Paid)</td>\n");
      out.write("                    <td><INPUT type=\"checkbox\" name=\"type\" placeholder=\"Paid (check)\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>SSC Name</td>\n");
      out.write("                    <td><INPUT type=”text” name=\"ssc\" value=\"\" size=”24″ placeholder=\"SSC\"></td></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Job Role</td>\n");
      out.write("                    <td><INPUT type=”text” name=\"jobrole\" value=\"\" size=”24″ placeholder=\"Job Role\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>QP Code</td>\n");
      out.write("                    <td><INPUT type=”text” name=\"qp_code\" value=\"\" size=”24″ placeholder=\"QP Code\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>Industry Type</td>\n");
      out.write("                    <td><select name=\"industry_type\">\n");
      out.write("                            <option>Service</option>\n");
      out.write("                            <option>Manufacturing</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>Training Type</td>\n");
      out.write("                    <td><select name=\"training_type\">\n");
      out.write("                            <option>Technical</option>\n");
      out.write("                            <option>Non-Technical</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>Number of Industry Visit</td>\n");
      out.write("                    <td><INPUT type=”text” name=\"industry_visit\" value=\"\" size=”24″ placeholder=\"Number of Industry Visit\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>NSQF Level</td>\n");
      out.write("                    <td><INPUT type=”text” name=\"nsqf\" value=\"\" size=”24″ placeholder=\"NSQF Level\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>Theory</td>\n");
      out.write("                    <td><INPUT type=”text” name=\"theory\" value=\"\" size=”24″ placeholder=\"Number of hours Theory\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>Practical</td>\n");
      out.write("                    <td><INPUT type=”text” name=\"practical\" value=\"\" size=”24″ placeholder=\"Number of hours Practical\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>Additional Duration</td>\n");
      out.write("                    <td><INPUT type=”text” name=\"add_duration\" value=\"\" size=”24″ placeholder=\"Number of hours Additional\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>Digital Literacy</td>\n");
      out.write("                    <td><INPUT type=”text” name=\"digital\" value=\"\" size=”24″ placeholder=\"Number of hours Digital Literacy\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>Total Hours</td>\n");
      out.write("                    <td><INPUT type=”text” name=\"total_hours\" value=\"\" size=”24″ placeholder=\"Number of total hours\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td></td><TD> <input type=\"submit\" value=\"Add\"> \n");
      out.write("                        <!--<BUTTON type=button value=save name=cmdsave onclick=”save()” >Add</BUTTON>-->\n");
      out.write("                        <input type=\"reset\" value=\"Cancel\"></form>\n");
      out.write("                        <form action=\"editBatchCode.jsp\"><input type=\"submit\" value=\"Edit\"></form>\n");
      out.write("                    </TD>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>SSC</th>\n");
      out.write("                    <th>Job Role</th>\n");
      out.write("                    <th>QP Code</th>\n");
      out.write("                    <th>Training Type</th>\n");
      out.write("                    <th>Industry Type</th>\n");
      out.write("<th>Total</th>\n");
      out.write("<th>Extra</th>\n");
      out.write("<th>Theory</th>\n");
      out.write("<th>Practical</th>\n");
      out.write("<th>Digital Literacy</th>\n");
      out.write("<th>Industry Visit</th>\n");
      out.write("<th>NSQF Level</th>\n");
      out.write("<th>Paid/Free</th>\n");
      out.write("                </tr>\n");
      out.write("                ");
 List<JobRole> list1 = Operations.getJobRole();
                    for (JobRole u1 : list1) {
                        //if((request.getParameter(“cbousername")!=null)&&(request.getParameter(“cbousername").trim().equalsIgnoreCase(u1.getUserID().trim()))){

      out.write("<tr>\n");
      out.write("                    <td>");
      out.print(u1.getSsc());
      out.write(" </td>\n");
      out.write("                    <td>");
      out.print(u1.getName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(u1.getQp_code());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(u1.getTraining_type());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(u1.getIndustry_type());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(u1.getTotal_hours());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(u1.getAditional_duration());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(u1.getTheory());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(u1.getPractical());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(u1.getDegital_literacy());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(u1.getIndustry_visit());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(u1.getNsqf_level());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(u1.getPaid());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
                
      out.write("\n");
      out.write("\n");
      out.write("                ");
/*
                UserDetail udet = new UserDetail();
                List<USERTABLE> mylist=new ArrayList<USERTABLE>();
                USERTABLE e = new USERTABLE();
                mylist=udet.getUserDetails(uid);
                System.out.println(“–size-*"+mylist.size());
                Iterator it=mylist.iterator();
                while(it.hasNext())
                {
                e=USERTABLE)it.next();
                     */
                
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("    </center></body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
