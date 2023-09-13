package com.test.lesson04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz01")
public class Quiz01 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//응답 plain
		response.setContentType("text/plain");
		
		//db연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect();
		
		//db 인서트 쿼리 수행
		String insertQuery = "insert into `real_estate`"
				+ "(`realtorId`, `address`, `area`, `type`, `price`, `rentPrice`)"
				+ "values"
				+ "(3, '헤라펠리스 101동 5305호', 350, '매매', 1500000, Null);";
		
		
		//db 셀렉트 쿼리 수행 & 출력
		PrintWriter out = response.getWriter();
		String query = "select `address`, `area`, `type` from `real_estate`"
		
		//db 연결 해제
		ms.disconnect();
	}
}
