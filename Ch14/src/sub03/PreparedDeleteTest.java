package sub03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜:2023/07/11
 * 이름:최동일
 * 내용:preparedStatement Delete 실습하기
 */
public class PreparedDeleteTest {

	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			//1단계-jdbc 드라이브 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계-데이터 베이스 연결
			
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			//3단계-SQL 객체 생성
			
			
			String sql ="delete from user2 where uid =?";
		
			
			PreparedStatement psmt = conn.prepareStatement(sql);
		
			psmt.setString(1, "j101");
			
			//4단계-SQL 실행
			
			psmt.executeUpdate();
			//5단계-결과 받기
			//6단계-연결 해제
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		System.out.println("delete 실행");
	}
}
