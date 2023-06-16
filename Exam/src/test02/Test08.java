package test02;

/*
 * 날짜: 2023/06/15
 * 이름: 최동일
 * 내용: 자바 팩토리얼 재귀 메서드 연습문제
 */
public class Test08 {
	public static void main(String[] args) {
		System.out.println("3! = "+factorial(3));
		System.out.println("4! = "+factorial(4));
		System.out.println("5! = "+factorial(5));
		
	}
	
	public static int factorial(int n) {
		
		if(n<=1) {
			return 1;
		}
		return n*factorial((n-1));//<-재귀함수(=재귀메서드) recursive
	}
	//현대 사회에서는 재귀함수를 권하지 않는다.
/*
 * fcatorial(n=3)일 때
 * n!=3이므로
 * return 3*factorial(2)가 되는데 factorial(2)를 수행
 * factorial(2) = 2*factorial(1) 
 * factorial(1) = factorial(1) =1
 * 3*factorial(2)=3*2*factorial(1)=3*2*1
 */
}
