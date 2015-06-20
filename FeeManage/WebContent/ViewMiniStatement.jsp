<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BHABHA ENGINEERING RESEARCH INSTITUTE</title>
</head>
<body style="background-image: url(images/bg.jpg); no repaet">
<center>
		<font color="black" size="10">BHABHA ENGINEERING RESEARCH INSTITUTE,BHOPAL </font>
	</center><br/>
	<div> <a href="display.jsp">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="Login.jsp">logout</a> </div>
<form action="mini.do" method="post">
<table align="center" border=2>
<tr>
<td>StartDate:<input type="date" name="sd"> &nbsp;&nbsp;LastDate:<input type="date" name="ld"></td>
</tr>
<tr>
<td><center><input type="submit" value="ShowData"></center></td>
</tr>
</table>
</form>
</body>
</html>