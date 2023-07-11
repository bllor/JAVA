package sub04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 날짜:2023/07/11
 * 이름:최동일
 * 내용:트랜잭션 실습하기
 */
/*
 * 트랜잭션(Transaction)
 * -트랜잭션은 DB처리의 최소 작업단위로 하나의 작업은 소작업으로 구성
 * -트랜잭션은 모두 성공 또는 모두 실패 해야 됨.
 * -commit은 모든 작업의 성공처리, rollback은 모든 작업의 실패처리
 */
public class TransectionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("에러를 발생시키겠습니까");
		int answer = sc.nextInt();
		
		
		//DB정보
		
		String host 	="jdbc:mysql://localhost:3306/bank";
		String user		="root";
		String pass		="1234";
		
		Connection conn =null;
		
		try {
			
			//1단계-JDBC드라이브
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계-데이터 베이스 접속
			
			conn = DriverManager.getConnection(host,user,pass);
			
			//트랜잭션 시작
			conn.setAutoCommit(false);
			//자동으로 commit이 되는 것을 막음 
			
			//3단계-SQL객체 생성
			
			String sql1="update `bank_account` set `a_balance`=`a_balance`-10000 where `a_no`=?";
			String sql2="update `bank_account` set `a_balance`=`a_balance`+10000 where `a_no`=?";
			
				PreparedStatement psmt1 =conn.prepareStatement(sql1);
				psmt1.setString(1, "101-11-1001");
				
				
				PreparedStatement psmt2 =conn.prepareStatement(sql2);
				psmt2.setString(1, "101-11-1003");
			
			//4단계- 실행하기 - 여러가지를 실행하면 오류가 생길 수 있으므로 다 실행되거나 다 실행이 안될 경우를 만들어야 한다.
				psmt1.executeUpdate();
				
				
				if(answer==1) {
					throw new Exception("에러가 발생하였습니다.");
					//1이 입력되면 예외가 발생하여 바로 catch로 들어감
					
				}
				
				
				
				psmt2.executeUpdate();
				
				//트랜잭션 확정- 성공처리 
				//여기까지 에러없이 도달하면 commit이 되어 sql에 업데이트가 진행됨.
				conn.commit();
				
				
			//5단계-연결해제
			
				psmt1.close();
				psmt2.close();
				conn.close();
				
		} catch (Exception e) {
			e.printStackTrace();
			try {
				//트랜잭션 취소- 실패처리
				//작업취소되어 트랜잭션 시작부분으로 이동한다.
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	
		System.out.println("트랜잭션 완료");
	}
}
