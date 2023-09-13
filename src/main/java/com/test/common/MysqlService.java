package com.test.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlService {
	//필드(db 접속 정보들을 넣을것임)
	private static MysqlService mysqlService = null; 
	
	private String url = "jdbc:mysql://localhost:3306/test_230619"; //도메인 뒤쪽에 접속할 데이터베이스 명(test_230619)까지 넣어야한다
	private String id = "root";
	private String password = "root";
	
	private Connection conn; 
	private Statement statement;
	private ResultSet res;
	
	
	//메소드
	//Singleton 패턴 : MysqlService라는 객체가 단 한번만 생성되도록 하는 디자인 패턴(DB연결을 여러객체에서 하지 않도록 관리)
	public static MysqlService getInstance() { 
		if (mysqlService == null) {
			mysqlService = new MysqlService();
		}
		return mysqlService;
	}
	
	//db연결 하는 메소드
	public void connect() {
		try {
			//1. 드라이버 메모리에 로딩
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			//2. DB Connection
			conn = DriverManager.getConnection(url, id, password);
			//3. statement:db와 쿼리를 실행하기 위한 준비
			statement = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//db연결 해제 메소드
	public void disconnect() {
		try {
			statement.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//쿼리문 수행 메소드- Read(select)
	public ResultSet select(String query) throws SQLException {
		res = statement.executeQuery(query);
		return res;
	}
	
	//쿼리문 수행 메소드- Create, Update, Delete(insert, update, delete)
	public void update(String query) throws SQLException {
		statement.executeUpdate(query);
	}
	
	
	
}
