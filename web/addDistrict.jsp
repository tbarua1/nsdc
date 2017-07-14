<%-- 
    Document   : addDistrict
    Created on : 12 Jul, 2017, 7:24:17 PM
    Author     : Abhishek.Sehgal
--%>

<%@page import="com.tarkesh.entity.Districts"%>
<%@page import="com.tarkesh.operation.Operations"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add District</title>
    </head>
    <body>
        <script>
            var x = document.getElementById("lat");
            var y = document.getElementById("lon");
            function getLocation() {
                if (navigator.geolocation) {
                    navigator.geolocation.getCurrentPosition(showPosition, showError);
                } else {
                    x.value = "Geolocation is not supported by this browser.";
                    y.value = "Geolocation is not supported by this browser.";
                }
            }

            function showPosition(position) {
                x.value = "Latitude: " + position.coords.latitude;
                y.value = "Longitude: " + position.coords.longitude;
            }

            function showError(error) {
                switch (error.code) {
                    case error.PERMISSION_DENIED:
                        x.value = "User denied the request for Geolocation."
                        y.value = "User denied the request for Geolocation."
                        break;
                    case error.POSITION_UNAVAILABLE:
                        x.value = "Location information is unavailable."
                        y.value = "Location information is unavailable."
                        break;
                    case error.TIMEOUT:
                        x.value = "The request to get user location timed out."
                        y.value = "The request to get user location timed out."
                        break;
                    case error.UNKNOWN_ERROR:
                        x.value = "An unknown error occurred."
                        y.value = "An unknown error occurred."
                        break;
                }
            }

        </script>
    <center>
        <h1>Add District</h1>
    </center>
    <form name="registerForm" role="form" action="AddDistricts" method="post" onsubmit="return validateForm()">
        <center>
            <table>
                <tr>
                    <td>State</td>
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
                <tr>
                    <td>District Name</td>
                    <td><input type="text" name="dname" placeholder="ex- Agra"></td>
                </tr>
                <tr>
                    <td>District Code</td>
                    <td><input type="text" name="dcode" placeholder="ex- AG"></td>
                </tr>
                <tr>
                    <td>Pin/Zip code</td>
                    <td><input type="text" name="pin" placeholder="PIN/ZIP code 205135"></td>
                </tr>
                <tr>
                    <td>Latitude</td>
                    <td><input type="text" name="lat" placeholder="Latitute"></td>
                    <td><p id="lat"></p></td>
                </tr>
                <tr>
                    <td>Longitude</td>
                    <td><input type="text" name="lon" placeholder="Longitute"></td>
                    <td><p id="lon"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Add district"></td>
                </tr>
            </table>
        </center>
    </form>

    <center>
        <table>
            <% List<Districts> list1 = Operations.getDistrictAll();
                for (Districts u1 : list1) {
    //if((request.getParameter(“cbousername")!=null)&&(request.getParameter(“cbousername").trim().equalsIgnoreCase(u1.getUserID().trim()))){
            %><tr>
                <td><%=u1.getScode()%></td>
                <td><%=u1.getPincode()%></td>
                <td><%=u1.getLat()%></td>
                <td><%=u1.getLon()%></td>
                <td><%=u1.getDcode()%></td>
                <td><%=u1.getDistrict()%></td>

            </tr>
            <%}
            %>
        </table>
    </center>
</body>
</html>
