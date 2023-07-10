package sub01;

import java.sql.Connection;
import java.sql.DriverManager;


/*
 * 날짜 : 2023/07/10
 * 이름 : 최동일
 * 내용 : JDBC프로그래밍 실습하기
 */
/*
 * JDBC(Java Database Connectivity)
 * -자바에서 데이터베이스 연결을 위한 기술표준
 * -Java는 기본적으로 java.sql 패키지를 포함하고 있고 별도로 DBMS에 맞는 드라이버 설정
 */
public class JDBCTest {

	public static void main(String[] args) {
		
		
		//DB정보
		String host= "jdbc:mysql://127.0.0.1:3306/userdb";
		String user= "root";
		String pass= "1234";
		
		
		//데이터베이스 접속
		try {
			//jdbc 드라이버 로드 - 얘를 참조하여 프로그램을 실행하겠다는 뜻.
			//forname은 static매서드 클래스명을 말하고 바로 시작하므로
			//Class는 클래스 대문자로 시작하므오
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//데이트베이스 접속-connection이라는 객체가 리턴됨
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			if(conn!=null) {
				
				System.out.println("데이터베이스 연결 성공");
			}else {
				System.out.println("데이터베이스 연결 실패");

			}
				
				
				
				
			
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
	}
}
