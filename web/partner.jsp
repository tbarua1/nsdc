<%@page import="java.util.List"%>
<%@page import="com.tarkesh.entity.TrainingPartner"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            Object value = request.getAttribute("workList");
            if (value == null) {
                response.sendRedirect("error.html");
            }
            List<TrainingPartner> loginCheckAdmin = (List<TrainingPartner>) session.getAttribute("informationPartner");
            TrainingPartner data = loginCheckAdmin.get(0);
            session.getAttribute("usertype");
        %>

        <title>Training Partner <%=session.getAttribute("username")%></title>
        <meta name="keywords" content="lict,monitor, reatime monitoring, RTM, rtm">
        <meta name="description" content="RealTime Monitoring App Developed by Tarkeshwar Barua">
        <style>
            html, body {
                height: 100%;
                margin: 0;
            }
            div {
                height: 100%;
                background-color: bisque;
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

    </head>
    <body>
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
        <div id="header">WelCome TP <%=session.getAttribute("username")%></div>
        <div id="left">
            <a href="addBatchCode.jsp" target="iframe_a">Add Batch</a><br>
            <a href="addTrainingCenter.jsp" target="iframe_a">Add Training Center</a><br>   
            <a href="addBatchSchedule.jsp" target="iframe_a">Add Schedule</a><br>   
             
        </div>
        <div id="center">
            <iframe height="100%" width="100%" src="addBatchCode.jsp" name="iframe_a"></iframe>
        </div>
        <div id="right">Right Side</div>
        <div id="footer">Footer</div>

        <!--        <iframe height="300px" width="100%" src="newjsp.jsp" name="iframe_a"></iframe>
        
                <p><a href="https://www.w3schools.com" target="iframe_a">W3Schools.com</a></p>
        
                <p>When the target of a link matches the name of an iframe, the link will open in the iframe.</p>-->

    </body>
</html>
