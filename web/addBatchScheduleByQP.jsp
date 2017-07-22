<%-- 
    Document   : addBatchSchedule
    Created on : 26 Apr, 2017, 8:08:18 PM
    Author     : data1
--%>

<%@page import="org.codehaus.jackson.map.ObjectMapper"%>
<%@page import="com.tarkesh.entity.TrainingCenter"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.tarkesh.entity.BatchSchedule"%>
<%@page import="com.tarkesh.entity.Trainer"%>
<%@page import="com.tarkesh.entity.BatchCodes"%>
<%@page import="com.tarkesh.operation.Operations"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv=”Content-Type” content=”text/html; charset=ISO-8859-1″>
        <title>Add Batch Schedule</title>
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
            document.frm.action = "AddBatchCodeWeb";
            document.frm.submit();
            }
            }
        </script>        
    </head>
    <script>
        function setLatLon(trainingcenter){
        alert("i clicked with parameter");
        }
        function setLatLon(){
        var tc = document.getElementById("university").value;
        var url = "http://localhost:8282/nsdc/ServeBatchForSchedulingWeb?trainingcenter=" + tc;
        var xmlhttp = new XMLHttpRequest();
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
        var select = document.getElementById("batches");
        var y = select.length;
        var limit = y * 2;
        for (var x = 0; x < limit; x++) {
        select.remove(x);
        }
        var out = "";
        var i;
        for (i = 0; i < arr.length; i++) {
        var option = document.createElement('option');
        option.text = option.value = arr[i].batchCode;
        select.add(option, 0);
        }
        }
        function downloadJSON2() {
        var xmlhttp = new XMLHttpRequest();
        var trainercombo = document.getElementById("trainer1");
        var url = "http://localhost:8282/nsdc/getTrainerByDistrict?district=" + document.getElementById("district").value;
        xmlhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
        var myArr = JSON.parse(this.responseText);
        /*for (i = 0; i < arr.length; i++) {
         var option = document.createElement('option');
         option.text = option.value = arr[i].district;
         select.add(option, 0);
         }*/
        for (var i = 0; i < myArr.length; i++){
        var option = document.createElement('option');
        option.text = option.value = myArr[i].name;
        trainercombo.add(option, 0);
        }
        }
        };
        xmlhttp.open("GET", url, true);
        xmlhttp.send();
        }
        function printDays(value){
        document.getElementById("dday1").innerHTML = "Day "+parseInt(value);
        document.getElementById("dday2").innerHTML = "Day "+(parseInt(value)+1);
        document.getElementById("dday3").innerHTML = "Day "+(parseInt(value)+2);
        document.getElementById("dday4").innerHTML = "Day "+(parseInt(value)+3);
        document.getElementById("dday5").innerHTML = "Day "+(parseInt(value)+4);
        document.getElementById("dday6").innerHTML = "Day "+(parseInt(value)+5);
        document.getElementById("dday7").innerHTML = "Day "+(parseInt(value)+6);
        document.getElementById("dday8").innerHTML = "Day "+(parseInt(value)+7);
        document.getElementById("dday9").innerHTML = "Day "+(parseInt(value)+8);
        document.getElementById("dday10").innerHTML = "Day "+(parseInt(value)+9);
        document.getElementById("dday11").innerHTML = "Day "+(parseInt(value)+10);
        document.getElementById("dday12").innerHTML = "Day "+(parseInt(value)+11);
        document.getElementById("dday13").innerHTML = "Day "+(parseInt(value)+12);
        document.getElementById("dday14").innerHTML = "Day "+(parseInt(value)+13);
        document.getElementById("dday15").innerHTML = "Day "+(parseInt(value)+14);
        document.getElementById("dday16").innerHTML = "Day "+(parseInt(value)+15);    
    }
    </script>
    <body onload="downloadJSON2();"><center>
        <form name=frm method="post" action="AddScheduleWeb">
            <table border=”1″>
                <%List<TrainingCenter> loginCheckAdmin = (List<TrainingCenter>) session.getAttribute("informationTC");
                   TrainingCenter data= loginCheckAdmin.get(0);
                    session.getAttribute("usertype");
                %>
                <input type="text" name="district" id="district" value="<%=data.getDistrict()%>">
                <font size=”3″>Add Batch Schedule</font>
                <tr>
                    <td>Trainer</td>
                    <td>
                        <select name="trainer1" id="trainer1">                                                        
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Job Role Qualification(TOT)</td>
                    <td>
                        <select name="qpcode" onchange="downloadJSON2(this.value);" id="ssc">
                            <%
                                String sscList = data.getQpcode();
                                String[] s = new ObjectMapper().readValue(sscList,String[].class);
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
                <tr>
                    <td>Schedule Date</td>
                    <td><select name="day" onchange="printDays(this.value)">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                            <option>6</option>
                            <option>7</option>
                            <option>8</option>
                            <option>9</option>
                            <option>10</option>
                            <option>11</option>
                            <option>12</option>
                            <option>13</option>
                            <option>14</option>
                            <option>15</option>
                            <option>16</option>
                            <option>17</option>
                            <option>18</option>
                            <option>19</option>
                            <option>20</option>
                            <option>21</option>
                            <option>22</option>
                            <option>23</option>
                            <option>24</option>
                            <option>25</option>
                            <option>26</option>
                            <option>27</option>
                            <option>28</option>
                            <option>29</option>
                            <option>30</option>
                            <option>31</option>
                        </select>
                        <select name="month">
                            <option value="0">January</option>
                            <option value="1">February</option>
                            <option value="2">March</option>
                            <option value="3">April</option>
                            <option value="4">May</option>
                            <option value="5">June</option>
                            <option value="6">July</option>
                            <option value="7">August</option>
                            <option value="8">September</option>
                            <option value="9">October</option>
                            <option value="10">November</option>
                            <option value="11">December</option>
                        </select>
                        <select name="year">
                            <option>2017</option>
                            <option>2018</option>                            
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>Schedule Time</td>
                    <td>Start:<select name="starthour">
                            <option>8</option>
                            <option>9</option>
                            <option>10</option>
                            <option>11</option>
                            <option>12</option>
                            <option>13</option>
                            <option>14</option>
                            <option>15</option>
                            <option>16</option>
                            <option>17</option>
                            <option>18</option>
                            <option>19</option>
                            <option>20</option>
                            <option>21</option>
                            <option>22</option>
                        </select>
                        <select name="startminute">
                            <option>0</option>                            
                            <option>5</option>
                            <option>10</option>
                            <option>15</option>
                            <option>20</option>
                            <option>25</option>
                            <option>30</option>
                            <option>35</option>
                            <option>40</option>
                            <option>45</option>
                            <option>50</option>
                            <option>55</option>
                        </select> 
                        End: <select name="endhour">
                            <option>8</option>
                            <option>9</option>
                            <option>10</option>
                            <option>11</option>
                            <option>12</option>
                            <option>13</option>
                            <option>14</option>
                            <option>15</option>
                            <option>16</option>
                            <option>17</option>
                            <option>18</option>
                            <option>19</option>
                            <option>20</option>
                            <option>21</option>
                            <option>22</option>
                        </select>
                        <select name="endminute">
                            <option>0</option>                            
                            <option>5</option>
                            <option>10</option>
                            <option>15</option>
                            <option>20</option>
                            <option>25</option>
                            <option>30</option>
                            <option>35</option>
                            <option>40</option>
                            <option>45</option>
                            <option>50</option>
                            <option>55</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        Days
                    </td>
                    <td>
                        <table>
                            <tr>
                                <td><p id="dday1">Day 1</p><input type="checkbox" name="day1" value="0"></td> 
                                <td><p id="dday2">Day 2</p><input type="checkbox" name="day2" value="1"></td> 
                                <td><p id="dday3">Day 3</p><input type="checkbox" name="day3" value="2"> </td>
                                <td><p id="dday4">Day 4</p><input type="checkbox" name="day4" value="3"> </td>
                           
                                <td><p id="dday5">Day 5</p><input type="checkbox" name="day5" value="4"></td> 
                                <td><p id="dday6">Day 6</p><input type="checkbox" name="day6" value="5"> </td>
                                <td><p id="dday7">Day 7</p><input type="checkbox" name="day7" value="6"> </td>
                                <td><p id="dday8">Day 8</p><input type="checkbox" name="day8" value="7"> </td>
                            </tr>
                            <tr>
                                <td><p id="dday9">Day 9</p><input type="checkbox" name="day9" value="8"> </td>
                                <td><p id="dday10">Day 10</p><input type="checkbox" name="day10" value="9"> </td>
                                <td><p id="dday11">Day 11</p><input type="checkbox" name="day11" value="10"> </td>
                                <td><p id="dday12">Day 12</p><input type="checkbox" name="day12" value="11"></td> 
                           
                                <td><p id="dday13">Day 13</p><input type="checkbox" name="day13" value="12"></td> 
                                <td><p id="dday14">Day 14</p><input type="checkbox" name="day14" value="13"></td> 
                                <td><p id="dday15">Day 15</p><input type="checkbox" name="day15" value="14"></td> 
                                <td><p id="dday16">Day 16</p><input type="checkbox" name="day16" value="15"></td>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <input type="text" name="lat" id="lat" hidden="">
                <input type="text" name="lon" id="lon" hidden="">
                <tr>
                    <td>

                    </td>
                    <TD> 
                        <input type="submit" value="Add"> 
                        <!--<BUTTON type=button value=save name=cmdsave onclick=”save()” >Add</BUTTON>-->
                        <input type="reset" value="Cancel"></form>
                        <form action="editBatchCode.jsp"><input type="submit" value="Edit"></form>
                    </TD>
                </tr>
            </table>
            <table border="1">
                <% List<BatchSchedule> batchScheduleList = Operations.getBatchSchedule();
                    for (BatchSchedule u1 : batchScheduleList) {%>
                <tr> 
                    <td><%=u1.getStatus()%></td>
                    <td><%=u1.getBatchcode()%> </td>  
                    <td><%=u1.getTrainer()%></td>
                    <td><%=u1.getDate().get(Calendar.DATE) + "-" + (u1.getDate().get(Calendar.MONTH) + 1) + "-" + u1.getDate().get(Calendar.YEAR) + " " + u1.getDate().get(Calendar.HOUR_OF_DAY) + ":" + u1.getDate().get(Calendar.MINUTE)%></td>
                    <td><%=u1.getTill().get(Calendar.DATE) + "-" + (u1.getTill().get(Calendar.MONTH) + 1) + "-" + u1.getTill().get(Calendar.YEAR) + " " + u1.getTill().get(Calendar.HOUR_OF_DAY) + ":" + u1.getTill().get(Calendar.MINUTE)%></td>
                    <td><%=u1.getUniversity()%></td>                    
                </tr>
                <%}%>               
            </table>
    </center>
</body>
</html>