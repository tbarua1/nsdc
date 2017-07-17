<%-- 
    Document   : admin
    Created on : 15 Jul, 2017, 12:21:00 PM
    Author     : Abhishek.Sehgal
--%>

<%@page import="com.tarkesh.entity.RegisterAdmin"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            Object value = request.getAttribute("workList");
            if (value == null) {
                response.sendRedirect("error.html");
            }
           List<RegisterAdmin> loginCheckAdmin=(List<RegisterAdmin>)session.getAttribute("informationAdmin");           
            RegisterAdmin data=loginCheckAdmin.get(0);
            
           session.getAttribute("usertype");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Welcome <%=session.getAttribute("username")%></h3>
        <script>
            var x = document.getElementById("demo");

            function getLocation() {
                if (navigator.geolocation) {
                    navigator.geolocation.getCurrentPosition(showPosition, showError);
                } else {
                    x.innerHTML = "Geolocation is not supported by this browser.";
                }
            }

            function showPosition(position) {
                x.innerHTML = "Latitude: " + position.coords.latitude +
                        "<br>Longitude: " + position.coords.longitude;
            }

            function showError(error) {
                switch (error.code) {
                    case error.PERMISSION_DENIED:
                        x.innerHTML = "User denied the request for Geolocation."
                        break;
                    case error.POSITION_UNAVAILABLE:
                        x.innerHTML = "Location information is unavailable."
                        break;
                    case error.TIMEOUT:
                        x.innerHTML = "The request to get user location timed out."
                        break;
                    case error.UNKNOWN_ERROR:
                        x.innerHTML = "An unknown error occurred."
                        break;
                }
            }
        </script>
        <style>
            html, body {
                height: 100%;
                margin: 0;
            }
            div {
                height: 100%;
                background-color: aliceblue;
                float: left;
            }
            #left {
                width:150px;
                /* margin: 5px;*/
                height: calc(100% - 200px);
            }
            #center {
                /*margin: 5px ;*/
                width: calc(100% - 330px);
                height: calc(100% - 200px);
            }
            #right {
                /*margin: 5px;*/
                width: 180px;
                height: calc(100% - 200px);
                /*width: calc(100% - 330px);*/
            }#header {
                width:100%;
                height: 100px;
                /*margin: 5px;*/
            }
            #footer {
                width:100%;
                height: 100px;
                /*margin: 5px;*/
            }
        </style>      
        <div id="left">
            <a href="addBatchCode.jsp" target="iframe_a">Create TP</a><br>
            <a href="addTrainingCenter.jsp" target="iframe_a">Create TC</a><br>
            <a href="addAdmin.jsp" target="iframe_a">Create Administrator </a><br>            
            <a href="addTrainer.jsp" target="iframe_a">Create Trainer</a><br>
            <a href="addBatchCode.jsp" target="iframe_a">Create Batch</a> <br> 
            <a href="addBatchSchedule.jsp" target="iframe_a">Schedule Batch</a><br>  
            <a href="addDistrict.jsp" target="iframe_a">Add District</a>  <br>
            <a href="addJobRole.jsp" target="iframe_a">Add Job Role</a>  </br>
            <a href="register.jsp" target="iframe_a">Common Register</a>  <br>
            <!--            <a href="admin.html" target="iframe_a">Admin App Download</a><br>   
                         <a href="DAR.jsp" target="iframe_a">Daily Activity Report</a><br>  
                         <a href="TodayReport" target="iframe_a">Today Report</a><br>  -->
        </div>
        <div id="center">
            <iframe height="100%" width="100%" src="addBatchCode.jsp" name="iframe_a"></iframe>
        </div>
        <div id="right">Right Side</div>
        <div id="footer">Footer</div>
    </body>
</html>
