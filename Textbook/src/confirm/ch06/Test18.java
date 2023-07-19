package confirm.ch06;
/*
 * 날짜: 2023/07/19
 * 이름: 최동일
 * 내용: 자바 6장 확인문제
 */

class ShopService{
	private static ShopService shopservice= new ShopService();
	
	private ShopService() {
		
	}
	
	public static ShopService getInstance() {
		return shopservice;
	}
}
public class Test18 {

	public static void main(String[] args) {
		
		ShopService ss1= ShopService.getInstance();
		ShopService ss2= ShopService.getInstance();
		
		if(ss1==ss2) {
			System.out.println("같은 singleton 객체 입니다.");
		}else {
			System.out.println("다른 singleton 객체 입니다.");
		}
	}
}
