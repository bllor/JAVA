package javaTest;

import java.util.Scanner;

/*
 * 날짜: 2023/07/05
 * 이름: 최동일
 * 내용: 작업형 1번
 */
public class Test1 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("예제입력");
		int x= sc.nextInt();
		while(x<1||x>100) {
			System.out.println("숫자를 다시 입력하시오.");
			
			int z= sc.nextInt();
			 x=z;
		}
		System.out.println("예제출력");
		for(int i =1 ; i<=x;i++) {
			
			for(int k =x;k>i;k--) {
				System.out.print(" ");
				
				}
			for(int j=1; j<=i;j++) {
				System.out.print("*");	
				}		
			
			System.out.println();
		
		}
		sc.close();
	}
	
}

