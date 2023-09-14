<%@page import="java.sql.ResultSet"%>
<%@page import="com.test.common.MysqlService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz02 사이트 목록 출력</title>
</head>
<body>
<%
	//db 연결
	MysqlService ms = MysqlService.getInstance();
	ms.connect();
	
	//db select
	String selectQuery = "select * from `bookmark`";
	ResultSet res = ms.select(selectQuery);
	
%>
		<table class="table">
			<thead>
				<tr>
					<th>사이트</th>
					<th>사이트 주소</th>
				</tr>
			</thead>
			<tbody>
			<%
				while (res.next()) {
					
			%>
				<tr>
					<td><%= res.getString("name") %></td>
					<td><a href="<%= res.getString("name") %>"><%= res.getString("url") %></a></td>				
				</tr>
			<%
				}		
			%>
			</tbody>
		</table>
</body>
</html>