package ch02.sec09;
/*
 * 날짜: 2023/6/14
 * 이름: 최동일
 * 내용: 교재 62p 예제
 */
public class OperationPromotionExample {
	public static void main(String[] args) {
		byte result1= 20+10;//컴파일 단계에서 byte로 연산이 되므로 result1의 타입은 byte
		System.out.println("result1 : "+result1);
		
		byte b1= 10;
		byte b2= 20;
		int result2= b1+b2;
		//b1+b2는 둘다 바이트 타입이지만 연산을 할 때 int형으로 바뀌므로 int result2로 받아야 한다.
		System.out.println("result2 : "+result2);
		
		byte b3=10;
		int b4= 100;
		long b5= 1000L;
		
		long result3=b3+b4+b5;
		System.out.println("result3 : "+result3);
		
		char b6 = 'A';
		char b7 = 1;
		int result4=b6+b7;
		//char 타입도 연산할 때 int형으로 바뀐다.
		char result5=(char)(b6+b7);
		//강제 형변환 하면 되긴할 듯.
		System.out.println("result4 : "+result4);
		System.out.println("result5 : "+result5);
		
		int b8= 10;
		int result6= b8/4;
		System.out.println("result6 : "+result6);
		
		int b9=10;
		double result7 = b9/4.0;
		System.out.println("result7 : "+result7);
		
		int b10=1;
		int b11=2;
		double result8= (double)b10/b11;
		//double로 형변환해서 계산
		System.out.println("result8 : "+result8);
		
		double b12=10.0;
		double result9=b12/4;//정수가 있어도 double형으로 출력된다.
		System.out.println("result9 : "+result9);
	}
}
