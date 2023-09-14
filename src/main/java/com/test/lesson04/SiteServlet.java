package com.test.lesson04;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/site")
public class SiteServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		//응답 정의 생략
		
		//request parameter
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		//db연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		//db insert
		String insertQuery = "insert into `bookmark` (`name`, `url`)"
				+ "values ('" + name + "', '" + url + "')";
		
		//db 연결 해제
		ms.disconnect();
		
	
	}
}
