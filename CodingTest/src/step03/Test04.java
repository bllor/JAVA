package step03;

import java.util.Scanner;

/*
 * 날짜 :2023/07/18
 * 이름: 최동일
 * 내용: 3단계 4번 문제
 */
public class Test04 {

	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		int total = sc.nextInt();
		int num = sc.nextInt();
		int price = 0;
		
		
		for(int i = 1;i<=num;i++) {
			int x= sc.nextInt();
			int y= sc.nextInt();
			price += x*y;
			
		}
		
		
		
		if(total==price) {
			System.out.println("Yes");
		}else {
			System.out.println("No");

		}
		sc.close();
	}
}
