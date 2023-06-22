package step01;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();//위의 문장 때문에 출력형식 에러가 났음
		String s= sc.next();
		String x="??!";
		String r1= s+x;
				
		System.out.println(r1);
		sc.close();
		
	}
}
