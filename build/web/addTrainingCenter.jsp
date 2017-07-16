<%-- 
    Document   : addUniversity
    Created on : 26 Apr, 2017, 8:09:01 PM
    Author     : data1
--%>


<%@page import="java.util.Iterator"%>
<%@page import="com.tarkesh.entity.TrainingCenter"%>
<%@page import="com.tarkesh.operation.Operations"%>
<%@page import="java.util.List"%>
<%@page import="com.tarkesh.entity.BatchCodes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv=”Content-Type” content=”text/html; charset=ISO-8859-1″>
        <title>Add Training Center</title>
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
        <script>
            function downloadJSON(value){
            var xmlhttp = new XMLHttpRequest();
            var url = "http://localhost:8282/nsdc/ServeJobRoleBySSC?ssc=" + value;
            //  var url = "http://localhost:8282/nsdc/GetDistrictByState?state="+value;
            xmlhttp.onreadystatechange = function () {
            if (this.readyState == 4 && this.status == 200) {
            var myArr = JSON.parse(this.responseText);
            displayData(myArr);
            }
            };
            xmlhttp.open("GET", url, true);
            xmlhttp.send();
            }
            function displayData(arr) {
            var select = document.getElementById("jobrole");
            var y = select.length;
            var limit = y * 2;
            //alert(y+" "+limit);
            for (var x = 0; x < limit; x++){
            //document.write(x);
            select.remove(x);
            // select.removeChild(select.[]);
            //select.removeChild(select.firstChild);
            }
            //}
            var out = "";
            var i;
            for (i = 0; i < arr.length; i++) {
            var option = document.createElement('option');
            option.text = option.value = arr[i].qp_code + "@" + arr[i].name;
            select.add(option, 0);
            }

            }
            
            function addJobrole(){               
            var listToPrepare = document.getElementById("afjobrole");
            var listToGet = document.getElementById("jobrole").value;           
            var option = document.createElement('option');
            option.text = option.value = listToGet;
            listToPrepare.add(option, 0);
            }
            function removeJobrole(){
            var toBeRemove=document.getElementById("afjobrole");
            var index=toBeRemove.selectedIndex;
             toBeRemove.removeChild(toBeRemove[index]);            
            }
        </script>
    </head>
    <body><center>
        <form name=frm method="post" action="AddTrainingCenter">
            <table border=”1″>
                <font size=”3″>Add Training Center</font> 
                <tr><td>Training Center Name</td>
                    <td><INPUT type=”text” name="trainingcenter" value=""  ></td>
                </tr>
                <tr><td>Spoc Name</td>
                    <td><INPUT type=”text” name="spoc" value=""  ></td>
                </tr>
                <tr><td>Spoc Phone</td>
                    <td><INPUT type=”text” name="spocphone" value=""  ></td>
                </tr>
                <tr><td>Affiliated Job Role</td>
                    <td>
                        <select name="ssc" onchange="downloadJSON(this.value);">
                            <option value="Agriculture">Agriculture</option>
                            <option value="Apparel, Madeups & Home Furnishing">Apparel, Madeups & Home Furnishing</option>
                            <option value="Automotive">Automotive</option>
                            <option value="Beauty and Wellness">Beauty and Wellness</option>
                            <option value="BFSI">BFSI</option>
                            <option value="Capital Goods">Capital Goods</option>
                            <option value="Construction">Construction</option>
                            <option value="Domestic Workers">Domestic Workers</option>
                            <option value="Earthmoving & Infrastructure Building">Earthmoving & Infrastructure Building</option>
                            <option value="Electronics & Hardware">Electronics & Hardware</option>
                            <option value="Food Processing">Food Processing</option>
                            <option value="Furniture & Fittings">Furniture & Fittings</option>
                            <option value="Gems and Jewellery">Gems and Jewellery</option>
                            <option value="Green Jobs">Green Jobs</option>
                            <option value="Handicrafts">Handicrafts</option>
                            <option value="Healthcare">Healthcare</option>
                            <option value="Iron and Steel">Iron and Steel</option>
                            <option value="IT/ITes">IT/ITes</option>
                            <option value="Leather">Leather</option>
                            <option value="Life Sciences">Life Sciences</option>
                            <option value="Logistics">Logistics</option>
                            <option value="Media & Entertainment">Media & Entertainment</option>
                            <option value="Mining">Mining</option>
                            <option value="Paints & Coatings">Paints & Coatings</option>
                            <option value="People with Disability">People with Disability</option>
                            <option value="Plumbing">Plumbing</option>
                            <option value="Power">Power</option>
                            <option value="Retail">Retail</option>
                            <option value="Rubber">Rubber</option>
                            <option value="Security">Security</option> 
                            <option value="Sports">Sports</option>
                            <option value="Telecom">Telecom</option>
                            <option value="Textiles & Handloom">Textiles & Handloom</option>
                            <option value="Tourism and Hospitality">Tourism and Hospitality</option>
                        </select><br>
                        <select name="JobRole" id="jobrole">

                        </select>
                        <br><button type="button" name="jobroleadd" onclick="addJobrole();">add Affiliated Job Role</button>
                        <button type="button" name="jobroleremove" onclick="removeJobrole();">Remove</button>
                        <br><select name="afjobrole" id="afjobrole" multiple=""></select>
                        <br><a href="addJobRole.jsp">Add Job Role(if not in the list)</td>
                </tr>
                <tr><td>Latitude</td>
                    <td><INPUT type=”text” name="latitute" value=""  ></td>
                </tr>
                <tr><td>Longitude</td>
                    <td><INPUT type=”text” name="longitute" value=""  ></td>
                </tr>
                <tr><td>User Name</td>
                    <td><INPUT type=”text” name="username" value=""  ></td>
                </tr>
                <tr><td>Password</td>
                    <td><INPUT type=”password” name="password" value=""  ></td>
                </tr>
                <tr><td>Confirm Password</td>
                    <td><INPUT type=”password” name="password1" value=""  ></td>
                </tr>
                <tr><td>Address</td>
                    <td>
                        <table>
                            <tr>
                                <td>Building Number</td>
                                <td><INPUT type=”text” name="building" value=""  ></td>
                            </tr>
                            <tr><td>Locality</td>
                                <td><INPUT type=”text” name="locality" value=""  ></td>
                            </tr>
                            <tr>
                                <td>City/Village</td>
                                <td><INPUT type=”text” name="city" value=""  ></td>
                            </tr>
                            <tr>
                                <td>District</td>
                                <td><INPUT type=”text” name="district" value=""  ></td>
                            </tr>
                            <tr>
                                <td>State</td>
                                <td><select class="form-control" name="state">
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
                                    </select></td>
                            </tr>
                            <tr>
                                <td>PIN/ZIP</td>
                                <td><INPUT type=”text” name="pin" value=""  ></td>
                            </tr>

                        </table></td>
                </tr>
                <tr><td></td><TD> <input type="submit" value="Add"> 
                        <!--<BUTTON type=button value=save name=cmdsave onclick=”save()” >Add</BUTTON>-->
                        <input type="reset" value="Cancel"></form>
                        <form action="editBatchCode.jsp"><input type="submit" value="Edit"></form>
                    </TD>
                </tr>
            </table>
            <table>
                <% List<TrainingCenter> universityList = Operations.getTrainingCenterAll();
                    for (TrainingCenter u1 : universityList) {
                        //if((request.getParameter(“cbousername")!=null)&&(request.getParameter(“cbousername").trim().equalsIgnoreCase(u1.getUserID().trim()))){
%><tr>
                    <td><%=u1.getState()%> </td><td><%=u1.getDistrict()%> </td><td><%=u1.getLatitude()%></td>
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