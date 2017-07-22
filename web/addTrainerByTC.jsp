<%-- 
    Document   : register
    Created on : 7 Jul, 2017, 10:38:07 PM
    Author     : Abhishek.Sehgal
--%>

<%@page import="org.codehaus.jackson.map.ObjectMapper"%>
<%@page import="com.tarkesh.entity.TrainingCenter"%>
<%@page import="com.tarkesh.entity.JobRole"%>
<%@page import="java.util.List"%>
<%@page import="com.tarkesh.operation.Operations"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Register User</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
            {
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
                // alert(y + " " + limit);
                for (var x = 0; x < limit; x++) {
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
            function selectAllFields() {
                var select = document.getElementById('afjobrole');
                for (var i = 0; i < select.options.length; i++)
                {
                    select.options[i].selected = true;
                }
            }

        </script>
    </head>
    <body>
        <div>Register Trainer</div>
        <%List<TrainingCenter> loginCheckAdmin = (List<TrainingCenter>) session.getAttribute("informationTC");
            TrainingCenter data = loginCheckAdmin.get(0);
            session.getAttribute("usertype");
        %>

        <form name="registerForm" role="form" action="AddTrainer" method="post" onsubmit="return validateForm()">
            <center><table>
                    <tr>
                        <td><label class="label-control-a">Name:</label></td>
                        <td> <input type="text" class="form-control"  placeholder="Name of Candidate" id="name"  name="name" >
                        </td>
                    </tr>
                    <tr>
                        <td><label class="label-control-a">User Name:</label></td>
                        <td> <input type="text" class="form-control"  placeholder="User Name" id="txtUname"  name="username" >
                        </td>
                    </tr>
                    <tr>
                        <td><label class="label-control-a">Password:</label></td>
                        <td><input type="password" name="password" class="form-control" placeholder="Password" id="txtPassword" require></td>
                    </tr>
                    <tr>
                        <td><label class="label-control-a">Confirm Password:</label></td>
                        <td><input type="password" name="cpassword" class="form-control" placeholder="Confirm Password" id="ctxtPassword" require></td>
                    </tr>
                    <tr>
                        <td><label class="label-control-a">Qualification</label></td>
                        <td><input type="text" name="qualification" class="form-control" placeholder="Qualification" id="qualification" require></td>
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
                    <!--                    <tr>
                                            <td><label class="label-control-a">QP Code</label></td>
                                            <td>
                                                <select name="qp_code" id="ssc" onchange="downloadJSON(this.value);">
                    <%
                        List<JobRole> jobroles = Operations.getJobRole();
                        for (JobRole j : jobroles) {
                    %>

                    <option value="<%=j.getQp_code()%>"><%=j.getQp_code()%></option>

                    <%
                        }
                    %>                                
                </select>
                <button name="addjobrole">Add Job Role</button> <button name="removejobrole">Remove Job Role</button></td>
        </tr>
        <tr>
            <td><label class="label-control-a">SSC</label></td>
            <td><input type="text" name="SSC" class="form-control" placeholder="SSC" id="ssc1" readonly=""></td>
        </tr>
        <tr>
            <td><label class="label-control-a">Job Role</label></td>
            <td><input type="text" name="jobrole" class="form-control" placeholder="Job Role" id="jobrole" readonly=""></td>
        </tr>-->
                    <tr>
                        <td><label class="label-control-a">Experience</label></td>
                        <td><input type="number" name="experience" class="form-control" placeholder="Experience" id="experience" require></td>
                    </tr><tr>
                        <td><label class="label-control-a">Mobile Number</label></td>
                        <td><input onchange="copywhatsapp();" type="text" name="mobile" class="form-control" placeholder="Mobile Number" id="mobile" require></td>

                    </tr>
                    <tr>
                        <td>Another Number on WhatsApp<input onclick="hideWhatsApp();" type="checkbox" name="another" class="form-control" placeholder="WhatsApp" id="whatsapp"></td>
                        <td>
                            <!--<input type="text" name="txtwhatsapp" class="form-control" placeholder="WhatsApp Number" id="txtwhatsapp" disabled="disabled">--> 
                            <input type="text" name="txtwhatsapp" class="form-control" placeholder="WhatsApp Number" id="txtwhatsapp" style="visibility: hidden">
                        </td>
                    </tr>

                    <tr>
                        <td><label class="label-control-a">Skype ID</label></td>
                        <td><input type="text" name="skype" class="form-control" placeholder="Skype ID" id="skype" require></td>
                    </tr><tr>
                        <td><label class="label-control-a">Email ID</label></td>
                        <td><input type="text" name="emailid" class="form-control" placeholder="Email ID" id="emailid" require></td>
                    </tr>
                    <!--                    <tr>
                                            <td><label class="label-control-a">Photograph</label></td>
                                            <td><input type="file" name="photo" class="form-control" placeholder="Photo" id="photo" require></td>
                                        </tr>-->
                    <tr>
                        <td><input type="reset" name="" id="btnlogin" class="btn-3" value="reset" style="float: right;"></td>
                        <td><input type="submit" name="" id="btnlogin" class="btn-3" value="Login" style="float: right;" onclick="selectAllFields();">
                        </td>
                    </tr>
                </table>
            </center>
        </form>
    </body>
</html>
