package sub2;
/*
 * 날짜: 2023.6.12
 * 이름: 최동일
 * 내용: Java 자료형 실습하기
 * 
 * 
 * 많이 사용되는 int, double, boolean, String을 많이 사용한다.
 * 
 * 자료형(Data Type)
 * -변수에 저장되는 데이터의 종류와 크기를 나타낸 키워드
 * -자료형은 기본형과 참조형(=객체)으로 나뉨
 * 
 */
public class DataTypeTest {
	public static void main(String[] args) {
		
		//정수형
		byte num1=1;//byte는 정수형 가운데 가장 크기가 작다.-128~127까지 저장가능
		short num2=32767;//short는 32767까지 저장가능
		int num3=2147483647;//2147483647이게 최대치
		long num4=922337203685477507L;//long으로 쓸 때는 마지막에 L을 붙여줘야함.
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		
		//실수형
		
		float var1=0.123456789f; //float형을 쓸 때는 글자의 마지막에 f를 붙여주어야 한다.
								//float형을 소수점 7자리까지 출력이 된다.
		double var2=0.123456789123456789;//double형의 뒤에 접미사가 없다.
										//double형은 소수점 16자리까지 출력이 된다. 마지막 값은 반올림 된다.
		System.out.println(var1);
		System.out.println(var2);
		
		
		//논리형
		boolean data1= true; //data 1과 같이 띄워쓰기를 하게 될 경우 오류가 난다.
		boolean data2= false;
		
		System.out.println(data1);
		System.out.println(data2);
		
		//문자형 문자형은 단어하나만 가능
		char c1= 'A'; //
		char c2= '가';
		System.out.println("c1= "+c1);
		System.out.println("c2= "+c2);
		
		//문자열
		//String은 참조타입, 객체이므로 대문자로 사용된다.
		String str1= "A";
		String str2= "가";
		String str3= "Apple";
		String str4= "가을";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
	}
		
}
