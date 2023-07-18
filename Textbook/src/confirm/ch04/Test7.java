package confirm.ch04;

import java.util.Scanner;

/*
 * 날짜: 2023/07/18
 * 이름: 최동일
 * 내용: ch04 조건문 test
 */
public class Test7 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int input =0, output=0 , deposit ;
		
		
		while(true) {
			System.out.println("--------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("--------------");
			
			
			
			
			int answer = sc.nextInt();
			if(answer==1) {
				System.out.println("선택>"+answer);
				System.out.print("예금액>");
				input= sc.nextInt();
					
			}if(answer==2) {
				System.out.println("선택>"+answer);
				System.out.print("출금액>");
				output= sc.nextInt();
				
			}if(answer==3) {
				deposit= input-output;
				System.out.println("선택>"+answer);
				System.out.println("잔고>"+deposit);
			}if(answer==4) {
				System.out.println("선택>"+answer);
				break;
			}
			
		
			
			
			
			
		}
		sc.close();
		System.out.println("프로그램 종료");
	}
}
