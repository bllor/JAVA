package test04;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 날짜: 2023/06/30
 * 이름: 최동일
 * 내용: 예외처리 연습문제
 */
public class Test01 {

	public static void main(String[] args) {
		
		int answer = (int)(Math.random()*10)+1;
		int input = 0;
		int count =0;
		
		do {
			count++;
			System.out.println("----------------");
			System.out.println("answer값을 맞춰보시오.");
			System.out.println("1~10사이 값을 입력 : ");
			
			
			try {
			Scanner sc = new Scanner(System.in);
			input = sc.nextInt();
			
			
			if(input<0) {
				throw new Exception("음수를 입력할 수 없습니다.");
				
			}
			}
			catch(InputMismatchException e) {
				System.out.println("숫자가 아닙니다. 숫자를 입력하세요.");
				continue;
			}catch(Exception e) {
				System.out.println(e.getMessage());
				continue;
			}
			
			if(answer> input) {
				System.out.println("더 큰 수를 입력하세요.");
			}else if(answer< input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("answer : "+answer);
				System.out.println("정답입니다.");
				System.out.println("시도회수: "+count+"회" );
				break;
			}
			
		}while(true);

		System.out.println("프로그램이 정상 종료 되엇습니다.");
	}
}