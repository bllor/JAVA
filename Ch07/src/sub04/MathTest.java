package sub04;
/*
 * 날짜: 2023/06/27
 * 이름: 최동일
 * 내용: Java Math 클래스 실습하기
 */
public class MathTest {

	public static void main(String[] args) {
		
		//Math math = new Meth(); new가 안됨. private생성자
		
		//기본함수
		System.out.println("절대값: "+Math.abs(-5));
		System.out.println("제곱근: "+Math.sqrt(9));
		System.out.println("올림값: "+Math.ceil(1.2));
		System.out.println("올림값: "+Math.ceil(1.8));
		System.out.println("내림값: "+Math.floor(1.2));
		System.out.println("내림값: "+Math.floor(1.8));
		System.out.println("반올림: "+Math.round(1.2));
		System.out.println("반올림: "+Math.round(1.8));
	
		//random
		double num1 = Math.random();
		System.out.println(num1);//0~1사이의 정수를 출력
		
		double num2= num1*10;
		System.out.println(num2);//0~10사이의 정수를 출력
		
		double num3 = Math.ceil(num2);
		System.out.println(num3);//정수로 표기됨.
		
		int rand = (int) Math.ceil(Math.random()*46);
		System.out.println("rand: "+rand);
	}
}
