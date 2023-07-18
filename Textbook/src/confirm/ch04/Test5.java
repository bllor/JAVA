package confirm.ch04;
/*
 * 날짜: 2023/07/18
 * 이름: 최동일
 * 내용: ch04 조건문 test
 */
public class Test5 {

	public static void main(String[] args) {
		
		for(int i =1; i<=10; i++) {
			for(int j=1;j<=10;j++) {
				if((4*i+5*j)==60) {
					System.out.println(i+","+j);
				}
			}
		}
	}
}
