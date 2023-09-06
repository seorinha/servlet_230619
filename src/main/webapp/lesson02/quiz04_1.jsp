<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz04 결과</title>
</head>
<body>
<%
	int length = Integer.parseInt(request.getParameter("length"));
	String[] types = request.getParameterValues("type");
	
%>
<div class="container">
	<h1>길이 변환 결과</h1>
	<h2><%= length %>cm</h2>
	<hr>
	
	<h2>
		<%
			if (types != null) {
				for (String type : types) { // inch
					if (type.equals("inch")) {
						double inch = length * 0.393701;
						out.print(inch + "in<br>");
					} else if (type.equals("yard")) {
						double yard = length * 0.0109361;
						out.print(yard + "yd<br>");
					} else if (type.equals("feet")) {
						double feet = length * 0.0328084;
						out.print(feet + "ft<br>");
					} else if (type.equals("meter")) {
						double meter = length / 100.0;
						out.print(meter + "m<br>");
					}
				}
			}
		%>
	</h2>
	<h2></h2>
	<h2></h2>
	<h2></h2>
</div>
</body>
</html>