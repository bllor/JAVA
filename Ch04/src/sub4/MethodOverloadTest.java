package sub4;
/*
 *  날짜:2023/6/15
 *  이름:최동일
 *  내용:Java 매서드 오버로딩 실습하기
 */
public class MethodOverloadTest {
	public static void main(String[] args) {
		int r1 =plus(1);
		int r2= plus(1,2);
		double r3= plus(1.1,2.3);
		String r4=plus("hello ","world");
		
		System.out.println("r1 :"+r1);
		System.out.println("r2 :"+r2);
		System.out.println("r3 :"+r3);
		System.out.println("r4 :"+r4);
	}
//오버로딩 매서드 정의
//매서드는 소문자로 정의되어야 한다.
//class는 대문자로, 매서드는 소문자로 표기
//매개변수가 전부 다르므로 매서드의 이름이 같다고 해도 구분이 가능하다.
	public static int plus(int a) {
		return a+a;
	}
	
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static double plus(double a, double b) {
		return a+b;
	}
	
	public static String plus(String a, String b) {
		return a+b;
	}
	
	
}
//오버로딩은 매개변수로만 구분이 가능하다.
