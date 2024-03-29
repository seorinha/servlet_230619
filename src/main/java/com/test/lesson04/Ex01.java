package com.test.lesson04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/ex01")
public class Ex01 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//응답 plain
		response.setContentType("text/plain");
		
		//db 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect(); //★★★★★ 실질적인 db연결(꼭 넣어야 한다). 안넣게 되면 500서버오류
		
		//db 인서트 쿼리 수행
		String insertQuery = "insert into `used_goods`"
				+ "(`sellerId`, `title`, `description`, `price`)"
				+ "values"
				+ "(1, '고양이 간식 팝니다', '입맛이 까다로워서 잘 안먹어요ㅠ', 2000);";
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//db 셀렉트 쿼리 수행 & 출력
		PrintWriter out = response.getWriter();
		String query = "select * from `used_goods`";
		try {
			ResultSet res = ms.select(query);
			while (res.next()) { //결과 행이 있는동안 계속 수행
				out.println(res.getInt("id"));
				out.println(res.getString("title"));
				out.println(res.getInt("price"));
				out.println(res.getString("description"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//db 연결 해제 
		ms.disconnect();
		
		
		
	}
	
	
	
}
