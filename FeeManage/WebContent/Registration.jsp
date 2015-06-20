<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BHABHA ENGINEERING RESEARCH INSTITUTE,BHOPAL</title>
</head>
<body style="background-image: url(images/bg.jpg); no repaet">
<center>
		<font color="black" size="10">BHABHA ENGINEERING RESEARCH INSTITUTE,BHOPAL </font>
	</center><br/>
<form action="reg.do" method="post">
<table align="center" border=2 style="background-color: darkgray;">
<tr>
<td>FirstName:</td>
<td><input type="text" name="fn" required></td>
</tr>
<tr>
<td>LastName:</td>
<td><input type="text" name="ln" required></td>
</tr>
<tr>
<td>Address:</td>
<td><textarea rows="4" cols="21" name="ad" required>
</textarea></td>
</tr>
<tr>
<td>PhoneNumber:</td>
<td><input type="text" name="pn" required></td>
</tr>
<tr>
<td>Gender:</td>
<td><input type="radio" name="sex" value="male" checked >Male<input type="radio" name="sex" value="female">Female</td>
</tr>
<tr>
<td>DOB:</td>
<td><input type="date" name="dt" required></td>
</tr>
<tr>
<td>College Fee(Yearly):</td>
<td><input type="text" name="id" required></td>
</tr>
<tr>
<td>Account Type:</td>
<td><input type="radio" name="at" value="SV" checked>Student<input type="radio" name="at" value="CA">College Administration</td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="ps" required></td>
</tr>
<tr>
<td>Confirm Password:</td>
<td><input type="password" name="cp" required></td>
</tr>
</table><br/><br/>

<center><input type="submit" value="Register">&nbsp;&nbsp;&nbsp;&nbsp;<a href="Login.jsp"><input type="button" value="Login"></a></center>
</form>
<center>
<% String ref=(String)request.getAttribute("err");
%>
<% if(ref!=null){
%>
<font color="red" size="3"><%=ref %></font>

<%} %>
</center>
</body>
</html>