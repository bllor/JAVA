package sub2;

import java.util.Scanner;

/*
 * 날짜: 2023.6.13
 * 이름: 최동일
 * 내용: Java의 조건문인 Switch문 실습하기
 * switch문은 현재 자주사용되지 않는다.
 */

public class SwitchTest {

	public static void main(String[] args) {

		System.out.print("숫자 입력: ");
		
		//사용자 입력
		Scanner scan= new Scanner(System.in);
		//Scanner는 클래스인데 라이브러리에서 가져오려고 한다면 import를 해야한다.
		//scan만하게 되면 scanner가 뜨는데 그것을 누르게 되면 자동으로 import가 된다.
		int number= scan.nextInt();
		//사용자가 숫자를 입력하는 순간, 숫자가 num에 들어가게되고 그 다음에 로직이 진행된다.
		
	System.out.println("입력한 숫자: "+number);
		
		switch(number %2) {
		
		case 0:
			System.out.println("number는 짝수");
			break;
		
		case 1:
		System.out.println("number는 홀수");
		
			break;
		}
	}

}
