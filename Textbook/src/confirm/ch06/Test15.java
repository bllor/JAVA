package confirm.ch06;
/*
 * 날짜: 2023/07/19
 * 이름: 최동일
 * 내용: 자바 6장 확인문제
 */

class MemberService{
	
	String id;
	String password;
	
	public MemberService() {
		
	}
	
	
	
	public boolean login(String id, String password){
		this.id =id;
		this.password=password;
		
		boolean result;
		if(id=="hong"&&password=="12345") {
			result = true;
			
		}else {
			result = false;
		}
			
		return result;
	}
	
	public void logout() {
		
		System.out.println(id+"님이 로그아웃 하셨습니다.");
	}
}

public class Test15 {

	public static void main(String[] args) {
		
		MemberService ms = new MemberService();
		boolean result = ms.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
		ms.logout();
	}
}
