package confirm.ch04;
/*
 * 날짜: 2023/07/18
 * 이름: 최동일
 * 내용: ch04 조건문 test
 */
public class Test3 {

	public static void main(String[] args) {
		
		int total = 0;
		for(int i =1; i<=100; i++) {
			if(i%3==0) {
				total+=i;
			}
		}
		System.out.println("1부터 100까지 정수 중 3의 배수의 총합 :"+total);
	}
}
