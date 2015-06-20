<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BHABHA ENGINEERING RESEARCH INSTITUTE</title>
</head>
<body style="background-image: url(images/bg.jpg); no repaet">
<center><h1>Welcome To BHABHA ENGINEERING RESEARCH INSTITUTE</h1></center>
<% String ref1=(String)session.getAttribute("name");
	String ref2=(String)session.getAttribute("acno1");
%>



<p align="right">
<a href="Login.jsp">logout</a></p>
<div style=" margin-left: 387px;">
<div style="float:left;">
<form  method="post" action="view.do">
<INPUT TYPE="submit" value="Your College Fee ">  
</form></div>&nbsp;&nbsp;&nbsp;
<div style="float:left;">
<form  method="post" action="transfer.jsp ">
<INPUT TYPE="submit"value="SubmitFee "><br><br>
</form></div>&nbsp;&nbsp;
<div style="float:left;">
</div><br><br>
<div style="float:left;">
<center>
<font size="4" align="center">UserName:<%=ref1 %></font><br><br>
<font  size="4">Your AccountNo:<%=ref2 %></font>
</center></div>
<center>
<% String ref=(String)request.getAttribute("id");
%>
<% if(ref!=null){
%>
<font color="red" size="5"><%=ref %></font>

<%} %>
</center></div>
</body>
</html>