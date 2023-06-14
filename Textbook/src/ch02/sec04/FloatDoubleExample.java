package ch02.sec04;
/*
 * 날짜: 2023/6/14
 * 이름: 최동일
 * 내용: 교재 47p 예제
 */
public class FloatDoubleExample {
	public static void main(String[] args) {
		//정밀도 확인
		float var1=0.1234567890987654321f;
		double var2=0.1234567890987654321;
		System.out.println(var1);
		System.out.println(var2);
		
		//10의 거듭제곱 리터럴
		double var3=3e6;
		float var4=3e6f;
		double var5=2e-3;
//		int var6= 2e5; 리터럴(e)는 실수형에서만 사용가능하다.\
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
	}
}
