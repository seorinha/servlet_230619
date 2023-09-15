package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/delete-bookmark")
public class DeleteBookmarkServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//응답 생략
		
		//request parameter
		int id = Integer.valueOf(request.getParameter("id"));
		
		//db 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		//delete query 수행
		String deleteQuery = "delete from `bookmark` where `id` = " + id;
		try {
			ms.update(deleteQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//db 연결 해제
		ms.disconnect();
		
		//302 redirect -> bookmarkList 페이지로 이동
		response.sendRedirect("/lesson04/quiz02/bookmarkList.jsp");
	}
}
