package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.tarkesh.entity.TrainingCenter;
import java.util.Calendar;
import com.tarkesh.entity.BatchSchedule;
import com.tarkesh.entity.Trainer;
import com.tarkesh.entity.BatchCodes;
import com.tarkesh.operation.Operations;
import java.util.List;

public final class addBatchSchedule_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=”Content-Type” content=”text/html; charset=ISO-8859-1″>\r\n");
      out.write("        <title>Add Batch Schedule</title>\r\n");
      out.write("        <script type=”text/javascript”>\r\n");
      out.write("            function ValidateForm()\r\n");
      out.write("            {\r\n");
      out.write("\r\n");
      out.write("            if (document.frm.userName.value == ””)\r\n");
      out.write("            {\r\n");
      out.write("            alert(“Please Enter User Name “);\r\n");
      out.write("            return false;\r\n");
      out.write("            }\r\n");
      out.write("            if (document.frm.userAge.value == ””)\r\n");
      out.write("            {\r\n");
      out.write("            alert(“Please Enter Age”);\r\n");
      out.write("            return false;\r\n");
      out.write("            }\r\n");
      out.write("            if (document.frm.usercellNO.value == ””)\r\n");
      out.write("            {\r\n");
      out.write("            alert(“Please Enter Cell No”);\r\n");
      out.write("            return false;\r\n");
      out.write("            }\r\n");
      out.write("            if (document.frm.userAddress.value == ””)\r\n");
      out.write("            {\r\n");
      out.write("            alert(“Please Enter Address “);\r\n");
      out.write("            return false;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            return true;\r\n");
      out.write("            }\r\n");
      out.write("            function save(){\r\n");
      out.write("\r\n");
      out.write("            if (!ValidateForm()) return; {\r\n");
      out.write("            document.frm.action = \"AddBatchCodeWeb\";\r\n");
      out.write("            document.frm.submit();\r\n");
      out.write("            }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body><center>\r\n");
      out.write("        <form name=frm method=\"post\" action=\"AddScheduleWeb\">\r\n");
      out.write("            <table border=”1″>\r\n");
      out.write("                <font size=”3″>Add Batch Schedule</font>\r\n");
      out.write("                <tr><td>University</td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <select name=\"university\">\r\n");
      out.write("                            ");

                                List<TrainingCenter> list2 = Operations.getTrainingCenterAll();
                                for (TrainingCenter university : list2) {
                            
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print(university.getName());
      out.write('"');
      out.write('>');
      out.print(university.getName());
      out.write("</option>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </select></td></tr>\r\n");
      out.write("                <tr><td>Trainer</td>\r\n");
      out.write("                    <td><select name=\"trainer\">\r\n");
      out.write("                            ");

                                List<Trainer> trainerList = Operations.getBatchTrainer();
                                for (Trainer university : trainerList) {
                            
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print(university.getName());
      out.write('"');
      out.write('>');
      out.print(university.getName());
      out.write("</option>\r\n");
      out.write("                            ");

                                }
                            
      out.write("                            \r\n");
      out.write("                        </select></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr><td>Batch Code</td>\r\n");
      out.write("                    <td><select name=\"batchcode\">\r\n");
      out.write("                            ");

                                List<BatchCodes> batchCodeList = Operations.getBatchCode();
                                for (BatchCodes university : batchCodeList) {
                            
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print(university.getBatchCode());
      out.write('"');
      out.write('>');
      out.print(university.getBatchCode());
      out.write("</option>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </select></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Schedule Date</td>\r\n");
      out.write("                    <td><select name=\"day\">\r\n");
      out.write("                            <option>1</option>\r\n");
      out.write("                            <option>2</option>\r\n");
      out.write("                            <option>3</option>\r\n");
      out.write("                            <option>4</option>\r\n");
      out.write("                            <option>5</option>\r\n");
      out.write("                            <option>6</option>\r\n");
      out.write("                            <option>7</option>\r\n");
      out.write("                            <option>8</option>\r\n");
      out.write("                            <option>9</option>\r\n");
      out.write("                            <option>10</option>\r\n");
      out.write("                            <option>11</option>\r\n");
      out.write("                            <option>12</option>\r\n");
      out.write("                            <option>13</option>\r\n");
      out.write("                            <option>14</option>\r\n");
      out.write("                            <option>15</option>\r\n");
      out.write("                            <option>16</option>\r\n");
      out.write("                            <option>17</option>\r\n");
      out.write("                            <option>18</option>\r\n");
      out.write("                            <option>19</option>\r\n");
      out.write("                            <option>20</option>\r\n");
      out.write("                            <option>21</option>\r\n");
      out.write("                            <option>22</option>\r\n");
      out.write("                            <option>23</option>\r\n");
      out.write("                            <option>24</option>\r\n");
      out.write("                            <option>25</option>\r\n");
      out.write("                            <option>26</option>\r\n");
      out.write("                            <option>27</option>\r\n");
      out.write("                            <option>28</option>\r\n");
      out.write("                            <option>29</option>\r\n");
      out.write("                            <option>30</option>\r\n");
      out.write("                            <option>31</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select name=\"month\">\r\n");
      out.write("                            <option value=\"0\">January</option>\r\n");
      out.write("                            <option value=\"1\">February</option>\r\n");
      out.write("                            <option value=\"2\">March</option>\r\n");
      out.write("                            <option value=\"3\">April</option>\r\n");
      out.write("                            <option value=\"4\">May</option>\r\n");
      out.write("                            <option value=\"5\">June</option>\r\n");
      out.write("                            <option value=\"6\">July</option>\r\n");
      out.write("                            <option value=\"7\">August</option>\r\n");
      out.write("                            <option value=\"8\">September</option>\r\n");
      out.write("                            <option value=\"9\">October</option>\r\n");
      out.write("                            <option value=\"10\">November</option>\r\n");
      out.write("                            <option value=\"11\">December</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("\r\n");
      out.write("                        <select name=\"year\">\r\n");
      out.write("                            <option>2017</option>\r\n");
      out.write("                            <option>2018</option>                            \r\n");
      out.write("                        </select>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Schedule Time</td>\r\n");
      out.write("                    <td>Start:<select name=\"starthour\">\r\n");
      out.write("                            <option>8</option>\r\n");
      out.write("                            <option>9</option>\r\n");
      out.write("                            <option>10</option>\r\n");
      out.write("                            <option>11</option>\r\n");
      out.write("                            <option>12</option>\r\n");
      out.write("                            <option>13</option>\r\n");
      out.write("                            <option>14</option>\r\n");
      out.write("                            <option>15</option>\r\n");
      out.write("                            <option>16</option>\r\n");
      out.write("                            <option>17</option>\r\n");
      out.write("                            <option>18</option>\r\n");
      out.write("                            <option>19</option>\r\n");
      out.write("                            <option>20</option>\r\n");
      out.write("                            <option>21</option>\r\n");
      out.write("                            <option>22</option>\r\n");
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select name=\"startminute\">\r\n");
      out.write("                            <option>0</option>                            \r\n");
      out.write("                            <option>5</option>\r\n");
      out.write("                            <option>10</option>\r\n");
      out.write("                            <option>15</option>\r\n");
      out.write("                            <option>20</option>\r\n");
      out.write("                            <option>25</option>\r\n");
      out.write("                            <option>30</option>\r\n");
      out.write("                            <option>35</option>\r\n");
      out.write("                            <option>40</option>\r\n");
      out.write("                            <option>45</option>\r\n");
      out.write("                            <option>50</option>\r\n");
      out.write("                            <option>55</option>\r\n");
      out.write("                        </select> End: <select name=\"endhour\">\r\n");
      out.write("                            <option>8</option>\r\n");
      out.write("                            <option>9</option>\r\n");
      out.write("                            <option>10</option>\r\n");
      out.write("                            <option>11</option>\r\n");
      out.write("                            <option>12</option>\r\n");
      out.write("                            <option>13</option>\r\n");
      out.write("                            <option>14</option>\r\n");
      out.write("                            <option>15</option>\r\n");
      out.write("                            <option>16</option>\r\n");
      out.write("                            <option>17</option>\r\n");
      out.write("                            <option>18</option>\r\n");
      out.write("                            <option>19</option>\r\n");
      out.write("                            <option>20</option>\r\n");
      out.write("                            <option>21</option>\r\n");
      out.write("                            <option>22</option>\r\n");
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <select name=\"endminute\">\r\n");
      out.write("                            <option>0</option>                            \r\n");
      out.write("                            <option>5</option>\r\n");
      out.write("                            <option>10</option>\r\n");
      out.write("                            <option>15</option>\r\n");
      out.write("                            <option>20</option>\r\n");
      out.write("                            <option>25</option>\r\n");
      out.write("                            <option>30</option>\r\n");
      out.write("                            <option>35</option>\r\n");
      out.write("                            <option>40</option>\r\n");
      out.write("                            <option>45</option>\r\n");
      out.write("                            <option>50</option>\r\n");
      out.write("                            <option>55</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        Days\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        <table><tr><td>Day1 &nbsp;<input type=\"checkbox\" name=\"day1\" value=\"0\"></td> \r\n");
      out.write("                                <td>Day2 &nbsp;<input type=\"checkbox\" name=\"day2\" value=\"1\"></td> \r\n");
      out.write("                                <td>Day3 &nbsp;<input type=\"checkbox\" name=\"day3\" value=\"2\"> </td>\r\n");
      out.write("                                <td>Day4 &nbsp;<input type=\"checkbox\" name=\"day4\" value=\"3\"> </td>\r\n");
      out.write("                            </tr><tr> <td>Day5 &nbsp;<input type=\"checkbox\" name=\"day5\" value=\"4\"></td> \r\n");
      out.write("                                <td>Day6 &nbsp;<input type=\"checkbox\" name=\"day6\" value=\"5\"> </td>\r\n");
      out.write("                                <td>Day7 &nbsp;<input type=\"checkbox\" name=\"day7\" value=\"6\"> </td>\r\n");
      out.write("                                <td>Day8 &nbsp;<input type=\"checkbox\" name=\"day8\" value=\"7\"> </td>\r\n");
      out.write("                            </tr><tr><td>Day9 &nbsp;<input type=\"checkbox\" name=\"day9\" value=\"8\"> </td>\r\n");
      out.write("                                <td>Day10<input type=\"checkbox\" name=\"day10\" value=\"9\"> </td>\r\n");
      out.write("                                <td>Day11<input type=\"checkbox\" name=\"day11\" value=\"10\"> </td>\r\n");
      out.write("                                <td>Day12<input type=\"checkbox\" name=\"day12\" value=\"11\"></td> \r\n");
      out.write("                            </tr><tr> <td>Day13<input type=\"checkbox\" name=\"day13\" value=\"12\"></td> \r\n");
      out.write("                                <td>Day14<input type=\"checkbox\" name=\"day14\" value=\"13\"></td> \r\n");
      out.write("                                <td>Day15<input type=\"checkbox\" name=\"day15\" value=\"14\"></td> \r\n");
      out.write("                                <td> Day16<input type=\"checkbox\" name=\"day16\" value=\"15\"></td>\r\n");
      out.write("                                </td></tr></table>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr><td></td><TD> <input type=\"submit\" value=\"Add\"> \r\n");
      out.write("                        <!--<BUTTON type=button value=save name=cmdsave onclick=”save()” >Add</BUTTON>-->\r\n");
      out.write("                        <input type=\"reset\" value=\"Cancel\"></form>\r\n");
      out.write("                        <form action=\"editBatchCode.jsp\"><input type=\"submit\" value=\"Edit\"></form>\r\n");
      out.write("                    </TD>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <table border=\"1\">\r\n");
      out.write("                ");
 List<BatchSchedule> batchScheduleList = Operations.getBatchSchedule();
                    for (BatchSchedule u1 : batchScheduleList) {
                        //if((request.getParameter(“cbousername")!=null)&&(request.getParameter(“cbousername").trim().equalsIgnoreCase(u1.getUserID().trim()))){

      out.write("<tr> <td>");
      out.print(u1.getStatus());
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(u1.getBatchcode());
      out.write(" </td>                \r\n");
      out.write("\r\n");
      out.write("                    <td>");
      out.print(u1.getTrainer());
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("                    <td>");
      out.print(u1.getDate().get(Calendar.DATE) + "-" + (u1.getDate().get(Calendar.MONTH) + 1) + "-" + u1.getDate().get(Calendar.YEAR) + " " + u1.getDate().get(Calendar.HOUR_OF_DAY) + ":" + u1.getDate().get(Calendar.MINUTE));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(u1.getTill().get(Calendar.DATE) + "-" + (u1.getTill().get(Calendar.MONTH) + 1) + "-" + u1.getTill().get(Calendar.YEAR) + " " + u1.getTill().get(Calendar.HOUR_OF_DAY) + ":" + u1.getTill().get(Calendar.MINUTE));
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(u1.getUniversity());
      out.write("</td><!--<td>");
      out.print(u1.getTill());
      out.write("</td>-->\r\n");
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
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
