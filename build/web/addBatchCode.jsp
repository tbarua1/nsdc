<%-- 
    Document   : addBatchCode
    Created on : 25 Apr, 2017, 12:43:53 AM
    Author     : data1
--%>

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
            document.frm.action = "AddBatchCode";
            document.frm.submit();
            }
            }
        </script>
    </head>
    <body><center>
        <form name=frm method="post" action="AddBatchCode">
            <table border=”1″>
                <font size=”3″>Add Batch Code</font>
                <tr><td>State</td>
                    <td><select class="form-control" name="state" onchange="jsFunction(this.value);">
                                <option value="AN">Andaman and Nicobar</option>
                                <option value="AP">Andhra Pradesh</option>
                                <option value="AR">Arunachal Pradesh</option>
                                <option value="BR">Bihar</option>
                                <option value="CH">Chandigarh</option> 
                                <option value="CG">Chhattisgarh</option> 
                                <option value="DN">Dadra and Nagar Haveli</option> 
                                <option value="DD">Daman and Diu</option> 
                                <option value="DL">Delhi</option> 
                                <option value="GA">Goa</option>
                                <option value="GJ">Gujarat</option> 
                                <option value="HR">Haryana</option> 
                                <option value="HP">Himachal Pradesh</option> 
                                <option value="JK">Jammu and Kashmir</option> 
                                <option value="JH">Jharkhand</option> 
                                <option value="KA">Karnataka</option> 
                                <option value="KL">Kerala</option> 
                                <option value="LD">Lakshadweep</option>
                                <option value="MP">Madhya Pradesh</option> 
                                <option value="MH">Maharashtra</option> 
                                <option value="MN">Manipur</option> 
                                <option value="ML">Meghalaya</option> 
                                <option value="MZ">Mizoram</option> 
                                <option value="NL">Nagaland</option> 
                                <option value="OD">Odisha</option> 
                                <option value="PY">Puducherry</option> 
                                <option value="PB">Punjab</option>
                                <option value="RJ">Rajathan</option>
                                <option value="SK">Sikkim</option>
                                <option value="TN">Tamil Nadu</option>
                                <option value="TS">Telangana</option>
                                <option value="TR">Tripura</option>
                                <option value="UP">Uttar Pradesh</option>
                                <option value="UK">Uttarakhand</option>
                                <option value="WB">West Bengal</option>
                            </select><a href="addDistrict.jsp">Add District</a></td></tr>
                <tr><td>District</td>
                    <td><INPUT type=”text” name=facebookGroup value="" size=”24″></td>
                </tr>
                <tr><td>Training Center</td>
                    <td><INPUT type=”text” name=scheduledDay value="" size=”24″></td>
                </tr>
                <tr><td>Job Role</td>
                    <td><INPUT type=”text” name=content value="" size=”24″></td>
                </tr>
                <tr><td></td><TD> <input type="submit" value="Add"> 
                        <!--<BUTTON type=button value=save name=cmdsave onclick=”save()” >Add</BUTTON>-->
                        <input type="reset" value="Cancel"></form>
                        <form action="editBatchCode.jsp"><input type="submit" value="Edit"></form>
                    </TD>
                </tr>
            </table>
            <table>
                <% List<BatchCodes> list1 = Operations.getBatchCode();
                    for (BatchCodes u1 : list1) {
                //if((request.getParameter(“cbousername")!=null)&&(request.getParameter(“cbousername").trim().equalsIgnoreCase(u1.getUserID().trim()))){
                %><tr>
                    <td><%=u1.getBatchCode()%> </td>
                    <td><%=u1.getJobrole()%></td>
                    <td><%=u1.getSsc()%></td>
                    <td><%=u1.getTrainer_name()%></td>
                    <td><%=u1.getTrainer_contact()%></td>
                     <td><%=u1.getCompleted_hours()%></td>
                     <td><%=u1.getBatchSize_ondate()%></td>
                     <td><%=u1.getBatchSize_start()%></td>
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