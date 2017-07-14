<%-- 
    Document   : addBatchCode
    Created on : 25 Apr, 2017, 12:43:53 AM
    Author     : data1
--%>

<%@page import="com.tarkesh.entity.JobRole"%>
<%@page import="java.util.List"%>
<%@page import="com.tarkesh.entity.BatchCodes"%>
<%@page import="com.tarkesh.operation.Operations"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv=”Content-Type” content=”text/html; charset=ISO-8859-1″>
        <title>Add Batch Code</title>
        <script type=”text/javascript”>
            function ValidateForm()
            {

            if (document.frm.userName.value == ””)
            {
            alert(“Please Enter User Name “);
            return false;
            }
            if (document.frm.userAge.value == ””)
            {
            alert(“Please Enter Age”);
            return false;
            }
            if (document.frm.usercellNO.value == ””)
            {
            alert(“Please Enter Cell No”);
            return false;
            }
            if (document.frm.userAddress.value == ””)
            {
            alert(“Please Enter Address “);
            return false;
            }

            return true;
            }
            function save(){

            if (!ValidateForm()) return; {
            document.frm.action = "AddJobRole";
            document.frm.submit();
            }
            }
        </script>
    </head>
    <body><center>
        <form name=frm method="post" action="AddJobRole">
            <table border=”1″>
                <font size=”3″>Add Job Role</font>
                <tr>
                    <td>Type (Free/Paid)</td>
                    <td><INPUT type="checkbox" name="type" placeholder="Paid (check)"></td></tr>
                <tr>
                <tr>
                    <td>SSC Name</td>
                    <td><INPUT type=”text” name="ssc" value="" size=”24″ placeholder="SSC"></td></tr>
                <tr>
                    <td>Job Role</td>
                    <td><INPUT type=”text” name="jobrole" value="" size=”24″ placeholder="Job Role"></td>
                </tr>
                <tr><td>QP Code</td>
                    <td><INPUT type=”text” name="qp_code" value="" size=”24″ placeholder="QP Code"></td>
                </tr>
                <tr><td>Industry Type</td>
                    <td><select name="industry_type">
                            <option>Service</option>
                            <option>Manufacturing</option>
                        </select>
                    </td>
                </tr>
                <tr><td>Training Type</td>
                    <td><select name="training_type">
                            <option>Technical</option>
                            <option>Non-Technical</option>
                        </select></td>
                </tr>
                <tr><td>Number of Industry Visit</td>
                    <td><INPUT type=”text” name="industry_visit" value="" size=”24″ placeholder="Number of Industry Visit"></td>
                </tr>
                <tr><td>NSQF Level</td>
                    <td><INPUT type=”text” name="nsqf" value="" size=”24″ placeholder="NSQF Level"></td>
                </tr>
                <tr><td>Theory</td>
                    <td><INPUT type=”text” name="theory" value="" size=”24″ placeholder="Number of hours Theory"></td>
                </tr>
                <tr><td>Practical</td>
                    <td><INPUT type=”text” name="practical" value="" size=”24″ placeholder="Number of hours Practical"></td>
                </tr>
                <tr><td>Additional Duration</td>
                    <td><INPUT type=”text” name="add_duration" value="" size=”24″ placeholder="Number of hours Additional"></td>
                </tr>
                <tr><td>Digital Literacy</td>
                    <td><INPUT type=”text” name="digital" value="" size=”24″ placeholder="Number of hours Digital Literacy"></td>
                </tr>
                <tr><td>Total Hours</td>
                    <td><INPUT type=”text” name="total_hours" value="" size=”24″ placeholder="Number of total hours"></td>
                </tr>
                <tr><td></td><TD> <input type="submit" value="Add"> 
                        <!--<BUTTON type=button value=save name=cmdsave onclick=”save()” >Add</BUTTON>-->
                        <input type="reset" value="Cancel"></form>
                        <form action="editBatchCode.jsp"><input type="submit" value="Edit"></form>
                    </TD>
                </tr>
            </table>
            <table border="1">
                <tr>
                    <th>SSC</th>
                    <th>Job Role</th>
                    <th>QP Code</th>
                    <th>Training Type</th>
                    <th>Industry Type</th>
<th>Total</th>
<th>Extra</th>
<th>Theory</th>
<th>Practical</th>
<th>Digital Literacy</th>
<th>Industry Visit</th>
<th>NSQF Level</th>
<th>Paid/Free</th>
                </tr>
                <% List<JobRole> list1 = Operations.getJobRole();
                    for (JobRole u1 : list1) {
                        //if((request.getParameter(“cbousername")!=null)&&(request.getParameter(“cbousername").trim().equalsIgnoreCase(u1.getUserID().trim()))){
%><tr>
                    <td><%=u1.getSsc()%> </td>
                    <td><%=u1.getName()%></td>
                    <td><%=u1.getQp_code()%></td>
                    <td><%=u1.getTraining_type()%></td>
                    <td><%=u1.getIndustry_type()%></td>
                    <td><%=u1.getTotal_hours()%></td>
                    <td><%=u1.getAditional_duration()%></td>
                    <td><%=u1.getTheory()%></td>
                    <td><%=u1.getPractical()%></td>
                    <td><%=u1.getDegital_literacy()%></td>
                    <td><%=u1.getIndustry_visit()%></td>
                    <td><%=u1.getNsqf_level()%></td>
                    <td><%=u1.getPaid()%></td>
                </tr>
                <%}
                %>

                <%/*
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
                %>
            </table>

    </center></body>
</html>