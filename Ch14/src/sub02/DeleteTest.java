package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2023/07/10
 * 이름 : 최동일
 * 내용 : JDBC DELETE 실습하기
 */
public class DeleteTest {

	public static void main(String[] args) {
		
		//DB정보
		
		String host="jdbc:mySQL://127.0.0.1:3306/userdb";
		String user="root";
		String pass="1234";
		
		try {
			
			//1단계 - JDBC 드라이버로드
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - 데이터베이스 연결
			
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			//3단계 - SQL객체 생성
			
			Statement stmt = conn.createStatement();
			
			
			//4단계 - SQL실행
			
			String sql ="delete from `user1` ";
					sql += "where `uid`='J101'";
					
			stmt.executeUpdate(sql);
			//5단계 - 결과받기
			//6단계 - 연결해제
					stmt.close();
					conn.close();
					
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("업데이트 완료");
	}
}
