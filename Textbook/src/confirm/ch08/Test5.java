package confirm.ch08;
/*
 * 날짜: 2023/07/21
 * 이름: 최동일
 * 내용: 8장 연습문제
 */


 interface Remocon{
	 public void powerOn();
}

 class TV implements Remocon{

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켰습니다.");
		
	}
	 
 }
 
 
public class Test5 {

	
	
	public static void main(String[] args) {
	
		Remocon rc = new TV();
		rc.powerOn();
		
		
	}
}
