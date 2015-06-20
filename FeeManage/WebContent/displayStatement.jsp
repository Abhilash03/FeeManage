<%@page import="com.sam.BERI.fee.Dto.TransferDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BHABHA ENGINEERING RESEARCH INSTITUTE</title>
</head>
<body style="background-image: url(images/bg.jpg); no repaet">
<%
ArrayList<TransferDto> list=(ArrayList<TransferDto>)request.getAttribute("ls");

%>
<table align="center" border=2>
<tr>
<th>Transaction ID</th>
<th>AccountNo</th>
<th>Remark</th>
<th>Amount</th>
<th>Transaction Type</th>
<th>Date</th>
<th>Time</th>
</tr>
<%if(list!=null){ 
	for(TransferDto tdto:list){

	
%>

<tr>
<td><%=tdto.getTid()%></td>
<td><%=tdto.getSacno()%></td>
<td><%=tdto.getRemark()%></td>
<td><%=tdto.gettAmt()%></td>
<td><%=tdto.getTransType()%></td>
<td><%=tdto.getDate()%></td>
<td><%=tdto.getTime()%></td>

</tr>
<%
}
}
%>
</table>

</body>
</html>