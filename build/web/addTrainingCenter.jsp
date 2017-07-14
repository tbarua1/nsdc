<%-- 
    Document   : addUniversity
    Created on : 26 Apr, 2017, 8:09:01 PM
    Author     : data1
--%>


<%@page import="com.tarkesh.operation.Operations"%>
<%@page import="java.util.List"%>
<%@page import="com.tarkesh.entity.BatchCodes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv=”Content-Type” content=”text/html; charset=ISO-8859-1″>
        <title>Add University</title>
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
        <form name=frm method="post" action="OneTimeUniversityAdd">
            <table border=”1″>
                <font size=”3″>Add University</font>
                <tr><td>Division</td>
                    <td>
                        <select class="form-control" name="state">
                            <option value="Andaman and Nicobar-AN">Andaman and Nicobar</option>
                            <option value="Andhra Pradesh-AP">Andhra Pradesh</option>
                            <option value="Arunachal Pradesh-AR">Arunachal Pradesh</option>
                            <option value="Bihar-BR">Bihar</option>
                            <option value="Chandigarh-CH">Chandigarh</option> 
                            <option value="Chhattisgarh-CG">Chhattisgarh</option> 
                            <option value="Dadra and Nagar Haveli-DN">Dadra and Nagar Haveli</option> 
                            <option value="Daman and Diu-DD">Daman and Diu</option> 
                            <option value="Delhi-DL">Delhi</option> 
                            <option value="Goa-GA">Goa</option>
                            <option value="Gujarat-GJ">Gujarat</option> 
                            <option value="Haryana-HR">Haryana</option> 
                            <option value="Himachal Pradesh-HP">Himachal Pradesh</option> 
                            <option value="Jammu and Kashmir-JK">Jammu and Kashmir</option> 
                            <option value="Jharkhand-JH">Jharkhand</option> 
                            <option value="Karnataka-KA">Karnataka</option> 
                            <option value="Kerala-KL">Kerala</option> 
                            <option value="Lakshadweep-LD">Lakshadweep</option>
                            <option value="Madhya Pradesh-MP">Madhya Pradesh</option> 
                            <option value="Maharashtra-MH">Maharashtra</option> 
                            <option value="Manipur-MN">Manipur</option> 
                            <option value="Meghalaya-ML">Meghalaya</option> 
                            <option value="Mizoram-MZ">Mizoram</option> 
                            <option value="Nagaland-NL">Nagaland</option> 
                            <option value="Odisha-OD">Odisha</option> 
                            <option value="Puducherry-PY">Puducherry</option> 
                            <option value="Punjab-PB">Punjab</option>
                            <option value="Rajathan-RJ">Rajathan</option>
                            <option value="Sikkim-SK">Sikkim</option>
                            <option value="Tamil Nadu-TN">Tamil Nadu</option>
                            <option value="Telangana-TS">Telangana</option>
                            <option value="Tripura-TR">Tripura</option>
                            <option value="Uttar Pradesh-UP">Uttar Pradesh</option>
                            <option value="Uttarakhand-UK">Uttarakhand</option>
                            <option value="West Bengal-WB">West Bengal</option>
                        </select>
                    </td>
                </tr>
                <tr><td>University Name</td>
                    <td><INPUT type=”text” name="name" value="" size=”24″></td>
                </tr>
                <tr><td>Latitude</td>
                    <td><INPUT type=”text” name="latitute" value="" size=”24″></td>
                </tr>
                <tr><td>Longitude</td>
                    <td><INPUT type=”text” name="longitute" value="" size=”24″></td>
                </tr>
                <tr><td></td><TD> <input type="submit" value="Add"> 
                        <!--<BUTTON type=button value=save name=cmdsave onclick=”save()” >Add</BUTTON>-->
                        <input type="reset" value="Cancel"></form>
                        <form action="editBatchCode.jsp"><input type="submit" value="Edit"></form>
                    </TD>
                </tr>
            </table>
            <table>
                <% List<University> universityList = Operations.getUniversity();
                    for (University u1 : universityList) {
                        //if((request.getParameter(“cbousername")!=null)&&(request.getParameter(“cbousername").trim().equalsIgnoreCase(u1.getUserID().trim()))){
%><tr>
                    <td><%=u1.getUniversity_type()%> </td><td><%=u1.getDivision()%> </td><td><%=u1.getLatitude()%></td>
                    <td><%=u1.getLongitude()%></td><td><%=u1.getName()%></td></tr>
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
    </center>
</body>
</html>