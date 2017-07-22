<%-- 
    Document   : addBatchCode
    Created on : 25 Apr, 2017, 12:43:53 AM
    Author     : data1
--%>

<%@page import="org.codehaus.jackson.map.ObjectMapper"%>
<%@page import="com.tarkesh.entity.TrainingCenter"%>
<%@page import="java.util.List"%>
<%@page import="com.tarkesh.entity.BatchCodes"%>
<%@page import="com.tarkesh.operation.Operations"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv=”Content-Type” content=”text/html; charset=ISO-8859-1″>
        <title>Add Batch</title>
        <script>
            function comfirmPassword() {
                var x = document.getElementById("password");
                var y = document.getElementById("cpassword");
                if (x == y) {
                    return true;
                } else {
                    return false;
                }
            }
            function validateForm() {
                var msg = "";
                var name = document.forms["registerForm"]["name"].value;
                var username = document.forms["registerForm"]["username"].value;
                var qualification = document.forms["registerForm"]["qualification"].value;
                var jobrole = document.forms["registerForm"]["jobrile"].value;
                var experience = document.forms["registerForm"]["experience"].value;
                var mobile = document.forms["registerForm"]["mobile"].value;
                var skype = document.forms["registerForm"]["skype"].value;
                var emailid = document.forms["registerForm"]["emailid"].value;
                if (emailid === "") {
                    msg += "No Email given";
                    return false;
                }
                if (experience === "") {
                    msg += "No Experience given";
                    return false;
                }
                if (mobile === "") {
                    msg += "No Mobile/Contact Number given";
                    return false;
                }
                if (skype === "") {
                    msg += "No Skype ID given";
                    return false;
                }
                if (qualification === "") {
                    msg += "No Qualification given";
                    return false;
                }
                if (jobrole === "") {
                    msg += "No Job Role given";
                    return false;
                }
                if (name === "") {
                    msg += "No Blank Name allowed";
                    return false;
                }
                if (username === "") {
                    msg += "No Blank UserName allowed";
                    return false;
                }
                if (comfirmPassword()) {
                    msg += "No matching Password";
                    return false;
                }
                if (m !== "") {
                    alert(msg)
                    return true;
                }

            }

            function Get(yourUrl) {
                var Httpreq = new XMLHttpRequest(); // a new request
                Httpreq.open("GET", yourUrl, false);
                Httpreq.send(null);
                return Httpreq.responseText;
            }
            function getJSON(url) {
                alert("Going to connect");
                var json_obj = JSON.parse(Get(url));
                alert("i received JSON" + json_obj);
//console.log("this is the author name: "+json_obj.author_name);
            }
            function jsFunction(value)
            {alert("Welcome");
                var dist = document.getElementById("district1");
                var xmlhttp;
                //var keys = document.dummy.sele.value
                var urls = "http://192.168.1.24:8282/nsdc/GetDistrictByState?state=" + value;
                if (window.XMLHttpRequest)
                {// code for IE7+, Firefox, Chrome, Opera, Safari

                    xmlhttp = new XMLHttpRequest();
                } else
                {// code for IE6, IE5
                    alert("HTTP Request is false " + value);
                    xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
                }
                xmlhttp.onreadystatechange = function ()
                {
                    if (xmlhttp.readyState === 4 && this.status === 200)
                    {
                        // myFunction(this);
                        var some = xmlhttp.responseXML.documentElement;
                        if (some === null) {
                            alert("Result Null");
                        } else {
                            alert("Not Null");
                        }
                        document.getElementById("a").innerHTML = some.getElementsByTagName("districts")[0].childNodes[0].nodeValue;
//                        //document.getElementById("b").innerHTML = some.getElementsByTagName("empname")[0].childNodes[0].nodeValue;
                        // document.getElementById("c").innerHTML = some.getElementsByTagName("empaddr")[0].childNodes[0].nodeValue;
                    }
                }
                xmlhttp.open("GET", urls, true);
                alert("Request Done " + urls)
                xmlhttp.send();
//                document.getElementById("demo").innerHTML = document.getElementById("district").value;
//                document.getElementById("demo").innerHTML += document.getElementById("district").length;
//                List < Districts > list = Operations.getDistrict(value);
//                        list.get

            }
            myFunction(xmldata){
                var x, i, txt, xmldoc;
                xmldoc = xmldata.responseXML;
                txt = "";
                x = xmldoc.getElementByTagName("districts");
                document.write(x);
                for (i = 0; i < x.length; i++) {
                    txt += x[i].childNodes[0].nodeValue + "<br>";
                }
                document.write(txt)
            }
            function removeOption() {
                var x = document.getElementById("mySelect");
                x.remove(x.selectedIndex);
            }
        </script>
        <script>
            function downloadJSON1(value) {               
                var xmlhttp = new XMLHttpRequest();
                var url = "http://localhost:8282/nsdc/GetDistrictByState?state=" + value;
                xmlhttp.onreadystatechange = function () {
                    if (this.readyState === 4 && this.status === 200) {
                        var myArr = JSON.parse(this.responseText);
                        displayData1(myArr);
                    }
                };
                xmlhttp.open("GET", url, true);
                xmlhttp.send();
            }
            function displayData1(arr) {
                var select = document.getElementById("district1");
                var y = select.length;
                var limit = y * 2;
              for (var x = 0; x < limit; x++) {
                    select.remove(x);
                  }
                var out = "";
                var i;
                for (i = 0; i < arr.length; i++) {
                    var option = document.createElement('option');
                    option.text = option.value = arr[i].district;
                    select.add(option, 0);
                }
            }
            function downloadJSON(value) {
                var xmlhttp = new XMLHttpRequest();
                var url = "http://localhost:8282/nsdc/ServeJobRole?qp_code=" + value;
                xmlhttp.onreadystatechange = function () {
                    if (this.readyState === 4 && this.status === 200) {
                        var myArr = JSON.parse(this.responseText);
                        document.getElementById("ssc1").value = myArr.ssc;
                        document.getElementById("jobrole").value = myArr.name;
                        //displayData(myArr);
                    }
                };
                xmlhttp.open("GET", url, true);
                xmlhttp.send();
            }

            function addJobrole() {
                var listToPrepare = document.getElementById("afjobrole");
                var listToGet = document.getElementById("jobrole").value;
                var option = document.createElement('option');
                option.text = option.value = listToGet;
                listToPrepare.add(option, 0);
            }
            function removeJobrole() {
                var toBeRemove = document.getElementById("afjobrole");
                var index = toBeRemove.selectedIndex;
                toBeRemove.removeChild(toBeRemove[index]);
            }
                    </script>
        <script>
            function copywhatsapp() {
                var mobile = document.getElementById("mobile").value;
                document.getElementById("txtwhatsapp").value = mobile;
            }
            function hideWhatsApp() {
               
                if (document.getElementById("whatsapp").checked) {
                     //alert("What app checked");
                     document.getElementById("txtwhatsapp").style.visibility = 'visible';
                } else {//alert("What app not checked");
                 
                     document.getElementById("txtwhatsapp").style.visibility = 'hidden';
                   
                }    
            }
            function enableWhatsApp() {

                if (document.getElementById("whatsapp").checked)
                    document.getElementById("txtwhatsapp").disabled = false;
                else
                    document.getElementById("txtwhatsapp").disabled = true;
//                
//                document.getElementById("field07").setAttribute("disabled", false);
//                if (document.getElementById("whatsapp").checked === true) {
//                    document.getElementById("txtwhatsapp").disabled = false;
//                } else {
//                    document.getElementById("txtwhatsapp").disabled = true;
//                }

            }
            function downloadJSON2(value) {
                var xmlhttp = new XMLHttpRequest();
                var url = "http://localhost:8282/nsdc/ServeJobRoleByQPCode?qp_code=" + value;
                var displayqp1 = document.getElementById("sssc");
                var displayJobRole = document.getElementById("afjobrole");
                xmlhttp.onreadystatechange = function () {
                    if (this.readyState == 4 && this.status == 200) {
                        var myArr = JSON.parse(this.responseText);
                        displayJobRole.value = myArr.name;
                        displayqp1.value = myArr.ssc; 
                        
                    }
                };
                xmlhttp.open("GET", url, true);
                xmlhttp.send();
            }
            
        </script>
    </head>
    <body><center>
        <form name=frm method="post" action="AddBatch">
            <table border=”1″>
                 <%List<TrainingCenter> loginCheckAdmin = (List<TrainingCenter>) session.getAttribute("informationTC");
            TrainingCenter data = loginCheckAdmin.get(0);
            session.getAttribute("usertype");
        %>

       
                <font size=”3″>Add Batch</font>
                    <tr><td>Training Center ID(Smart)</td>
                    <td><INPUT type=”text” name="smarttcid" value="" size=”24″></td>
                </tr>
                <tr><td>Training Center Name</td>
                    <td><INPUT type=”text” name="tariningcentername" value="" size=”24″></td>
                </tr>
                <tr>
                        <td>Job Role Qualification(TOT)</td>
                        <td>
                            <select name="qpcode" onchange="downloadJSON2(this.value);" id="ssc">
                                <%
                                    String sscList = data.getQpcode();
                                    String[] s = new ObjectMapper().readValue(sscList, String[].class);
                                    for (String sss : s) {
                                %><option value="<%=sss%>"><%=sss%></option>
                                <%
                                    }
                                %>   
                            </select><br>


                    </tr>
                    <tr>
                        <td><label class="label-control-a">SSC Code</label></td>
                        <td><input type="text" name="ssc" class="form-control" placeholder="Qualification" id="sssc" readonly=""></td>
                    </tr>
                    <tr>
                        <td><label class="label-control-a">Affiliated Job Role</label></td>
                        <td><input type="text" name="afjobrole" class="form-control" placeholder="Qualification" id="afjobrole" readonly=""></td>
                    </tr>
                <tr><td>Trainer</td>
                    <td><INPUT type=”text” name="trainer" value="" size=”24″></td>
                </tr>
                <tr><td>Trainer Contact (If any other)</td>
                    <td><INPUT type="text" name="trainercontact" value="" size=”24″></td>
                </tr>
                <tr><td>Number of Students(Initialy)</td>
                    <td><INPUT type="number" name="initstudents" value="" size=”24″></td>
                </tr>
                <tr><td>Students on Date</td>
                    <td><INPUT type="number" name="ondatestudents" value="" size=”24″></td>
                </tr>
                <tr><td>Completed Hours</td>
                    <td><INPUT type="number" name="completedhour" value="" size=”24″></td>
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