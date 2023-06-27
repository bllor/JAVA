package step02;
/*
 * 날짜: 2023/06/27
 * 이름: 최동일
 * 내용: 백준 2단계 2번 문제
 */
import java.util.Scanner;


public class Test02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x>=90) {
			System.out.println("A");
		}else if(x>=80) {
			System.out.println("B");
		}else if(x>=70) {
			System.out.println("C");
		}else if(x>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
