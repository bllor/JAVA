package sub03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


/*
 * 날짜:2023/07/11
 * 이름:최동일
 * 내용:preparedStatement 실습하기
 */
public class PreparedInsertTest {

	public static void main(String[] args) {
		//DB정보
		
		String host="jdbc:mysql://127.0.0.1:3306/userdb";
		String user="root";
		String pass="1234";
		
		
		 try {
			
			 //1단계-JDBC 드라이브 로드
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 //2단계-데이터베이스 연결
			 Connection conn= DriverManager.getConnection(host, user, pass);
			 
			 //3단계-SQL객체 생성
			 String sql = "INSERT INTO `USER2` VALUES (?,?,?,?)";
			 PreparedStatement psmt =conn.prepareStatement(sql);//쿼리문을 생성하는 것
			 psmt.setString(1, "j101");// user2의 1번째 칼럼에 j101을 넣는다.
			 psmt.setString(2, "홍길동");
			 psmt.setString(3, "010-1234-1001");
			 psmt.setInt(4, 23);//나이는 숫자이므로  setInt로 받는다.
			 //4단계-SQL실행
			 
			 psmt.executeUpdate();
			 
			 //5단계-결과받기
			 //6단계-연결해제
			 psmt.close();
			 conn.close();
			 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("insert 완료");
	}
	
}
