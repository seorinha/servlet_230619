package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson/ex02")
public class UrlMappingEx02 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//한글
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 서블릿(Servlet) : 자바 코드 + 태그 (별로 좋은건 아님)
		int sum = 0;
		for (int i = 1; i <= 10; i++) { // 1~10
			sum += i;
		}
		
		out.print("<html><head><title>합계</title></head><body>");
		//합계:55
		out.print("합계:<b>" + sum + "</b>");
		out.print("</body></html>");
		
	}
	
}
