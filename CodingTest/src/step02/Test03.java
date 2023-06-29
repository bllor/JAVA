package step02;
/*
 * 날짜: 2023/06/29
 * 이름: 최동일
 * 내용: test2 3번
 */
import java.util.Scanner;


public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println("1");
			
		}else {
			System.out.println("0");
		}
	}
}
