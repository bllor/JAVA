package sub05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
//DAO(Data Access Object)
//- 데이터베이스 CRUD처리 객체
//싱클톤으로 사용
	
	private static UserDAO instance = new UserDAO();

	public static UserDAO getInstance() {
		return instance;
	}
	private UserDAO() {}
	
	//DB정보 - 상수로 만들어줌(final선언)-대문자로 사용
	private final String HOST ="jdbc:mysql://localhost:3306/userdb";
	private final String USER ="root";
	private final String PASS ="1234";
	
	//connection
	private Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		return DriverManager.getConnection(HOST,USER,PASS);
		
		
	}
	
	private Connection conn;
	private Statement stmt;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	
	public void insertUser(UserVO vo) {
		
		try {
			
			 conn =getConnection();
			
			 psmt =conn.prepareStatement(SQL.INSERT_USER);
					psmt.setString(1,  vo.getUid());
					psmt.setString(2, vo.getName());
					psmt.setString(3, vo.getHp());
					psmt.setInt(4, vo.getAge());
			
			
					psmt.executeUpdate();
					close();
					
					
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		
	}
	
	public void insertUser() {}
	public UserVO selectUser(String uid) {
		//찾기
		UserVO vo=new UserVO();
		try {
			
			conn = getConnection();
			psmt=conn.prepareStatement(SQL.SELECT_USER);
			psmt.setString(1, uid);
			rs = psmt.executeQuery();
			
			//if를 쓰는 이유는 pk를 기준으로 출력을 하는데 
			//출력하는 데이터가 1개이거나 0개이므로
			//자료가 1개 출력이 되면 리스트로 만들 필요가 없다.
			if(rs.next()) {
				
				
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
			}
			close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}
	public List<UserVO> selectUsers() {
		//출력
		List<UserVO> users = new ArrayList<>();
		
		try {
			
			 conn =getConnection();
			 stmt =conn.createStatement();
			 rs = stmt.executeQuery(SQL.SELECT_USERS);
			
			while(rs.next()) {
				
				UserVO vo = new UserVO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				users.add(vo);
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return users;
		
		
	}
	public int updateUser(UserVO vo) {
		
		int result = 0 ;
		try {
			
			
			conn = getConnection();
			psmt =conn.prepareStatement(SQL.UPDATE_USER);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getHp());
			psmt.setInt(3, vo.getAge());
			psmt.setString(4, vo.getUid());
			
			
//			conn = getConnection();
//			psmt = conn.prepareStatement(SQL.UPDATE_USER);
//			psmt.setString(1, vo.getName());
//			psmt.setString(2, vo.getHp());
//			psmt.setInt(3, vo.getAge());
//			psmt.setString(4, vo.getUid());
			
			result =psmt.executeUpdate();//int로 return되는데 1은 수정이됬고, 2는 수정할 수 없다는 것.
			
			
			close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
		
	}
	public int deleteUser(UserVO vo) {
		int result =0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER);
			psmt.setString(1, vo.getUid());
			
			result = psmt.executeUpdate();
			close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result;
		
	}
	public void close() throws SQLException {
			if(rs!=null) {
				rs.close();
			}
			if(stmt!=null) {
				stmt.close();
			}
			if(psmt!=null) {
				psmt.close();
			}
			if(conn!= null) {
				conn.close();
			}
				
		}

}

	