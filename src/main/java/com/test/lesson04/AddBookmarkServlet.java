package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/add-bookmark") //jsp의 action과 같게
public class AddBookmarkServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//응답 정의 생략
		
		//request parameter
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		//db연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		//db insert query -> 수행
		String insertQuery = "insert into `bookmark`" 
				+ "(`name`, `url`)"
				+ "values"
				+ "('" + name + "', '" + url + "')";
				try {
					ms.update(insertQuery);
				} catch (SQLException e) {
					e.printStackTrace();
				}
		
		//db 연결 해제
		ms.disconnect();
		
		//Redirect -> 즐찾 목록 페이지로 이동
		response.sendRedirect("/lesson04/quiz02/bookmarkList.jsp");
		
	
	}
}
