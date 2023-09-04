package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson/quiz05")
public class GetMethodQuiz05 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//한글 깨짐 방지 
		response.setCharacterEncoding("uft-8");
		response.setContentType("text/html");
		
		// request parameter - 몇 단인지 나타냄
		int number = Integer.valueOf(request.getParameter("number"));
		
		// 구구단 반복문 - 출력
		PrintWriter out = response.getWriter();
		out.println("<html><head><title></title></head><body><ul>");
		
		for (int i = 1; i < 10; i++) {
				out.println("<li>" + number + " X " + i + " = " + (number * i) + "</li>");
		}
		out.println("</ul></body></html>");
		
		
		
	}
}
