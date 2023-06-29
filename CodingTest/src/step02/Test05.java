package step02;
/*
 * 날짜: 2023/06/29
 * 이름: 최동일
 * 내용: test2 5번
 */
import java.util.Scanner;


public class Test05 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		int y= sc.nextInt();
		
		int z= y-45;
		
		if(z<0) {
			
			x=x-1;
			z=60+y-45;
			if(x<0) {
				x=24-1;
			}
				
		}
		System.out.printf("%d %d",x,z);
		
	}
}
