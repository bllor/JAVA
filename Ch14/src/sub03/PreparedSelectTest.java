package sub03;

import java.awt.desktop.UserSessionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/*
 * 날짜:2023/07/11
 * 이름:최동일
 * 내용:preparedStatement Select 실습하기
 */
/*
 * PreparedStatement
 * -기존 statement보다 향상된 동적 SQL 생성을 위한 STATEMENT
 * -Query Parameter에 값을 Mapping시켜 쿼리 수행
 * 
 * 
 * VO(Value Object)
 * -도메인 값을 속성으로 갖는 객체
 * -sql의 컬럼값 = 도메인 값
 * -테이블 개체(entity)를 객체(object)로 변경할 때 사용하는 객체
 * -DTO구분
 */



class User2VO{
	
//user2는 table의 개체가 변환되는 클래스
//접미사로 VO(Value Object)를 붙여줌
//vo: 테이블의 인티티가 변환되는 객체	
	
	
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}




public class PreparedSelectTest {

	public static void main(String[] args) {
		
		//DB정보
		String host ="jdbc:mysql://localhost:3306/userdb";
		String user ="root";
		String pass = "1234";
		
		
		//결과처리에 사용할 리스트생성
		
		List<User2VO> user2 = new ArrayList<>();
		
		try {
			//1단계-jdbc드라이버 로드
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계-데이터베이스 접속
			
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			
			//3단계- SQL실행 객체 생성
			String sql ="select * from `user2`;";
			PreparedStatement psmt = conn.prepareStatement(sql);
			//쿼리 파라미터가 없으므로 바로실행하면됨
			//파라미터가 없을 경우 statement를 사용하는 것이 좋음
			
			//4단계-SQL실행
			
			ResultSet rs =psmt.executeQuery();
			
			
			//5단계-결과 받기
			
			//데이터베이스의 개체는 자바의 오브젝트(=객체)가 된다.
			
			
			while(rs.next()) {
				
				
				
				User2VO vo = new User2VO();
//				 vo.setUid(uid) < String uid = rs.getString(1);

				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				
				//vo객체 list에 저장
				user2.add(vo);
				
				
			}
			
			
			//6단계-연결해제
			rs.close();
			psmt.close();
			conn.close();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		//List 결과출력
		
		for(User2VO vo  : user2) {
			System.out.println("------------");
			System.out.println("아이디 :"+vo.getUid());
			System.out.println("이름 :"+vo.getName());
			System.out.println("전화번호 :"+vo.getHp());
			System.out.println("나이 :"+vo.getAge());
			System.out.println("------------");
		}
		
		System.out.println("main 끝");
	}
}
