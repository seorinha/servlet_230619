<%@page import="java.util.Iterator"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04 제어문 활용</title>
</head>
<body>
<%
	// Map을 테이블로 표현
	//{"korean"=85, "english"=72, "math"=90, "science"=100}
	
	Map<String, Integer> scoreMap = new HashMap<>();  //Map자체는 반복문을 돌릴 수 없다 key를 가지고 iterator로 반복문을 돌려야한다
	scoreMap.put("korean", 85);
	scoreMap.put("english", 72);
	scoreMap.put("math", 90);
	scoreMap.put("science", 100); //출력시 순서는 보장 안된다

%>

	<table border="1">
	<%
		Iterator<String> iter =  scoreMap.keySet().iterator();
		while (iter.hasNext()) { 
			String key = iter.next(); //iter가 갖고있는 값(Map의 과목명)을 한번씩 뽑아낸다
	%>	
		<tr>
			<th>
				<%
					if (key.equals("korean")) {
						out.print("국어");
					} else if (key.equals("english")) {
						out.print("영어");
					} else if (key.equals("math")) {
						out.print("수학");
					} else if (key.equals("science")) {
						out.print("과학");
					}
				%>
			</th>
			<td><%= scoreMap.get(key) %></td>
		</tr>
	<%
		}		
	%>
	</table>
</body>
</html>