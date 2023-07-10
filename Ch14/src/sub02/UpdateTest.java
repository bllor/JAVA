package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2023/07/10
 * 이름 : 최동일
 * 내용 : JDBC Update 실습하기
 */
public class UpdateTest {

	public static void main(String[] args) {
		
		
		//DB정보
		
		String host="jdbc:mysql://127.0.0.1:3306/userdb";
		String user="root";
		String pass="1234";
		
		try {
			//1단계 - JDBC 드라이버로드
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - 데이터베이스 연결
			
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			//3단계 - SQL 객체 생성(Statement생성)
			
			Statement stmt = conn.createStatement();
			
			//4단계 - SQ	L문 실행
			
			String sql = "UPDATE `USER1` SET `hp`='010-1234-1111',`age`=25 WHERE `uid`='J101'";
			
			//sql+=hp='010-1234-1111'이런 식으로 해도됨.
			
			
			stmt.executeUpdate(sql);
			
			//5단계 - 결과 받기
			//6단계 - 연결 해제
			
			stmt.close();
			conn.close();
			
			//전번호 뒷자리를 1111, 나이를 25로 수정
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println("업데이트 완료");
	}
}
