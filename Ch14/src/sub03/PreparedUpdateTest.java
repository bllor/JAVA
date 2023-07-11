package sub03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



/*
 * 날짜:2023/07/11
 * 이름:최동일
 * 내용:preparedStatement 실습하기
 */
public class PreparedUpdateTest {

	public static void main(String[] args) {
		
		String host ="jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		try {
			//1단계 - jdbc 드라이브 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계- 데이터베이스 연결
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			//3단계 - SQL객체 생성
			String sql = "update user2 set hp=?,age=? where uid=?";
			//?는 쿼리파라미터
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "010-1234-1111");
			psmt.setInt(2, 25);
			psmt.setString(3, "j101");
			
			//4단계- SQL실행
			psmt.executeUpdate();
			
			//5단계 - 결과받기
			
			
			//6단계 - 연결해제
			psmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("업데이트 완료");
	}
}
