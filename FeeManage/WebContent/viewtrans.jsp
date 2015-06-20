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
<div style="margin-left:256px;">
<div> <a href="display.jsp">Home</a> </div>
<h5><font color="Blue" size="10">Your Transfered amount successfully </font></h5>
<font color="Red" size="5">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<font color="black" size="5"><%=session.getAttribute("tamt") %></font><br>
<h5><font color="Blue" size="10">Your Receiver account no:</font></h5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<font color="black" size="5"><%=session.getAttribute("recacno") %></font></div>
</html>