package confirm.ch04;


/*
 * 날짜: 2023/07/18
 * 이름: 최동일
 * 내용: ch04 조건문 test
 */
public class Test4 {

	public static void main(String[] args) {
		
		
		while(true) {
			
		 int x = (int)Math.ceil(Math.random()*6);//ceil은 반올림	
		 int y = (int)Math.ceil(Math.random()*6);
//		int x =(int)(Math.random()*5+1);
//		int y =(int)(Math.random()*5+1);
		int z = x+y;
		if(z==5) {
			System.out.println("x : "+x+", y: "+y);
			break;
			
		}
		
		}
	}
}
