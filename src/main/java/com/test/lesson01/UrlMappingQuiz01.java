package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz01 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//한글
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		//날짜 객체
		Date now = new Date();

		//포멧 출력
		SimpleDateFormat sdf = new SimpleDateFormat("오늘의 날짜는 " + "yyyy" + "년 " + "M" + "월 " + "d" + "일");
		PrintWriter out = response.getWriter();
		out.println(sdf.format(now));
		
	
	}
}
