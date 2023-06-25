package step01;
/*
 * 날짜: 2023/06/23
 * 이름: 최동일
 * 내용: 백준 1단계 10번 문제
 */
import java.util.Scanner;


public class Test10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		
		int divide = 0 ;		
		
		divide=y%10;
		System.out.println(x*divide);

		divide=(y/10)%10;
		System.out.println(x*divide);
		divide=y/100;
		System.out.println(x*divide);
		System.out.println(x*y);

	}
}
