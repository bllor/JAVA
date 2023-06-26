package sub02;

import java.util.Scanner;

/*
 * 날짜: 2023/06/26
 * 이름: 최동일
 * 내용: Java Throws 실습하기
 */
public class ThrowsTest {

public static void main(String[] args)  {
		
		try {
			myMethod1(10);
		} catch (Exception e) {
			//여기서 발생할 수 있는 에러는 
			//0이 들어갔을 때
			//입력값이 정수가 아닐 때
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상종료...");
		//Main에서 jvm으로 예외가 오면 그냥 프로그램을 종료시켜버림.
	}

	
	public static void myMethod1(int n1) throws Exception {
		myMethod2(n1);
	}
	
	
	public static void myMethod2(int n1) throws Exception {//throws Exception을 하는 이유는 모든 예외를 다 보내 버리기 위해서.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n2 입력 :");
		int n2 = sc.nextInt();
		
		int result = n1/n2;
		System.out.println("result : "+ result );
	}
	
	
	}
