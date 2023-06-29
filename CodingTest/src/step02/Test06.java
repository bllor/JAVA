package step02;
/*
 * 날짜: 2023/06/29
 * 이름: 최동일
 * 내용: test2 6번
 */
import java.util.Scanner;


public class Test06 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		int z= sc.nextInt();
		
		int t= y+z;
		
		if(t/60>=1) {
			x=x+(t/60);
			t=y+z-60*(t/60);
			
			if(x>=24) {
				x=x-24;
			}
		}
		
		System.out.printf("%d %d",x,t);
	}
}
