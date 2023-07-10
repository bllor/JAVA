package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2023/07/10
 * 이름 : 최동일
 * 내용 : JDBC Insert 실습하기
 */
public class InsertTest {

	public static void main(String[] args) {
		
		//DB정보
		
		String host ="jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		
		try {
			
			//1단계 -JDBC 드라이버로드
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2단계 -데이터베이스 접속
			
			Connection conn= DriverManager.getConnection(host,user,pass);
			
			//3단계 -SQL 실행객체 생성(Statement)
			
			Statement stmt = conn.createStatement();
			
			
			//4단계 -SQL 실행
			
			//insert하기
			String sql ="INSERT INTO `user1` VALUES ('J101','김유신','010-1234-1001',23);";
			stmt.executeUpdate(sql);
			
			//5단계 -결과처리(Select문일경우에 한해서)
			
			//insert이므로 생략
			
			
			//6단계 -JDBC 연결해제
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("insert 완료");
	}
}
