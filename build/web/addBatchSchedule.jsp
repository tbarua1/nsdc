<%-- 
    Document   : addBatchSchedule
    Created on : 26 Apr, 2017, 8:08:18 PM
    Author     : data1
--%>

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
    <body><center>
        <form name=frm method="post" action="AddScheduleWeb">
            <table border=”1″>
                <font size=”3″>Add Batch Schedule</font>
                <tr><td>University</td>
                    <td>
                        <select name="university">
                            <%
                                List<TrainingCenter> list2 = Operations.getTrainingCenterAll();
                                for (TrainingCenter university : list2) {
                            %>
                            <option value="<%=university.getName()%>"><%=university.getName()%></option>
                            <%
                                }
                            %>

                        </select></td></tr>
                <tr><td>Trainer</td>
                    <td><select name="trainer">
                            <%
                                List<Trainer> trainerList = Operations.getBatchTrainer();
                                for (Trainer university : trainerList) {
                            %>
                            <option value="<%=university.getName()%>"><%=university.getName()%></option>
                            <%
                                }
                            %>                            
                        </select></td>
                </tr>
                <tr><td>Batch Code</td>
                    <td><select name="batchcode">
                            <%
                                List<BatchCodes> batchCodeList = Operations.getBatchCode();
                                for (BatchCodes university : batchCodeList) {
                            %>
                            <option value="<%=university.getBatchCode()%>"><%=university.getBatchCode()%></option>
                            <%
                                }
                            %>

                        </select></td>
                </tr>
                <tr>
                    <td>Schedule Date</td>
                    <td><select name="day">
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
                        </select> End: <select name="endhour">
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
                        <table><tr><td>Day1 &nbsp;<input type="checkbox" name="day1" value="0"></td> 
                                <td>Day2 &nbsp;<input type="checkbox" name="day2" value="1"></td> 
                                <td>Day3 &nbsp;<input type="checkbox" name="day3" value="2"> </td>
                                <td>Day4 &nbsp;<input type="checkbox" name="day4" value="3"> </td>
                            </tr><tr> <td>Day5 &nbsp;<input type="checkbox" name="day5" value="4"></td> 
                                <td>Day6 &nbsp;<input type="checkbox" name="day6" value="5"> </td>
                                <td>Day7 &nbsp;<input type="checkbox" name="day7" value="6"> </td>
                                <td>Day8 &nbsp;<input type="checkbox" name="day8" value="7"> </td>
                            </tr><tr><td>Day9 &nbsp;<input type="checkbox" name="day9" value="8"> </td>
                                <td>Day10<input type="checkbox" name="day10" value="9"> </td>
                                <td>Day11<input type="checkbox" name="day11" value="10"> </td>
                                <td>Day12<input type="checkbox" name="day12" value="11"></td> 
                            </tr><tr> <td>Day13<input type="checkbox" name="day13" value="12"></td> 
                                <td>Day14<input type="checkbox" name="day14" value="13"></td> 
                                <td>Day15<input type="checkbox" name="day15" value="14"></td> 
                                <td> Day16<input type="checkbox" name="day16" value="15"></td>
                                </td></tr></table>
                </tr>
                <tr><td></td><TD> <input type="submit" value="Add"> 
                        <!--<BUTTON type=button value=save name=cmdsave onclick=”save()” >Add</BUTTON>-->
                        <input type="reset" value="Cancel"></form>
                        <form action="editBatchCode.jsp"><input type="submit" value="Edit"></form>
                    </TD>
                </tr>
            </table>
            <table border="1">
                <% List<BatchSchedule> batchScheduleList = Operations.getBatchSchedule();
                    for (BatchSchedule u1 : batchScheduleList) {
                        //if((request.getParameter(“cbousername")!=null)&&(request.getParameter(“cbousername").trim().equalsIgnoreCase(u1.getUserID().trim()))){
%><tr> <td><%=u1.getStatus()%></td>
                    <td><%=u1.getBatchcode()%> </td>                

                    <td><%=u1.getTrainer()%></td>

                    <td><%=u1.getDate().get(Calendar.DATE) + "-" + (u1.getDate().get(Calendar.MONTH) + 1) + "-" + u1.getDate().get(Calendar.YEAR) + " " + u1.getDate().get(Calendar.HOUR_OF_DAY) + ":" + u1.getDate().get(Calendar.MINUTE)%></td>
                    <td><%=u1.getTill().get(Calendar.DATE) + "-" + (u1.getTill().get(Calendar.MONTH) + 1) + "-" + u1.getTill().get(Calendar.YEAR) + " " + u1.getTill().get(Calendar.HOUR_OF_DAY) + ":" + u1.getTill().get(Calendar.MINUTE)%></td>
                    <td><%=u1.getUniversity()%></td><!--<td><%=u1.getTill()%></td>-->

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