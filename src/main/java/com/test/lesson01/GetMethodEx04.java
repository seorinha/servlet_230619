package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/ex04")
public class GetMethodEx04 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
		// 한글 깨짐 방지 -> html
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		// request parameter (html의 name에 있는것과 mapping이 된다)
		String userId = request.getParameter("usesrId");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String email = request.getParameter("email");
		
		
		// 출력
		PrintWriter out = response.getWriter();
//		out.print("userId:" + userId + "<br>");
//		out.print("name:" + name + "<br>");
//		out.print("birth:" + birth + "<br>");
//		out.print("email:" + email + "<br>");
		
		out.print("<html><head><title>회원정보</title></head><body>");
		out.print("<table border=\"1\">");
		out.print("<tr><th>아이디</th><td>" + userId + "</td></tr>");
		out.print("<tr><th>이름</th><td>" + name + "</td></tr>");
		out.print("<tr><th>생년월일</th><td>" + birth + "</td></tr>");
		out.print("<tr><th>이메일</th><td>" + email + "</td></tr>");
		out.print("</table></body></html>");
		
	}
}
