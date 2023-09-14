package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/sign-up")
public class SignUpServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//응답 정의 생략한다, 왜냐면 302이기 때문에
		
		//request parameters
		String name = request.getParameter("name");
		String yyyymmdd = request.getParameter("yyyymmdd");
		String email = request.getParameter("email");
		String introduce = request.getParameter("introduce");
		
		//db 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		//db insert
		String insertQuery = "insert into `new_user` (`name`, `yyyymmdd`, `email`, `introduce`)"
				 + "values ('" + name + "', '" + yyyymmdd + "', '" + email + "', '" + introduce + "')";
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//db 연결 해제
		ms.disconnect();
		
		//Redirect => 유저목록 화면 이동
		response.sendRedirect("/lesson04/ex02/userList.jsp");
		
		
		
		
	}
}
