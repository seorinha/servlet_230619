package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz02 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//한글
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		
		//시간생성
		Date now = new Date();
		
		//포맨 정의, 출력
		PrintWriter out = response.getWriter();
		SimpleDateFormat sdf = new SimpleDateFormat("현재시간은 " + "HH" + "시 " + "mm" + "분 " + "ss" + "초 입니다.");
		out.println(sdf.format(now));
		
		
		
	}
	
	
}
