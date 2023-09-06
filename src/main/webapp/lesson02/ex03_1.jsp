<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과</title>
</head>
<body>
<%
	String nickname = request.getParameter("nickname");
	String hobby = request.getParameter("hobby");
	String animal = request.getParameter("animal");
	String fruit = request.getParameter("fruit");
	String[] foodArr = request.getParameterValues("food"); // 선택 항목 값이 여러개일 때
%>
	
	<table border="1">
		<tr>
			<th>별명</th>
			<td><%= nickname %></td>
		</tr>
		
		<tr>
			<th>취미</th>
			<td><%= hobby %></td>
		</tr>
		
		<tr>
			<th>선호동물</th>
			<td><%= animal %></td>
		</tr>
		
		<tr>
			<th>과일</th>
			<td><%= fruit %></td>
		</tr>
		
		<tr>
			<th>선호음식</th>
			<td>
				<%
					if (foodArr != null) {		
						String result = "";
						for (String food : foodArr) {
							result += food + ",";
						}
						
						//맨 뒤에 붙은 콤마 제거
						//abc중에서 c만 제거하고 ab를 출력 (0, 2)
						// (0, result - 1)  => substring
						result.substring(0, result.length() - 1);
						
						out.print(result);
					}
				%>
			</td>
		</tr>
	</table>
	
</body>
</html>