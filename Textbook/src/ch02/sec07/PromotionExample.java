package ch02.sec07;
/*
 * 날짜: 2023/6/14
 * 이름: 최동일
 * 내용: 교재 54p 예제
 */
public class PromotionExample {
	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue= 10;
		int intValue= byteValue;
		System.out.println("intvalue"+intValue);
		
		char charValue ='가';
		intValue= charValue;
		System.out.println("가의 유니코드: "+intValue);
		
		intValue= 50;
		long longValue= intValue;
		System.out.println("longValue : "+longValue);
		
		longValue =100;
		float floatValue= longValue;
		System.out.println("floateValue : "+floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue :"+doubleValue);
	}
	//형변환이 되는 이유는 기본 타입의 크기가 byte<int<long<float<double이기 때문이다.
}
