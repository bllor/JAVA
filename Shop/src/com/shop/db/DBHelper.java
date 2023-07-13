package com.shop.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
//private가 되어있으면 자식에서도 사용할 수 없으므로 protected로 바꿔준다.
			
		//DB정보-얘는 커넥션에서만 사용되므로 private로 사용되어도 된다.
		private final String HOST ="jdbc:mysql://localhost:3306/shop";
		private final String USER ="root";
		private final String PASS = "1234";
		
		
		
		
		//자원
		protected Connection conn;
		protected Statement stmt;
		protected PreparedStatement psmt;
		protected ResultSet rs;
		
		
		//커넥션
		protected Connection getConnection() throws ClassNotFoundException, SQLException{
			Class.forName("com.mysql.cj.jdbc.Driver");		
			return DriverManager.getConnection(HOST,USER,PASS);
		}
		
		
		//종료
		protected void close() throws SQLException {
			if(rs!= null) {
				rs.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
			if(psmt!=null) {
				psmt.close();
			}
			if(conn!=null) {
				conn.close();
			}
		}
}
