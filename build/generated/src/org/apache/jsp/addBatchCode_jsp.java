package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import com.tarkesh.entity.BatchCodes;
import com.tarkesh.operation.Operations;

public final class addBatchCode_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=”Content-Type” content=”text/html; charset=ISO-8859-1″>\r\n");
      out.write("        <title>Add Batch Code</title>\r\n");
      out.write("        <script type=”text/javascript”>\r\n");
      out.write("            function ValidateForm()\r\n");
      out.write("                    {\r\n");
      out.write("\r\n");
      out.write("                    if (document.frm.userName.value == ””)\r\n");
      out.write("                            {\r\n");
      out.write("                            alert(“Please Enter User Name “);\r\n");
      out.write("                            return false;\r\n");
      out.write("                            }\r\n");
      out.write("                    if (document.frm.userAge.value == ””)\r\n");
      out.write("                            {\r\n");
      out.write("                            alert(“Please Enter Age”);\r\n");
      out.write("                            return false;\r\n");
      out.write("                            }\r\n");
      out.write("                    if (document.frm.usercellNO.value == ””)\r\n");
      out.write("                            {\r\n");
      out.write("                            alert(“Please Enter Cell No”);\r\n");
      out.write("                            return false;\r\n");
      out.write("                            }\r\n");
      out.write("                    if (document.frm.userAddress.value == ””)\r\n");
      out.write("                            {\r\n");
      out.write("                            alert(“Please Enter Address “);\r\n");
      out.write("                            return false;\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                    return true;\r\n");
      out.write("                    }\r\n");
      out.write("            function save(){\r\n");
      out.write("\r\n");
      out.write("            if (!ValidateForm()) return; {\r\n");
      out.write("            document.frm.action = \"AddBatchCode\";\r\n");
      out.write("            document.frm.submit();\r\n");
      out.write("            }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body><center>\r\n");
      out.write("        <form name=frm method=\"post\" action=\"AddBatchCode\">\r\n");
      out.write("            <table border=”1″>\r\n");
      out.write("                <font size=”3″>Add Batch Code</font>\r\n");
      out.write("                <tr><td>State</td>\r\n");
      out.write("                    <td><select class=\"form-control\" name=\"state\" onchange=\"jsFunction(this.value);\">\r\n");
      out.write("                                <option value=\"AN\">Andaman and Nicobar</option>\r\n");
      out.write("                                <option value=\"AP\">Andhra Pradesh</option>\r\n");
      out.write("                                <option value=\"AR\">Arunachal Pradesh</option>\r\n");
      out.write("                                <option value=\"BR\">Bihar</option>\r\n");
      out.write("                                <option value=\"CH\">Chandigarh</option> \r\n");
      out.write("                                <option value=\"CG\">Chhattisgarh</option> \r\n");
      out.write("                                <option value=\"DN\">Dadra and Nagar Haveli</option> \r\n");
      out.write("                                <option value=\"DD\">Daman and Diu</option> \r\n");
      out.write("                                <option value=\"DL\">Delhi</option> \r\n");
      out.write("                                <option value=\"GA\">Goa</option>\r\n");
      out.write("                                <option value=\"GJ\">Gujarat</option> \r\n");
      out.write("                                <option value=\"HR\">Haryana</option> \r\n");
      out.write("                                <option value=\"HP\">Himachal Pradesh</option> \r\n");
      out.write("                                <option value=\"JK\">Jammu and Kashmir</option> \r\n");
      out.write("                                <option value=\"JH\">Jharkhand</option> \r\n");
      out.write("                                <option value=\"KA\">Karnataka</option> \r\n");
      out.write("                                <option value=\"KL\">Kerala</option> \r\n");
      out.write("                                <option value=\"LD\">Lakshadweep</option>\r\n");
      out.write("                                <option value=\"MP\">Madhya Pradesh</option> \r\n");
      out.write("                                <option value=\"MH\">Maharashtra</option> \r\n");
      out.write("                                <option value=\"MN\">Manipur</option> \r\n");
      out.write("                                <option value=\"ML\">Meghalaya</option> \r\n");
      out.write("                                <option value=\"MZ\">Mizoram</option> \r\n");
      out.write("                                <option value=\"NL\">Nagaland</option> \r\n");
      out.write("                                <option value=\"OD\">Odisha</option> \r\n");
      out.write("                                <option value=\"PY\">Puducherry</option> \r\n");
      out.write("                                <option value=\"PB\">Punjab</option>\r\n");
      out.write("                                <option value=\"RJ\">Rajathan</option>\r\n");
      out.write("                                <option value=\"SK\">Sikkim</option>\r\n");
      out.write("                                <option value=\"TN\">Tamil Nadu</option>\r\n");
      out.write("                                <option value=\"TS\">Telangana</option>\r\n");
      out.write("                                <option value=\"TR\">Tripura</option>\r\n");
      out.write("                                <option value=\"UP\">Uttar Pradesh</option>\r\n");
      out.write("                                <option value=\"UK\">Uttarakhand</option>\r\n");
      out.write("                                <option value=\"WB\">West Bengal</option>\r\n");
      out.write("                            </select><a href=\"addDistrict.jsp\">Add District</a></td></tr>\r\n");
      out.write("                <tr><td>District</td>\r\n");
      out.write("                    <td><INPUT type=”text” name=facebookGroup value=\"\" size=”24″></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr><td>Training Center</td>\r\n");
      out.write("                    <td><INPUT type=”text” name=scheduledDay value=\"\" size=”24″></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr><td>Job Role</td>\r\n");
      out.write("                    <td><INPUT type=”text” name=content value=\"\" size=”24″></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr><td></td><TD> <input type=\"submit\" value=\"Add\"> \r\n");
      out.write("                        <!--<BUTTON type=button value=save name=cmdsave onclick=”save()” >Add</BUTTON>-->\r\n");
      out.write("                        <input type=\"reset\" value=\"Cancel\"></form>\r\n");
      out.write("                        <form action=\"editBatchCode.jsp\"><input type=\"submit\" value=\"Edit\"></form>\r\n");
      out.write("                    </TD>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <table>\r\n");
      out.write("                ");
 List<BatchCodes> list1 = Operations.getBatchCode();
                    for (BatchCodes u1 : list1) {
                //if((request.getParameter(“cbousername")!=null)&&(request.getParameter(“cbousername").trim().equalsIgnoreCase(u1.getUserID().trim()))){
                
      out.write("<tr>\r\n");
      out.write("                    <td>");
      out.print(u1.getBatchCode());
      out.write(" </td>\r\n");
      out.write("                    <td>");
      out.print(u1.getJobrole());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(u1.getSsc());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(u1.getTrainer_name());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(u1.getTrainer_contact());
      out.write("</td>\r\n");
      out.write("                     <td>");
      out.print(u1.getCompleted_hours());
      out.write("</td>\r\n");
      out.write("                     <td>");
      out.print(u1.getBatchSize_ondate());
      out.write("</td>\r\n");
      out.write("                     <td>");
      out.print(u1.getBatchSize_start());
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                    ");
}
                    
      out.write("\r\n");
      out.write("\r\n");
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
                
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("\r\n");
      out.write("    </center></body>\r\n");
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
