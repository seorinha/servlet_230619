<%@page import="java.util.Iterator"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz01</title>
</head>
<body>
<%!
	//1
	public int getSum(int N) {
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
		}
		return sum;
	}
%>

<%
	//2
	int[] scores = {80, 90, 100, 95, 80};
	int sum = 0;
	for (int i = 0; i < scores.length; i++) {
		sum += scores[i];
	}
	double average = sum / (double)scores.length;
	
	//3
	List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
		int score = 0;
		for (int i = 0; i < scoreList.size(); i++) { //0 ~ 9 index
			if (scoreList.get(i).equals("O")) {
				score += 100 / scoreList.size();
			}
		}
		
	//4
	String birthDay = "20010820";  //2001까지 추출하려면 : index 0~3까지
	String year = birthDay.substring(0, 4);
	//out.print(year); 이렇게 볼 수도 있다
	int age = 2023 - Integer.valueOf(year); 
%>

<h2>1부터 50까지의 합은 <%= getSum(50) %>입니다.</h2>
<h2>평균 점수는 <%= average %>입니다.</h2>
<h2>채점 결과는 <%= score %>점 입니다.</h2>
<h2><%= birthDay %>의 나이는 <%= age %>세 입니다.</h2>
</body>
</html>