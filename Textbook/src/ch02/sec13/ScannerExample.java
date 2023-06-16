package ch02.sec13;

import java.util.Scanner;

/*
 * 날짜: 2023/6/16
 * 이름: 최동일
 * 내용: Scanner사용
 */
public class ScannerExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("값 입력 : ");
		int x= sc.nextInt();
		System.out.println(x);
		
//		while문을 사용해서 입력을 받을 수 있다.
		while(true) {
			System.out.print("입력 문자열: ");
			String s=sc.next();
			if(s.equals("q")) {
				break;
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
