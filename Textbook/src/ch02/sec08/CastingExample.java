package ch02.sec08;
/*
 * 날짜: 2023/6/14
 * 이름: 최동일
 * 내용: 교재 58p 예제
 */
public class CastingExample {
	public static void main(String[] args) {
		//강제 타입 변환을 하려면 (바꾸려는 타입)변수명 이렇게 해야 된다.
		int var1= 10;
		byte var2= (byte)var1;
		System.out.println(var2);
		// 강제 타입 변환 후에 10이 그대로 유지
		// 만약 byte의 범위를 벗어난다면 원하는 수가 출력되지 않을 것이다.
		
		long var3=300L;
		int var4= (int)var3;
		System.out.println(var4);
		
		int var5= 65;
		char var6= (char)var5;
		System.out.println(var6);
		
		double var7= 3.14;
		int var8= (int)var7;
		System.out.println(var8);
		
	}
}
