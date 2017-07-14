<html>
<head>
<title>Change password in jsp</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"></head>
<h2 align="center"><strong>Change password</strong></h2>
<body>
     <form method="post" action="index.jsp" name="productForm">
    <select name="colour" onchange="document.productForm.submit();">
        <option value="dropdown">Pls select one
        <option value="apple">Apple
        <option value="oragne">Orange
        <option value="grapes">Grapes
    </select>
    <input type="hidden" name="dropdown" id="dropdown">
    <input type="submit" value="click" name="dropdown" id="dropdown">
    <form>
    <%
        String colour = request.getParameter("colour");
        out.println(colour);
    %>
    <form name="f1" method="get" action="#">
        <select name="clr" onchange="changepassword.jsp">
           <option>Red</option>
           <option>Blue</option>   
           <option>Green</option>
           <option>Pink</option>
       </select>
     <input type="submit" name="submit" value="Select Color"/>
    </form>
    <%-- To display selected value from dropdown list. --%>
     <% 
                String s=request.getParameter("clr");
                if (s !=null)
                {
                    out.println("Selected Color is : "+s);
                }
      %>
<script language="javascript">
function fncSubmit()
{

if(document.ChangePasswordForm.OldPassword.value == "")
{
alert('Please input old password');
document.ChangePasswordForm.OldPassword.focus();
return false;
} 

if(document.ChangePasswordForm.newpassword.value == "")
{
alert('Please input Password');
document.ChangePasswordForm.newpassword.focus(); 
return false;
} 

if(document.ChangePasswordForm.conpassword.value == "")
{
alert('Please input Confirm Password');
document.ChangePasswordForm.conpassword.focus(); 
return false;
} 

if(document.ChangePasswordForm.newpassword.value != document.ChangePasswordForm.conpassword.value)
{
alert('Confirm Password Not Match');
document.ChangePasswordForm.conpassword.focus(); 
return false;
} 

document.ChangePasswordForm.submit();
}
</script>
<form name="ChangePasswordForm" method="post" action="changedone.jsp" OnSubmit="return fncSubmit();">

<table border="1" align="center" bgcolor="#2B60DE">

<tr>
<td>OLD PASSWORD</td>
<TD><input name="OldPassword" type="password" id="OLDpwd" size="20"></td>
</tr>
<tr>
<td>NewPassword</td>
<td><input name="newpassword" type="password" id="newpassword">
</td>
</tr>
<tr>
<td>Confirm Password</td>
<td><input name="conpassword" type="password" id="conpassword">
</td>
</tr>
<tr>
<td>&nbsp;</td>
<td><input type="submit" name="Submit" value="Save"></td>
</tr>

</table>
</form>
</body>
</html>