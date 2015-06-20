<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BHABHA ENGINEERING RESEARCH INSTITUTE,BHOPAL</title>
</head>
<body style="background-image: url(images/bg.jpg); no repaet">
<center><h2>WELCOME TO BHABHA ENGINEERING RESEARCH INSTITUTE,BHOPAL</h2></center>
<form action="login.do" method="post">
<table align="center">
<tr>
<td>AccountNO:</td>
<td><input type="text" name="an"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="ps"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Login"></td>
</tr>

</table>
</form>
<center><h4>Don't Have Account please  <a href="Registration.jsp">Register</a></h4></center>
<center>
<% String ref=(String)request.getAttribute("msg");
%>
<% if(ref!=null){
%>
<font color="red" size="3"><%=ref %></font>

<%} %>
</center>
</body>
</html>