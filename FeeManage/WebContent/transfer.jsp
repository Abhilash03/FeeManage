<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BHABHA ENGINEERING RESEARCH INSTITUTE</title>
</head>
<body style="background-image: url(images/bg.jpg); no repaet">
<center><h1>Welcome To JAI NARAYAN COLLEGE OF TECHNOLOGY</h1></center>
<div> <a href="display.jsp">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="Login.jsp">logout</a> </div>
 <form method="post" action="trans.do">
 <table align="center" border=2>
 <tr>
	<td>College account Number</td>
	<td><input type="text" name="acc"></td>
 </tr>
 <tr>
	<td>Amount</td>
	<td><input type="text" name="amt"></td>
 </tr>
 <tr>
 <td>Remark:</td>
 <td><textarea rows="4" cols="21" name="rm"></textarea></td>
 </tr>
 <tr><td> TransactionType:</td><td><input type="text" name="transtype" value="Credit" /></td></tr>
 <tr>
	<td></td>
	<td><input type="submit" value="transfer"></td>
 </tr>
 </table>
	
 </form>
  
 </body>

</html>