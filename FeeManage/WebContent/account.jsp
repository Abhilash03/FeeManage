<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BERI</title>
</head>
<body style="background-image: url(images/bg.jpg); no repaet">

<% String ref= (String)request.getAttribute("acc");%>

<center>

<h1>Welcome To BHABHA ENGINEERING RESEARCH INSTITUTE</h1>
<h5 align="right"><a href="Login.jsp"><font size="3">Login</font></a></h5>
<p><font  size="5">Your Accountno :<%=ref %></font></p>
</center>

</body>
</html>