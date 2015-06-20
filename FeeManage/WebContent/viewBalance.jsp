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
<div> <a href="display.jsp">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="Login.jsp">logout</a> </div>
<div style="margin-left: 475px;">
<h1><font color="Blue" size="10">Dues Amount is:</font>&nbsp;&nbsp;&nbsp;&nbsp;
<font color="Red" size="5">
<%=request.getAttribute("balance")%>
</font></h1>
</div>
</body>
</html>