<%-- 
    Document   : addAdmin
    Created on : 16 Jul, 2017, 1:47:59 PM
    Author     : Abhishek.Sehgal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                var url = "http://localhost:8282/nsdc/ServeJobRoleBySSC?ssc=" + value;
                //  var url = "http://localhost:8282/nsdc/GetDistrictByState?state="+value;
                xmlhttp.onreadystatechange = function () {
                    if (this.readyState == 4 && this.status == 200) {
                        var myArr = JSON.parse(this.responseText);
                        displayData2(myArr);
                    }
                };
                xmlhttp.open("GET", url, true);
                xmlhttp.send();
            }
            function displayData2(arr) {
                var select = document.getElementById("jobrole");
                var y = select.length;
                var limit = y * 2;
                //alert(y+" "+limit);
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
                    option.text = option.value = arr[i].qp_code + "@" + arr[i].name;
                    select.add(option, 0);
                }

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
        </script>
    </head>
    <body>
        <h1>Administrator Register</h1>
        <form name="registerForm" role="form" action="AddAdmin" method="post" onsubmit="return validateForm()">
            <center><table>
                    <tr>
                        <td>State</td><td>
                            <!--                        <td><select class="form-control" name="state" onchange="jsFunction(this.value);">-->
                            <select name="state" onchange="downloadJSON1(this.value);">            
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
                            </select><a href="addDistrict.jsp">Add District</a></td>
                    </tr>
                    <tr>
                        <td>District</td>
                        <td><select class="form-control" name="district" id="district1">

                            </select></td>
                    </tr>
<tr>
                        <td><label class="label-control-a">Company Name:</label></td>
                        <td> <input type="text" class="form-control"  placeholder="Name of Candidate" id="name"  name="company" >
                        </td>
                    </tr>
<tr>
                        <td><label class="label-control-a">Designation:</label></td>
                        <td> <input type="text" class="form-control"  placeholder="Name of Candidate" id="name"  name="designation" >
                        </td>
                    </tr>
                    <tr>
                        <td><label class="label-control-a">First Name:</label></td>
                        <td> <input type="text" class="form-control"  placeholder="Name of Candidate" id="name"  name="fname" >
                        </td>
                    </tr>
                    <tr>
                        <td><label class="label-control-a">Last Name:</label></td>
                        <td> <input type="text" class="form-control"  placeholder="Name of Candidate" id="name"  name="lname" >
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
                        <td><input type="submit" name="" id="btnlogin" class="btn-3" value="Login" style="float: right;" onclick="formValidation();">
                        </td>
                    </tr>
                </table>
            </center>

        </form>
    </body>
</html>
