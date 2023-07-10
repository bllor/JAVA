package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 날짜 : 2023/07/10
 * 이름 : 최동일
 * 내용 : JDBC Select 실습하기
 */
public class SelectTest {

	public static void main(String[] args) {
		
		
		//DB정보
		
		String host="jdbc:mysql://localhost:3306/userdb";
		String user="root";
		String pass="1234";
		
		
		try {
			
			
			
			
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - 데이터베이스 연결
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			//3단계 - SQL 객체 생성
			
			Statement stmt = conn.createStatement();
			
			//4단계 - SQL실행
			
			String sql = "select * from user1";
			
			ResultSet rs = stmt.executeQuery(sql);
			//5단계 - 결과 받기
			//while로 리스트를 만들어야함S
			//sql의 머리를 커서가 가리키고 있는데 커서를 이동시키기 위해서 while 사용
			while(rs.next()) {
				
				String uid = rs.getString(1);
				String name= rs.getString(2);
				String hp = rs.getString(3);
				int age = rs.getInt(4);//age는 나이이므로 int로 뽑는게 나음.
				
				
				System.out.printf("%s,%s,%s,%d\n",uid,name,hp,age);
				
			}
			
			//6단계 - 연결 해제
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		System.out.println("select 완료");
	}
}













