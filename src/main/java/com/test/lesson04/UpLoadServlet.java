package com.test.lesson04;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson04/quiz03/market")
public class UpLoadServlet extends HttpServlet {

	@Override 
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		//응답 생략
		
		//request params
		String name = request.getParameter("name");
		String title = request.getParameter("title");
		
		
		//db 연결
		
		//db insert query
		
		//db연결 해제
		
		//redirect
	}
}
