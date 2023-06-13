package test01;

/*
 * 날짜: 2023/06/13
 * 이름: 최동일
 * 내용: 자바 기본 연산자 연습문제
 */
public class Test03 {
	public static void main(String[] args) {
		int num, result;
		num=1;
		
		result =num++;
		System.out.println("result : "+result);
		
		result=++num;
		System.out.println("result : "+result);
		
		result=num--;
		System.out.println("result : "+result);
		
		result=--num;
		System.out.println("result : "+result);
	}
}
